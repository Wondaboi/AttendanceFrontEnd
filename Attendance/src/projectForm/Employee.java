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
public class Employee {
    private Integer empID;
    private String employeeID;
    private String name;
    private String lname;
    
    public Employee()
    {
        
    }
    
    public Employee(String employeeID, String name, String lname)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.lname = lname;
    }
    
    public Integer getEmpID() {
        return empID;
    }
    
    public void setEmpID(Integer id) {
        empID = id;
    }

    public String getEmployeeID() 
    
    { return employeeID; }
    
     public void setEmployeeID(String empID) {
        employeeID = empID;
    }


    public String getName() {
        return name;
    }
    
     public void setName(String fn) {
        name = fn;
    }
    public String getLname() {
        return lname;
    }
    
     public void setLname(String ln) {
        name = ln;
    }
}
