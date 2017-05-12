import java.awt.Color;

public class Buttons {

	public static void place() {

		// Der Button, in dem "Hello World" angezeigt wird
		Var.btnHelloWorld.setBounds(Var.framewidth / 2 - 50,
				Var.frameheight / 3, 150, 50);

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

		Var.btn[0].setText("German");
		Var.btn[1].setText("English");
		Var.btn[2].setText("French");
		Var.btn[3].setText("Japanese");
		Var.btn[4].setText("Chinese");
		Var.btn[5].setText("Turkish");
		Var.btn[6].setText("Spanish");
		Var.btn[7].setText("Icelandic");
		Var.btn[8].setText("Dutch");

		// Farbgebung der Button
		Var.btnHelloWorld.setBackground(Color.cyan);

		Var.btn[0].setBackground(Color.orange);
		Var.btn[1].setBackground(Color.orange);
		Var.btn[2].setBackground(Color.orange);
		Var.btn[3].setBackground(Color.orange);
		Var.btn[4].setBackground(Color.orange);
		Var.btn[5].setBackground(Color.orange);
		Var.btn[6].setBackground(Color.orange);
		Var.btn[7].setBackground(Color.orange);
		Var.btn[8].setBackground(Color.orange);

	}

}
