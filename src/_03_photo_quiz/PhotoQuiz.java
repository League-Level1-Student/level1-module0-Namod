package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String URL = "https://www.howtogeek.com/wp-content/uploads/2019/03/chrome.png";
		// 2. create a variable of type "Component" that will hold your image
			Component image = createImage(URL);
		// 3. use the "createImage()" method below to initialize your Component
	
		// 4. add the image to the quiz window
			quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
			String y= JOptionPane.showInputDialog("What icon do you see?");
		// 7. print "CORRECT" if the user gave the right answer
			
			if(y.equals("chrome")){
				System.out.println("Correct");
			}
			else {
				System.out.println("Wrong");
			}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
			quizWindow.remove(image);

		// 10. find another image and create it (might take more than one line
		// of code)
			String URL2 = "data:image/png;base64,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";
		// 11. add the second image to the quiz window
			Component image2 = createImage(URL2);
			quizWindow.add(image2);
		// 12. pack the quiz window
			quizWindow.pack();
		// 13. ask another question
			String y2= JOptionPane.showInputDialog("What icon do you see?");
			if(y2.equals("snapchat")) {
				System.out.println("Correct+14");
			}
			else {
				System.out.println("wrong");
			}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private void loadImage(String string) {
		// TODO Auto-generated method stub
		
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
