import java.awt.*;
import javax.swing.JLabel;
import loewenagent.helloworld.Var;

public class Background extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.GREEN);

		g.fillRect(0, 0, Var.framewidth, Var.frameheight);
	}
}
