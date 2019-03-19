package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class SampleController {
    @FXML
    private Button sampleBtn;

    @FXML
    private TextField textField;

    @FXML
    void sampleBtnClicked(ActionEvent event){
        System.out.println("Button clicked");
        System.out.println(textField.getText());
    }

}
