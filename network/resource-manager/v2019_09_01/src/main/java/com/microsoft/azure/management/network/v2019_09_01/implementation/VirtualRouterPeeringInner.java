/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Virtual Router Peering resource.
 */
@JsonFlatten
public class VirtualRouterPeeringInner extends SubResource {
    /**
     * Peer ASN.
     */
    @JsonProperty(value = "properties.peerAsn")
    private Long peerAsn;

    /**
     * Peer IP.
     */
    @JsonProperty(value = "properties.peerIp")
    private String peerIp;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Gets name of the peering unique to VirtualRouter. This name can be used
     * to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Peering type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get peer ASN.
     *
     * @return the peerAsn value
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set peer ASN.
     *
     * @param peerAsn the peerAsn value to set
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get peer IP.
     *
     * @return the peerIp value
     */
    public String peerIp() {
        return this.peerIp;
    }

    /**
     * Set peer IP.
     *
     * @param peerIp the peerIp value to set
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withPeerIp(String peerIp) {
        this.peerIp = peerIp;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get gets name of the peering unique to VirtualRouter. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the peering unique to VirtualRouter. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get peering type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
