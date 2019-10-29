/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.kusto.v2019_05_15.implementation.KustoManager;
import com.microsoft.azure.management.kusto.v2019_05_15.implementation.DatabasePrincipalInner;

/**
 * Type representing DatabasePrincipal.
 */
public interface DatabasePrincipal extends HasInner<DatabasePrincipalInner>, HasManager<KustoManager> {
    /**
     * @return the appId value.
     */
    String appId();

    /**
     * @return the email value.
     */
    String email();

    /**
     * @return the fqn value.
     */
    String fqn();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the role value.
     */
    DatabasePrincipalRole role();

    /**
     * @return the tenantName value.
     */
    String tenantName();

    /**
     * @return the type value.
     */
    DatabasePrincipalType type();

}
