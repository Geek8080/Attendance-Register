package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Subject> subs = new ArrayList<Subject>();

    public static final String ICON_IMAGE_LOC = "logo.png";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Pin.fxml"));
        primaryStage.setTitle("Enter Pin");
        primaryStage.setScene(new Scene(root, 531, 220));
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream(ICON_IMAGE_LOC)));
        primaryStage.show();
        initialiseSubjects();
    }

    private void initialiseSubjects() {
        Helper.inflateSub();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
