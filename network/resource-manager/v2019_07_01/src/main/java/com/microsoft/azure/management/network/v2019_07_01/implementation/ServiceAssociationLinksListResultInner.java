/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for ServiceAssociationLinks_List operation.
 */
public class ServiceAssociationLinksListResultInner {
    /**
     * The service association links in a subnet.
     */
    @JsonProperty(value = "value")
    private List<ServiceAssociationLinkInner> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the service association links in a subnet.
     *
     * @return the value value
     */
    public List<ServiceAssociationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the service association links in a subnet.
     *
     * @param value the value value to set
     * @return the ServiceAssociationLinksListResultInner object itself.
     */
    public ServiceAssociationLinksListResultInner withValue(List<ServiceAssociationLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to get the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
