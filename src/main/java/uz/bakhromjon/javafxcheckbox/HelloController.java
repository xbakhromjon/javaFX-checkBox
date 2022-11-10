package uz.bakhromjon.javafxcheckbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class HelloController {

    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;

    @FXML
    private ImageView myImageView;


    public void change(ActionEvent event) throws IOException {
        if (myCheckBox.isSelected()) {
            myLabel.setText("ON");
            myImageView.setImage(new Image(Files.newInputStream(Path.of("/home/xbakhromjon/Downloads/Ex_Files_Web_Apps_Spring_Boot_WebSockets/Exercise Files/Ch04/04_01/javaFX-checkBox/src/main/resources/photos/photo2.jpg"))));
        } else {
            myLabel.setText("OFF");
            myImageView.setImage(new Image(Files.newInputStream(Path.of("/home/xbakhromjon/Downloads/Ex_Files_Web_Apps_Spring_Boot_WebSockets/Exercise Files/Ch04/04_01/javaFX-checkBox/src/main/resources/photos/photo1.jpg"))));
        }
    }

}