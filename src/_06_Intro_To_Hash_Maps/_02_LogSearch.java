package _06_Intro_To_Hash_Maps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements MouseListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add");
	JButton search = new JButton("Search");
	JButton view = new JButton("View");
	JButton remove = new JButton("Remove");
	HashMap<Integer, String> students = new HashMap<Integer, String>();

	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.setup();
	}

	public void setup() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(remove);
		panel.add(search);
		panel.add(view);
		frame.pack();

		add.addMouseListener(this);
		remove.addMouseListener(this);
		search.addMouseListener(this);
		view.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton origin =(JButton)e.getSource();
		if (origin==add) {
			int idnum = Integer.parseInt(JOptionPane.showInputDialog("What is the student's ID number?"));
			String tortle = JOptionPane.showInputDialog("What is the student's name?");
			students.put(idnum, tortle);
		} else if (origin==remove) {
			int tiefling = Integer.parseInt(JOptionPane.showInputDialog("What is the student's ID number"));
			boolean gnome = students.containsKey(tiefling);
			if (gnome == true) {
				students.remove(tiefling);
			} else {
				JOptionPane.showInputDialog("Sorry, there is no student with that ID.");

			}
		} else if (origin==search) {
			int tiefling = Integer.parseInt(JOptionPane.showInputDialog("What is the student's ID number"));
			boolean gnome = students.containsKey(tiefling);
			if (gnome == true) {
				JOptionPane.showMessageDialog(null, "That students name is " + students.get(tiefling));
			} else {
				JOptionPane.showInputDialog("Sorry, there is no student with that ID.");
			}
			}else {
				for (int i = 1; i < students.size()+1; i++) {
				System.out.println("ID: "+(i)+"  Name: "+students.get(i));	
				}
			}

		}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
