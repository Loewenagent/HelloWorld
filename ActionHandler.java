import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	public void actionPerformed(ActionEvent e) {

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
		}
		
		Var.btnHelloWorld.setText(Var.text);
		
	}

}
