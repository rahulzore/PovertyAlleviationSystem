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
    
    private String basicKnowledge;
    private boolean isComputer;
    public JobQuestionaire(){
        
    }

    public boolean isIsComputer() {
        return isComputer;
    }

    public void setIsComputer(boolean isComputer) {
        this.isComputer = isComputer;
    }

   
    public String isBasicKnowledge() {
        return basicKnowledge;
    }

    public void setBasicKnowledge(String basicKnowledge) {
        this.basicKnowledge = basicKnowledge;
    }
    
    
    
}
