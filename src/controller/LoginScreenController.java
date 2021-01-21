
package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import comman.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginScreenController extends User {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;

    public void initialize(URL url, ResourceBundle rb) {


    }


    @FXML
    private void loginbtn(MouseEvent event) {

        /*String sql = "System mysql -u admin -p = '"+password.getText().trim()+"'";
        Connection connection = (Connection) DBConnection.connect();
        try {
             PreparedStatement ps =(PreparedStatement) Connection.PreparedStatement(sql);
        } catch (Exception e) {
        }**/

        String getusername = "admin";
        String getuserpw = "admin123";

        String getlecusername = "lecture";
        String getlecuserpw = "lec123";

        String getstuusername = "student";
        String getstuuserpw = "student123";

        String gettecofficerusername = "tec";
        String gettecofficeruserpw = "tec123";
        if ((username.getText().equals(getusername)) & (password.getText().equals(getuserpw))) {


            Stage adminScreen = new Stage();
            Parent root = null;

            try {
                setId("");
                root = FXMLLoader.load(getClass().getResource("../view/adminScreen.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }

            Stage current = (Stage) username.getScene().getWindow();
            Scene scene = new Scene(root);

            adminScreen.setScene(scene);
            adminScreen.initStyle(StageStyle.UTILITY);

            current.hide();
            adminScreen.show();

        } else if ((username.getText().equals(getlecusername)) & (password.getText().equals(getlecuserpw))) {

            Stage lectureScreen = new Stage();
            Parent root = null;

            try {
                root = FXMLLoader.load(getClass().getResource("../view/lectureScreen.fxml"));
                Stage current = (Stage) username.getScene().getWindow();
                Scene scene = new Scene(root);

                lectureScreen.setScene(scene);
                lectureScreen.initStyle(StageStyle.UTILITY);

                current.hide();
                lectureScreen.show();
            } catch (IOException ex) {
                Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }



        } else if ((username.getText().equals(getstuusername)) & (password.getText().equals(getstuuserpw))) {

            Stage studentScreen = new Stage();
            Parent root = null;

            try {
                root = FXMLLoader.load(getClass().getResource("../view/studentScreen.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }

            Stage current = (Stage) username.getScene().getWindow();
            Scene scene = new Scene(root);

            studentScreen.setScene(scene);
            studentScreen.initStyle(StageStyle.TRANSPARENT);

            current.hide();
            studentScreen.show();

        } else if ((username.getText().equals(gettecofficerusername)) & (password.getText().equals(gettecofficeruserpw))) {

            Stage tecofficerScreen = new Stage();
            Parent root = null;

            try {
                root = FXMLLoader.load(getClass().getResource("../view/tecofficerScreen.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }

            Stage current = (Stage) username.getScene().getWindow();
            Scene scene = new Scene(root);

            tecofficerScreen.setScene(scene);
            tecofficerScreen.initStyle(StageStyle.TRANSPARENT);

            current.hide();
            tecofficerScreen.show();

        } else {


            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error ");
            alert.setHeaderText("Invalid Username or Password!");
            alert.setContentText("Enter valid Username and Password");

            alert.showAndWait();
           
            
            /*Image image= new Image("error.png");
            
            
           Notifications notifications =  Notifications.create()
              .title("Error")
              .text("Invalid Username or Password!")
              .hideAfter(Duration.seconds(2))
              .position(Pos.CENTER_RIGHT)
              .graphic(new ImageView(image));
            notifications.darkStyle();
            notifications.show();*/


        }

    }

    @FXML
    private void cancelbtn(MouseEvent event) {

        System.exit(0);

    }


}
