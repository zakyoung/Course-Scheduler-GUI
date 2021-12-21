/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakyoung
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentQueries {
    private static Connection connection;
    private static ResultSet resultSet;
    private static PreparedStatement addStudent;
    private static PreparedStatement getAllStudents;
    private static PreparedStatement getStudent;
    private static PreparedStatement dropStudent;
    public static void addStudent(StudentEntry student){
        connection = DBConnection.getConnection();
        try
        {
            addStudent = connection.prepareStatement("insert into app.STUDENT(STUDENTID,FIRSTNAME,LASTNAME) values (?,?,?)");
            addStudent.setString(1,student.getStudentID());
            addStudent.setString(2, student.getFirstName());
            addStudent.setString(3, student.getLastName());
            addStudent.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();    
        }
    }
   public static ArrayList<StudentEntry>  getAllStudents(){
       connection = DBConnection.getConnection();
       ArrayList<StudentEntry> allStudents = new ArrayList<StudentEntry>();
       try
       {
           getAllStudents = connection.prepareStatement("select STUDENTID,FIRSTNAME,LASTNAME from APP.STUDENT");
           resultSet = getAllStudents.executeQuery();
           while (resultSet.next()){
               StudentEntry student = new StudentEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
               allStudents.add(student);
             }
       }
        catch(SQLException sqlException)
        {
           sqlException.printStackTrace();    
        }
       return allStudents;
   }
   public static StudentEntry getStudent(String studentID){
       connection = DBConnection.getConnection();
       StudentEntry student = new StudentEntry("","","");
       try
       {
         getStudent = connection.prepareStatement("select STUDENTID,FIRSTNAME,LASTNAME from APP.STUDENT where STUDENTID = ?");
         getStudent.setString(1, studentID);
         resultSet = getStudent.executeQuery();
         if(resultSet.next()){
                    student.setStudentID(resultSet.getString(1));
                    student.setFirstName(resultSet.getString(2));
                    student.setLastName(resultSet.getString(3));
            }
         
       }
        catch(SQLException sqlException)
        {
           sqlException.printStackTrace();    
        }
        return student;
   }
    public static void dropStudent(String studentID){
        connection = DBConnection.getConnection();
        try
        {
            dropStudent = connection.prepareStatement("delete from APP.STUDENT where STUDENTID = ? ");
            dropStudent.setString(1,studentID);
            dropStudent.executeUpdate();
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();    
        }
    }
}
