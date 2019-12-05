package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HangMan implements KeyListener {
	int lives = 10;
	Stack<String> wordstoguess = new Stack<String>();
	JFrame fram = new JFrame();
	JLabel ladel = new JLabel();
	String answer = "";
	String seen = "";
	int completed = 0;
	int pushes = 0;

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.setup();
	}

	public void setup() {

		fram.setVisible(true);
		fram.add(ladel);
		String attempts = JOptionPane.showInputDialog("How many attemps do you wish to make.");
		pushes = Integer.parseInt(attempts);
		for (int i = 0; i < pushes; i++) {
			String nextup = Utilities.readRandomLineFromFile("dictionary.txt");
			wordstoguess.push(nextup);
		}
		ready();

	}

	public void ready() {
		answer = wordstoguess.pop();
		seen = "";
		for (int i = 0; i < answer.length(); i++) {
			seen += "_";
		}
		ladel.setText("Loading...please wait");
		ladel.setText(seen);
		fram.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean crud=false;
		char guess = e.getKeyChar();
		System.out.println(guess);
		for (int i = 0; i < answer.length(); i++) {
			if (guess == answer.charAt(i)) {
				seen = (seen.substring(0, i) + answer.charAt(i) + seen.substring(i + 1));
crud=true;
				if (answer.equals(seen)) {
					completed++;
					lives += 5;
					if (completed == pushes) {
						JOptionPane.showMessageDialog(null, "Congradulations! You scored " + lives);
					} else {
						ready();
					}
				}
			}
			}
		if(crud==false) {
				lives--;
				if (lives <= 0) {
					JOptionPane.showMessageDialog(null, "You hath been hanged by the English Court.");
					setup();
				}
		}
			ladel.setText(seen + "         You have " + lives + " tries remaining");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
