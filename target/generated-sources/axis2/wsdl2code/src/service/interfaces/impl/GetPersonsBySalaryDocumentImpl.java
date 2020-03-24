/*
 * An XML document type.
 * Localname: getPersonsBySalary
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.GetPersonsBySalaryDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one getPersonsBySalary(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class GetPersonsBySalaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonsBySalaryDocument
{
    
    public GetPersonsBySalaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPERSONSBYSALARY$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "getPersonsBySalary");
    
    
    /**
     * Gets the "getPersonsBySalary" element
     */
    public service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary getGetPersonsBySalary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary target = null;
            target = (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary)get_store().find_element_user(GETPERSONSBYSALARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getPersonsBySalary" element
     */
    public void setGetPersonsBySalary(service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary getPersonsBySalary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary target = null;
            target = (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary)get_store().find_element_user(GETPERSONSBYSALARY$0, 0);
            if (target == null)
            {
                target = (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary)get_store().add_element_user(GETPERSONSBYSALARY$0);
            }
            target.set(getPersonsBySalary);
        }
    }
    
    /**
     * Appends and returns a new empty "getPersonsBySalary" element
     */
    public service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary addNewGetPersonsBySalary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary target = null;
            target = (service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary)get_store().add_element_user(GETPERSONSBYSALARY$0);
            return target;
        }
    }
    /**
     * An XML getPersonsBySalary(@http://Interfaces.Service/).
     *
     * This is a complex type.
     */
    public static class GetPersonsBySalaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.GetPersonsBySalaryDocument.GetPersonsBySalary
    {
        
        public GetPersonsBySalaryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SALARY$0 = 
            new javax.xml.namespace.QName("", "Salary");
        
        
        /**
         * Gets the "Salary" element
         */
        public java.lang.String getSalary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Salary" element
         */
        public org.apache.xmlbeans.XmlString xgetSalary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "Salary" element
         */
        public boolean isNilSalary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "Salary" element
         */
        public void setSalary(java.lang.String salary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALARY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALARY$0);
                }
                target.setStringValue(salary);
            }
        }
        
        /**
         * Sets (as xml) the "Salary" element
         */
        public void xsetSalary(org.apache.xmlbeans.XmlString salary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALARY$0);
                }
                target.set(salary);
            }
        }
        
        /**
         * Nils the "Salary" element
         */
        public void setNilSalary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALARY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALARY$0);
                }
                target.setNil();
            }
        }
    }
}
