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
			this.add(buttons[i]);
		}
		buttons[9] = new JButton("Solve puzzle");
		this.add(buttons[9]);
		buttons[10] = new JButton("Clear puzzle");
		this.add(buttons[10]);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 600);
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
