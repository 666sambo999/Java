package org.example.academyfx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField LastName;
    @FXML
    private TextField FirstName;
    @FXML
    private DatePicker age;
    @FXML
    private Label welcomeText;


    @FXML
    protected void onHelloButtonClick()
    {
        String data = LastName.getText() + " " + FirstName.getText() + " "+ age.getValue();
        //welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setText(data);
        Alert alert = new Alert(Alert.AlertType.INFORMATION, data, ButtonType.APPLY, ButtonType.CANCEL);
        alert.setTitle("Здорово" + LastName.getText());
        alert.show();
    }
}