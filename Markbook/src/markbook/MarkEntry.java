package markbook;
/**
 * Title: <h1>Mark Entry</h1>
 * Purpose: Instance representing a single mark entry in the mark book.
 * @version 1.0
 * @author Yash Patel, Adrian Chung, Kiran Patel
 * @since December 18, 2019
 */

public class MarkEntry {
    private double knowledge;
    private double application;
    private double communication;
    private double thinking;
    private double knowledgeTotal;
    private double applicationTotal;
    private double communicationTotal;
    private double thinkingTotal;
    private double weighting;
    private String entryName;
    
    /**
     * Constructor for a mark entry for a given student.
     * @param ku Marks earned in the knowledge category.
     * @param app Marks earned in the application category.
     * @param comm Marks earned in the communication category.
     * @param tips Marks earned in the thinking category.
     * @param kuTotal Mark total for the knowledge category.
     * @param appTotal Mark total for the application category.
     * @param commTotal Mark total for the communication category.
     * @param tipsTotal Mark total for the thinking category.
     * @param weight The weight of the assessment.
     * @param entry The entry's name.
     */
    public MarkEntry(double ku, double app, double comm, double tips, double kuTotal, double appTotal, double commTotal, double tipsTotal, double weight, String entry) {
        if (knowledge <= knowledgeTotal) {
            knowledge = ku;
            knowledgeTotal = kuTotal;
        }
        if (application <= applicationTotal) {
            application = app;
            applicationTotal = appTotal;
        }
        if (communication <= communicationTotal) {
            communication = comm;   
            communicationTotal = commTotal;
        }
        if (thinking <= thinkingTotal) {
            thinking = tips;
            thinkingTotal = tipsTotal;
        }
        weighting = weight;
        entryName = entry;
    }
    
    /**
     * Getter for knowledge marks earned in a specific assessment.
     * @return Knowledge marks earned on an assessment.
     */
    public double getKnowledge() {
        return this.knowledge;
    }
    
    /**
     * Getter for application marks earned in a specific assessment.
     * @return Application marks earned on an assessment.
     */
    public double getApplication() {
        return this.application;
    }
    
    /**
     * Getter for communication marks earned in a specific assessment
     * @return Communication marks earned on an assessment.
     */ 
    public double getCommunication() {
        return this.communication;
    }
    
    /**
     * Getter for thinking marks earned in a specific assessment.
     * @return Thinking marks earned on an assessment.
     */
    public double getThinking() {
        return this.thinking;
    }
    
    /**
    * Getter for the total knowledge marks on a specific assessment.
    * @return Total knowledge marks.
    */
    public double getKnowledgeTotal() {
        return this.knowledgeTotal;
    }
    
    /**
     * Getter for the total application marks on a specific assessment.
     * @return Total application marks.
     */
    public double getApplicationTotal() {
        return this.applicationTotal;
    }
    
    /**
     * Getter for the total communication marks on a specific assessment.
     * @return Total communication marks.
     */
    public double getCommunicationTotal() {
        return this.communicationTotal;
    }
    
    /**
     * Getter for the total thinking marks on a specific assessment.
     * @return Total thinking marks.
     */
    public double getThinkingTotal() {
        return this.thinkingTotal;
    }
    
    /**
     * Getter for the weighting of the assessment.
     * @return Total weighting of the assessment.
     */
    public double getWeighting() {
        return this.weighting;
    }
    
    /**
     * Getter for the name of the assessment.
     * @return Assessment name.
     */
    public String getEntryName() {
        return this.entryName;
    }
    
    /**
     * Setter for the knowledge marks on an assessment.
     * @param ku Knowledge mark to be set to.
     */
    public void setKnowledge(int ku) {
        knowledge = ku;
    }
    
    /**
     * Setter for the application marks on an assessment.
     * @param app Application mark to be set to.
     */
    public void setApplication(int app) {
        application = app;
    }
    
    /**
     * Setter for the communication marks on an assessment.
     * @param comm Communication mark to be set to.
     */
    public void setCommunication(int comm) {
        communication = comm;
    }
    
    /**
     * Setter for the thinking marks on an assessment.
     * @param tips Thinking mark to be set to.
     */
    public void setThinking(int tips) {
        thinking = tips;
    }
    
    /**
     * Setter for the total knowledge marks on an assessments.
     * @param kuTotal Total knowledge marks to be set.
     */
    public void setKnowledgeTotal(int kuTotal) {
        knowledgeTotal = kuTotal;
    }
    
    /**
     * Setter for the total application marks on an assessment.
     * @param appTotal Total application marks to be set.
     */
    public void setApplicationTotal(int appTotal) {
        applicationTotal = appTotal;
    }
    
    /**
     * Setter for the total communication marks on an assessment.
     * @param commTotal Total communication marks to be set.
     */
    public void setCommunicationTotal(int commTotal) {
        communicationTotal = commTotal;
    }
    
    /**
     * Setter for the total thinking marks on an assessment.
     * @param tipsTotal Total thinking marks to be set.
     */
    public void setThinkingTotal(int tipsTotal) {
        thinkingTotal = tipsTotal;
    }
    
    /**
     * Setter for the weighting of an assessment.
     * @param weight Weight of the assessment to be set to.
     */
    public void setWeighting(int weight) {
        weighting = weight;
    }
    
    /**
     * Calculates the average for the knowledge section of the assessment.
     * @return The average in the knowledge section of an assessment.
     */
    public double calculateKnowledge() {
        return this.knowledge/this.knowledgeTotal;
    }
    
    /**
     * Calculates the average for the application section of the assessment.
     * @return The average in the application section of the assessment.
     */
    public double calculateApplication() {
        return this.application/this.applicationTotal;
    }
    
    /**
     * Calculates the average for the communication section of the assessment.
     * @return The average in the communication section of the assessment.
     */
    public double calculateCommunication() {
        return this.communication/this.communicationTotal;
    }
    
    /**
     * Calculates the thinking section of the assessment.
     * @return The average in the thinking section of the assessment.
     */
    public double calculateThinking() {
        return this.thinking/this.thinkingTotal;
    }
    
    /**
     * Calculates the total mark for the assessment.
     * @return The mark on the assessment.
     */
    public double calculateMark() {
        return this.calculateKnowledge() * 35 + this.calculateApplication() * 35 + this.calculateCommunication() * 15 + this.calculateThinking() * 15 ;
    }
}
