package util;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Util {
    // EDITOR FOLDER
    public static String SRC_CONTENT_PATH = "src" + File.separator + "content" + File.separator;
    public static String SRC_BUTTON_PATH = "button" + File.separator;
    public static String SRC_ICON_PATH = "icon" + File.separator;
    public static String SRC_FXML_PATH = "fxml" + File.separator;

    // EDITOR PATHS

    public static String getIconPath(String iconName) {
        String ext = ".png";
        return "file:" + SRC_CONTENT_PATH + SRC_ICON_PATH + iconName + ext;
    }

    public static URL getFxmlPath(String fxmlName) throws MalformedURLException {
        String ext = ".fxml";
        return new URL("file:" + SRC_CONTENT_PATH + SRC_FXML_PATH + fxmlName + ext);
    }

    // UTIL

    public static Image getSubImage(Image image, int x, int y, int w, int h) {
        BufferedImage bi = new BufferedImage((int)image.getWidth(), (int)image.getHeight(), BufferedImage.TYPE_INT_ARGB);
        SwingFXUtils.fromFXImage(image, bi);

        BufferedImage subbi = bi.getSubimage(x, y, w, h);
        Image img = SwingFXUtils.toFXImage(subbi, null);

        return img;
    }

}
