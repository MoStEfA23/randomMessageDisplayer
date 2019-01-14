/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askmeprogram;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/**
 *
 * @author MoStEfA23
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Text actiontarget;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        List<String> randomMessages = Arrays.asList("Hi and welcome to devent", 
                                                    "Hi there",
                                                    "Have a good day sir",
                                                    "Goal, Goal, Goal !!!",
                                                    "Goodbye sir");

       Random r = new Random();
       int messageIndex = 0 + r.nextInt((randomMessages.size()-1) + 1);//-1 cause we start from 0
        actiontarget.setText(randomMessages.get(messageIndex));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
