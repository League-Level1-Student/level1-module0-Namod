package _10_cuteness_tv;

	import java.applet.AudioClip;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;

		public class cutenesstv implements ActionListener {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton DuckButton = new JButton();
		JButton FrogButton = new JButton();
		JButton UnicornButton = new JButton();
	
			public void run() {	
				
			
				
				frame.add(panel);
				frame.setVisible(true);
				DuckButton.addActionListener(this);
				FrogButton.addActionListener(this);
				UnicornButton.addActionListener(this);
	

				panel.add(DuckButton);
				panel.add(FrogButton);
				panel.add(UnicornButton);
			
				frame.pack();
			
				frame.setTitle("Cute");
			
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton buttonPressed = (JButton) e.getSource();	
				// TODO Auto-generated method stub
				if(buttonPressed == DuckButton) {	
					showDucks();
				}
				else if(buttonPressed == FrogButton) {	
				showFrog();				
				}
				else if(buttonPressed == UnicornButton) {		
				showFluffyUnicorns();
			}
				}
			void showDucks() {
			     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
			}
			void showFrog() {
			     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
			}
			void showFluffyUnicorns() {
			     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
			}
			void playVideo(String videoID) {
			     try {
			          URI uri = new URI(videoID);
			          java.awt.Desktop.getDesktop().browse(uri);
			     } catch (Exception e) {
			          e.printStackTrace();
			     }
			}


}
		
