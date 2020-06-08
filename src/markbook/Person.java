package markbook;
/**
 * <h1>Person</h1> 
 * Purpose: Represents users of the mark book. 
 * @version 1.0
 * @author Kiran Patel, Adrian Chung, Yash Patel
 * @since January 9, 2020
 */

public class Person {
    private String name;
    private int number;
    private String password;

    public Person(String nm, int num, String pass) {
        name = nm;
        number = num;
        password = pass;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public boolean login(int num, String pass) {
        return this.number == num && this.password.equals(pass);
    }
}