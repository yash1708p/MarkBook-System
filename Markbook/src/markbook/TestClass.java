package markbook;
/**
 *
 * @author 325247039
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Markbook book = new Markbook();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        book.listUsers();
        book.listCourses();
        book.saveCourses();
        
    }
    
}
