/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakyoung
 */
public class StudentEntry {
    private String StudentID;
    private String FirstName;
    private String LastName;

    public StudentEntry(String StudentID, String FirstName, String LastName) {
        this.StudentID = StudentID;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String toString() {
      return String.format("%s, %s",LastName,FirstName);
       }
    public String getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    
}
