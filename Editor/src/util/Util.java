package util;

import javafx.scene.image.Image;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Util {
    // USER FOLDERS
    public static String USER_CONTENT_PATH = "content" + File.separator;

    public static String USER_TILESET_PATH = "tileset" + File.separator;
    public static String USER_OBJECT_PATH = "object" + File.separator;
    public static String USER_ANIMATION_PATH = "animation" + File.separator;
    public static String USER_MAP_PATH = "map" + File.separator;

    // USER FILE EXTENSIONS
    public static String USER_TILESET_EXT = ".tls";
    public static String USER_OBJECT_EXT = ".gobj";
    public static String USER_ANIMATION_EXT = ".anm";
    public static String USER_MAP_EXT = ".map";

    // EDITOR FOLDER
    public static String SRC_CONTENT_PATH = "src" + File.separator + "content" + File.separator;
    public static String SRC_BUTTON_PATH = "button" + File.separator;
    public static String SRC_ICON_PATH = "icon" + File.separator;
    public static String SRC_FXML_PATH = "fxml" + File.separator;

    // USER PATHS

    public static String getTilesetPath(String name) {
        if (name == null)
            return USER_CONTENT_PATH + USER_TILESET_PATH;
        return USER_CONTENT_PATH + USER_TILESET_PATH + name + USER_TILESET_EXT;
    }

    public static String getObjectPath(String name) {
        if (name == null)
            return USER_CONTENT_PATH + USER_OBJECT_PATH;
        return USER_CONTENT_PATH + USER_OBJECT_PATH + name + USER_OBJECT_EXT;
    }

    public static String getAniamtionPath(String name) {
        if (name == null)
            return USER_CONTENT_PATH + USER_ANIMATION_PATH;
        return USER_CONTENT_PATH + USER_ANIMATION_PATH + name + USER_ANIMATION_EXT;
    }

    public static String getMapPath(String name) {
        if (name == null)
            return USER_CONTENT_PATH + USER_MAP_PATH;
        return USER_CONTENT_PATH + USER_MAP_PATH + name + USER_MAP_EXT;
    }

    // EDITOR PATHS

    public static String getIconPath(String iconName) {
        String ext = ".png";
        return SRC_CONTENT_PATH + SRC_ICON_PATH + iconName + ext;
    }

    public static URL getFxmlPath(String fxmlName) throws MalformedURLException {
        String ext = ".fxml";
        return new URL("file:" + SRC_CONTENT_PATH + SRC_FXML_PATH + fxmlName + ext);
    }

    // UTIL

    public static Image getSubImage(Image image, int x, int y, int w, int h) {
        // TODO

        return null;
    }

}
