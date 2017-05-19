import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Var.btnLanguage) {
			if (Var.language == "German") {
				Var.language = "English";
			} else if (Var.language == "English") {
				Var.language = "German";
			}
		}

		if (e.getSource() == Var.btn[0]) {
			Var.text = "Hallo Welt!";
		} else if (e.getSource() == Var.btn[1]) {
			Var.text = "Hello World!";
		} else if (e.getSource() == Var.btn[2]) {
			Var.text = "Bonjour tout le monde!";
		} else if (e.getSource() == Var.btn[3]) {
			Var.text = "Kon'nichiwa sekai!";
		} else if (e.getSource() == Var.btn[4]) {
			Var.text = "Ni hao shijie!";
		} else if (e.getSource() == Var.btn[5]) {
			Var.text = "Merhaba dünya!";
		} else if (e.getSource() == Var.btn[6]) {
			Var.text = "Hola mundo!";
		} else if (e.getSource() == Var.btn[7]) {
			Var.text = "Hallo heimur!";
		} else if (e.getSource() == Var.btn[8]) {
			Var.text = "Hallo wereld!";
		} else if (e.getSource() == Var.btnReset) {
			Var.text = "";
		}
		
		if (Var.language == "English") {
			Var.btn0Text = "German";
			Var.btn1Text = "English";
			Var.btn2Text = "French";
			Var.btn3Text = "Japanese";
			Var.btn4Text = "Chinese";
			Var.btn5Text = "Turkish";
			Var.btn6Text = "Spanish";
			Var.btn7Text = "Icelandic";
			Var.btn8Text = "Dutch";
		} else if (Var.language == "German") {
			Var.btn0Text = "Deutsch";
			Var.btn1Text = "Englisch";
			Var.btn2Text = "Französisch";
			Var.btn3Text = "Japanisch";
			Var.btn4Text = "Chinesisch";
			Var.btn5Text = "Türkisch";
			Var.btn6Text = "Spanisch";
			Var.btn7Text = "Isländisch";
			Var.btn8Text = "Dänisch";
		}

		Var.btn[0].setText(Var.btn0Text);
		Var.btn[1].setText(Var.btn1Text);
		Var.btn[2].setText(Var.btn2Text);
		Var.btn[3].setText(Var.btn3Text);
		Var.btn[4].setText(Var.btn4Text);
		Var.btn[5].setText(Var.btn5Text);
		Var.btn[6].setText(Var.btn6Text);
		Var.btn[7].setText(Var.btn7Text);
		Var.btn[8].setText(Var.btn8Text);
		
		Var.btnHelloWorld.setText(Var.text);
		Var.btnLanguage.setText(Var.language);

	}

}
