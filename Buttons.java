import java.awt.Color;

public class Buttons {

	public static void place() {

		// Der Button, in dem "Hello World" angezeigt wird
		Var.btnHelloWorld.setBounds(Var.framewidth / 2 - 75,
				Var.frameheight / 3, 150, 50);
		Var.btnReset.setBounds(Var.framewidth / 2 - 37,
				Var.frameheight / 3 + 75, 74, 30);
		Var.btnLanguage.setBounds(20, 20, 100, 50);

		// Die Button, über die man die Sprache von "Hello World" einstellen
		// kann
		Var.btn[0].setBounds(Var.framewidth / 2 - 290,
				Var.frameheight / 3 * 2 - 70, 100, 50);
		Var.btn[1].setBounds(Var.framewidth / 2 - 170,
				Var.frameheight / 3 * 2 - 70, 100, 50);
		Var.btn[2].setBounds(Var.framewidth / 2 - 50,
				Var.frameheight / 3 * 2 - 70, 100, 50);
		Var.btn[3].setBounds(Var.framewidth / 2 + 70,
				Var.frameheight / 3 * 2 - 70, 100, 50);
		Var.btn[4].setBounds(Var.framewidth / 2 + 190,
				Var.frameheight / 3 * 2 - 70, 100, 50);
		Var.btn[5].setBounds(Var.framewidth / 2 - 230, Var.frameheight / 3 * 2,
				100, 50);
		Var.btn[6].setBounds(Var.framewidth / 2 - 110, Var.frameheight / 3 * 2,
				100, 50);
		Var.btn[7].setBounds(Var.framewidth / 2 + 10, Var.frameheight / 3 * 2,
				100, 50);
		Var.btn[8].setBounds(Var.framewidth / 2 + 130, Var.frameheight / 3 * 2,
				100, 50);

		// Textgebung der Button
		Var.btnHelloWorld.setText(Var.text);
		Var.btnReset.setText("(Reset)");
		Var.btnLanguage.setText(Var.language);

		Var.btn[0].setText(Var.btn0Text);
		Var.btn[1].setText(Var.btn1Text);
		Var.btn[2].setText(Var.btn2Text);
		Var.btn[3].setText(Var.btn3Text);
		Var.btn[4].setText(Var.btn4Text);
		Var.btn[5].setText(Var.btn5Text);
		Var.btn[6].setText(Var.btn6Text);
		Var.btn[7].setText(Var.btn7Text);
		Var.btn[8].setText(Var.btn8Text);

		// Farbgebung der Button
		Var.btnHelloWorld.setBackground(Color.GREEN);
		Var.btnReset.setBackground(Color.GREEN);
		Var.btnLanguage.setBackground(Color.ORANGE);

		Var.btn[0].setBackground(Color.CYAN);
		Var.btn[1].setBackground(Color.CYAN);
		Var.btn[2].setBackground(Color.CYAN);
		Var.btn[3].setBackground(Color.CYAN);
		Var.btn[4].setBackground(Color.CYAN);
		Var.btn[5].setBackground(Color.CYAN);
		Var.btn[6].setBackground(Color.CYAN);
		Var.btn[7].setBackground(Color.CYAN);
		Var.btn[8].setBackground(Color.CYAN);

	}

}
