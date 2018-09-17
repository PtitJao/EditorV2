package util.window;

import java.util.ArrayList;
import java.util.List;

public abstract class Controller {
    protected Window parentWindow;
    protected List<NestedController> controllers;

    public void init(Window parentWindow) {
        this.parentWindow = parentWindow;
        parentWindow.start();
    }

    protected void add(NestedController controller) {
        if (controllers == null)
            controllers = new ArrayList<>();
        controllers.add(controller);
        controller.init(parentWindow, this);
    }

    protected void remove(NestedController controller) {
        controllers.remove(controller);
    }

    public void reloadLanguage() {
        for (Controller c : controllers)
            c.reloadLanguage();
    }

    public void reloadTheme() {
        for (Controller c : controllers)
            c.reloadTheme();
    }

    protected void close() {
        parentWindow.close();
    }
}
