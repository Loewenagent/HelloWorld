import javax.swing.JButton;
import javax.swing.JFrame;

import loewenagent.helloworld.Background;
import loewenagent.helloworld.Var;

public class GUI {

	public GUI() {

		Var.frame = new JFrame(
				"Hello World - Multilanguage || created by Loewenagent");
		Var.frame.setSize(1000, 600);
		Var.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.frame.setLocationRelativeTo(null);
		Var.frame.setResizable(false);

		for (int i = 0; i < Var.btn.length; i++) {
			Var.btn[i] = new JButton();
			Var.btn[i].setVisible(true);
			Var.btn[i].addActionListener(new ActionHandler());
			Var.btn[i].setFocusPainted(false);
			Var.btn[i].setBorder(null);
			Var.frame.add(Var.btn[i]);
		}

		Buttons.place();

		Var.btnHelloWorld.setVisible(true);
		Var.btnHelloWorld.addActionListener(new ActionHandler());
		Var.btnHelloWorld.setFocusPainted(false);
		Var.btnHelloWorld.setBorder(null);
		Var.frame.add(Var.btnHelloWorld);

		Background background = new Background();
		background.setBounds(0, 0, Var.framewidth, Var.frameheight);
		background.setVisible(true);
		Var.frame.add(background);

		Var.frame.setVisible(true);
	}

}