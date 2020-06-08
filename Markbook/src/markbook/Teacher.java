package markbook;
import java.util.ArrayList;
/**
 * <h1>Title: Teacher</h1>
 * Purpose: Represents a teacher within the program.
 * @version 1.0
 * @author Kiran Patel, Yash Patel, Adrian Chung
 * @since January 5, 2020
 */

public class Teacher extends Person {
    public ArrayList<Course> courses;
    
    public Teacher(String name, int num, String pass) {
        super(name, num, pass);
    }
}
