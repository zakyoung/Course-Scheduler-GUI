/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakyoung
 */
public class CourseEntry {
    private String Semester;
    private String CourseCode;
    private String Description;
    private int Seats;

    public CourseEntry(String Semester, String CourseCode, String Description, int Seats) {
        this.Semester = Semester;
        this.CourseCode = CourseCode;
        this.Description = Description;
        this.Seats = Seats;
    }
    
    public String toString(){
        return String.format("%s",CourseCode);
    }

    public String getSemester() {
        return Semester;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public String getDescription() {
        return Description;
    }

    public int getSeats(){
        return Seats;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }
    
}
