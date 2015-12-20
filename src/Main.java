import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		CalcGUI calcGUI = new CalcGUI();
		calcGUI.setSize(250,300);
		calcGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		calcGUI.setVisible(true);
	}
}
