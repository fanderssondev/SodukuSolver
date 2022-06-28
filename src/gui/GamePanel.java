package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import logic.Solver;

/**
 * @author {nanobyter}
 * 
 *         created: 2022-06-20
 */
public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public GamePanel() {
		this.setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		paintBackground(g);
		paintBoard(g, Solver.getBoard());
	}

	private void paintBackground(Graphics g) {

		int[][] board = Solver.getBoard();
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				
			}
		}
		
	}

	private void paintBoard(Graphics g, int[][] Board) {
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600,600);
	}
	
}
