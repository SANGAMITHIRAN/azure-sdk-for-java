// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The NetworkRuleCondition model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleConditionType")
@JsonTypeName("NetworkRuleCondition")
@Fluent
public final class NetworkRuleCondition extends FirewallPolicyRuleCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkRuleCondition.class);

    /*
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     */
    @JsonProperty(value = "ipProtocols")
    private List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /**
     * Get the ipProtocols property: Array of FirewallPolicyRuleConditionNetworkProtocols.
     *
     * @return the ipProtocols value.
     */
    public List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set the ipProtocols property: Array of FirewallPolicyRuleConditionNetworkProtocols.
     *
     * @param ipProtocols the ipProtocols value to set.
     * @return the NetworkRuleCondition object itself.
     */
    public NetworkRuleCondition withIpProtocols(List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
        return this;
    }

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the NetworkRuleCondition object itself.
     */
    public NetworkRuleCondition withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the NetworkRuleCondition object itself.
     */
    public NetworkRuleCondition withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the destinationPorts property: List of destination ports.
     *
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set.
     * @return the NetworkRuleCondition object itself.
     */
    public NetworkRuleCondition withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
