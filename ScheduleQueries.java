
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakyoung
 */

public class ScheduleQueries {
        private static Connection connection;
        private static PreparedStatement addScheduleEntry;
        private static PreparedStatement getScheduleByStudent;
        private static PreparedStatement getNumberOfStudents;
        private static PreparedStatement getScheduledStudentsByCourse;
        private static PreparedStatement getWaitListedStudentsByCourse;
        private static PreparedStatement dropStudentScheduleByCourse;
        private static PreparedStatement dropScheduleByCourse;
        private static PreparedStatement getWaitlistByCourse;
        private static PreparedStatement updateScheduleEntry;
        private static PreparedStatement getStudentStatusForCourse;
        private static ResultSet resultSet;
        public static void addScheduleEntry(ScheduleEntry entry){
            connection = DBConnection.getConnection();
            try
            {
                addScheduleEntry = connection.prepareStatement("insert into APP.SCHEDULE(SEMESTER,COURSECODE,STUDENTID,STATUS,TIMESTAMP) values (?,?,?,?,?)");
                addScheduleEntry.setString(1,entry.getSemester());
                addScheduleEntry.setString(2, entry.getCourseCode());
                addScheduleEntry.setString(3, entry.getStudentID());
                addScheduleEntry.setString(4, entry.getStatus());
                addScheduleEntry.setTimestamp(5,entry.getTimestamp());
                addScheduleEntry.executeUpdate();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }

        }
    public static ArrayList<ScheduleEntry> getScheduleByStudent(String semester, String studentID){
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> schedules = new ArrayList<ScheduleEntry>();
        try{
            getScheduleByStudent = connection.prepareStatement("select * from APP.SCHEDULE where STUDENTID = ? and SEMESTER = ?");
            getScheduleByStudent.setString(1,studentID);
            getScheduleByStudent.setString(2,semester);
            resultSet = getScheduleByStudent.executeQuery();
            while(resultSet.next())
            {   
                ScheduleEntry sch = new ScheduleEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5));
                schedules.add(sch);
            }
                
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        return schedules;
    }
    public static int getScheduledStudentCount(String semester, String CourseCode){
        connection = DBConnection.getConnection();
        int count = 0;
        try{
            getNumberOfStudents = connection.prepareStatement("select count(STUDENTID) from app.SCHEDULE where SEMESTER = ? and COURSECODE = ?");
            getNumberOfStudents.setString(1,semester);
            getNumberOfStudents.setString(2,CourseCode);
            resultSet = getNumberOfStudents.executeQuery();
            if(resultSet.next()){
                count = resultSet.getInt(1);
            }
            resultSet.getInt(1);
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        return count;
    }
    public static ArrayList<ScheduleEntry> getScheduledStudentsByCourse(String semester, String courseCode){
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> allStudents = new ArrayList<ScheduleEntry>();
        try{
            getScheduledStudentsByCourse = connection.prepareStatement("select SEMESTER,COURSECODE,STUDENTID,STATUS,TIMESTAMP from app.SCHEDULE where SEMESTER = ? and COURSECODE = ? and STATUS = ?");
            getScheduledStudentsByCourse.setString(1,semester);
            getScheduledStudentsByCourse.setString(2,courseCode);
            getScheduledStudentsByCourse.setString(3,"Scheduled");
            resultSet = getScheduledStudentsByCourse.executeQuery();
            while(resultSet.next()){
                ScheduleEntry entry = new ScheduleEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5));
                allStudents.add(entry);
            }
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        return allStudents;
    }
    public static ArrayList<ScheduleEntry> getWaitlistedStudentsByCourse(String semester, String courseCode) {
        connection = DBConnection.getConnection();
        ArrayList<ScheduleEntry> allWaitListedStudents = new ArrayList<ScheduleEntry>();
        try{
            getWaitListedStudentsByCourse  = connection.prepareStatement("select SEMESTER,COURSECODE,STUDENTID,STATUS,TIMESTAMP from app.SCHEDULE where SEMESTER = ? and COURSECODE = ? and STATUS = ?");
            getWaitListedStudentsByCourse.setString(1,semester);
            getWaitListedStudentsByCourse.setString(2,courseCode);
            getWaitListedStudentsByCourse.setString(3,"Waitlisted");
            resultSet = getWaitListedStudentsByCourse.executeQuery();
            while(resultSet.next()){
                ScheduleEntry entry = new ScheduleEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getTimestamp(5));
                allWaitListedStudents.add(entry);
            }
            
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        return allWaitListedStudents;
    }
    public static void dropStudentScheduleByCourse(String semester, String studentID, String courseCode){
        connection = DBConnection.getConnection();
        try{
            dropStudentScheduleByCourse = connection.prepareStatement("delete from app.SCHEDULE where SEMESTER = ? and STUDENTID = ? and courseCode = ?");
            dropStudentScheduleByCourse.setString(1, semester);
            dropStudentScheduleByCourse.setString(2,studentID);
            dropStudentScheduleByCourse.setString(3,courseCode);
            dropStudentScheduleByCourse.executeUpdate();
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
    }
    public static void dropScheduleByCourse(String semester, String courseCode){
        connection = DBConnection.getConnection();
        try{
            dropScheduleByCourse = connection.prepareStatement("delete from app.SCHEDULE where SEMESTER = ? and courseCode = ?");
            dropScheduleByCourse.setString(1, semester);
            dropScheduleByCourse.setString(2, courseCode);
            dropScheduleByCourse.executeUpdate();
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
    }

    public static void updateScheduleEntry(String semester, ScheduleEntry entry){
        connection = DBConnection.getConnection();
        try{
            updateScheduleEntry = connection.prepareStatement("UPDATE app.SCHEDULE set STATUS = ?, TIMESTAMP = ? where SEMESTER = ? and COURSECODE = ? and STUDENTID = ?");
            updateScheduleEntry.setString(1, entry.getStatus());
            updateScheduleEntry.setTimestamp(2,entry.getTimestamp());
            updateScheduleEntry.setString(3, semester);
            updateScheduleEntry.setString(4, entry.getCourseCode());
            updateScheduleEntry.setString(5,entry.getStudentID());
            updateScheduleEntry.executeUpdate();
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
    }
    public static ScheduleEntry getfirstWaitlistedStudent(ArrayList<ScheduleEntry> allEntries){
        ScheduleEntry oldestValue = allEntries.get(0);
        if(allEntries.size() >= 1){
            for(ScheduleEntry entry: allEntries){
                if(entry.getTimestamp().compareTo(oldestValue.getTimestamp()) < 0){
                    oldestValue = entry;
                }
            }
        }
        return oldestValue;
    }
    public static boolean getStudentStatusForCourse(String semester, String studentID,String courseCode){
        //Returns true if student is enrolled and false if student is waitlisted
        connection = DBConnection.getConnection();
        boolean status  = false;
        try{
            getStudentStatusForCourse = connection.prepareStatement("select STATUS from app.SCHEDULE where SEMESTER = ? and STUDENTID = ? and COURSECODE = ?");
            getStudentStatusForCourse.setString(1, semester);
            getStudentStatusForCourse.setString(2,studentID);
            getStudentStatusForCourse.setString(3, courseCode);
            resultSet = getStudentStatusForCourse.executeQuery();
            if(resultSet.next()){
                String classStatus = resultSet.getString(1);
                if(classStatus.equals("Waitlisted")){
                    status = false;
                }
                else{
                    status = true;
                }
            }
        }
        catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
        return status;
    }
}
