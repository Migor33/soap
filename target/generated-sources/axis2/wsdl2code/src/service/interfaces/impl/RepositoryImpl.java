/*
 * XML Type:  repository
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.Repository
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * An XML repository(@http://Interfaces.Service/).
 *
 * This is a complex type.
 */
public class RepositoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.Repository
{
    
    public RepositoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("", "Person");
    
    
    /**
     * Gets array of all "Person" elements
     */
    public service.interfaces.Person[] getPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSON$0, targetList);
            service.interfaces.Person[] result = new service.interfaces.Person[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Person" element
     */
    public service.interfaces.Person getPersonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Person" element
     */
    public int sizeOfPersonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$0);
        }
    }
    
    /**
     * Sets array of all "Person" element
     */
    public void setPersonArray(service.interfaces.Person[] personArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personArray, PERSON$0);
        }
    }
    
    /**
     * Sets ith "Person" element
     */
    public void setPersonArray(int i, service.interfaces.Person person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().find_element_user(PERSON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(person);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Person" element
     */
    public service.interfaces.Person insertNewPerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().insert_element_user(PERSON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Person" element
     */
    public service.interfaces.Person addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().add_element_user(PERSON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Person" element
     */
    public void removePerson(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$0, i);
        }
    }
}
