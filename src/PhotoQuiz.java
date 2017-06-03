
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the
		// image, and select “Copy Image URL”)
		JOptionPane.showMessageDialog(null, "Where is this image from?");
		// 2. create a variable of type "Component" that will hold your image
		Component image = createImage("https://www.surfholidays.com/assets/images/blog/2015-08-17-teahupoo-aerial.jpg");
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String y = JOptionPane.showInputDialog(image);
		// 7. print "CORRECT" if the user gave the right answer
		if (y.equals("Teahupoo")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		JOptionPane.showMessageDialog(null, "What is this high school?");
		Component image2 = createImage("http://teachers.sduhsd.net/dpillsbury/Images/TP-v1.gif");
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String a = JOptionPane.showInputDialog(image2);
		// 14+ check answer, say if correct or incorrect, etc.
		if (a.equals("Torrey Pines")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		quizWindow.remove(image2);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener())
}
