package CW2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
    @FXML
    private TextField id1;
    @FXML
    private TextField employeename;
    @FXML
    private TextField dob;
    @FXML
    private TextField contactnumber;
    @FXML
    private TextField address;
    @FXML
    private TextField role;
    @FXML
    private TextField delete;
    @FXML
    private TextField update1;
    @FXML
    private TextField name1;
    @FXML
    private TextField dob1;
    @FXML
    private TextField contact1;
    @FXML
    private TextField address1;
    @FXML
    private TextField role1;
    @FXML
    private TextField view1;
    public void employeeadd(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "INSERT INTO EMPLOYEE(ID,Name,DOB,Contact_Number,Address,Role) VALUES('"+id1.getText()+"','" + employeename.getText() + "','" + dob.getText() + "','" + contactnumber.getText() + "','" + address.getText() + "','" + role.getText() + "')";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void employeedelete(ActionEvent event) {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();

            String sql = "DELETE FROM EMPLOYEE WHERE ID ='" + delete.getText() + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void employeeupdate(ActionEvent event) throws SQLException, ClassNotFoundException {
        try {
            ConnectivityClass connectivityClass = new ConnectivityClass();
            Connection connection = connectivityClass.getConnection();
            String update = "";
            if (!name1.getText().equals(update)) {
                String sql = "UPDATE EMPLOYEE SET Name='" + name1.getText() + "' WHERE ID='" + update1.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!dob1.getText().equals(update)){
                String sql = "UPDATE EMPLOYEE SET DOB='" + dob1.getText() + "' WHERE ID='" + update1.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!contact1.getText().equals(update)){
                String sql = "UPDATE EMPLOYEE SET Contact_Number='" + contact1.getText() + "'  WHERE ID='" + update1.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!address1.getText().equals(update)){
                String sql = "UPDATE EMPLOYEE SET Address='" + address1.getText() + "' WHERE ID='" + update1.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            if (!role1.getText().equals(update)){
                String sql = "UPDATE EMPLOYEE SET Role='" + role1.getText() + "' WHERE ID='" + update1.getText() + "'";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(null,"Updated Successfully");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    public void employeeview(ActionEvent event) {

        ConnectivityClass connectivityClass = new ConnectivityClass();
        Connection connection = connectivityClass.getConnection();

        String sql = "SELECT * FROM EMPLOYEE WHERE ID ='" + view1.getText() + "'";

        Statement sts=null;
        ResultSet rsr=null;
        int a=0;
        try {
            sts = connection.createStatement();
            rsr = sts.executeQuery(sql);

            while(rsr.next()) {
                JOptionPane.showMessageDialog(null,rsr.getString("ID"));
                JOptionPane.showMessageDialog(null,rsr.getString("Name"));
                JOptionPane.showMessageDialog(null,rsr.getString("DOB"));
                JOptionPane.showMessageDialog(null,rsr.getString("Contact_Number"));
                JOptionPane.showMessageDialog(null,rsr.getString("Address"));
                JOptionPane.showMessageDialog(null,rsr.getString("Role"));
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
