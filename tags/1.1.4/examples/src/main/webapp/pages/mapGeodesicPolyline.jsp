<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://code.google.com/p/gmaps4jsf/" prefix="m" %>
<!DOCTYPE html "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <f:view>
        <head>
        	<%@include file="../templates/internalHeader.jspf" %>               
        </head>  
        <body onunload="GUnload()">
            <h:form id="form">
                <div>A Geodesic Polyline</div>
                <m:map width="90%" height="90%" latitude="24" longitude="15" zoom="2">
                    <m:polyline lineWidth="10" hexaColor="#ff0000" geodesic="true">
                        <m:point latitude="30.01" longitude="31.14"/>
                        <m:point latitude="48" longitude="2"/>
                        <m:point latitude="43" longitude="141"/>
                    </m:polyline>
                </m:map>
            </h:form>
            <%@include file="../templates/footer.jspf" %>
        </body>
    </f:view>
</html>