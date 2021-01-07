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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminScreenController implements Initializable {

    @FXML
    private Pane pane_1;
    @FXML
    private Pane pane_2;
    @FXML
    private Pane pane_3;
    @FXML
    private Pane pane_4;
    @FXML
    private StackPane stackpane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void mouse_exit_1(MouseEvent event) {

        pane_1.setStyle("-fx-background-color: #1e272e;");
    }

    @FXML
    private void mouse_hover_1(MouseEvent event) {

        pane_1.setStyle("-fx-background-color:#ffdd59");
    }

    @FXML
    private void mouse_exit_2(MouseEvent event) {

        pane_2.setStyle("-fx-background-color: #1e272e;");
    }

    @FXML
    private void mouse_hover_2(MouseEvent event) {

        pane_2.setStyle("-fx-background-color:#ffdd59");
    }

    @FXML
    private void mouse_exit_3(MouseEvent event) {

        pane_3.setStyle("-fx-background-color: #1e272e;");
    }

    @FXML
    private void mouse_hover_3(MouseEvent event) {

        pane_3.setStyle("-fx-background-color:#ffdd59");
    }

    @FXML
    private void mouse_exit_4(MouseEvent event) {

        pane_4.setStyle("-fx-background-color: #1e272e;");
    }

    @FXML
    private void mouse_hover_4(MouseEvent event) {

        pane_4.setStyle("-fx-background-color:#ffdd59");
    }

    @FXML
    private void logoutbtn(MouseEvent event) {

        JFXDialogLayout dialogLayout = new JFXDialogLayout();
        dialogLayout.setHeading(new Text("Alert"));
        dialogLayout.setBody(new Text("Do You Want to Logout !"));

        JFXButton ok = new JFXButton("Ok");
        JFXButton Cancel = new JFXButton("Cancel");

//        JFXDialog dialog = new JFXDialog(stackpane, dialogLayout, JFXDialog.DialogTransition.CENTER);
//        ok.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent t) {
//                System.exit(0);
//            }
//        });
//
//        Cancel.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent t) {
//                dialog.close();
//            }
//        });
//
//        dialogLayout.setActions(ok, Cancel);
//        dialog.show();
    }

    @FXML
    private void adminprofile(MouseEvent event) {

        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/adminprofile.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }

//        Stage adminprofile = new Stage();
//        Parent root = null;
//        
//        try {
//            root = FXMLLoader.load(this.getClass().getResource("adminprofile.fxml"));
//        } catch (IOException ex) {
//            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        Stage current = (Stage)pane_1.getScene().getWindow();
//        Scene scene = new Scene(root);
//        
//        adminprofile.setScene(scene);
//        adminprofile.initStyle(StageStyle.UTILITY);
//        
//        current.hide();
//        adminprofile.show();
    }

    @FXML
    private void adminCourseScreen(MouseEvent event) {
        
       Stage admincourse = new Stage();
        Parent root = null;
        
        try {
            root = FXMLLoader.load(this.getClass().getResource("../view/admincdcourse.fxml"));
            Stage current = (Stage)pane_2.getScene().getWindow();
            Scene scene = new Scene(root);

            admincourse.setScene(scene);
            admincourse.initStyle(StageStyle.UTILITY);

            current.hide();
            admincourse.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }

    @FXML
    private void adminnotice(MouseEvent event) {
        
        Stage admincourse = new Stage();
        Parent root = null;
        
        try {
            root = FXMLLoader.load(this.getClass().getResource("../view/admincmNOTICE.fxml"));
            Stage current = (Stage)pane_3.getScene().getWindow();
            Scene scene = new Scene(root);

            admincourse.setScene(scene);
            admincourse.initStyle(StageStyle.UTILITY);

            current.hide();
            admincourse.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
   

    @FXML
    private void timetable(MouseEvent event) {
        
        Stage admintime = new Stage();
        Parent root = null;
        
        try {
            root = FXMLLoader.load(this.getClass().getResource("../view/admintimetable.fxml"));
            Stage current = (Stage)pane_4.getScene().getWindow();
            Scene scene = new Scene(root);

            admintime.setScene(scene);
            admintime.initStyle(StageStyle.UTILITY);

            current.hide();
            admintime.show();
        } catch (IOException ex) {
            Logger.getLogger(AdminScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    

}
