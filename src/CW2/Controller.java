package CW2;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controller {
    @FXML
    private TextField uname;
    @FXML
    private PasswordField pass;
    @FXML
    private Label labelstatus;

    public void Login(ActionEvent event) {
        try {
            if (uname.getText().equals("user") && pass.getText().equals("1234")) {
                labelstatus.setText("Valid");
                Stage primaryStage = new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("Select.fxml"));
                Scene scene = new Scene(root, 600, 400);
                primaryStage.setScene(scene);
                primaryStage.show();
            } else {
                labelstatus.setText("Not Valid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void employee(ActionEvent event) {
        try {
            Stage primaryStage1 = new Stage();
            Parent root1 = FXMLLoader.load(getClass().getResource("Employee.fxml"));
            Scene scene1 = new Scene(root1, 600, 500);
            primaryStage1.setScene(scene1);
            primaryStage1.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void customer(ActionEvent event) {
        try {
            Stage primaryStage2 = new Stage();
            Parent root2 = FXMLLoader.load(getClass().getResource("Customer.fxml"));
            Scene scene2 = new Scene(root2, 600, 500);
            primaryStage2.setScene(scene2);
            primaryStage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contract(ActionEvent event) {
        try {
            Stage primaryStage3 = new Stage();
            Parent root3 = FXMLLoader.load(getClass().getResource("Contract.fxml"));
            Scene scene3 = new Scene(root3, 600, 500);
            primaryStage3.setScene(scene3);
            primaryStage3.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addemployee(ActionEvent event) {
        try {
            Stage primaryStage4 = new Stage();
            Parent root4 = FXMLLoader.load(getClass().getResource("addEmployee.fxml"));
            Scene scene4 = new Scene(root4, 600, 600);
            primaryStage4.setScene(scene4);
            primaryStage4.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewemployee(ActionEvent event) {
        try {
            Stage primaryStage5 = new Stage();
            Parent root5 = FXMLLoader.load(getClass().getResource("viewEmployee.fxml"));
            Scene scene5 = new Scene(root5, 600, 600);
            primaryStage5.setScene(scene5);
            primaryStage5.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateemployee(ActionEvent event) {
        try {
            Stage primaryStage6 = new Stage();
            Parent root6 = FXMLLoader.load(getClass().getResource("updateEmployee.fxml"));
            Scene scene6 = new Scene(root6, 600, 600);
            primaryStage6.setScene(scene6);
            primaryStage6.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteemployee(ActionEvent event) {
        try {
            Stage primaryStage7 = new Stage();
            Parent root7 = FXMLLoader.load(getClass().getResource("deleteEmployee.fxml"));
            Scene scene7 = new Scene(root7, 600, 600);
            primaryStage7.setScene(scene7);
            primaryStage7.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addcustomer(ActionEvent event) {
        try {
            Stage primaryStage8 = new Stage();
            Parent root8 = FXMLLoader.load(getClass().getResource("addCustomer.fxml"));
            Scene scene8 = new Scene(root8, 600, 600);
            primaryStage8.setScene(scene8);
            primaryStage8.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewcustomer(ActionEvent event) {
        try {
            Stage primaryStage9 = new Stage();
            Parent root9 = FXMLLoader.load(getClass().getResource("viewCustomer.fxml"));
            Scene scene9 = new Scene(root9, 600, 600);
            primaryStage9.setScene(scene9);
            primaryStage9.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatecustomer(ActionEvent event) {
        try {
            Stage primaryStage10 = new Stage();
            Parent root10 = FXMLLoader.load(getClass().getResource("updateCustomer.fxml"));
            Scene scene10 = new Scene(root10, 600, 600);
            primaryStage10.setScene(scene10);
            primaryStage10.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletecustomer(ActionEvent event) {
        try {
            Stage primaryStage11 = new Stage();
            Parent root11 = FXMLLoader.load(getClass().getResource("deleteCustomer.fxml"));
            Scene scene11 = new Scene(root11, 600, 600);
            primaryStage11.setScene(scene11);
            primaryStage11.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addcontract(ActionEvent event) {
        try {
            Stage primaryStage12 = new Stage();
            Parent root12 = FXMLLoader.load(getClass().getResource("addContract.fxml"));
            Scene scene12 = new Scene(root12, 600, 600);
            primaryStage12.setScene(scene12);
            primaryStage12.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewcontract(ActionEvent event) {
        try {
            Stage primaryStage13 = new Stage();
            Parent root13 = FXMLLoader.load(getClass().getResource("viewContract.fxml"));
            Scene scene13 = new Scene(root13, 600, 600);
            primaryStage13.setScene(scene13);
            primaryStage13.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatecontract(ActionEvent event) {
        try {
            Stage primaryStage14 = new Stage();
            Parent root14 = FXMLLoader.load(getClass().getResource("updateContract.fxml"));
            Scene scene14 = new Scene(root14, 600, 600);
            primaryStage14.setScene(scene14);
            primaryStage14.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletecontract(ActionEvent event) {
        try {
            Stage primaryStage15 = new Stage();
            Parent root15 = FXMLLoader.load(getClass().getResource("deleteContract.fxml"));
            Scene scene15 = new Scene(root15, 600, 600);
            primaryStage15.setScene(scene15);
            primaryStage15.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void calculatepay(ActionEvent event) {
        try {
            Stage primaryStage16 = new Stage();
            Parent root16 = FXMLLoader.load(getClass().getResource("calculatePay.fxml"));
            Scene scene16 = new Scene(root16, 600, 600);
            primaryStage16.setScene(scene16);
            primaryStage16.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
