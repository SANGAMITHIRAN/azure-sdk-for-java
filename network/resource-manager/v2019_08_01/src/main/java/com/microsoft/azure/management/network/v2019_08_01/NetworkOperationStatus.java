/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkOperationStatus.
 */
public final class NetworkOperationStatus extends ExpandableStringEnum<NetworkOperationStatus> {
    /** Static value InProgress for NetworkOperationStatus. */
    public static final NetworkOperationStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for NetworkOperationStatus. */
    public static final NetworkOperationStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for NetworkOperationStatus. */
    public static final NetworkOperationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a NetworkOperationStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkOperationStatus
     */
    @JsonCreator
    public static NetworkOperationStatus fromString(String name) {
        return fromString(name, NetworkOperationStatus.class);
    }

    /**
     * @return known NetworkOperationStatus values
     */
    public static Collection<NetworkOperationStatus> values() {
        return values(NetworkOperationStatus.class);
    }
}
