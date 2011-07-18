/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.client.packages;

import org.drools.guvnor.client.explorer.navigation.modules.PackageHierarchy;

import com.google.gwt.event.shared.GwtEvent;

/**
 * An event for when the Package Hierarchy (in the "Knowledge Bases" part of "Explorer") needs to be changed
 */
public class ChangeModulePackageHierarchyEvent extends GwtEvent<ChangeModulePackageHierarchyEventHandler> {

    public static Type<ChangeModulePackageHierarchyEventHandler> TYPE = new Type<ChangeModulePackageHierarchyEventHandler>();

    private PackageHierarchy                                     packageHierarchy;

    public ChangeModulePackageHierarchyEvent(PackageHierarchy packageHierarchy) {
        this.packageHierarchy = packageHierarchy;
    }

    @Override
    public Type<ChangeModulePackageHierarchyEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ChangeModulePackageHierarchyEventHandler eventHandler) {
        eventHandler.onChangeModulePackageHierarchy( this );
    }

    public PackageHierarchy getPackageHierarchy() {
        return packageHierarchy;
    }

}
