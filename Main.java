import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    	
    		JOptionPane.showMessageDialog(
    				null, 
    				"Message",
    				"Title",
    				JOptionPane.INFORMATION_MESSAGE);
    		int response = JOptionPane.showConfirmDialog(
    				null, 
    				"Are you over 18 years old?",
    				"Message",
    				JOptionPane.YES_NO_OPTION,
    				JOptionPane.QUESTION_MESSAGE);
    		JOptionPane.showMessageDialog(
    				null, 
    				response == 0 ? "Over 18" : "Under 18", 
    				"Message",
    				JOptionPane.INFORMATION_MESSAGE);
    		String answer = JOptionPane.showInputDialog(
    				null, 
    				"What's your name?",
    				"Message",
    			    JOptionPane.QUESTION_MESSAGE);
    		JOptionPane.showMessageDialog(
    				null, 
    				"User's name is " + answer,
    				"User's name",
    				JOptionPane.INFORMATION_MESSAGE);
            Object[] options = {"one", "two", "more"};

            int reply = JOptionPane.showOptionDialog(
                null,                               
                "How many siblings do you have?",   
                "Message",                          
                JOptionPane.DEFAULT_OPTION,         
                JOptionPane.QUESTION_MESSAGE,       
                null,                               
                options,                            
                options[0]                          
            );

            JOptionPane.showMessageDialog(
                null,
                "You have " + options[reply] + " siblings",
                "Response",
                JOptionPane.INFORMATION_MESSAGE
    			);
    	
    	}
}