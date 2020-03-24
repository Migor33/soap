/*
 * An XML document type.
 * Localname: Person
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.PersonDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one Person(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class PersonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.PersonDocument
{
    
    public PersonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSON$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "Person");
    
    
    /**
     * Gets the "Person" element
     */
    public service.interfaces.Person getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Person" element
     */
    public void setPerson(service.interfaces.Person person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Person target = null;
            target = (service.interfaces.Person)get_store().find_element_user(PERSON$0, 0);
            if (target == null)
            {
                target = (service.interfaces.Person)get_store().add_element_user(PERSON$0);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "Person" element
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
}
