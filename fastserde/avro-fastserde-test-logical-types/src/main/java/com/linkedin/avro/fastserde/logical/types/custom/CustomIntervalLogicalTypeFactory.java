/*
 * Copyright 2023 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avro.fastserde.logical.types.custom;

import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;

public class CustomIntervalLogicalTypeFactory implements LogicalTypes.LogicalTypeFactory {

    public static final String LOGICAL_TYPE_NAME = "custom-interval";

    public static final LogicalType TYPE = new LogicalType(LOGICAL_TYPE_NAME) {
        @Override
        public void validate(Schema schema) {
            super.validate(schema);
            if (schema.getType() != Schema.Type.STRING) {
                throw new IllegalArgumentException("CustomInterval can only be used with an underlying string type");
            }
        }
    };

    @Override
    public LogicalType fromSchema(Schema schema) {
        return TYPE;
    }

    // @Override - no annotation, method is undefined in LogicalTypeFactory in Avro 1.9
    public String getTypeName() {
        return LOGICAL_TYPE_NAME;
    }
}
