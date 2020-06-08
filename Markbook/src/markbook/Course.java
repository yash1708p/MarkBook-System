package markbook;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files; 
import java.nio.file.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;
/**
 * Title: <h1>Course</h1>
 * @version 1.0
 * @author Adrian Chung, Yash Patel, Kiran Patel
 * @since December 17, 2019
 */

public class Course {
    public String course;
    private ArrayList<StudentCourseInfo> students;
    public int periodNumber;
    private int teacherNumber;
    
    /**
     * Constructor for Course instance.
     * @param courseName The course name.
     * @param periodNum The period in which the course takes place.
     * @param teachNum The course teacher's identification number.
     */
    public Course(String courseName, int periodNum, int teachNum) {
        course = courseName;
        periodNumber = periodNum;
        teacherNumber = teachNum;
        students = new ArrayList<>();
    }

    /**
     * Getter for list of students.
     * @return The list of students in the course.
     */
    public ArrayList<StudentCourseInfo> getStudents() {
        return this.students;
    }
    
    /**
     * Method of checking whether a teacher teaches a certain course.
     * @param teachNum
     * @return True or false based upon if the teacher teaches the course.
     */
    public boolean checkTeacher(int periodNum, int teachNum) {
        return this.teacherNumber == teachNum && periodNumber == periodNum;
    }
    
    /**
     * Method of adding new students to the course.
     * @param studentNumber The student number of the new student.
     */
    public boolean addStudent(int studentNumber) {
        boolean studentExists = false;
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).checkStudent(studentNumber)) {
                studentExists = true;
            }
        }
        if (!studentExists) {
            this.students.add(new StudentCourseInfo(studentNumber));
        }
        return studentExists;
    }
    
    /**
     * Method for sorting the students in order of lowest to highest mark.
     * @return The sorted array.
     */
    public ArrayList<StudentCourseInfo> sortIncreasing() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = 1; j < this.students.size() - i; j++) {
                if (this.students.get(j).getAverage() < this.students.get(j - 1).getAverage()) {
                    Collections.swap(students, j, j-1);
                }
            }
        }
        return this.students;
    }
    
    public int checkStudent(int stuNum, int index) {
        if (this.students.get(index).checkStudent(stuNum)) {
            return index;
        } else if (index >= this.students.size()) {
            return -1;
        }             
        else {
            return this.checkStudent(stuNum, index++);
        }
    }
    
    public void listStudents() {
        for (int i = 0; i < this.students.size(); i++) {
            this.students.get(i).listEntries();
        }
    }
    
    /**
     * Saves all the information of the course into a folder. 
     */
    public void saveCourse() {
        String path = new File("data").getAbsolutePath();
        File dir = new File(path);
        dir.mkdirs();
        File txt;
        String txtName;
        FileWriter writer;
        txt = new File(path + "\\" + this.course + "\\" + this.course + ".txt");
        try {
            writer = new FileWriter(txt);      
            writer.write(this.course + System.getProperty("line.separator"));
            writer.write(Integer.toString(this.teacherNumber) + System.getProperty("line.separator"));
            writer.write(Integer.toString(this.periodNumber) + System.getProperty("line.separator"));
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < this.students.size(); i++) {
            txtName = Integer.toString(this.students.get(i).getStudentNumber());
            txt = new File(path + "\\" + this.course + "\\" + txtName + ".txt");
            try {
                writer = new FileWriter(txt);
                writer.write(Integer.toString(this.students.get(i).getStudentNumber()) + System.getProperty("line.separator"));
                for (int j = 0; j < this.students.get(i).entries.size(); j++) {
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getKnowledge()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getApplication()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getCommunication()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getThinking()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getKnowledgeTotal()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getApplicationTotal()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getCommunicationTotal()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getThinkingTotal()) + System.getProperty("line.separator"));
                    writer.write(Double.toString(this.students.get(i).entries.get(j).getWeighting()) + System.getProperty("line.separator"));
                    writer.write(this.students.get(i).entries.get(j).getEntryName() + System.getProperty("line.separator"));
                }
                writer.close();
            } catch (IOException ex) {
                System.out.println("Exception Occurred:");
            }
        }
       
    }
    
    public boolean addEntry(int stuNum, double ku, double app, double comm, double tips, double kuTotal, double appTotal, double commTotal, double tipsTotal, int weight, String entry) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentNumber() == stuNum) {
                this.students.get(i).addEntry(ku, app, comm, tips, kuTotal, appTotal, commTotal, tipsTotal, weight, entry);
                return true;
            }
        }
        return false;
    }
}
/**
 * 
 */