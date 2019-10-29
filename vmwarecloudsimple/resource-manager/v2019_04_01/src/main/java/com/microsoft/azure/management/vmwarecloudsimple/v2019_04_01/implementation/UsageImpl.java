/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation;

import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.UsageName;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.UsageCount;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final VMwareCloudSimpleManager manager;

    UsageImpl(UsageInner inner,  VMwareCloudSimpleManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public VMwareCloudSimpleManager manager() {
        return this.manager;
    }



    @Override
    public int currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public int limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public UsageCount unit() {
        return this.inner().unit();
    }

}
