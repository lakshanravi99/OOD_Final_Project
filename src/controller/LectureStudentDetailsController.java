/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXTextField;
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
import tm.LectureStudetailsTM;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class LectureStudentDetailsController implements Initializable {

    @FXML
    private TableColumn<LectureStudetailsTM, ?> idcol;
    @FXML
    private TableColumn<LectureStudetailsTM, ?> f_namecol;
    @FXML
    private TableColumn<LectureStudetailsTM, ?> l_namecol;
    @FXML
    private TableColumn<LectureStudetailsTM, ?> gendercol;
    @FXML
    private TableColumn<LectureStudetailsTM, ?> addresscol;
    @FXML
    private TableColumn<LectureStudetailsTM, ?> statuscol;
    @FXML
    private JFXTextField searchbox;
    @FXML
    private TableView<LectureStudetailsTM> studetails;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LectureStudentDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LectureStudentDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }   
    
     private void setTableCols() {
        idcol.setCellValueFactory(new PropertyValueFactory<>("stu_id"));
        f_namecol.setCellValueFactory(new PropertyValueFactory<>("f_name"));
        l_namecol.setCellValueFactory(new PropertyValueFactory<>("l_name"));
        gendercol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        addresscol.setCellValueFactory(new PropertyValueFactory<>("address"));
        statuscol.setCellValueFactory(new PropertyValueFactory<>("status"));
        
    }
    
     private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM student");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<LectureStudetailsTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new LectureStudetailsTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        studetails.setItems(allCourse);

    }
    
    
}
