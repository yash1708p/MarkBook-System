package markbook;
import java.util.ArrayList; 
/**
 * Title: <h1>Student Course Information</h1>
 * @version 1.0
 * @author Yash Patel, Adrian Chung, Kiran Patel
 * @since December 17, 2019
 */

public class StudentCourseInfo {
    private int studentNumber;
    ArrayList<MarkEntry> entries;
    
    /**
     * Constructor for the information on a given student.
     * @param stuNum The student identification number.
     */
    public StudentCourseInfo(int stuNum) {
        studentNumber = stuNum;
        entries = new ArrayList<>();
    }
    
    /**
     * Getter for the student's identification number.
     * @return The student identification number.
     */
    public int getStudentNumber() {
        return this.studentNumber;
    }
    
    /**
     * Constructor for a new mark entry for a given student.
     * @param ku Marks earned in the knowledge category.
     * @param app Marks earned in the application category.
     * @param comm Marks earned in the communication category.
     * @param tips Marks earned in the thinking category.
     * @param kuTotal Mark total for the knowledge category.
     * @param appTotal Mark total for the application category.
     * @param commTotal Mark total for the communication category.
     * @param tipsTotal Mark total for the thinking category.
     * @param weight The weight of the assessment.
     * @param entry The name of the assessment.
     */
    public void addEntry(double ku, double app, double comm, double tips, double kuTotal, double appTotal, double commTotal, double tipsTotal, double weight, String entry) {
        MarkEntry newMark = new MarkEntry(ku, app, comm, tips, kuTotal, appTotal, commTotal, tipsTotal, weight, entry);
        entries.add(newMark);
    }
    
    /**
     * Calculates the average across all mark entries.
     * @return The average of the individual.
     */
    public double getAverage() {
        double total = 0;
        int weightTotal = 0;
        for (int i = 0; i < this.entries.size(); i++) {
            total += this.entries.get(i).calculateMark() * this.entries.get(i).getWeighting();
            weightTotal += this.entries.get(i).getWeighting();
        }
        return total / weightTotal;
    }
    
    /**
     * Method for checking is an student number matches a student number in the course.
     * @param stuNum The external student number.
     * @return Boolean dependent if the student number matches the student number of the course.
     */
    public boolean checkStudent(int stuNum) {
        return this.studentNumber == stuNum;
    }
    
    public void listEntries() {
        for (int i = 0; i < this.entries.size(); i++) {
            System.out.println(this.entries.get(i).getKnowledge());
            System.out.println(this.entries.get(i).getKnowledgeTotal());
            System.out.println(this.entries.get(i).getApplication());
            System.out.println(this.entries.get(i).getApplicationTotal());
            System.out.println(this.entries.get(i).getCommunication());
            System.out.println(this.entries.get(i).getCommunicationTotal());
            System.out.println(this.entries.get(i).getThinking());
            System.out.println(this.entries.get(i).getThinkingTotal());
            System.out.println(this.entries.get(i).getWeighting());
            System.out.println(this.entries.get(i).getEntryName());
        }
    }
}

