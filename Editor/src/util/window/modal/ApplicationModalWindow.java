package util.window.modal;

import javafx.stage.Modality;
import util.window.Controller;
import util.window.Window;

public abstract class ApplicationModalWindow<T extends Controller> extends ModalWindow<T> {
    @Override
    protected void start(Window parentWindow, String title, String iconPath, String fxmlFile) {
        super.start(parentWindow, title, iconPath, fxmlFile);
        stage.initModality(Modality.APPLICATION_MODAL);
    }
}
