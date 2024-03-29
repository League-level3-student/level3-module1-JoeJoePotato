package _03_IntroToStacks;

import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame fram = new JFrame();
	JPanel panel = new JPanel();
	JLabel words = new JLabel();
	Stack<Character> previous = new Stack<Character>();

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	public static void main(String[] args) {
		_02_TextUndoRedo ugh = new _02_TextUndoRedo();
		ugh.setup();
	}

	public void setup() {
		fram.setVisible(true);
		fram.add(panel);
		panel.add(words);
		fram.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
System.out.println(e.getKeyCode());
		if (8 == e.getKeyCode()) {
			char z = words.getText().charAt(words.getText().length() - 1);
			previous.push(z);
			words.setText(words.getText().substring(0, words.getText().length() - 1));
			
		} else if (10 == e.getKeyCode()) {

			char b = previous.pop();
			words.setText(words.getText() + b);
		} else {
			char k = e.getKeyChar();
			words.setText(words.getText() + k);
		}
		fram.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
