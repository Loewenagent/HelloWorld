package loewenagent.helloworld;

import java.awt.*;
import javax.swing.JLabel;
import loewenagent.helloworld.Var;

public class Strings extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.BLACK);
		
		g.drawRect(Var.framewidth / 2 - 34, Var.frameheight / 3 - 10, 69, 20);
		g.drawString(Var.text, Var.framewidth / 2 - 31, Var.frameheight / 3 + 5);		
	}
}