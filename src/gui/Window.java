package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author {nanobyter}
 * 
 * created: 2022-06-20
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Window() {
		
		setTitle("nanobyter    Soduku Solver");
		setSize(600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		this.add(new GamePanel(), BorderLayout.WEST);
		this.add(new NumberPanel(), BorderLayout.EAST);
		
		setVisible(true);
		pack();
	}

	
	
}
