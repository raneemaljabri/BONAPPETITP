/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetitp;

/**
 *
 * @author noufa
 */
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Popup {
 
public static void display()
{
Stage popupwindow=new Stage();
      
popupwindow.initModality(Modality.APPLICATION_MODAL);
popupwindow.setTitle("send order");
      
      
Label label1= new Label("Thank You for choosing us\n your order has been successfully received.\n We will contact you soon :) ");
label1.setAlignment(Pos.CENTER);
     
Button button1= new Button("Ok");
     
     
button1.setOnAction(e -> popupwindow.close());
     
     

VBox layout= new VBox(10);
     
      
layout.getChildren().addAll(label1, button1);
layout.setAlignment(Pos.CENTER);
      
Scene scene1= new Scene(layout, 250, 100);
      
popupwindow.setScene(scene1);
      
popupwindow.showAndWait();
       
}

}
