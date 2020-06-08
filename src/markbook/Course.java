package markbook;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
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
    public Course(String courseName, int teachNum, int periodNum) {
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
     */
    public void sortIncreasing() {
        for (int i = 0; i < this.students.size(); i++) {
            for (int j = 1; j < this.students.size() - i; j++) {
                if (this.students.get(j).getAverage() < this.students.get(j - 1).getAverage()) {
                    Collections.swap(students, j, j-1);
                }
            }
        }
    }
    
    /**
     * Method of sorting the students in order of highest to lowest mark.
     */
    public void sortDecreasing() {
        for (int i = this.students.size() - 1; i > 0; i--) {
            for (int j = this.students.size() - i; j > 0; j--) {
                if (this.students.get(j).getAverage() < this.students.get(j - 1).getAverage()) {
                    Collections.swap(students, j, j-1);
                }
            }
        }
    }
    /**
    public int checkStudent(int stuNum, int index) {
        if (this.students.get(index).checkStudent(stuNum)) {
            return index;
        } else if (!this.students.get(index).checkStudent(stuNum)) {
            return this.checkStudent(stuNum, index++);
        } else {
            return -1;
        }           
    }
    */
    
    /**
     * Checks if a student exists in a course.
     * @param stuNum The student's identification number.
     * @return The index of the student in the ArrayList.
     */
    public int checkStudent(int stuNum) {
        int returnNum = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).checkStudent(stuNum)) {
                returnNum = i;
            }
        }
        return returnNum;
    }
    
    public boolean courseOutputStudent(int studentNum, String name) {
        boolean success = false;
        StudentDashboard student = new StudentDashboard();
        student.setVisible(true);
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).checkStudent(studentNum)) {
                success = true;
                student.userMark.setText(String.valueOf(this.students.get(i).getAverage()));
                student.courseName.setText(this.course);
                student.userName.setText(name);
                student.periodNum.setText(String.valueOf(this.periodNumber));
                DefaultTableModel model= (DefaultTableModel)student.markTable.getModel();
                Object[] rowData = new Object[7];
                for (int j = 0; j < this.students.get(i).entries.size(); j++) {
                    rowData[0] = this.students.get(i).entries.get(j).getKnowledge();
                    rowData[1] = this.students.get(i).entries.get(j).getApplication();
                    rowData[2] = this.students.get(i).entries.get(j).getCommunication();
                    rowData[3] = this.students.get(i).entries.get(j).getThinking();
                    rowData[4] = this.students.get(i).entries.get(j).getWeighting();
                    rowData[5] = this.students.get(i).entries.get(j).getEntryName();
                    rowData[6] = this.students.get(i).entries.get(j).calculateMark();
                    model.addRow(rowData);
                }
            }
        }
        return success;
    }
    
     public void courseOutputTeacher(int teacherNum, String name) {
        TeacherDashboard teacher = new TeacherDashboard();
        teacher.courseName.setText(this.course);
        teacher.teacherName.setText(name);
        teacher.teacherNum.setText(String.valueOf(teacherNum));
        DefaultTableModel model= (DefaultTableModel)teacher.markTable.getModel();
        Object[] rowData = new Object[2];
        for (int i = 0; i < this.students.size(); i++) {
            rowData[0] = this.students.get(i).getStudentNumber();
            rowData[1] = this.students.get(i).getAverage();
            model.addRow(rowData);
        }
        teacher.periodOutput.setText(String.valueOf(this.periodNumber));
        teacher.setVisible(true);
    }
    
    public boolean deleteStudent(int stuNum) {
        boolean success = false;
        String path = new File("data\\" + this.course).getAbsolutePath();
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).checkStudent(stuNum)) {
                this.students.remove(i);
                success = true;
                File deleteText = new File(path + "\\" + stuNum + ".txt");
                deleteText.setWritable(true);
                deleteText.delete();
            }
        }
        return success;
    }
    
    /**
     * Saves all the information of the course into a folder. 
     */
    public void saveCourse() {
        String path = new File("data").getAbsolutePath();
        File dir = new File(path + "\\" + this.course);
        dir.mkdirs();
        File txt;
        String txtName;
        FileWriter writer;
        txt = new File(path + "\\" + this.course + "\\"+ this.course + ".txt");
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
    
    public boolean deleteEntry(int stuNum, String entryName) {
        boolean result = false;
        int index = -1;
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentNumber() == stuNum) {
               index = i;
            } 
        }
        if (index != -1) {
            result = this.students.get(index).deleteEntry(entryName);
            System.out.println(result);
            this.saveCourse();
        }
        return result;
    }
    
    public boolean addEntry(int stuNum, double ku, double app, double comm, double tips, double kuTotal, double appTotal, double commTotal, double tipsTotal, int weight, String entry) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentNumber() == stuNum) {
                this.students.get(i).addEntry(ku, app, comm, tips, kuTotal, appTotal, commTotal, tipsTotal, weight, entry);
                this.saveCourse();
                return true;
            }
        }
        return false;
    }
}
/**
 * 
 */