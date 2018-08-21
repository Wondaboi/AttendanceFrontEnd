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
public class Address {
     
    private Integer addressID;
    private String employeeID;
    private String address;
    
    public Address()
    {
        
    }
    
    public Address(String employeeID, String address)
    {
        this.employeeID = employeeID;
        this.address = address;
    }
    
    public Integer getAddressID() {
        return addressID;
    }
    
    public void setAddressID(Integer addressID) {
        addressID = addressID;
    }

    public String getEmployeeID() 
    
    { return employeeID; }
    
     public void setEmployeeID(String employeeID) {
        employeeID = employeeID;
    }


    public String getAddress() {
        return address;
    }
    
     public void setAddress(String address) {
        address = address;
    }
}
