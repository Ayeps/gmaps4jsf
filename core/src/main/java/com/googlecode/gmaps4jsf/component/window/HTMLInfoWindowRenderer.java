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
package com.googlecode.gmaps4jsf.component.window;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.googlecode.gmaps4jsf.component.common.BaseRenderer;
import com.googlecode.gmaps4jsf.component.map.EventEncoder;
import com.googlecode.gmaps4jsf.util.ComponentUtils;

/**
 * @author Jose Noheda [jose.noheda@gmail.com]
 * @author hazems
 * @date Dec 23, 2012
 */
public class HTMLInfoWindowRenderer extends BaseRenderer {

    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        writer.write(ComponentUtils.pad(component) + "parent.createInfoWindow(" + convertToJavascriptObject(context, (HTMLInformationWindow) component) + ", parent, function (parent) {\n");
        EventEncoder.encodeEventListeners(context, (HTMLInformationWindow) component, writer);
    }

    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        writer.write(ComponentUtils.pad(component) + "});\n");     
    }

    protected String convertToJavascriptObject(FacesContext context, HTMLInformationWindow infoWindow) {
        StringBuffer buffer = new StringBuffer("{latitude: ");
        buffer.append(infoWindow.getLatitude()).append(", longitude: ");
        buffer.append(infoWindow.getLongitude()).append(", htmlText: '");
        buffer.append(ComponentUtils.unicode(infoWindow.getHtmlText())).append("'}");
        return buffer.toString();
    }

}
