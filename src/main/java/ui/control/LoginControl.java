package ui.control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Component;

@Component
public class LoginControl {

    @FXML public TextField loginTF;
    @FXML public Label headerText;
    @FXML public PasswordField passwordPF;


    @FXML
    public void onCancel(ActionEvent actionEvent) {
        Platform.exit();
    }

    @FXML
    public void onLogin(ActionEvent actionEvent) {

    }
}
