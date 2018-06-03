package util.window;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import util.Util;

public abstract class Window<T extends Controller>{
    protected String title;
    protected Stage stage;
    protected T controller;

    protected void start(String title, String icon, String fxmlFile) {
        this.title = title;
        this.stage = new Stage();

        try {
            FXMLLoader loader = new FXMLLoader(Util.getFxmlPath(fxmlFile));
            loader.load();

            controller = loader.getController();
            stage.setScene(new Scene(loader.getRoot()));
        } catch (Exception e) {

        }

        reloadTitle();
        stage.getIcons().add(new Image(Util.getIconPath(icon)));

        reloadLanguage();
        reloadTheme();

        stage.sizeToScene();

        controller.init(this);
    }

    protected void start() {
        stage.show();
    }

    public void reloadLanguage() {
        controller.reloadLanguage();
    }

    public void reloadTheme() {
        controller.reloadTheme();
    }

    public void reloadTitle() {
        stage.setTitle(title);
    }

    public void close() {
        stage.close();
    }

    public void requestFocus() {
        stage.requestFocus();
    }
}
