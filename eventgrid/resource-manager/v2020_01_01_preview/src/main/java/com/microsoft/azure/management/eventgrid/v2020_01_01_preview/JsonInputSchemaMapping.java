/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This enables publishing to Event Grid using a custom input schema. This can
 * be used to map properties from a custom input JSON schema to the Event Grid
 * event schema.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "inputSchemaMappingType")
@JsonTypeName("Json")
@JsonFlatten
public class JsonInputSchemaMapping extends InputSchemaMapping {
    /**
     * The mapping information for the Id property of the Event Grid Event.
     */
    @JsonProperty(value = "properties.id")
    private JsonField id;

    /**
     * The mapping information for the Topic property of the Event Grid Event.
     */
    @JsonProperty(value = "properties.topic")
    private JsonField topic;

    /**
     * The mapping information for the EventTime property of the Event Grid
     * Event.
     */
    @JsonProperty(value = "properties.eventTime")
    private JsonField eventTime;

    /**
     * The mapping information for the EventType property of the Event Grid
     * Event.
     */
    @JsonProperty(value = "properties.eventType")
    private JsonFieldWithDefault eventType;

    /**
     * The mapping information for the Subject property of the Event Grid
     * Event.
     */
    @JsonProperty(value = "properties.subject")
    private JsonFieldWithDefault subject;

    /**
     * The mapping information for the DataVersion property of the Event Grid
     * Event.
     */
    @JsonProperty(value = "properties.dataVersion")
    private JsonFieldWithDefault dataVersion;

    /**
     * Get the mapping information for the Id property of the Event Grid Event.
     *
     * @return the id value
     */
    public JsonField id() {
        return this.id;
    }

    /**
     * Set the mapping information for the Id property of the Event Grid Event.
     *
     * @param id the id value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withId(JsonField id) {
        this.id = id;
        return this;
    }

    /**
     * Get the mapping information for the Topic property of the Event Grid Event.
     *
     * @return the topic value
     */
    public JsonField topic() {
        return this.topic;
    }

    /**
     * Set the mapping information for the Topic property of the Event Grid Event.
     *
     * @param topic the topic value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withTopic(JsonField topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the mapping information for the EventTime property of the Event Grid Event.
     *
     * @return the eventTime value
     */
    public JsonField eventTime() {
        return this.eventTime;
    }

    /**
     * Set the mapping information for the EventTime property of the Event Grid Event.
     *
     * @param eventTime the eventTime value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withEventTime(JsonField eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * Get the mapping information for the EventType property of the Event Grid Event.
     *
     * @return the eventType value
     */
    public JsonFieldWithDefault eventType() {
        return this.eventType;
    }

    /**
     * Set the mapping information for the EventType property of the Event Grid Event.
     *
     * @param eventType the eventType value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withEventType(JsonFieldWithDefault eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * Get the mapping information for the Subject property of the Event Grid Event.
     *
     * @return the subject value
     */
    public JsonFieldWithDefault subject() {
        return this.subject;
    }

    /**
     * Set the mapping information for the Subject property of the Event Grid Event.
     *
     * @param subject the subject value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withSubject(JsonFieldWithDefault subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the mapping information for the DataVersion property of the Event Grid Event.
     *
     * @return the dataVersion value
     */
    public JsonFieldWithDefault dataVersion() {
        return this.dataVersion;
    }

    /**
     * Set the mapping information for the DataVersion property of the Event Grid Event.
     *
     * @param dataVersion the dataVersion value to set
     * @return the JsonInputSchemaMapping object itself.
     */
    public JsonInputSchemaMapping withDataVersion(JsonFieldWithDefault dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }

}
