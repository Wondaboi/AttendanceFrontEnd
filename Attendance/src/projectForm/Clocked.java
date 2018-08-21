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
public class Clocked {
    
    private Integer clockedID;
    private String employeeID;
    private String clocked;
    
    public Clocked()
    {
        
    }
    
    public Clocked(String employeeID, String clocked)
    {
        this.employeeID = employeeID;
        this.clocked = clocked;
    }
    
    public Integer getClockedID() {
        return clockedID;
    }
    
    public void setClockedID(Integer id) {
        clockedID = id;
    }

    public String getEmployeeID() 
    
    { return employeeID; }
    
     public void setEmployeeID(String empID) {
        employeeID = empID;
    }


    public String getClocked() {
        return clocked;
    }
    
     public void setClocked(String clock) {
        clocked = clock;
    }
    
}
