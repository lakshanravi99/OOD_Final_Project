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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import tm.ToMedicalTM;

import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class ToMedicalController implements Initializable {

    @FXML
    private JFXTextField searchbox;
    @FXML
    private JFXTextField refnobox;
    @FXML
    private JFXTextField courseidbox;
    @FXML
    private JFXTextField placebox;
    @FXML
    private JFXTextField idbox;
    @FXML
    private JFXTextField statusbox;
    @FXML
    private DatePicker datebox;
    @FXML
    private JFXTextField approvelbox;
    @FXML
    private JFXButton insertbtn;
    @FXML
    private JFXButton updatebtn;
    @FXML
    private JFXButton deletebtn;
    @FXML
    private TableView<ToMedicalTM> medicaltable;
    @FXML
    private TableColumn<ToMedicalTM, ?> colrefno;
    @FXML
    private TableColumn<ToMedicalTM, ?> colcourse;
    @FXML
    private TableColumn<ToMedicalTM, ?> colsubmit;
    @FXML
    private TableColumn<ToMedicalTM, ?> colplace;
    @FXML
    private TableColumn<ToMedicalTM, ?> colstdid;
    @FXML
    private TableColumn<ToMedicalTM, ?> colstatus;
    @FXML
    private TableColumn<ToMedicalTM, ?> colapprovel;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insertrecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO medical VALUES (?,?,?,?,?,?,?)");
            stm.setObject(1, refnobox.getText());
            stm.setObject(2, courseidbox.getText());
            stm.setObject(3, datebox.getValue());
            stm.setObject(4, placebox.getText());
            stm.setObject(5, idbox.getText());
            stm.setObject(6, statusbox.getText());
            stm.setObject(7, approvelbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllCourseToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM medical");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<ToMedicalTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new ToMedicalTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7)));
        }
        medicaltable.setItems(allCourse);

    }


    private void setTableCols() {
        colrefno.setCellValueFactory(new PropertyValueFactory<>("refnobox"));
        colcourse.setCellValueFactory(new PropertyValueFactory<>("courseidbox"));
        colsubmit.setCellValueFactory(new PropertyValueFactory<>("datebox"));
        colplace.setCellValueFactory(new PropertyValueFactory<>("placebox"));
        colstdid.setCellValueFactory(new PropertyValueFactory<>("idbox"));
        colstatus.setCellValueFactory(new PropertyValueFactory<>("statusbox"));
        colapprovel.setCellValueFactory(new PropertyValueFactory<>("approvelbox"));

    }

    @FXML
    private void updaterecord(MouseEvent event) {

        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE medical SET course_id=?,submit_date=?,place_of_issue=?,status=?,Approvel=? where ref_no=? AND std_id=? ");

            stm.setObject(1, refnobox.getText());
            stm.setObject(2, courseidbox.getText());
            stm.setObject(3, datebox.getValue());
            stm.setObject(4, placebox.getText());
            stm.setObject(5, idbox.getText());
            stm.setObject(6, statusbox.getText());
            stm.setObject(7, approvelbox.getText());


            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Update sucessfully");
                loadAllCourseToTable();
                setTableCols();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Updated");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void deleterecord(MouseEvent event) {
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("delete from medical  where ref_no=? AND course_id=?  AND std_id=?  ");

            stm.setObject(1, idbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "delete sucessfully");
                loadAllCourseToTable();
                setTableCols();
            } else {
                JOptionPane.showMessageDialog(null, "NOT delete");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ToMedicalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showmedicaltable(MouseEvent event) {

        ToMedicalTM admin = medicaltable.getSelectionModel().getSelectedItem();

        refnobox.setText(admin.getRefnobox());
        courseidbox.setText(admin.getCourseidbox());
        //datebox.setText(admin.getDatebox());
        placebox.setText(admin.getPlacebox());
        idbox.setText(admin.getIdbox());
        statusbox.setText(admin.getStatusbox());
        approvelbox.setText(admin.getApprovelbox());

    }

}
