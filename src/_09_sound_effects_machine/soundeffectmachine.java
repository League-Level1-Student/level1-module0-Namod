	package _09_sound_effects_machine;

	import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class soundeffectmachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton oneButton = new JButton();
	JButton twoButton = new JButton();
	JButton threeButton = new JButton();
	JButton	fourButton = new JButton();
	JButton fiveButton = new JButton();
		public void run() {	
			
		
			
			frame.add(panel);
			frame.setVisible(true);
			oneButton.addActionListener(this);
			twoButton.addActionListener(this);
			threeButton.addActionListener(this);
			fourButton.addActionListener(this);
			fiveButton.addActionListener(this);

			panel.add(oneButton);
			panel.add(twoButton);
			panel.add(threeButton);
			panel.add(fourButton);
			panel.add(fiveButton);
			frame.pack();
		
			frame.setTitle("Sound Effects");
		
		}
	
		
		
		
		private void playSound(String fileName) {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
			sound.play();
		}




		@Override
		public void actionPerformed(ActionEvent e) {
			JButton buttonPressed = (JButton) e.getSource();			
			if(buttonPressed == oneButton) {	
				playSound("one.wav");
			}
			else if(buttonPressed == twoButton) {	
				playSound("two.wav");
			}
			else if(buttonPressed == threeButton) {		
				playSound("three.wav");
			}
			else if(buttonPressed == fourButton) {	
				playSound("four.wav");
			}
			else if(buttonPressed == fiveButton) {	
				playSound("five.wav");
			}
					}
				
			
	}
	
	
	
	
	