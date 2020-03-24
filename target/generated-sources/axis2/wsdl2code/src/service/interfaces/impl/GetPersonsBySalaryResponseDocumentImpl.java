/*
 * An XML document type.
 * Localname: getPersonsBySalaryResponse
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonsBySalaryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one getPersonsBySalaryResponse(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class GetPersonsBySalaryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonsBySalaryResponseDocument
{
    
    public GetPersonsBySalaryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONSBYSALARYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "getPersonsBySalaryResponse");
    
    
    /**
     * Gets the "getPersonsBySalaryResponse" element
     */
    public service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse getGetPersonsBySalaryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse target = null;
            target = (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse)get_store().find_element_user(GETPERSONSBYSALARYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonsBySalaryResponse" element
     */
    public void setGetPersonsBySalaryResponse(service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse getPersonsBySalaryResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse target = null;
            target = (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse)get_store().find_element_user(GETPERSONSBYSALARYRESPONSE$0, 0);
            if (target == null)
            {
                target = (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse)get_store().add_element_user(GETPERSONSBYSALARYRESPONSE$0);
            }
            target.set(getPersonsBySalaryResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonsBySalaryResponse" element
     */
    public service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse addNewGetPersonsBySalaryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse target = null;
            target = (service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse)get_store().add_element_user(GETPERSONSBYSALARYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getPersonsBySalaryResponse(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public static class GetPersonsBySalaryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonsBySalaryResponseDocument.GetPersonsBySalaryResponse
    {
        
        public GetPersonsBySalaryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public service.interfaces.Repository getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Repository target = null;
                target = (service.interfaces.Repository)get_store().find_element_user(RETURN$0, 0);
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
                service.interfaces.Repository target = null;
                target = (service.interfaces.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(service.interfaces.Repository xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Repository target = null;
                target = (service.interfaces.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (service.interfaces.Repository)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public service.interfaces.Repository addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                service.interfaces.Repository target = null;
                target = (service.interfaces.Repository)get_store().add_element_user(RETURN$0);
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
                service.interfaces.Repository target = null;
                target = (service.interfaces.Repository)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (service.interfaces.Repository)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
