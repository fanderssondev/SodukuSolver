package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import logic.Solver;

/**
 * @author {nanobyter}
 * 
 *         created: 2022-06-28
 */
public class NumberPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton[] buttons;

	public NumberPanel() {

		buttons = new JButton[Solver.GRID_SIZE + 2];

		this.setBackground(Color.LIGHT_GRAY);

		GridLayout layout = new GridLayout(0, 3);
		this.setLayout(layout);

		initButtons();

	}

	private void initButtons() {
		for (int i = 0; i < Solver.GRID_SIZE; i++) {
			buttons[i] = new JButton(String.valueOf(i + 1));
			buttons[i].addActionListener(new ButtonListener());
			buttons[i].setBackground(Color.LIGHT_GRAY);
			this.add(buttons[i]);
		}
		buttons[9] = new JButton("Solve puzzle");
		buttons[9].addActionListener(new ButtonListener());
		buttons[9].setBackground(Color.LIGHT_GRAY);
		this.add(buttons[9]);
		buttons[10] = new JButton("Clear puzzle");
		buttons[10].addActionListener(new ButtonListener());
		buttons[10].setBackground(Color.LIGHT_GRAY);
		this.add(buttons[10]);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 600);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("Clear puzzle")) {
				for (int j = 0; j < Solver.GRID_SIZE * Solver.GRID_SIZE; j++) {
					Solver.setBoardValue(j, 0);
				}
			}
			else if (e.getActionCommand().equals("Solve puzzle")) {
				if (Solver.solveBoard(Solver.getBoard())) {
					GamePanel.updateBoard();
				}
				else {
					System.out.println("Not able to solve board");
				}
			}
			else {
				for (int i = 0; i < buttons.length; i++) {
					if (e.getActionCommand().equals(String.valueOf(i)) && Solver.getMarkedSquare() != -1) {
						Solver.setBoardValue(Solver.getMarkedSquare(), i);
					}
					
					
					
//					String value = Solver.getBoardValue(i) == 0 ? "" : String.valueOf(Solver.getBoardValue(i));
//					buttons[i].setText(value);
//					buttons[i].setBackground(Color.LIGHT_GRAY);
				}
			}

		}
	}
}
