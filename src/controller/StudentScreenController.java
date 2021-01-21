
package controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class StudentScreenController implements Initializable {

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
    private Pane pane_6;
    @FXML
    private Pane pane_7;
    @FXML
    private JFXButton logoutbtn;
    @FXML
    private ImageView stucourse;
    @FXML
    private ImageView timetablebtn;

    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void logoutbtn(MouseEvent event) {
        
        System.exit(0);
    }

    @FXML
    private void mouse_exit_1(MouseEvent event) {
        
        pane_1.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_1(MouseEvent event) {
        
        pane_1.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_2(MouseEvent event) {
        
        pane_2.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_2(MouseEvent event) {
        
        pane_2.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_3(MouseEvent event) {
        
        pane_3.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_3(MouseEvent event) {
        
        pane_3.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_4(MouseEvent event) {
        
        pane_4.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_4(MouseEvent event) {
        
        pane_4.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_5(MouseEvent event) {
        
        pane_5.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_5(MouseEvent event) {
        
        pane_5.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_6(MouseEvent event) {
        
        pane_6.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_6(MouseEvent event) {
        
        pane_6.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void mouse_exit_7(MouseEvent event) {
        
        pane_7.setStyle("-fx-background-color: #82589F;");
    }

    @FXML
    private void mouse_hover_7(MouseEvent event) {
        
        pane_7.setStyle("-fx-background-color: #F97F51;");
    }

    @FXML
    private void profile(MouseEvent event) {
        
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/studentprofile.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();
            
            ///////////////////////////////////////////////////////////////////////////////////
            //System.out.println("TestLoad",.seltbl.usrname);
            ////////////////////////////////////////////////////////////////////////////////

        } catch (IOException ex) {
            Logger.getLogger(StudentScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void notice(MouseEvent event) {
         try {
            Parent load = FXMLLoader.load(this.getClass().getResource("/view/stuNotice.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(StudentScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void stucourse(MouseEvent event) {
        
    }

    @FXML
    private void timetablebutton(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("/interface2/studenttimetable.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(StudentScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
