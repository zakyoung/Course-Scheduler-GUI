
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zakyoung
 */
public class CourseQueries {
        private static Connection connection;
        private static PreparedStatement addCourse;
        private static PreparedStatement getAllCourses;
        private static PreparedStatement getAllCourseCodes;
        private static PreparedStatement getCourseSeats;
        private static PreparedStatement dropCourse;
        private static ResultSet resultSet;
        
        public static ArrayList<CourseEntry> getAllCourses(String semester){
            connection = DBConnection.getConnection();
            ArrayList<CourseEntry> courses = new ArrayList<CourseEntry>();
            try{
                getAllCourses = connection.prepareStatement("select SEMESTER,COURSECODE,DESCRIPTION,SEATS from APP.COURSE where SEMESTER = ?");
                getAllCourses.setString(1,semester);
                // What do we do now; Are we supposed to make a new CourseEntry Object?
                resultSet = getAllCourses.executeQuery();
                while(resultSet.next())
                {   
                    CourseEntry newCourse = new CourseEntry(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
                    courses.add(newCourse);
                }
            }
            catch(SQLException sqlException){
                sqlException.printStackTrace();
            }
            return courses;
        }
        
        public static void addCourse(CourseEntry course){
            connection = DBConnection.getConnection();
            try
            {
                addCourse = connection.prepareStatement("insert into APP.COURSE(SEMESTER,COURSECODE,DESCRIPTION,SEATS) values (?,?,?,?)");
                addCourse.setString(1,course.getSemester());
                addCourse.setString(2, course.getCourseCode());
                addCourse.setString(3, course.getDescription());
                addCourse.setInt(4, course.getSeats());
                addCourse.executeUpdate();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }

        }
       
        public static ArrayList<String> getAllCourseCodes(String semester){
            connection = DBConnection.getConnection();
            ArrayList<String> courseCodes = new ArrayList<String>();
            try{
                getAllCourseCodes = connection.prepareStatement("select SEMESTER,COURSECODE from APP.COURSE where SEMESTER = ?");
                getAllCourseCodes.setString(1, semester);
                resultSet = getAllCourseCodes.executeQuery();
                while(resultSet.next())
                {   
                   courseCodes.add(resultSet.getString(2));
                }
                
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
            return courseCodes;
        }
        
        
        public static int getCourseSeats(String semester, String courseCode){
            connection = DBConnection.getConnection();
            int numberSeats = 0;
            try{
                getCourseSeats = connection.prepareStatement("select SEATS from APP.COURSE where semester = ? and courseCode = ?");
                getCourseSeats.setString(1,semester);
                getCourseSeats.setString(2, courseCode);
                resultSet = getCourseSeats.executeQuery();
                if(resultSet.next()){
                    numberSeats = resultSet.getInt(1);
                }
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }
            return numberSeats;
        }
        public static void dropCourse(String semester, String courseCode){
            connection = DBConnection.getConnection();
            try
            {
                dropCourse = connection.prepareStatement("DELETE from APP.COURSE where SEMESTER = ? and COURSECODE = ?");
                dropCourse.setString(1,semester);
                dropCourse.setString(2,courseCode);
                dropCourse.executeUpdate();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
            }

        }
    
}
