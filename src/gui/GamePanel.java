package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.Solver;

/**
 * @author {nanobyter}
 * 
 *         created: 2022-06-20
 */
public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton [] buttons = new JButton[81];
	private int[] board1D;
	
	public GamePanel() {
		
		board1D = new int[Solver.GRID_SIZE * Solver.GRID_SIZE];
		
		this.setBackground(Color.LIGHT_GRAY);

		GridLayout layout = new GridLayout(0, 9);
		this.setLayout(layout);

		
		
		initBoard();
	}

	private void initBoard() {
		for (int i = 0; i < Solver.GRID_SIZE * Solver.GRID_SIZE; i++) {
			String value = getFieldValue(i) == 0 ? "" : String.valueOf(getFieldValue(i));
			buttons[i] = new JButton(value);
			this.add(buttons[i]);
		}
	}
	
	private int getFieldValue(int index1D) {
		int[][] board2D = Solver.getBoard();
		int row = index1D / Solver.GRID_SIZE;
		int col = index1D % Solver.GRID_SIZE;
		
		return board2D[row][col];
	}
	
	private int[] getBoard1D() {
		int[][] board2D = Solver.getBoard();
	
		for (int row = 0; row < Solver.GRID_SIZE; row++) {
			for (int col = 0; col < Solver.GRID_SIZE; col++) {
				board1D[row * Solver.GRID_SIZE + col] = board2D[row][col];
			}
		}
		
		
		return board1D;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		paintBackground(g);
		paintBoard(g, Solver.getBoard());
	}

	private void paintBackground(Graphics g) {

		
		
	}

	private void paintBoard(Graphics g, int[][] Board) {

	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600, 600);
	}

}
