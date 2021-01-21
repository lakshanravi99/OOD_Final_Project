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
import tm.StdTimeTableTM;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class StudenttimetableController implements Initializable {

    @FXML
    private TableView<StdTimeTableTM> timetabl;
    @FXML
    private TableColumn<StdTimeTableTM, ?> timecol;
    @FXML
    private TableColumn<StdTimeTableTM, ?> moncol;
    @FXML
    private TableColumn<StdTimeTableTM, ?> tucol;
    @FXML
    private TableColumn<StdTimeTableTM, ?> wedcol;
    @FXML
    private TableColumn<StdTimeTableTM, ?> thucol;
    @FXML
    private TableColumn<StdTimeTableTM, ?> fricol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StuNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StuNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    private void setTableCols() {
        timecol.setCellValueFactory(new PropertyValueFactory<>("timecol"));
        moncol.setCellValueFactory(new PropertyValueFactory<>("moncol"));
        tucol.setCellValueFactory(new PropertyValueFactory<>("tucol"));
        wedcol.setCellValueFactory(new PropertyValueFactory<>("wedcol"));
        thucol.setCellValueFactory(new PropertyValueFactory<>("thucol"));
        fricol.setCellValueFactory(new PropertyValueFactory<>("fricol"));
        

    }
    
    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM icttimetable");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<StdTimeTableTM> allCourse = FXCollections.observableArrayList();

//        System.out.println("In notice");

        while (rst.next()) {
            allCourse.add(new StdTimeTableTM(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
//            System.out.println(rst.getString(1) + " " + rst.getString(2) + " " + rst.getString(3));
        }
        timetabl.setItems(allCourse);

    }


    
}
