/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Resource pool model.
 */
@JsonFlatten
public class ResourcePoolInner {
    /**
     * resource pool id (privateCloudId:vsphereId).
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Azure region.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * {ResourcePoolName}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The Private Cloud Id.
     */
    @JsonProperty(value = "privateCloudId", access = JsonProperty.Access.WRITE_ONLY)
    private String privateCloudId;

    /**
     * Hierarchical resource pool name.
     */
    @JsonProperty(value = "properties.fullName", access = JsonProperty.Access.WRITE_ONLY)
    private String fullName;

    /**
     * {resourceProviderNamespace}/{resourceType}.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get resource pool id (privateCloudId:vsphereId).
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource pool id (privateCloudId:vsphereId).
     *
     * @param id the id value to set
     * @return the ResourcePoolInner object itself.
     */
    public ResourcePoolInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get azure region.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get {ResourcePoolName}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the Private Cloud Id.
     *
     * @return the privateCloudId value
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }

    /**
     * Get hierarchical resource pool name.
     *
     * @return the fullName value
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * Get {resourceProviderNamespace}/{resourceType}.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
