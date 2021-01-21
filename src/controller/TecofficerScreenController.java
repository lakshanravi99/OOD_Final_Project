
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class TecofficerScreenController implements Initializable {

    @FXML
    private Pane pane_1;
    @FXML
    private Pane pane_2;
    @FXML
    private Pane pane_3;
    @FXML
    private Pane pane_4;
    @FXML
    private Pane pane_5;
    @FXML
    private AnchorPane mainpane;
    @FXML
    private StackPane stackpane;
    @FXML
    private ImageView userprofile;
    @FXML
    private ImageView medical;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void logoutbtn(MouseEvent event) {
        
        JFXDialogLayout dialogLayout = new JFXDialogLayout();
        dialogLayout.setHeading(new Text("Alert"));
        dialogLayout.setBody(new Text("Do You Want to Logout !"));
        
        JFXButton ok = new JFXButton("Ok");
        JFXButton Cancel = new JFXButton("Cancel");
        
        JFXDialog dialog = new JFXDialog(stackpane, dialogLayout, JFXDialog.DialogTransition.CENTER);
        
        ok.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.exit(0);
            }
        });
        
        Cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               dialog.close();
            }
        });
        
        dialogLayout.setActions(ok,Cancel);
        dialog.show();
        
    }

    @FXML
    private void mouse_exit_1(MouseEvent event) {
        
        pane_1.setStyle("-fx-background-color: #57606f;");
    }

    @FXML
    private void mouse_hover_1(MouseEvent event) {
        
         pane_1.setStyle("-fx-background-color: #2ed573;");
    }

    @FXML
    private void mouse_exit_2(MouseEvent event) {
        
         pane_2.setStyle("-fx-background-color: #57606f;");
    }

    @FXML
    private void mouse_hover_2(MouseEvent event) {
        
         pane_2.setStyle("-fx-background-color: #2ed573;");
    }

    @FXML
    private void mouse_exit_3(MouseEvent event) {
        
         pane_3.setStyle("-fx-background-color: #57606f;");
    }

    @FXML
    private void mouse_hover_3(MouseEvent event) {
        
         pane_3.setStyle("-fx-background-color: #2ed573;");
    }

    @FXML
    private void mouse_exit_4(MouseEvent event) {
        
         pane_4.setStyle("-fx-background-color: #57606f;");
    }

    @FXML
    private void mouse_hover_4(MouseEvent event) {
        
         pane_4.setStyle("-fx-background-color: #2ed573;");
    }

    @FXML
    private void mouse_exit_5(MouseEvent event) {
        
         pane_5.setStyle("-fx-background-color: #57606f;");
    }

    @FXML
    private void mouse_hover_5(MouseEvent event) {
        
         pane_5.setStyle("-fx-background-color: #2ed573;");
    }

    @FXML
    private void showprofile(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/toprofile.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void attendence(MouseEvent event) {
        
         try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/TecOfficerAttendence.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    @FXML
    private void notice(MouseEvent event) {
        
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/tecofficernotice.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void timetable(MouseEvent event) {
         try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/tectimetable.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void showmedical(MouseEvent event) {
       try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/toMedical.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //System.out.println("hi");
        
    }

//    @FXML
//    private void timetablebtn(MouseEvent event) {
//        try {
//            Parent load = FXMLLoader.load(this.getClass().getResource("/interface2/tectimetable.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(load));
//            stage.show();
//
//        } catch (IOException ex) {
//            Logger.getLogger(TecofficerScreenController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//        
//    }
    
    
    
    
}
