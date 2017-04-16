import javax.swing.JFrame;
import loewenagent.helloworld.Strings;
import loewenagent.helloworld.Var;

public class GUI {

	public GUI() {
		
		Var.frame = new JFrame("Hello World - Multilanguage || created by Loewenagent");
		Var.frame.setSize(1000,600);
		// Var.frame.add(new JLabel("Hallo"));
		
		Strings labeldraw = new Strings();
		labeldraw.setBounds(0, 0, Var.framewidth, Var.frameheight);
		labeldraw.setVisible(true);
		Var.frame.add(labeldraw);
		
		Var.frame.setVisible(true);
	}
}
