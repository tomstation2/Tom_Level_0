import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		for (int i = 0; i < 5; i++) {
			int team = JOptionPane.showOptionDialog(null, "What is your favorite football team?", "Football question",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Packers", "Patriots", "Steelers", "Saints", "Chargers", "Rams", "49ers", "Raiders",
							"Broncos", "Chiefs", "Falcons", "Panthers", "Eagles", "Bills", "Dolphins", "Browns",
							"Cowboys", "Giants", "Jets", "Jaguars", "Titans", "Seahawks", "Redskins", "Vikings",
							"Bears", "Lions", "Texans", "Bengals", "Ravens", "Cardinals", "Colts", "Buccaneers",
							"I don't watch football" },
					null);

			// 2. Their answer is stored in the userMood variable. Print it out.
			if (team == 0) {
				JOptionPane.showMessageDialog(null, "Aaron Rodgers is the G.O.A.T");
			} else if (team == 1) {
				JOptionPane.showMessageDialog(null,
						"Tom Brady should only have one ring, the others are because of tuck rule,"
								+ " Vintinari, Spygate, and Deflategate");
			} else if (team == 2) {
				JOptionPane.showMessageDialog(null, "The Steelers game was rigged");
			} else if (team == 3) {
				JOptionPane.showMessageDialog(null, "Drew Brees is amazing");
			} else if (team == 4) {
				JOptionPane.showMessageDialog(null, "The Chargers shouldn't have moved to LA");
			} else if (team == 12) {
				JOptionPane.showMessageDialog(null,
						"The Eagles should have won against the Patriots in the Super Bowl");
			} else if (team == 13) {
				JOptionPane.showMessageDialog(null, "The Bills were great back in the 90's");
			} else {
				JOptionPane.showMessageDialog(null, "I don't care about your team :P");
			}
		}
	}
	// 3. If they are in a stressed mood, use the playVideo method to play a
	// calming song from YouTube.

	// 4. Play different songs for other moods.

	// If you are seeing ads at the beginning of your videos, install
	// Adblock.

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use...
 * bit.ly/video-for-happy bit.ly/video-for-sad bit.ly/video-for-angry
 **/
