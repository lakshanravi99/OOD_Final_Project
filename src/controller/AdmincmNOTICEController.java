package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
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
import tm.AdminNoticeTM;

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
public class AdmincmNOTICEController implements Initializable {

    @FXML
    private JFXButton deletebtn;
    @FXML
    private JFXButton updatebtn;
    @FXML
    private JFXButton insertbtn;
    @FXML
    private JFXTextArea descbox;
    @FXML
    private DatePicker datebox;
    @FXML
    private JFXCheckBox checkstu;
    @FXML
    private JFXCheckBox checklec;
    @FXML
    private JFXTextField idbox;
    @FXML
    private TableColumn<AdminNoticeTM, ?> idcol;
    @FXML
    private TableColumn<AdminNoticeTM, ?> datecol;
    @FXML
    private TableColumn<AdminNoticeTM, ?> noticecol;
    @FXML
    private TableView<AdminNoticeTM> tablenotice;

    /**
     * Initializes the controller class.
     */
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

    @FXML
    private void deleteRecord(MouseEvent event) {
        
        try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("delete from admin_notice  where notice_id=? ");
            
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
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void updateRecord(MouseEvent event) {
        
         try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("UPDATE admin_notice SET notice_date=?,notice=? where notice_id=? ");
            
            stm.setObject(1, datebox.getValue());
            stm.setObject(2, descbox.getText());
            stm.setObject(3, idbox.getText());
            
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
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insertRecord(MouseEvent event) {
        
         try {
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO admin_notice VALUES (?,?,?)");
            stm.setObject(1, idbox.getText());
            stm.setObject(2, datebox.getValue());
            stm.setObject(3, descbox.getText());
           

            boolean isAdded = stm.executeUpdate() > 0;
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "Added sucessfully");
                loadAllCourseToTable();
            } else {
                JOptionPane.showMessageDialog(null, "NOT Added");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdmincmNOTICEController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTableCols() {
       idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("date"));
        noticecol.setCellValueFactory(new PropertyValueFactory<>("notice"));
        
    }
    
     private void loadAllCourseToTable() throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM admin_notice");
        java.sql.ResultSet rst = stm.executeQuery();

        ObservableList<AdminNoticeTM> allCourse = FXCollections.observableArrayList();

        while (rst.next()) {
            allCourse.add(new AdminNoticeTM(String.valueOf(rst.getString(1)), rst.getString(2), rst.getString(3)));
        }
        tablenotice.setItems(allCourse);

    }

    @FXML
    private void tableadminOnMouseClicked(MouseEvent event) {
        AdminNoticeTM admin = tablenotice.getSelectionModel().getSelectedItem();
        
        idbox.setText(admin.getId());
        //datebox.setText(admin.getDate());
        descbox.setText(admin.getNotice());
        
    }
     
    
}
