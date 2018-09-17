package util;

import javafx.application.Application;
import javafx.stage.Stage;
import util.window.modal.confirmBox.ConfirmBox;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("yo");

        new ConfirmBox(null);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
