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
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javax.swing.JOptionPane;

import tm.TecAttendenceTM;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class TecOfficerAttendanceController implements Initializable {

    @FXML
    private JFXTextField searchbox;

    ObservableList<TecAttendenceTM> listM;
    ObservableList<TecAttendenceTM> dataList;

    @FXML
    private TableColumn<TecAttendenceTM, ?> idcol;
    @FXML
    private TableColumn<TecAttendenceTM, ?> courseidcol;
    @FXML
    private TableColumn<TecAttendenceTM, ?> datecol;
    @FXML
    private TableColumn<TecAttendenceTM, ?> typecol;
    @FXML
    private TableColumn<TecAttendenceTM, ?> att_statuscol;
    @FXML
    private TableColumn<TecAttendenceTM, ?> hoursecol;
    @FXML
    private JFXButton insertbtn;
    @FXML
    private JFXButton updatebtn;
    @FXML
    private JFXButton deletebtn;
    @FXML
    private TableView<TecAttendenceTM> atttbl;
    @FXML
    private JFXTextField idbox;
    @FXML
    private JFXTextField courseidbox;
    @FXML
    private JFXTextField typebox;
    @FXML
    private JFXTextField statusbox;
    @FXML
    private JFXTextField hoursbox;
    @FXML
    private DatePicker datebox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insertrecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO attendence VALUES (?,?,?,?,?,?)");
            stm.setObject(1, idbox.getText());
            stm.setObject(2, courseidbox.getText());
            stm.setObject(3, datebox.getValue());
            stm.setObject(4, typebox.getText());
            stm.setObject(5, statusbox.getText());
            stm.setObject(6, hoursbox.getText());


            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllCourseToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void updaterecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE attendence SET Date=?,type=?,att_status=?,hours=? where std_id=? AND course_id=? ");

            stm.setObject(1, datebox.getValue());
            stm.setObject(2, typebox.getText());
            stm.setObject(3, statusbox.getText());
            stm.setObject(4, hoursbox.getText());
            stm.setObject(5, courseidbox.getText());
            stm.setObject(6, idbox.getText());

            //stm.setObject(4, genderbox.getText());
            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Update sucessfully");
                loadAllCourseToTable();
                setTableCols();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void deleterecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("delete from attendence where std_id=? AND course_id=? AND date=? AND type=? AND att_status=?");

            stm.setObject(1, idbox.getText());
            stm.setObject(2, courseidbox.getText());
            stm.setObject(3, datebox.getValue());
            stm.setObject(4, typebox.getText());
            stm.setObject(5, statusbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "delete sucessfully");
                loadAllCourseToTable();
                setTableCols();
            } else {
                JOptionPane.showMessageDialog(null, "NOT delete");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TecOfficerAttendanceController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void setTableCols() {
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        courseidcol.setCellValueFactory(new PropertyValueFactory<>("course_id"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));
        typecol.setCellValueFactory(new PropertyValueFactory<>("type"));
        att_statuscol.setCellValueFactory(new PropertyValueFactory<>("att_status"));
        hoursecol.setCellValueFactory(new PropertyValueFactory<>("hours"));

    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM attendence");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<TecAttendenceTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new TecAttendenceTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        atttbl.setItems(allCourse);

    }

    @FXML
    private void tableToMouseClicked(MouseEvent event) {

        TecAttendenceTM to = atttbl.getSelectionModel().getSelectedItem();

        idbox.setText(to.getId());
        courseidbox.setText(to.getCourse_id());
        //datebox.setValue(to.getDate());
        typebox.setText(to.getType());
        statusbox.setText(to.getAtt_status());
        hoursbox.setText(to.getHours());
    }
//
//    void search_user() {
//        idcol.setCellValueFactory(new PropertyValueFactory<users, String>("id"));
//        courseidcol.setCellValueFactory(new PropertyValueFactory<users, String>("course_id"));
//        datecol.setCellValueFactory(new PropertyValueFactory<users, String>("date"));
//        //col_email.setCellValueFactory(new PropertyValueFactory<users,String>("email"));
//        //col_type.setCellValueFactory(new PropertyValueFactory<users,String>("type"));
//
//        dataList = mysqlconnect.getDatausers();
//        atttbl.setItems(dataList);
//        FilteredList<users> filteredData = new FilteredList<>(dataList, b -> true);
//        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
//            filteredData.setPredicate(person -> {
//                if (newValue == null || newValue.isEmpty()) {
//                    return true;
//                }
//                String lowerCaseFilter = newValue.toLowerCase();
//
//                if (person.getid().toLowerCase().indexOf(lowerCaseFilter) != -1) {
//                    return true; // Filter matches username
//                } else if (person.getCourse_id().toLowerCase().indexOf(lowerCaseFilter) != -1) {
//                    return true; // Filter matches password
//                } else if (person.getDate().toLowerCase().indexOf(lowerCaseFilter) != -1) {
//                    return true; // Filter matches password
//                }
//   /* else if (String.valueOf(person.getEmail()).indexOf(lowerCaseFilter)!=-1)
//         return true;// Filter matches email */
//
//                else
//                    return false; // Does not match.
//            });
//        });
//        SortedList<tec_attendence> sortedData = new SortedList<>(filteredData);
//        sortedData.comparatorProperty().bind(atttbl.comparatorProperty());
//        atttbl.setItems(sortedData);
//    }


}
