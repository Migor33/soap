/*
 * An XML document type.
 * Localname: getPerson
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one getPerson(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class GetPersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonDocument
{
    
    public GetPersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSON$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "getPerson");
    
    
    /**
     * Gets the "getPerson" element
     */
    public service.interfaces.GetPersonDocument.GetPerson getGetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonDocument.GetPerson target = null;
            target = (service.interfaces.GetPersonDocument.GetPerson)get_store().find_element_user(GETPERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPerson" element
     */
    public void setGetPerson(service.interfaces.GetPersonDocument.GetPerson getPerson)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonDocument.GetPerson target = null;
            target = (service.interfaces.GetPersonDocument.GetPerson)get_store().find_element_user(GETPERSON$0, 0);
            if (target == null)
            {
                target = (service.interfaces.GetPersonDocument.GetPerson)get_store().add_element_user(GETPERSON$0);
            }
            target.set(getPerson);
        }
    }
    
    /**
     * Appends and returns a new empty "getPerson" element
     */
    public service.interfaces.GetPersonDocument.GetPerson addNewGetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonDocument.GetPerson target = null;
            target = (service.interfaces.GetPersonDocument.GetPerson)get_store().add_element_user(GETPERSON$0);
            return target;
        }
    }
    /**
     * An XML getPerson(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public static class GetPersonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonDocument.GetPerson
    {
        
        public GetPersonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERSONID$0 = 
            new javax.xml.namespace.QName("", "personId");
        
        
        /**
         * Gets the "personId" element
         */
        public java.lang.String getPersonId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "personId" element
         */
        public org.apache.xmlbeans.XmlString xgetPersonId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "personId" element
         */
        public boolean isNilPersonId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "personId" element
         */
        public void setPersonId(java.lang.String personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONID$0);
                }
                target.setStringValue(personId);
            }
        }
        
        /**
         * Sets (as xml) the "personId" element
         */
        public void xsetPersonId(org.apache.xmlbeans.XmlString personId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSONID$0);
                }
                target.set(personId);
            }
        }
        
        /**
         * Nils the "personId" element
         */
        public void setNilPersonId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERSONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERSONID$0);
                }
                target.setNil();
            }
        }
    }
}
