package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	private static JButton[] buttons = new JButton[81];

	public GamePanel() {

		this.setBackground(Color.LIGHT_GRAY);

		GridLayout layout = new GridLayout(0, 9);
		this.setLayout(layout);

		initBoard();
	}

	private void initBoard() {
		for (int i = 0; i < Solver.GRID_SIZE * Solver.GRID_SIZE; i++) {
			String value = Solver.getBoardValue(i) == 0 ? "" : String.valueOf(Solver.getBoardValue(i));
			buttons[i] = new JButton(value);
			buttons[i].addActionListener(new ButtonListener());
			buttons[i].setBackground(Color.LIGHT_GRAY);
			buttons[i].setFocusable(false);
			this.add(buttons[i]);
		}
	}
	
	public static void updateBoard() {
		for (int i = 0; i < Solver.GRID_SIZE * Solver.GRID_SIZE; i++) {
			String value = Solver.getBoardValue(i) == 0 ? "" : String.valueOf(Solver.getBoardValue(i));
			buttons[i].setText(value);
			buttons[i].setBackground(Color.LIGHT_GRAY);
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(600, 600);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < buttons.length; i++) {
				if (e.getSource() == buttons[i]) {
					Solver.setMarkedSquare(i);
					buttons[Solver.getMarkedSquare()].setBackground(Color.RED);
				}
			}
		}
	}

}
