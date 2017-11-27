/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Questionnaire;

/**
 *
 * @author Nishad
 */
public class JobQuestionaire {
    private boolean isRead;
    private boolean isWrite;
    private String basicKnowledge;
    public JobQuestionaire(){
        
    }

    public boolean isIsRead() {
        return isRead;
    }

    public void setIsRead(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isIsWrite() {
        return isWrite;
    }

    public void setIsWrite(boolean isWrite) {
        this.isWrite = isWrite;
    }

    public String isBasicKnowledge() {
        return basicKnowledge;
    }

    public void setBasicKnowledge(String basicKnowledge) {
        this.basicKnowledge = basicKnowledge;
    }
    
    
    
}
