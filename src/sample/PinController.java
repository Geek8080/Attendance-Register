package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.Main;

public class PinController {



    @FXML
    public JFXPasswordField pin;

    @FXML
    public JFXButton ok;

    public void check(MouseEvent evt){
        if(Integer.parseInt(pin.getText().trim()) == 1024){
            //load();
            loadSchedule();
            loadHome();
            ((Stage) ok.getScene().getWindow()).close();
            //AlertMaker.showTrayMessage("Login Information", "Successfull log in...");
        }else{
            AlertMaker.showErrorMessage("Login Information", "Wrong Credentials...");
            pin.getStyleClass().add("wrong-credentials");
        }
    }

    public void load(){
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Loader.fxml"));
            Stage stage = new Stage(StageStyle.UNDECORATED);
            stage.setOpacity(0.8);
            stage.setTitle("Loading...");
            stage.setScene(new Scene(parent));
            stage.show();
            stage.getIcons().add(new Image(getClass().getResourceAsStream(Main.ICON_IMAGE_LOC)));
        }catch(Exception ex){
            System.out.println("Couldn't load main window...  " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void loadHome() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Home");
            stage.setScene(new Scene(parent));
            stage.show();
            stage.getIcons().add(new Image(getClass().getResourceAsStream(Main.ICON_IMAGE_LOC)));
        }catch(Exception ex){
            System.out.println("Couldn't load main window...  " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void loadSchedule() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("Schedule");
            stage.setScene(new Scene(parent));
            stage.setX(0.0d);
            stage.setY(0.0d);
            stage.show();
            stage.getIcons().add(new Image(getClass().getResourceAsStream(Main.ICON_IMAGE_LOC)));
        }catch(Exception ex){
            System.out.println("Couldn't load schedule window...  " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
