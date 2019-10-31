package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton add=new JButton();
	JButton View=new JButton();
	ArrayList<String> guests = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		GuestBook g=new GuestBook();
		g.setup();
	}
	public void setup() {
		frame.add(panel);
		frame.setVisible(true);;
		panel.add(View);
		panel.add(add);
frame.setTitle("~~~Guest Book~~~");
View.setText("~View Guests~");
add.setText("~Add Guest~");
	View.addMouseListener(this);
	add.addMouseListener(this);
	}
	public void addguest() {
		String newguest=JOptionPane.showInputDialog("~Enter Guest~");
	guests.add(newguest);
	}
	public void seeguests() {
		System.out.println("~~~Guests~~~");
		for (int i = 0; i < guests.size(); i++) {
			System.out.println("~Guest "+(i+1)+": "+guests.get(i));
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	JButton j=(JButton) e.getSource();
		if (j==add) {
		addguest();
	}else {
		seeguests();
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
