package util.window.modal;

import util.window.Controller;
import util.window.Window;

public abstract class ModalWindow<T extends Controller> extends Window<T> {
    protected Window parentWindow;

    protected void start(Window parentWindow, String title, String iconPath, String fxmlFile) {
        this.parentWindow = parentWindow;
        super.start(title, iconPath, fxmlFile);
    }

    @Override
    public void start() {
        stage.showAndWait();
    }
}
