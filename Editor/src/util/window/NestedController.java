package util.window;

public abstract class NestedController extends Controller {
    protected Controller parentController;

    public void init(Window parentWindow, Controller parentController) {
        super.init(parentWindow);
        this.parentController = parentController;
    }
}
