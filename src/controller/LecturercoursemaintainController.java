
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import tm.AdminCourseTM;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
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
public class LecturercoursemaintainController implements Initializable {

    @FXML
    private TableColumn<AdminCourseTM, ?> idcol;
    @FXML
    private TableColumn<AdminCourseTM, ?> namecol;
    @FXML
    private TableColumn<AdminCourseTM, ?> tcol;
    @FXML
    private TableColumn<AdminCourseTM, ?> pcol;
    @FXML
    private TableColumn<AdminCourseTM, ?> lecidcol;
    @FXML
    private TableColumn<AdminCourseTM, ?> depidcol;
    @FXML
    private JFXTextField idbox;
    @FXML
    private JFXTextField namebox;
    @FXML
    private JFXButton deletebtn;
    @FXML
    private JFXButton updatebtn;
    @FXML
    private JFXButton insertbtn;
    @FXML
    private JFXTextField tbox;
    @FXML
    private JFXTextField lecidbox;
    @FXML
    private JFXTextField depidbox;
    @FXML
    private JFXTextField pbox;
    @FXML
    private TableView<AdminCourseTM> tablecourse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void deleteRecord(MouseEvent event) {
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("delete from course_module  where admin_id=? ");

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
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void updateRecord(MouseEvent event) {
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE course_module SET name=?,theory=?,practical=?,lec_id=?,dep_id=? where course_id=? ");

            stm.setObject(1, namebox.getText());
            stm.setObject(2, tbox.getText());
            stm.setObject(3, pbox.getText());
            stm.setObject(4, lecidbox.getText());
            stm.setObject(5, depidbox.getText());
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
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insertRecord(MouseEvent event) {
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO course_module VALUES (?,?,?,?,?,?)");
            stm.setObject(1, idbox.getText());
            stm.setObject(2, namebox.getText());
            stm.setObject(3, tbox.getText());
            stm.setObject(4, pbox.getText());
            stm.setObject(5, lecidbox.getText());
            stm.setObject(6, depidbox.getText());

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllCourseToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LecturercoursemaintainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM course_module");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<AdminCourseTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new AdminCourseTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        tablecourse.setItems(allCourse);

    }

    private void setTableCols() {
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcol.setCellValueFactory(new PropertyValueFactory<>("t"));
        pcol.setCellValueFactory(new PropertyValueFactory<>("p"));
        lecidcol.setCellValueFactory(new PropertyValueFactory<>("lecid"));
        depidcol.setCellValueFactory(new PropertyValueFactory<>("depid"));

    }

    @FXML
    private void tablecourseOnMouseClicked(MouseEvent event) {
        AdminCourseTM course = tablecourse.getSelectionModel().getSelectedItem();

        idbox.setText(course.getId());
        namebox.setText(course.getName());
        tbox.setText(course.getT());
        pbox.setText(course.getP());
        lecidbox.setText(course.getLecid());
        depidbox.setText(course.getDepid());
    }

//        idbox.setText("");
//        namebox.setText("");
//        tbox.setText("");
//        pbox.setText("");
//        lecidbox.setText("");
//        depidbox.setText("");
//    "SELECT * FROM course_module where courseid like '%"++"%'"


}
