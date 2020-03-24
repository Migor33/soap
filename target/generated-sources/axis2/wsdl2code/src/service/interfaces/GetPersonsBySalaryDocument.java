/*
 * An XML document type.
 * Localname: getPersonsBySalary
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonsBySalaryDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces;


/**
 * A document containing one getPersonsBySalary(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public interface GetPersonsBySalaryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsBySalaryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getpersonsbysalary4bfadoctype");
    
    /**
     * Gets the "getPersonsBySalary" element
     */
    service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary getGetPersonsBySalary();
    
    /**
     * Sets the "getPersonsBySalary" element
     */
    void setGetPersonsBySalary(service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary getPersonsBySalary);
    
    /**
     * Appends and returns a new empty "getPersonsBySalary" element
     */
    service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary addNewGetPersonsBySalary();
    
    /**
     * An XML getPersonsBySalary(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public interface GetPersonsBySalary extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetPersonsBySalary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("getpersonsbysalary2d3felemtype");
        
        /**
         * Gets the "Salary" element
         */
        java.lang.String getSalary();
        
        /**
         * Gets (as xml) the "Salary" element
         */
        org.apache.xmlbeans.XmlString xgetSalary();
        
        /**
         * Tests for nil "Salary" element
         */
        boolean isNilSalary();
        
        /**
         * Sets the "Salary" element
         */
        void setSalary(java.lang.String salary);
        
        /**
         * Sets (as xml) the "Salary" element
         */
        void xsetSalary(org.apache.xmlbeans.XmlString salary);
        
        /**
         * Nils the "Salary" element
         */
        void setNilSalary();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary newInstance() {
              return (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static service.interfaces.GetPersonsBySalaryDocument newInstance() {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static service.interfaces.GetPersonsBySalaryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonsBySalaryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.GetPersonsBySalaryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.GetPersonsBySalaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
