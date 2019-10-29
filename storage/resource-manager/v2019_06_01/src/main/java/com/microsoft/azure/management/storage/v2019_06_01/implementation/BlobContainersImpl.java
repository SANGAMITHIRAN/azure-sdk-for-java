/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_06_01.BlobContainers;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.storage.v2019_06_01.ListContainerItem;
import com.microsoft.azure.management.storage.v2019_06_01.BlobContainer;
import com.microsoft.azure.management.storage.v2019_06_01.LegalHold;
import com.microsoft.azure.management.storage.v2019_06_01.LeaseContainerResponse;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_06_01.ImmutabilityPolicy;

class BlobContainersImpl extends WrapperImpl<BlobContainersInner> implements BlobContainers {
    private final StorageManager manager;

    BlobContainersImpl(StorageManager manager) {
        super(manager.inner().blobContainers());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public BlobContainerImpl defineContainer(String name) {
        return wrapContainerModel(name);
    }

    @Override
    public ImmutabilityPolicyImpl defineImmutabilityPolicy(String name) {
        return wrapImmutabilityPolicyModel(name);
    }

    private BlobContainerImpl wrapContainerModel(String name) {
        return new BlobContainerImpl(name, this.manager());
    }

    private ImmutabilityPolicyImpl wrapImmutabilityPolicyModel(String name) {
        return new ImmutabilityPolicyImpl(name, this.manager());
    }

    private BlobContainerImpl wrapBlobContainerModel(BlobContainerInner inner) {
        return  new BlobContainerImpl(inner, manager());
    }

    private ImmutabilityPolicyImpl wrapImmutabilityPolicyModel(ImmutabilityPolicyInner inner) {
        return  new ImmutabilityPolicyImpl(inner, manager());
    }

    private Observable<ImmutabilityPolicyInner> getImmutabilityPolicyInnerUsingBlobContainersInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String accountName = IdParsingUtils.getValueFromIdByName(id, "storageAccounts");
        String containerName = IdParsingUtils.getValueFromIdByName(id, "containers");
        BlobContainersInner client = this.inner();
        return client.getImmutabilityPolicyAsync(resourceGroupName, accountName, containerName);
    }

    @Override
    public Observable<ListContainerItem> listAsync(final String resourceGroupName, final String accountName) {
        BlobContainersInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<ListContainerItemInner>, Iterable<ListContainerItemInner>>() {
            @Override
            public Iterable<ListContainerItemInner> call(Page<ListContainerItemInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ListContainerItemInner, ListContainerItem>() {
            @Override
            public ListContainerItem call(ListContainerItemInner inner) {
                return new ListContainerItemImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BlobContainer> getAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, containerName)
        .map(new Func1<BlobContainerInner, BlobContainer>() {
            @Override
            public BlobContainer call(BlobContainerInner inner) {
                return new BlobContainerImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, containerName).toCompletable();
    }

    @Override
    public Observable<LegalHold> setLegalHoldAsync(String resourceGroupName, String accountName, String containerName, List<String> tags) {
        BlobContainersInner client = this.inner();
        return client.setLegalHoldAsync(resourceGroupName, accountName, containerName, tags)
        .map(new Func1<LegalHoldInner, LegalHold>() {
            @Override
            public LegalHold call(LegalHoldInner inner) {
                return new LegalHoldImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LegalHold> clearLegalHoldAsync(String resourceGroupName, String accountName, String containerName, List<String> tags) {
        BlobContainersInner client = this.inner();
        return client.clearLegalHoldAsync(resourceGroupName, accountName, containerName, tags)
        .map(new Func1<LegalHoldInner, LegalHold>() {
            @Override
            public LegalHold call(LegalHoldInner inner) {
                return new LegalHoldImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LeaseContainerResponse> leaseAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.leaseAsync(resourceGroupName, accountName, containerName)
        .map(new Func1<LeaseContainerResponseInner, LeaseContainerResponse>() {
            @Override
            public LeaseContainerResponse call(LeaseContainerResponseInner inner) {
                return new LeaseContainerResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ImmutabilityPolicy> getImmutabilityPolicyAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.getImmutabilityPolicyAsync(resourceGroupName, accountName, containerName)
        .flatMap(new Func1<ImmutabilityPolicyInner, Observable<ImmutabilityPolicy>>() {
            @Override
            public Observable<ImmutabilityPolicy> call(ImmutabilityPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ImmutabilityPolicy)wrapImmutabilityPolicyModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteImmutabilityPolicyAsync(String resourceGroupName, String accountName, String containerName, String ifMatch) {
        BlobContainersInner client = this.inner();
        return client.deleteImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch).toCompletable();
    }

    @Override
    public Observable<ImmutabilityPolicy> lockImmutabilityPolicyAsync(String resourceGroupName, String accountName, String containerName, String ifMatch) {
        BlobContainersInner client = this.inner();
        return client.lockImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch)
        .map(new Func1<ImmutabilityPolicyInner, ImmutabilityPolicy>() {
            @Override
            public ImmutabilityPolicy call(ImmutabilityPolicyInner inner) {
                return new ImmutabilityPolicyImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ImmutabilityPolicy> extendImmutabilityPolicyAsync(String resourceGroupName, String accountName, String containerName, String ifMatch, int immutabilityPeriodSinceCreationInDays) {
        BlobContainersInner client = this.inner();
        return client.extendImmutabilityPolicyAsync(resourceGroupName, accountName, containerName, ifMatch, immutabilityPeriodSinceCreationInDays)
        .map(new Func1<ImmutabilityPolicyInner, ImmutabilityPolicy>() {
            @Override
            public ImmutabilityPolicy call(ImmutabilityPolicyInner inner) {
                return new ImmutabilityPolicyImpl(inner, manager());
            }
        });
    }

}
