package settings;

import java.io.File;

public class ProjectDirectory {
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
}
