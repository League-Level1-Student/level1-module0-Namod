package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundeffectmachine {
public static void main(String[] args) {

}
private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();
}
public soundeffectmachine(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
}
}
