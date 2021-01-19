/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import db.DBConnection;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class ToProfileController implements Initializable {

    @FXML
    private JFXTextField toid;
    @FXML
    private JFXTextField toname;
    @FXML
    private JFXTextField tocontact;
    @FXML
    private JFXTextField togender;
    @FXML
    private JFXTextField todob;
    @FXML
    private JFXButton update;
    @FXML
    private JFXTextField tolname;
    @FXML
    private JFXTextField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updatebtn(MouseEvent event) {
      

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE technical_officer SET f_name=?,l_name=?,password=? where to_id=? ");
            
            stm.setObject(1, toname.getText());
            stm.setObject(2, tolname.getText());
            stm.setObject(3, password.getText());
            stm.setObject(4, toid.getText());
            
            //stm.setObject(4, genderbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Update sucessfully");
                
            } else {
                JOptionPane.showMessageDialog(null, "NOT Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToProfileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToProfileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        //--------------------
    }
        
    }
    

