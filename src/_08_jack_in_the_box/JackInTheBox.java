package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements MouseListener {
	JButton leftButton;
	int x=0;
	//1. Create a user interface (GUI) that has a single button labeled "Surprise".
    //If you need help, take a look at the instructions for the Fortune Cookie recipe.
public static void main(String[] args) {
	JackInTheBox j = new JackInTheBox();
	j.JackInThe();
}
//2. When the user presses the button 5 times, show them a jack-in-the-box using the methods below.
//(A sample jackInTheBox.png file is provided in the default package)
public void JackInThe(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	 leftButton = new JButton();
	frame.setVisible(true);	
	leftButton.addMouseListener(this);
	




}


	
private void showPicture(String fileName) { 
    try {
         JLabel imageLabel = createLabelImage(fileName);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

private JLabel createLabelImage(String fileName) {
    try {
         java.net.URL imageURL = getClass().getResource(fileName);
         if (imageURL == null) {
              System.err.println("Could not find image " + fileName);
              return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
         }
    } catch (Exception e) {
         System.err.println("Could not find image " + fileName);
         return new JLabel();
    }
    
}

//3. Also play a sound when the jack-in-the-box pops up using this method.
//(A sample sound homer-woohoo.wav is provided in the default package)
private void playSound(String soundFile) {
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed==leftButton) {
		x+1 = ;
	}
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
