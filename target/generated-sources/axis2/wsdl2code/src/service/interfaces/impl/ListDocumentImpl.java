/*
 * An XML document type.
 * Localname: list
 * Namespace: http://Interfaces.Service/
 * Java type: service.interfaces.ListDocument
 *
 * Automatically generated - do not modify.
 */
package service.interfaces.impl;
/**
 * A document containing one list(@http://Interfaces.Service/) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements service.interfaces.ListDocument
{
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://Interfaces.Service/", "list");
    
    
    /**
     * Gets the "list" element
     */
    public service.interfaces.Repository getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Repository target = null;
            target = (service.interfaces.Repository)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "list" element
     */
    public void setList(service.interfaces.Repository list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Repository target = null;
            target = (service.interfaces.Repository)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (service.interfaces.Repository)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "list" element
     */
    public service.interfaces.Repository addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            service.interfaces.Repository target = null;
            target = (service.interfaces.Repository)get_store().add_element_user(LIST$0);
            return target;
        }
    }
}
