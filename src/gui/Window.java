package gui;
import javax.swing.JFrame;

/**
 * @author {nanobyter}
 * 
 * created: 2022-06-20
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Window() {
		
		setTitle("Soduku Solver");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		this.add(new GamePanel());
		
		setVisible(true);
		pack();
	}

	
	
}
