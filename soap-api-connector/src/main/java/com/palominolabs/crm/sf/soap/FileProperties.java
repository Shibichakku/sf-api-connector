/*
 * Copyright © 2013. Palomino Labs (http://palominolabs.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.palominolabs.crm.sf.soap;

import com.palominolabs.crm.sf.core.Id;
import com.palominolabs.crm.sf.soap.jaxwsstub.metadata.ManageableState;
import org.joda.time.DateTime;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/**
 * The result of a listMetadata call.
 */
@Immutable
public final class FileProperties {

    private final com.palominolabs.crm.sf.soap.jaxwsstub.metadata.FileProperties stub;

    /**
     * The provided stub object MUST NOT BE MODIFIED after it is passed to this constructor. Using it in the constructor
     * must be an ownership change.
     *
     * @param stub the FileProperties from the API
     */
    public FileProperties(@Nonnull com.palominolabs.crm.sf.soap.jaxwsstub.metadata.FileProperties stub) {
        this.stub = stub;
    }

    @Nonnull
    public Id getCreatedById() {
        return new Id(stub.getCreatedById());
    }

    @Nonnull
    public String getCreatedByName() {
        return stub.getCreatedByName();
    }

    @Nonnull
    public DateTime getCreatedDate() {
        return ApiUtils.convertSFTimeToDateTime(stub.getCreatedDate());
    }

    @Nonnull
    public String getFileName() {
        return stub.getFileName();
    }

    @Nonnull
    public String getFullName() {
        return stub.getFullName();
    }

    /**
     * This is documented as non-null in the WSDL but does show up as "" (empty string) sometimes. This is exposed as a
     * null id.
     *
     * @return an id, if one was specified
     */
    @Nullable
    public Id getId() {
        String stubId = stub.getId();
        if (stubId != null && !stubId.isEmpty()) {
            return new Id(stubId);
        }

        return null;
    }

    @Nonnull
    public Id getLastModifiedById() {
        return new Id(stub.getLastModifiedById());
    }

    @Nonnull
    public String getLastModifiedByName() {
        return stub.getLastModifiedByName();
    }

    @Nonnull
    public DateTime getLastModifiedDate() {
        return ApiUtils.convertSFTimeToDateTime(stub.getLastModifiedDate());
    }

    @Nullable
    public ManageableState getManageableState() {
        return stub.getManageableState();
    }

    @Nullable
    public String getNamespacePrefix() {
        return stub.getNamespacePrefix();
    }

    @Nonnull
    public String getType() {
        return stub.getType();
    }

    @Override
    public String toString() {
        return "FileProperties{" + "createdById=" + getCreatedById() + ", createdByName='" + getCreatedByName() + '\'' +
                ", createdDate=" + getCreatedDate() + ", fileName='" + getFileName() + '\'' + ", fullName='" +
                getFullName() + '\'' + ", id=" + getId() + ", lastModifiedById=" + getLastModifiedById() +
                ", lastModifiedByName='" + getLastModifiedByName() + '\'' + ", lastModifiedDate=" +
                getLastModifiedDate() + ", manageableState=" + getManageableState() + ", namespacePrefix='" +
                getNamespacePrefix() + '\'' + ", type='" + getType() + '\'' + '}';
    }
}
