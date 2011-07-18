/*
 * Copyright 2011 JBoss Inc
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.drools.guvnor.client.explorer;

import org.drools.guvnor.client.common.AssetEditorFactory;
import org.drools.guvnor.client.explorer.navigation.NavigationPanelFactory;
import org.drools.guvnor.client.explorer.navigation.NavigationViewFactory;
import org.drools.guvnor.client.rpc.CategoryServiceAsync;
import org.drools.guvnor.client.rpc.ConfigurationServiceAsync;
import org.drools.guvnor.client.rpc.PackageServiceAsync;
import org.drools.guvnor.client.rpc.RepositoryServiceAsync;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;

public interface ClientFactory {

    AuthorPerspectiveView getAuthorPerspectiveView( NavigationPanelFactory navigationPanelFactory );

    RuntimePerspectiveView getRuntimePerspectiveView( NavigationPanelFactory navigationPanelFactory );

    PlaceController getPlaceController();

    EventBus getEventBus();

    PerspectivesPanelView getPerspectivesPanelView();

    IFramePerspectiveView getIFramePerspectiveView();

    NavigationViewFactory getNavigationViewFactory();

    ConfigurationServiceAsync getConfigurationService();

    MultiActivityManager getActivityManager();

    PlaceHistoryHandler getPlaceHistoryHandler();

    GuvnorPlaceHistoryMapper getPlaceHistoryMapper();

    ModuleEditorActivityView getModuleEditorActivityView();
    
    PackageServiceAsync getPackageService();

    AssetEditorFactory getAssetEditorFactory();

    RepositoryServiceAsync getRepositoryService();

    CategoryServiceAsync getCategoryService();
}
