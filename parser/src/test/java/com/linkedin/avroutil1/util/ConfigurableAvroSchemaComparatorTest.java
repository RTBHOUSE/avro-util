/*
 * Copyright 2022 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avroutil1.util;

import com.linkedin.avroutil1.compatibility.SchemaComparisonConfiguration;
import com.linkedin.avroutil1.model.AvroRecordSchema;
import com.linkedin.avroutil1.model.AvroSchema;
import com.linkedin.avroutil1.model.AvroSchemaDifference;
import com.linkedin.avroutil1.parser.avsc.AvscParseResult;
import com.linkedin.avroutil1.parser.avsc.AvscParser;
import com.linkedin.avroutil1.testcommon.TestUtil;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ConfigurableAvroSchemaComparatorTest {

  @DataProvider
  private Object[][] testEqualsProvider() {
    return new Object[][] {
        {"schemas/TestRecord.avsc", "schemas/TestRecord.avsc", true},
        {"schemas/UtilTester1.avsc", "schemas/UtilTester2.avsc", false}
    };
  }

  @DataProvider
  private Object[][] testFindDifferenceProvider() {
    return new Object[][] {
        {"schemas/UtilTester1.avsc", "schemas/UtilTester1.avsc", SchemaComparisonConfiguration.PRE_1_7_3, 0},
        {"schemas/UtilTester1.avsc", null, SchemaComparisonConfiguration.PRE_1_7_3, 1},
        {"schemas/UtilTester1.avsc", "schemas/UtilTester2.avsc", SchemaComparisonConfiguration.PRE_1_7_3, 12},
        {"schemas/UtilTester1.avsc", "schemas/UtilTester2.avsc", SchemaComparisonConfiguration.STRICT, 17}
    };
  }

  private static AvroSchema validateAndGetAvroRecordSchema(String path) throws IOException {
    AvscParser parser = new AvscParser();
    String avsc = TestUtil.load(path);
    AvscParseResult result = parser.parse(avsc);
    Assert.assertNull(result.getParseError());
    return result.getTopLevelSchema();
  }

  @Test(dataProvider = "testEqualsProvider")
  public void testEquals(String path1, String path2, boolean expectedResult) throws IOException {
    AvroRecordSchema recordSchema1 = (AvroRecordSchema) validateAndGetAvroRecordSchema(path1);
    AvroRecordSchema recordSchema2 = (AvroRecordSchema) validateAndGetAvroRecordSchema(path2);
    Assert.assertEquals(ConfigurableAvroSchemaComparator.equals(recordSchema1, recordSchema2,
        SchemaComparisonConfiguration.PRE_1_7_3), expectedResult);
  }

  @Test(dataProvider = "testFindDifferenceProvider")
  public void testFindDifference(String path1, String path2, SchemaComparisonConfiguration config, int expectedDifferences)
      throws IOException {
    // Load the schema, move this code to a separate method
    AvroRecordSchema schema1 = (AvroRecordSchema) validateAndGetAvroRecordSchema(path1);
    AvroRecordSchema schema2 = (path2 != null) ? (AvroRecordSchema) validateAndGetAvroRecordSchema(path2) : null;
    List<AvroSchemaDifference> differences = ConfigurableAvroSchemaComparator.findDifference(schema1, schema2, config);
    Assert.assertEquals(differences.size(), expectedDifferences);
  }

}
