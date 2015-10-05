package marshmallows.view;

import javax.swing.JOptionPane;
/**
 * This provides the popus for the input and output. Whoa!
 * @author jfor3194
 */
public class MonsterPopups
{
	/**
	 * Proves a popup box for asking you questions about the monster. The user may type in a text answer regarding the question asked.
	 * It returns user response as a String method.
	 * @param input the supplied question for the popup question asked.
	 * @return The user's answers to the question asked.
	 */
	public String getAnswers(String input)
	{
		String answer = "";
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * This here will display a response towards the question asked.
	 * @param input will input text for the program to display
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
