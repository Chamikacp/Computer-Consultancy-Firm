package CW2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer {
    @FXML
    private TextField id2;
    @FXML
    private TextField customername;
    @FXML
    private TextField contactnumbercustomer;
    @FXML
    private TextField addresscustomer;
    @FXML
    private TextField contracts;
    @FXML
    private TextField delete1;
    @FXML
    private TextField update2;
    @FXML
    private TextField name2;
    @FXML
    private TextField contact2;
    @FXML
    private TextField address2;
    @FXML
    private TextField contract2;
    @FXML
    private TextField view2;
    public void customeradd(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "INSERT INTO CUSTOMER(ID,Name,Contact_Number,Address,Contracts) VALUES('"+id2.getText()+"','" + customername.getText() + "','" + contactnumbercustomer.getText() + "','" + addresscustomer.getText() + "','" + contracts.getText() + "')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void customerdelete(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "DELETE FROM CUSTOMER WHERE ID ='" + delete1.getText() + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void customerupdate(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();
            String update = "";
            if (!name2.getText().equals(update)) {
                String sql = "UPDATE CUSTOMER SET Name='" + name2.getText() + "' WHERE ID='"+update2.getText()+"'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!contact2.getText().equals(update)){
                String sql = "UPDATE CUSTOMER SET Contact_Number='" + contact2.getText() + "'  WHERE ID='" + update2.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!address2.getText().equals(update)){
                String sql = "UPDATE CUSTOMER SET Address='" + address2.getText() + "' WHERE ID='" + update2.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!contract2.getText().equals(update)){
                String sql = "UPDATE CUSTOMER SET Contracts='" + contract2.getText() + "' WHERE ID='" + update2.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(null,"Updated Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void customerview(ActionEvent event) {

        ConnectivityClass connectivityClass = new ConnectivityClass();
        Connection connection = connectivityClass.getConnection();

        String sql = "SELECT * FROM CUSTOMER  WHERE ID ='" + view2.getText() + "'";

        Statement sts=null;
        ResultSet rsr=null;
        int a=0;
        try {
            sts = connection.createStatement();
            rsr = sts.executeQuery(sql);

            while(rsr.next()) {
                JOptionPane.showMessageDialog(null,rsr.getString("ID"));
                JOptionPane.showMessageDialog(null,rsr.getString("Name"));
                JOptionPane.showMessageDialog(null,rsr.getString("Contact_Number"));
                JOptionPane.showMessageDialog(null,rsr.getString("Address"));
                JOptionPane.showMessageDialog(null,rsr.getString("Contracts"));
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
