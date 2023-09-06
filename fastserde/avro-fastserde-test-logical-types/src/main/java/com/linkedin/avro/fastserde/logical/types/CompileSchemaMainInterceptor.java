/*
 * Copyright 2023 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License").
 * See License in the project root for license information.
 */

package com.linkedin.avro.fastserde.logical.types;

import java.time.LocalTime;
import java.util.Arrays;

import org.apache.avro.LogicalTypes;

import com.linkedin.avro.fastserde.logical.types.custom.CustomIntervalLogicalTypeFactory;

public class CompileSchemaMainInterceptor {

    public static void main(String[] args) throws Exception {
        System.out.println(" " + Arrays.toString(args));

        registerCustomLogicalTypes();

        Class.forName("org.apache.avro.tool.Main")
                .getDeclaredMethod("main", String[].class)
                .invoke(null, new Object[] { args });
    }

    private static void registerCustomLogicalTypes() {
        System.out.println(LocalTime.now() + " | CustomTypesRegistrar works");
        LogicalTypes.register(CustomIntervalLogicalTypeFactory.LOGICAL_TYPE_NAME, new CustomIntervalLogicalTypeFactory());
    }
}
