package LARRY;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Resources {
    public enum Icon{
        FAST_FORWARD("ic_fast_forward_white_48dp.png"),
        FAST_REWIND("ic_fast_rewind_white_48dp.png"),
        LOOP("ic_loop_white_48dp.png"),
        PAUSE("ic_pause_white_48dp.png"),
        PLAY("ic_play_arrow_white_48dp.png"),
        PLAYLIST_ADD("ic_playlist_add_white_48dp.png"),
        PLAYLIST_PLAY("ic_playlist_play_white_48dp.png"),
        REPEAT("ic_repeat_white_48dp.png"),
        REPLAY_10("ic_replay_10_white_48dp.png"),
        REPLAY_30("ic_replay_30_white_48dp.png"),
        REPLAY_5("ic_replay_5_white_48dp.png"),
        REPLAY("ic_replay_white_48dp.png");

        String filename;

        private Icon(String fileName) {
            this.filename = fileName;
        }

        public ImageIcon getIcon() {
            String iconFilePathRelative = "/resources/icons/" + this.filename;

            try {
                InputStream url = Resources.class.getResourceAsStream(iconFilePathRelative);
                if (url == null) {
                    throw new FileNotFoundException("Icon file not found: " + iconFilePathRelative);
                }

                BufferedImage buffImg = ImageIO.read(url);
                // TEMPORARY MEASURES - hardcoded image rescaling to 20x20
                return new ImageIcon(buffImg.getScaledInstance(20, 20, Image.SCALE_FAST));

            } catch (IOException ex){
                System.out.println("ERROR: Exception caught in getIcon(). Returning a null icon (will result in a blank/missing image)");
                ex.printStackTrace();
                return null;
            }
        }
    }
}
