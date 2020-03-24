/*
 * An XML document type.
 * Localname: getPerson
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces;


/**
 * A document containing one getPerson(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public interface GetPersonDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getpersonfceadoctype");
    
    /**
     * Gets the "getPerson" element
     */
    service.interfaces.GetPersonDocument.GetPerson getGetPerson();
    
    /**
     * Sets the "getPerson" element
     */
    void setGetPerson(service.interfaces.GetPersonDocument.GetPerson getPerson);
    
    /**
     * Appends and returns a new empty "getPerson" element
     */
    service.interfaces.GetPersonDocument.GetPerson addNewGetPerson();
    
    /**
     * An XML getPerson(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public interface GetPerson extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPerson.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getperson4c53elemtype");
        
        /**
         * Gets the "personId" element
         */
        java.lang.String getPersonId();
        
        /**
         * Gets (as xml) the "personId" element
         */
        org.apache.xmlbeans.XmlString xgetPersonId();
        
        /**
         * Tests for nil "personId" element
         */
        boolean isNilPersonId();
        
        /**
         * Sets the "personId" element
         */
        void setPersonId(java.lang.String personId);
        
        /**
         * Sets (as xml) the "personId" element
         */
        void xsetPersonId(org.apache.xmlbeans.XmlString personId);
        
        /**
         * Nils the "personId" element
         */
        void setNilPersonId();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static service.interfaces.GetPersonDocument.GetPerson newInstance() {
              return (service.interfaces.GetPersonDocument.GetPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static service.interfaces.GetPersonDocument.GetPerson newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (service.interfaces.GetPersonDocument.GetPerson) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static service.interfaces.GetPersonDocument newInstance() {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static service.interfaces.GetPersonDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static service.interfaces.GetPersonDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static service.interfaces.GetPersonDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static service.interfaces.GetPersonDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static service.interfaces.GetPersonDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static service.interfaces.GetPersonDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static service.interfaces.GetPersonDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static service.interfaces.GetPersonDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static service.interfaces.GetPersonDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
