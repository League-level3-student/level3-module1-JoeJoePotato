package _01_IntroToArrayLists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements MouseListener {
	ArrayList<Song> songs = new ArrayList<Song>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton listen = new JButton();
	JButton add = new JButton();
Song lastsong=new Song("");
	public _06_IPodShuffle() {
				// 1. Use the Song class the play the demo.mp3 file.

		frame.add(panel);
		panel.add(listen);
		panel.add(add);
		add.setText("add a song");
		listen.setText("listen to a random song");
		add.addMouseListener(this);
		listen.addMouseListener(this);
frame.setVisible(true);


		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton j = (JButton) e.getSource();
		if (j == add) {
String name=JOptionPane.showInputDialog("enter the name of the song");
		Song s=new Song(name);
	
		songs.add(s);
		
		}
		if(j==listen){
			lastsong.stop();
			Random r=new Random();
			int g=r.nextInt(songs.size());
			Song playing=songs.get(g);
		playing.play();
		lastsong=playing;
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