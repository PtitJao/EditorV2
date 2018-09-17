package util.window.modal.confirmBox;

import util.window.Window;
import util.window.modal.WindowModalWindow;

public class ConfirmBox extends WindowModalWindow<ConfirmBoxController> {
    private boolean answer = false;

    public ConfirmBox(Window parent) {
        // TODO LANGUAGE AND THEME
        start(parent, "CONFIRM BOX", "question16", "confirmBox");
    }
}
