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
public class Position {
       
     private Integer positionID;
    private String employeeID;
    private String position;
    
    public Position()
    {
        
    }
    
    public Position(String employeeID, String position)
    {
        this.employeeID = employeeID;
        this.position = position;
    }
    
    public Integer getPositionID() {
        return positionID;
    }
    
    public void setPositionID(Integer id) {
        positionID = id;
    }

    public String getEmployeeID() 
    
    { return employeeID; }
    
     public void setEmployeeID(String empID) {
        employeeID = empID;
    }


    public String getPosition() {
        return position;
    }
    
     public void setPosition(String pos) {
        position = pos;
    }
       
}
