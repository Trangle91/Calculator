import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setResizable(false);
		gui.setSize(250, 400);
		gui.setVisible(true);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
