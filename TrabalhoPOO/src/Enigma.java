import javax.swing.JPanel;

public abstract class Enigma {

	private int numWasUsed;
	private int numDeciphered;
	private int numErrors;
	private String answer;
	private ModuloM03 module;
	private JPanel panel;
	
	public Enigma(int w, int d, int e, String ans) {
		this.setNumWasUsed(w);
		this.setNumDeciphered(d);
		this.setNumErrors(e);
		this.setAnswer(ans);
	}
	
	public Enigma() {
		
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public int getNumWasUsed() {
		return numWasUsed;
	}
	public void setNumWasUsed(int numWasUsed) {
		this.numWasUsed = numWasUsed;
	}
	public void wasUsed() {
		this.numWasUsed++;
	}
	public void incrementNumDeciphered() {
		this.numDeciphered++;
	}
	
	public void incrementNumErrors() {
		this.numErrors++;
	}
	
	public int getNumDeciphered() {
		return numDeciphered;
	}
	public void setNumDeciphered(int numDeciphered) {
		this.numDeciphered = numDeciphered;
	}
	public int getNumErrors() {
		return numErrors;
	}
	public void setNumErrors(int numErrors) {
		this.numErrors = numErrors;
	}
	
	public boolean checkAnswer(String ans) {
		if (this.answer.equalsIgnoreCase(ans)) {
			return true;
		}
		return false;
	}

	public ModuloM03 getModule() {
		return module;
	}

	public void setModule(ModuloM03 module) {
		this.module = module;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	

}
	

