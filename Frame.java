import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
import javax.swing.JPanel;


public class Frame  extends JFrame{
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public int width = (int) screenSize.getWidth();
    public int height =(int) screenSize.getHeight();

		public Frame ( ) {

	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(width,height);
	        setResizable(false);
	        setTitle("Ludo Game");
	        setLocationRelativeTo(null);
	        setLayout(null);
	        //startFrameLayout(); 
	        setContentPane(new Tabuleiro());
	        setVisible(true);
		}
			
}
