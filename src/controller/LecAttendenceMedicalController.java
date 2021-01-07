/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tm.LeMediTM;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class LecAttendenceMedicalController implements Initializable {

    @FXML
    private TableView<LeMediTM> attendence;
    @FXML
    private TableColumn<LeMediTM, ?> stdid;
    @FXML
    private TableColumn<LeMediTM, ?> cid;
    @FXML
    private TableColumn<LeMediTM, ?> date;
    @FXML
    private TableColumn<LeMediTM, ?> TYPE;
    @FXML
    private TableColumn<LeMediTM, ?> STATUS;
    @FXML
    private TableColumn<LeMediTM, ?> HOURS;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
    
    private void setTableCols() {
       stdid.setCellValueFactory(new PropertyValueFactory<>("stdid"));
        cid.setCellValueFactory(new PropertyValueFactory<>("cid"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        TYPE.setCellValueFactory(new PropertyValueFactory<>("TYPE"));
        STATUS.setCellValueFactory(new PropertyValueFactory<>("STATUS"));
        HOURS.setCellValueFactory(new PropertyValueFactory<>("HOURS"));
    }
    
     private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM attendence");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<LeMediTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new LeMediTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        attendence.setItems(allCourse);

    }
    
    
}
