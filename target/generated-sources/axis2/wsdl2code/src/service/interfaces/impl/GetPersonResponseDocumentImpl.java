/*
 * An XML document type.
 * Localname: getPersonResponse
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonResponseDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one getPersonResponse(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class GetPersonResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonResponseDocument
{
    
    public GetPersonResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "getPersonResponse");
    
    
    /**
     * Gets the "getPersonResponse" element
     */
    public service.interfaces.GetPersonResponseDocument.GetPersonResponse getGetPersonResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (service.interfaces.GetPersonResponseDocument.GetPersonResponse)get_store().find_element_user(GETPERSONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonResponse" element
     */
    public void setGetPersonResponse(service.interfaces.GetPersonResponseDocument.GetPersonResponse getPersonResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (service.interfaces.GetPersonResponseDocument.GetPersonResponse)get_store().find_element_user(GETPERSONRESPONSE$0, 0);
            if (target == null)
            {
                target = (service.interfaces.GetPersonResponseDocument.GetPersonResponse)get_store().add_element_user(GETPERSONRESPONSE$0);
            }
            target.set(getPersonResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonResponse" element
     */
    public service.interfaces.GetPersonResponseDocument.GetPersonResponse addNewGetPersonResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonResponseDocument.GetPersonResponse target = null;
            target = (service.interfaces.GetPersonResponseDocument.GetPersonResponse)get_store().add_element_user(GETPERSONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getPersonResponse(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public static class GetPersonResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonResponseDocument.GetPersonResponse
    {
        
        public GetPersonResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public service.interfaces.Person getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Person target = null;
                target = (service.interfaces.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Person target = null;
                target = (service.interfaces.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(service.interfaces.Person xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Person target = null;
                target = (service.interfaces.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (service.interfaces.Person)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public service.interfaces.Person addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Person target = null;
                target = (service.interfaces.Person)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Person target = null;
                target = (service.interfaces.Person)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (service.interfaces.Person)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
