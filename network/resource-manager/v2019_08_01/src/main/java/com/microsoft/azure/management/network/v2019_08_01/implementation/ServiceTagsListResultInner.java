/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.ServiceTagInformation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for the ListServiceTags API service call.
 */
public class ServiceTagsListResultInner {
    /**
     * The name of the cloud.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The ID of the cloud.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The azure resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The iteration number.
     */
    @JsonProperty(value = "changeNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String changeNumber;

    /**
     * The name of the cloud.
     */
    @JsonProperty(value = "cloud", access = JsonProperty.Access.WRITE_ONLY)
    private String cloud;

    /**
     * The list of service tag information resources.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceTagInformation> values;

    /**
     * Get the name of the cloud.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the ID of the cloud.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the azure resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the iteration number.
     *
     * @return the changeNumber value
     */
    public String changeNumber() {
        return this.changeNumber;
    }

    /**
     * Get the name of the cloud.
     *
     * @return the cloud value
     */
    public String cloud() {
        return this.cloud;
    }

    /**
     * Get the list of service tag information resources.
     *
     * @return the values value
     */
    public List<ServiceTagInformation> values() {
        return this.values;
    }

}
