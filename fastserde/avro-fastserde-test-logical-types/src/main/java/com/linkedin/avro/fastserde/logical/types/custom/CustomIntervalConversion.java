/*
 * Copyright 2023 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avro.fastserde.logical.types.custom;

import org.apache.avro.Conversion;
import org.apache.avro.LogicalType;
import org.apache.avro.Schema;

public class CustomIntervalConversion extends Conversion<CustomInterval> {

    @Override
    public Class<CustomInterval> getConvertedType() {
        return CustomInterval.class;
    }

    @Override
    public String getLogicalTypeName() {
        return CustomIntervalLogicalTypeFactory.LOGICAL_TYPE_NAME;
    }

    @Override
    public CustomInterval fromCharSequence(CharSequence value, Schema schema, LogicalType type) {
        return new CustomInterval(1,2,3);
    }

    @Override
    public CharSequence toCharSequence(CustomInterval value, Schema schema, LogicalType type) {
        return value.toString();
    }
}
