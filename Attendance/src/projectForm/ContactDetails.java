/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectForm;

/**
 *
 * @author ajpGa
 */
public class ContactDetails {
     private Integer contactDetailsID;
    private String employeeID;
    private String contactDetails;
    
    public ContactDetails()
    {
        
    }
    
    public ContactDetails(String employeeID, String contactDetails)
    {
        this.employeeID = employeeID;
        this.contactDetails = contactDetails;
    }
    
    public Integer getContactDetailsID() {
        return contactDetailsID;
    }
    
    public void setContactDetailsID(Integer id) {
        contactDetailsID = id;
    }

    public String getEmployeeID() 
    
    { return employeeID; }
    
     public void setEmployeeID(String empID) {
        employeeID = empID;
    }


    public String getContactDetails() {
        return contactDetails;
    }
    
     public void setContactDetails(String contact) {
      contactDetails = contact;
    }
    
}
