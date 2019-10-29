/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_07_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_07_01.implementation.FirewallPolicyInner;

/**
 * Type representing FirewallPolicy.
 */
public interface FirewallPolicy extends HasInner<FirewallPolicyInner>, Resource, GroupableResourceCore<NetworkManager, FirewallPolicyInner>, HasResourceGroup, Refreshable<FirewallPolicy>, Updatable<FirewallPolicy.Update>, HasManager<NetworkManager> {
    /**
     * @return the basePolicy value.
     */
    SubResource basePolicy();

    /**
     * @return the childPolicies value.
     */
    List<SubResource> childPolicies();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the firewalls value.
     */
    List<SubResource> firewalls();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the ruleGroups value.
     */
    List<SubResource> ruleGroups();

    /**
     * @return the threatIntelMode value.
     */
    AzureFirewallThreatIntelMode threatIntelMode();

    /**
     * The entirety of the FirewallPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of FirewallPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a FirewallPolicy definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the FirewallPolicy definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the firewallpolicy definition allowing to specify BasePolicy.
         */
        interface WithBasePolicy {
            /**
             * Specifies basePolicy.
             * @param basePolicy The parent firewall policy from which rules are inherited
             * @return the next definition stage
             */
            WithCreate withBasePolicy(SubResource basePolicy);
        }

        /**
         * The stage of the firewallpolicy definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the firewall policy resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the firewallpolicy definition allowing to specify ThreatIntelMode.
         */
        interface WithThreatIntelMode {
            /**
             * Specifies threatIntelMode.
             * @param threatIntelMode The operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'
             * @return the next definition stage
             */
            WithCreate withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<FirewallPolicy>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithBasePolicy, DefinitionStages.WithProvisioningState, DefinitionStages.WithThreatIntelMode {
        }
    }
    /**
     * The template for a FirewallPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<FirewallPolicy>, Resource.UpdateWithTags<Update>, UpdateStages.WithBasePolicy, UpdateStages.WithProvisioningState, UpdateStages.WithThreatIntelMode {
    }

    /**
     * Grouping of FirewallPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the firewallpolicy update allowing to specify BasePolicy.
         */
        interface WithBasePolicy {
            /**
             * Specifies basePolicy.
             * @param basePolicy The parent firewall policy from which rules are inherited
             * @return the next update stage
             */
            Update withBasePolicy(SubResource basePolicy);
        }

        /**
         * The stage of the firewallpolicy update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the firewall policy resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the firewallpolicy update allowing to specify ThreatIntelMode.
         */
        interface WithThreatIntelMode {
            /**
             * Specifies threatIntelMode.
             * @param threatIntelMode The operation mode for Threat Intelligence. Possible values include: 'Alert', 'Deny', 'Off'
             * @return the next update stage
             */
            Update withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }

    }
}
