/*
 * XML Type:  repository
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.Repository
 *
 * Automatically generated - do not modify.
 */
package service.interfaces;


/**
 * An XML repository(@http://Interfaces.Service/).
 *
 * This is a complex type.
 */
public interface Repository extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Repository.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEF65AA20C68769C9114319E88E7CAEA1").resolveHandle("repository2bc9type");
    
    /**
     * Gets array of all "Person" elements
     */
    service.interfaces.Person[] getPersonArray();
    
    /**
     * Gets ith "Person" element
     */
    service.interfaces.Person getPersonArray(int i);
    
    /**
     * Returns number of "Person" element
     */
    int sizeOfPersonArray();
    
    /**
     * Sets array of all "Person" element
     */
    void setPersonArray(service.interfaces.Person[] personArray);
    
    /**
     * Sets ith "Person" element
     */
    void setPersonArray(int i, service.interfaces.Person person);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Person" element
     */
    service.interfaces.Person insertNewPerson(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Person" element
     */
    service.interfaces.Person addNewPerson();
    
    /**
     * Removes the ith "Person" element
     */
    void removePerson(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static service.interfaces.Repository newInstance() {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static service.interfaces.Repository newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static service.interfaces.Repository parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static service.interfaces.Repository parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static service.interfaces.Repository parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static service.interfaces.Repository parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static service.interfaces.Repository parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static service.interfaces.Repository parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static service.interfaces.Repository parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static service.interfaces.Repository parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static service.interfaces.Repository parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static service.interfaces.Repository parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static service.interfaces.Repository parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static service.interfaces.Repository parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static service.interfaces.Repository parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static service.interfaces.Repository parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.Repository parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static service.interfaces.Repository parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (service.interfaces.Repository) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
