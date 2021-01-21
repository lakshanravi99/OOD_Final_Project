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
import tm.stunoticeTM;

public class StuNoticeController implements Initializable {

    @FXML
    private TableView<stunoticeTM> noticetbl;

    @FXML
    private TableColumn<stunoticeTM, String> idcol;

    @FXML
    private TableColumn<stunoticeTM, String> datecol;

    @FXML
    private TableColumn<stunoticeTM, String> noticecol;

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
        idcol.setCellValueFactory(new PropertyValueFactory<>("idcol"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("datecol"));
        noticecol.setCellValueFactory(new PropertyValueFactory<>("noticecol"));

    }

    private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM admin_notice");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<stunoticeTM> allCourse = FXCollections.observableArrayList();

//        System.out.println("In notice");

        while (rst.next()) {
            allCourse.add(new stunoticeTM(rst.getString(1), rst.getString(2), rst.getString(3)));
//            System.out.println(rst.getString(1) + " " + rst.getString(2) + " " + rst.getString(3));
        }
        noticetbl.setItems(allCourse);

    }

}
