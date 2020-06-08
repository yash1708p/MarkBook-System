package markbook;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Title<h1>Markbook</h1>
 * @version 1.0
 * @author Kiran Patel, Yash Patel, Adrian Chung
 * @since December 17, 2019
 */
public final class Markbook {
    ArrayList <Course> courses;
    ArrayList <Person> users;
    
    public Markbook() {
        courses = new ArrayList<>();
        users = new ArrayList<>();
        this.loadUsers();
        this.loadData();
    }
    
    public void listUsers() {
        for (int i = 0; i < this.users.size(); i++) {
            System.out.println(this.users.get(i).getName());
        }
    }
    
    public void listCourses() {
        for (int i = 0; i < this.courses.size(); i++) {
            System.out.println(this.courses.get(i).course);
            this.courses.get(i).listStudents();
        }
    }
    
    public void addCourse(String course, int period, int teacherNumber) {
        boolean courseExists = false;
        if (courses.size() > 0) {
            for (int i = 0; i < this.courses.size(); i++) {
                if (courses.get(i).checkTeacher(period, teacherNumber)) {
                    courseExists = true;
                }
            }
        }
        if (!courseExists) {
            this.courses.add(new Course(course, period, teacherNumber));
            this.saveCourses();
        }
    }
    
    public void addStudentToCourse(String course, int period, int studentNumber) {
        boolean studentExists = false;
        for (int i = 0; i < this.courses.size(); i++) {
            if (this.courses.get(i).addStudent(studentNumber)) {
                studentExists = true;
            }
        }
        if (!studentExists) {
            for (int i = 0; i < this.courses.size(); i++) {
                if (this.courses.get(i).equals(course) && this.courses.get(i).periodNumber == period) {
                    this.courses.get(i).addStudent(studentNumber);
                }
            }
        }
    }
    
    public boolean addStudent(String name, int studentNumber, String password) {
        boolean studentExists = false;
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getNumber() == studentNumber) {
                studentExists = true;
            }
        }
        if (!studentExists) {
            this.users.add(new Student(name, studentNumber, password));
            this.saveUsers();
        }
        return !studentExists;
    }
    
    public boolean addTeacher(String name, int teacherNumber, String password) {
        boolean teacherExists = false;
        for (int i = 0; i < this.users.size(); i++) {
            if (this.users.get(i).getNumber() == teacherNumber) {
                teacherExists = true;
            }
        }
        if (!teacherExists) {
            this.users.add(new Teacher(name, teacherNumber, password));
            this.saveUsers();
        }
        return !teacherExists;
    }
    
    public void addEntry(String course, int period, int stuNum, double ku, double app, double comm, double tips, double kuTotal, double appTotal, double commTotal, double tipsTotal, int weight, String entry) {
        for (int i = 0; i < this.courses.size(); i++) {
            if (this.courses.get(i).course.equals(course) && this.courses.get(i).periodNumber == period) {
                this.courses.get(i).addEntry(stuNum, ku, app, comm, tips, kuTotal, appTotal, commTotal, tipsTotal, weight, entry);
            }
        }
    }
    
    public void saveCourses() {
        if (this.courses.size() > 0) {
            for (int i = 0; i < this.courses.size(); i++) {
                this.courses.get(i).saveCourse();
            }
        }
    }
    
    public void saveUsers() {
        File user = new File("users.txt");
        try {
            FileWriter writer = new FileWriter(user);
            for(int i = 0; i < this.users.size(); i++) {
                if (this.users.get(i) instanceof Teacher) {
                    writer.write("Teacher" + System.getProperty("line.separator"));
                } else {
                    writer.write("Student" + System.getProperty("line.separator"));
                }
                writer.write(this.users.get(i).getName() + System.getProperty("line.separator"));
                writer.write(this.users.get(i).getNumber() + System.getProperty("line.separator"));
                writer.write(this.users.get(i).getPassword() + System.getProperty("line.separator"));
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Markbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadUsers() {
        try {
            File user = new File("users.txt");
            Scanner scan = new Scanner(user);
            while(scan.hasNextLine()) {
                if (scan.nextLine().equals("Teacher")) {
                    this.users.add(new Teacher(scan.nextLine(), scan.nextInt(), scan.nextLine() + scan.nextLine()));
                } else {
                    this.users.add(new Student(scan.nextLine(), scan.nextInt(), scan.nextLine() + scan.nextLine()));
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Markbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public StudentCourseInfo loadStudent(File text) {
        StudentCourseInfo temp = null;
        try {
            Scanner scan = new Scanner(text);
            int entries = 0;
            while (scan.hasNextLine()) {
                entries++;
                scan.nextLine();
            }
            entries = (entries - 1) / 10;

            int stuNum = 0;
            double[] ku = new double[entries];
            double[] app = new double[entries];
            double[] comm = new double[entries];
            double[] tips = new double[entries];
            double[] kuTotal = new double[entries];
            double[] appTotal = new double[entries];
            double[] commTotal = new double[entries];
            double[] tipsTotal = new double[entries];
            double[] weightings = new double[entries];
            String[] entryNames = new String[entries];
            scan = new Scanner(text);
            stuNum = scan.nextInt();
            temp = new StudentCourseInfo(stuNum);
            for(int i = 0; i < entries; i++) {
                ku[i] = scan.nextDouble();
                app[i] = scan.nextDouble();
                comm[i] = scan.nextDouble();
                tips[i] = scan.nextDouble();
                kuTotal[i] = scan.nextDouble();
                appTotal[i] = scan.nextDouble();
                commTotal[i] = scan.nextDouble();
                tipsTotal[i] = scan.nextDouble();
                weightings[i] = scan.nextDouble();
                scan.nextLine();
                entryNames[i] = scan.nextLine();
                temp.addEntry(ku[i], app[i], comm[i], tips[i], kuTotal[i], appTotal[i], commTotal[i], tipsTotal[i], weightings[i], entryNames[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Markbook.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
     
    public void loadData() {
        String path = new File("data").getAbsolutePath();
        File dataDirectory = new File(path);
        File[] temp;
        File[] filesList = dataDirectory.listFiles();
        Course tempClass = null;
        StudentCourseInfo tempStu;
        Scanner scan;
        for (int i = 0; i < filesList.length; i++) {
            temp = filesList[i].listFiles();
            for (int j = 0; j < temp.length; j++) {
                if (Character.isLetter(temp[j].getName().charAt(0))) {
                    try {
                        scan = new Scanner(temp[j]);
                        tempClass = new Course(scan.nextLine(), scan.nextInt(), scan.nextInt());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Markbook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }  
            }
            for (int l = 0; l < temp.length; l++) {
                if (Character.isDigit(temp[l].getName().charAt(0))) {
                    tempClass.getStudents().add(loadStudent(temp[l]));
                }
            }
            courses.add(tempClass);
        }
    }
}
