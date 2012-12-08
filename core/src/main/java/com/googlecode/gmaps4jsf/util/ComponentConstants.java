/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.googlecode.gmaps4jsf.util;

public interface ComponentConstants {   
	final String CONTEXT_CANNOT_BE_NULL = "context cannot be null";
	final String HTML_SCRIPT = "script";
	final String HTML_SCRIPT_TYPE = "type";
	final String HTML_SCRIPT_LANGUAGE = "text/javascript";
	final String JS_GMAP_CORE_OBJECT = "GMap2";
	final String JS_GSTREET_VIEW_PANORAMA_CORE_OBJECT = "GStreetviewPanorama";
	final String JS_GSTREET_VIEW_PANORAMA_Overlay_OBJECT = "GStreetviewOverlay";
	final String HTML_DIV = "div";
	final String HTML_INPUT = "input";
	final String HTML_ATTR_ID = "id";
	final String HTML_ATTR_NAME = "name";
	final String HTML_ATTR_STYLE = "style";
    final String HTML_ATTR_STYLE_CLASS = "class";
	final String HTML_ATTR_HIDDEN = "hidden";
	final String HTML_ATTR_TYPE = "type";
	final String HTML_ATTR_TYPE_HIDDEN = "hidden";
	final String HTML_ATTR_VALUE = "value";
	final String CONST_MARKER_PREFIX = "marker_";
	final String JS_GEVENT_OBJECT = "google.maps.event";
	final String JS_GMarker_OBJECT = "GMarker";
	final String JS_GLatLng_OBJECT = "GLatLng";
	final String JS_GSize_OBJECT = "GSize";
	final String JS_GLatLngBounds_OBJECT = "GLatLngBounds";
	final String JS_GClientGeocoder_OBJECT = "GClientGeocoder";
	final String JS_GIcon_OBJECT = "GIcon";
	final String JS_CONST_G_DEFAULT_ICON_OBJECT = "G_DEFAULT_ICON";
	final String JS_GGroundOverlay_OBJECT = "GGroundOverlay";
	final String JS_GControlPosition_OBJECT = "GControlPosition";
	final String JS_GPolygon_OBJECT = "GPolygon";
	final String JS_GPolyline_OBJECT = "GPolyline";
	final String JS_GPoint_OBJECT = "GPoint";
    final String JS_GDirection_OBJECT = "GDirections";    
	final String JS_GMAP_BASE_VARIABLE = "map_base_variable";
	final String JS_GSTREET_VIEW_PANORAMA_VARIABLE = "pano_base_variable";
	final String JS_GBrowserIsCompatible_OBJECT = "GBrowserIsCompatible";
	final String JS_RENDER_MAP_FUNC = "renderMap";
	final String JS_RENDER_STREET_VIEW_PANORAMA_FUNC = "renderStreetViewPanorama";
	final String JS_CREATE_HTMLINFOWINDOWS_FUNCTION_PREFIX = "createHTMLInfoWindowsFunction";
	final String JS_CREATE_MARKER_FUNCTION_PREFIX = "createMarkerFunction";
	final String JS_CREATE_MAP_CONTROLS_FUNCTION_PREFIX = "createMapControlsFunction";
	final String JS_CREATE_EVENT_LISTENERS_FUNCTION_PREFIX = "createEventListenersFunction";
	//final String JS_CREATE_POLYLINES_FUNCTION_PREFIX = "createPolylinesFunction";
	final String JS_CREATE_POLYLINE_FUNCTION_PREFIX = "createPolylineFunction";
    final String JS_FUNCTION = "function ";    
	//final String JS_CREATE_POLYGONS_FUNCTION_PREFIX = "createPolygonsFunction";
	final String JS_CREATE_POLYGON_FUNCTION_PREFIX = "createPolygonFunction";
    final String JS_CREATE_CIRCLE_FUNCTION_PREFIX = "createCircleFunction";    
	final String JS_CREATE_GROUND_OVERLAYS_FUNCTION_PREFIX = "createGroundOverlaysFunction";
	final String JS_CREATE_ICON_FUNCTION_PREFIX = "createIconFunction";
    final String JS_MAP_VARIABLE_PREFIX = "com_google_gmaps4jsf_map_";    
    final String JS_TAB = "    ";
	final String HTML_MAP_MARKERS_STATE_PREFIX = "com_googlecode_gmaps4jsf_mapMarkersState";
	final String HTML_MAP_STATE_PREFIX = "com_googlecode_gmaps4jsf_mapState";	
	final String HTML_MAP_LAST_CHANGED_MARKER_PREFIX = "com_googlecode_gmaps4jsf_lastChangedMarker";	
	final String MARKER_ATTR_LATITUDE = "latitude";
	final String MARKER_ATTR_LONGITUDE = "longitude";    
    final String MARKER_LOAD_EVENT ="load";
}
