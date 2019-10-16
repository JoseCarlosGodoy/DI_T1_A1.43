/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1_a1.pkg433;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.control.ButtonBar.ButtonData.RIGHT;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class DI_T1_A1433 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid=new GridPane();
        
        Label l1=new Label("Annual Interest Rate:");
        TextField t1=new TextField();
        Label l2=new Label("Number of years:");
        TextField t2=new TextField();
        Label l3=new Label("Loan Amount:");
        TextField t3=new TextField();
        Label l4=new Label("Monthly Payment:");
        TextField t4=new TextField();
        Label l5=new Label("Total Payment:");
        TextField t5=new TextField();
        
        Button btn=new Button("Calcular");
        
       grid.add(l1, 0, 0);
       grid.add(t1,1,0);
       grid.add(l2,0,1);
       grid.add(t2,1,1);
       grid.add(l3,0,2);
       grid.add(t3,1,2);
       grid.add(l4,0,3);
       grid.add(t4,1,3);
       grid.add(l5,0,4);
       grid.add(t5,1,4);
       grid.add(btn,1,5);
       grid.setAlignment(CENTER);
       
        t1.setAlignment(Pos.CENTER_RIGHT);
        t2.setAlignment(Pos.CENTER_RIGHT);
        t3.setAlignment(Pos.CENTER_RIGHT);
        t4.setAlignment(Pos.CENTER_RIGHT);
        t5.setAlignment(Pos.CENTER_RIGHT);
       
        Scene scene = new Scene(grid, 300, 250);
       
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setOnAction(e->{
          try{
        double inte=Double.parseDouble(t1.getText());
        double ny=Double.parseDouble(t2.getText());  
        double la=Double.parseDouble(t3.getText());
        double x=inte/1200;
        double tm=(la*x)/(1-Math.pow((1+x),-(12*ny)));
        t4.setText(String.format("%.2f",tm));
        t5.setText(String.format("%.2f",tm*ny*12));
        }catch(NumberFormatException ev){
            t5.setText("No es un numero");
        }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
