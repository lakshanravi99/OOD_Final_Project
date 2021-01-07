


package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTimePicker;
import db.DBConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import tm.AdminTimeTableTM;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdmintimetableController implements Initializable {

    @FXML
    private TableColumn<AdminTimeTableTM, ?> timecol;
    @FXML
    private TableColumn<AdminTimeTableTM, ?> mondaycol;
    @FXML
    private TableColumn<AdminTimeTableTM, ?> tuesdaycol;
    @FXML
    private TableColumn<AdminTimeTableTM, ?> wednesdaycol;
    @FXML
    private TableColumn<AdminTimeTableTM, ?> thursdaycol;
    @FXML
    private TableColumn<AdminTimeTableTM, ?> fridaycol;
    @FXML
    private TableView<AdminTimeTableTM> timetable;
    @FXML
    private JFXTimePicker timectr;
    @FXML
    private TextField mondaybox;

    @FXML
    private TextField tuesdaybox;

    @FXML
    private TextField wednesdaybox;

    @FXML
    private TextField thursdaybox;

    @FXML
    private TextField fridaybox;

    @FXML
    private MenuItem depict;
    @FXML
    private MenuItem depet;
    @FXML
    private MenuItem depbst;
    @FXML
    private MenuItem level11;
    @FXML
    private MenuItem level22;
    @FXML
    private MenuItem level33;
    @FXML
    private MenuItem level44;
    @FXML
    private JFXButton searchbtn;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            setTableCols();
            loadAllCourseToTable();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmintimetableController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmintimetableController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM icttimetable");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<AdminTimeTableTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new AdminTimeTableTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        timetable.setItems(allCourse);

    }

    private void setTableCols() {
        timecol.setCellValueFactory(new PropertyValueFactory<>("time"));
        mondaycol.setCellValueFactory(new PropertyValueFactory<>("monday"));
        tuesdaycol.setCellValueFactory(new PropertyValueFactory<>("tuesday"));
        wednesdaycol.setCellValueFactory(new PropertyValueFactory<>("wednesday"));
        thursdaycol.setCellValueFactory(new PropertyValueFactory<>("thursday"));
        fridaycol.setCellValueFactory(new PropertyValueFactory<>("friday"));

    }


    private void insertRecord(MouseEvent event) {
        //--------------------
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO icttimetable VALUES (?,?,?,?,?,?)");
            stm.setObject(1, timectr.getValue());
            stm.setObject(2, mondaybox.getText());
            stm.setObject(3, tuesdaybox.getText());
            stm.setObject(4, wednesdaybox.getText());
            stm.setObject(5, thursdaybox.getText());
            stm.setObject(6, fridaybox.getText());


            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllCourseToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmintimetableController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmintimetableController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
