<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://code.google.com/p/gmaps4jsf/" prefix="m" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<f:view>
	
    <head>         
    <title>Get My Location Example</title> 
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />    	
    <m:resources key="ABQIAAAAD6cDv-a0AnpzXA4gj6utCRTUlDOzA1Sd8h2eDxLDJEZUtkHZ_xQlPmNUQ-At6YLqCd29cGkwT8i95A"/>

    </head>
	
	<body onunload="GUnload()">
    	<h:form id="form">
    	
            <h:panelGrid columns="2">                
                <h:outputText value="Enter your address like 'Giza, Egypt' :"/>
                <h:inputText id="txtAddress" value="#{addressBean.address}"/>
                <h:commandButton value="Get my location on the map" action="#{addressBean.doSearch}"/>                                                 
            </h:panelGrid>      
            
            <h:panelGrid>                     	
	    		<m:map width="500px" height="500px" address="#{addressBean.address}">
	    			<m:marker/>
	    			<m:htmlInformationWindow htmlText="#{addressBean.address}"/>
	    		</m:map>
            </h:panelGrid>      		
    	</h:form>
	<%@include file="../templates/footer.jspf" %>   	
    </body>
	</f:view>    
</html>  