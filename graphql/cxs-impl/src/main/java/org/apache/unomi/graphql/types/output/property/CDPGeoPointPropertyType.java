/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.unomi.graphql.types.output.property;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;
import org.apache.unomi.api.GeoPoint;
import org.apache.unomi.api.PropertyType;
import org.apache.unomi.graphql.types.output.CDPPropertyInterface;

import static org.apache.unomi.graphql.types.output.property.CDPGeoPointPropertyType.TYPE_NAME;

@GraphQLName(TYPE_NAME)
public class CDPGeoPointPropertyType extends CDPPropertyType implements CDPPropertyInterface {

    public static final String TYPE_NAME = "CDP_GeoPointProperty";

    public static final String UNOMI_TYPE = "geopoint";

    public CDPGeoPointPropertyType(final PropertyType type) {
        super(type);
    }

    @GraphQLField
    public GeoPoint defaultValue() {
        return type != null && type.getDefaultValue() != null ? GeoPoint.fromString(type.getDefaultValue()) : null;
    }
}
