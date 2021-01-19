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
import tm.TecOfficerNoticeTM;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class TecofficernoticeController implements Initializable {

    @FXML
    private TableColumn<TecOfficerNoticeTM, ?> idcol;
    @FXML
    private TableColumn<TecOfficerNoticeTM, ?> datecol;
    @FXML
    private TableColumn<TecOfficerNoticeTM, ?> noticecol;
    @FXML
    private TableView<TecOfficerNoticeTM> noticetbl;

    /**
     * Initializes the controller class.
     */
    @Override

    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecofficernoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TecofficernoticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }


    private void setTableCols() {
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));
        noticecol.setCellValueFactory(new PropertyValueFactory<>("notice"));

    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM admin_notice");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<TecOfficerNoticeTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new TecOfficerNoticeTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3)));
        }
        noticetbl.setItems(allCourse);

    }

}
