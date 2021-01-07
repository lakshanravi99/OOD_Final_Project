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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class LecturerprofileController implements Initializable {

    @FXML
    private JFXTextField lecid;
    @FXML
    private JFXTextField lecname;
    @FXML
    private JFXTextField lecno;
    @FXML
    private JFXTextField lecgender;
    @FXML
    private JFXTextField lecdob;
    @FXML
    private JFXTextField lecpass;
    @FXML
    private JFXButton updateRecord;
    @FXML
    private JFXTextField username;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         

    } 
    
    
    @FXML
    private void updateRecord(MouseEvent event) {
    try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE lecture SET username=?,password=? where lec_id=? ");
            
            stm.setObject(1, username.getText());
//            stm.setObject(2, lecno.getText());
//            stm.setObject(3, lecgender.getText());
//            stm.setObject(4, lecdob.getText());
            stm.setObject(2, lecpass.getText());
            stm.setObject(3, lecid.getText());
            
            //stm.setObject(4, genderbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Update sucessfully");
               
            } else {
                JOptionPane.showMessageDialog(null, "NOT Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturerprofileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturerprofileController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
    
    
  


}
