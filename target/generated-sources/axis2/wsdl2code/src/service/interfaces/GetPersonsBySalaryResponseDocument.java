/*
 * An XML document type.
 * Localname: getPersonsBySalaryResponse
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonsBySalaryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces;


/**
 * A document containing one getPersonsBySalaryResponse(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public interface GetPersonsBySalaryResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsBySalaryResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getpersonsbysalaryresponsee0f9doctype");
    
    /**
     * Gets the "getPersonsBySalaryResponse" element
     */
    service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse getGetPersonsBySalaryResponse();
    
    /**
     * Sets the "getPersonsBySalaryResponse" element
     */
    void setGetPersonsBySalaryResponse(service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse getPersonsBySalaryResponse);
    
    /**
     * Appends and returns a new empty "getPersonsBySalaryResponse" element
     */
    service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse addNewGetPersonsBySalaryResponse();
    
    /**
     * An XML getPersonsBySalaryResponse(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public interface GetPersonsBySalaryResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsBySalaryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getpersonsbysalaryresponsebd9felemtype");
        
        /**
         * Gets the "return" element
         */
        service.interfaces.Repository getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(service.interfaces.Repository xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        service.interfaces.Repository addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse newInstance() {
              return (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static service.interfaces.GetPersonsBySalaryResponseDocument newInstance() {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonsBySalaryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonsBySalaryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
