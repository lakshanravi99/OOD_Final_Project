
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LectureScreenController implements Initializable {

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
    private JFXButton uploadbtn;
    @FXML
    private ImageView showmarks;
    @FXML
    private JFXButton uploadbtn1;
    @FXML
    private ImageView lecturerprofile;
    @FXML
    private ImageView lecturecourse;
    @FXML
    private ImageView showNotice;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void logoutbtn(MouseEvent event) {
        
        System.exit(0);
    }

    @FXML
    private void mouse_exit_1(MouseEvent event) {
        pane_1.setStyle("-fx-background-color: #3c40c6;");
        
    }

    @FXML
    private void mouse_hover_1(MouseEvent event) {
     pane_1.setStyle("-fx-background-color: #ff5e57;");

        
    }

    @FXML
    private void mouse_exit_2(MouseEvent event) {
        
         pane_2.setStyle("-fx-background-color: #3c40c6;");
    }

    @FXML
    private void mouse_hover_2(MouseEvent event) {
        
         pane_2.setStyle("-fx-background-color: #ff5e57;");
    }

    @FXML
    private void mouse_exit_3(MouseEvent event) {
        
         pane_3.setStyle("-fx-background-color: #3c40c6;");
    }

    @FXML
    private void mouse_hover_3(MouseEvent event) {
        
         pane_3.setStyle("-fx-background-color: #ff5e57;");
    }

    @FXML
    private void mouse_exit_4(MouseEvent event) {
        
         pane_4.setStyle("-fx-background-color: #3c40c6;");
    }

    @FXML
    private void mouse_hover_4(MouseEvent event) {
        
         pane_4.setStyle("-fx-background-color: #ff5e57;");
    }

    @FXML
    private void mouse_exit_5(MouseEvent event) {
        
         pane_5.setStyle("-fx-background-color: #3c40c6;");
    }

    @FXML
    private void mouse_hover_5(MouseEvent event) {
        
         pane_5.setStyle("-fx-background-color: #ff5e57;");
    }

    @FXML
    private void lecturerprofile(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/lecturerprofile.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void lecturecourse(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/lecturercoursemaintain.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void upload(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("/interface2/lectureuploadmarks.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void studentDetails(MouseEvent event) {
        
         try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/LectureStudentDetails.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    @FXML
//    private void showmarks(MouseEvent event) {
//        try {
//            Parent load = FXMLLoader.load(this.getClass().getResource("/interface2/lectureshowmarks.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(load));
//            stage.show();
//
//        } catch (IOException ex) {
//            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    @FXML
    private void showNotice(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/lectureshowNotices.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showattendence(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("../view/lecAttendenceMedical.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showmarks(MouseEvent event) {
        try {
            Parent load = FXMLLoader.load(this.getClass().getResource("lectureshowmarks.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(LectureScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
