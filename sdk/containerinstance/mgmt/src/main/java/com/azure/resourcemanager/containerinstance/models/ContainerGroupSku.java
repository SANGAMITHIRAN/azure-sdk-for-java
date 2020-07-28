// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContainerGroupSku. */
public final class ContainerGroupSku extends ExpandableStringEnum<ContainerGroupSku> {
    /** Static value Standard for ContainerGroupSku. */
    public static final ContainerGroupSku STANDARD = fromString("Standard");

    /** Static value Dedicated for ContainerGroupSku. */
    public static final ContainerGroupSku DEDICATED = fromString("Dedicated");

    /**
     * Creates or finds a ContainerGroupSku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContainerGroupSku.
     */
    @JsonCreator
    public static ContainerGroupSku fromString(String name) {
        return fromString(name, ContainerGroupSku.class);
    }

    /** @return known ContainerGroupSku values. */
    public static Collection<ContainerGroupSku> values() {
        return values(ContainerGroupSku.class);
    }
}
