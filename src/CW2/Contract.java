package CW2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Contract {
    @FXML
    private TextField id3;
    @FXML
    private TextField contractname;
    @FXML
    private TextField description;
    @FXML
    private TextField date;
    @FXML
    private TextField type;
    @FXML
    private TextField delete2;
    @FXML
    private TextField update3;
    @FXML
    private TextField name3;
    @FXML
    private TextField description3;
    @FXML
    private TextField date3;
    @FXML
    private TextField job3;
    @FXML
    private TextField view3;

    public void contractadd(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "INSERT INTO CONTRACTS(ID,Name,Description,Creation_Date,Job_Type) VALUES('"+id3.getText()+"','" + contractname.getText() + "','" + description.getText() + "','" + date.getText() + "','" + type.getText() + "')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void contractdelete(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "DELETE FROM CONTRACTS WHERE ID ='" + delete2.getText() + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void contractupdate(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();
            String update = "";
            if (!name3.getText().equals(update)) {
                String sql = "UPDATE CONTRACTS SET Name='" + name3.getText() + "' WHERE ID='"+update3.getText()+"'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!description3.getText().equals(update)){
                String sql = "UPDATE CONTRACTS SET Description='" + description3.getText() + "'  WHERE ID='" + update3.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!date3.getText().equals(update)){
                String sql = "UPDATE CONTRACTS SET Creation_Date='" + date3.getText() + "' WHERE ID='" + update3.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!job3.getText().equals(update)){
                String sql = "UPDATE CONTRACTS SET Job_Type='" + job3.getText() + "' WHERE ID='" + update3.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(null,"Updated Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void contractview(ActionEvent event) {

        ConnectivityClass connectivityClass = new ConnectivityClass();
        Connection connection = connectivityClass.getConnection();

        String sql = "SELECT * FROM CONTRACTS WHERE ID ='" + view3.getText() + "'";

        Statement sts=null;
        ResultSet rsr=null;
        int a=0;
        try {
            sts = connection.createStatement();
            rsr = sts.executeQuery(sql);

            while(rsr.next()) {
                JOptionPane.showMessageDialog(null,rsr.getString("ID"));
                JOptionPane.showMessageDialog(null,rsr.getString("Name"));
                JOptionPane.showMessageDialog(null,rsr.getString("Description"));
                JOptionPane.showMessageDialog(null,rsr.getString("Creation_Date"));
                JOptionPane.showMessageDialog(null,rsr.getString("Job_Type"));
                a=1;
            }
            if (a==0){

                JOptionPane.showMessageDialog(null, "Not Found");
                a=0;}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
