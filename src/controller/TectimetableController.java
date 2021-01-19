/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tm.TecTimeTM;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class TectimetableController implements Initializable {

    @FXML
    private TableView<TecTimeTM> timetbl;
    @FXML
    private TableColumn<TecTimeTM, ?> timecol;
    @FXML
    private TableColumn<TecTimeTM, ?> moncol;
    @FXML
    private TableColumn<TecTimeTM, ?> tuescol;
    @FXML
    private TableColumn<TecTimeTM, ?> wedcol;
    @FXML
    private TableColumn<TecTimeTM, ?> thurscol;
    @FXML
    private TableColumn<TecTimeTM, ?> fricol;

    /**
     * Initializes the controller class.
     */
    @Override
       
         public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TectimetableController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TectimetableController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    } 
         
         
         private void setTableCols() {
        timecol.setCellValueFactory(new PropertyValueFactory<>("time"));
        moncol.setCellValueFactory(new PropertyValueFactory<>("mon"));
        tuescol.setCellValueFactory(new PropertyValueFactory<>("tue"));
        wedcol.setCellValueFactory(new PropertyValueFactory<>("wed"));
        thurscol.setCellValueFactory(new PropertyValueFactory<>("thurs"));
        fricol.setCellValueFactory(new PropertyValueFactory<>("fri"));
        
    }
    
     private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM icttimetable");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<TecTimeTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new TecTimeTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3),rst.getString(4) , rst.getString(5),rst.getString(6)));
        }
        timetbl.setItems(allCourse);

    }
    
}
