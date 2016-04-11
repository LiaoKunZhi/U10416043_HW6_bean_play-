//U10416043   廖崑智

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.animation.*;
import javafx.util.*;
import java.security.SecureRandom;

//Class
public class BeanPlay extends Application {

	//Create a new pane
	Pane pane = new Pane();

	@Override

	//Method
	public void start (Stage primaryStage) {

		//Make the machine's frame
		Line L1 = new Line();
		L1.setStartX(240);
		L1.setStartY(30);
		L1.setEndX(240);
		L1.setEndY(90);

		Line L2 = new Line();
		L2.setStartX(240);
		L2.setStartY(90);
		L2.setEndX(30);
		L2.setEndY(480);

		Line L3 = new Line();
		L3.setStartX(30);
		L3.setStartY(480);
		L3.setEndX(30);
		L3.setEndY(600);

		Line L4 = new Line();
		L4.setStartX(30);
		L4.setStartY(600);
		L4.setEndX(510);
		L4.setEndY(600);

		Line L5 = new Line();
		L5.setStartX(510);
		L5.setStartY(600);
		L5.setEndX(510);
		L5.setEndY(480);

		Line L6 = new Line();
		L6.setStartX(510);
		L6.setStartY(480);
		L6.setEndX(300);
		L6.setEndY(90);

		Line L7 = new Line();
		L7.setStartX(300);
		L7.setStartY(90);
		L7.setEndX(300);
		L7.setEndY(30);

		//Make the bulkheads
		Line K1 = new Line();
		K1.setStartX(90);
		K1.setStartY(480);
		K1.setEndX(90);
		K1.setEndY(600);

		Line K2 = new Line();
		K2.setStartX(150);
		K2.setStartY(480);
		K2.setEndX(150);
		K2.setEndY(600);

		Line K3 = new Line();
		K3.setStartX(210);
		K3.setStartY(480);
		K3.setEndX(210);
		K3.setEndY(600);

		Line K4 = new Line();
		K4.setStartX(270);
		K4.setStartY(480);
		K4.setEndX(270);
		K4.setEndY(600);

		Line K5 = new Line();
		K5.setStartX(330);
		K5.setStartY(480);
		K5.setEndX(330);
		K5.setEndY(600);

		Line K6 = new Line();
		K6.setStartX(390);
		K6.setStartY(480);
		K6.setEndX(390);
		K6.setEndY(600);

		Line K7 = new Line();
		K7.setStartX(450);
		K7.setStartY(480);
		K7.setEndX(450);
		K7.setEndY(600);

		//Make some dots of the ways to the game
		Circle D1 = new Circle(270, 120, 8);
		Circle D2_1 = new Circle(240, 180, 8);
		Circle D2_2 = new Circle(300, 180, 8);
		Circle D3_1 = new Circle(210, 240, 8);
		Circle D3_2 = new Circle(270, 240, 8);
		Circle D3_3 = new Circle(330, 240, 8);
		Circle D4_1 = new Circle(180, 300, 8);
		Circle D4_2 = new Circle(240, 300, 8);
		Circle D4_3 = new Circle(300, 300, 8);
		Circle D4_4 = new Circle(360, 300, 8);
		Circle D5_1 = new Circle(150, 360, 8);
		Circle D5_2 = new Circle(210, 360, 8);
		Circle D5_3 = new Circle(270, 360, 8);
		Circle D5_4 = new Circle(330, 360, 8);
		Circle D5_5 = new Circle(390, 360, 8);
		Circle D6_1 = new Circle(120, 420, 8);
		Circle D6_2 = new Circle(180, 420, 8);
		Circle D6_3 = new Circle(240, 420, 8);
		Circle D6_4 = new Circle(300, 420, 8);
		Circle D6_5 = new Circle(360, 420, 8);
		Circle D6_6 = new Circle(420, 420, 8);
		Circle D7_1 = new Circle(90, 480, 8);
		Circle D7_2 = new Circle(150, 480, 8);
		Circle D7_3 = new Circle(210, 480, 8);
		Circle D7_4 = new Circle(270, 480, 8);
		Circle D7_5 = new Circle(330, 480, 8);
		Circle D7_6 = new Circle(390, 480, 8);
		Circle D7_7 = new Circle(450, 480, 8);

		//Add all things in the pane
		pane.getChildren().addAll(L1,L2,L3,L4,L5,L6,L7);
		pane.getChildren().addAll(K1,K2,K3,K4,K5,K6,K7);
		pane.getChildren().addAll(D1,D2_1,D2_2,D3_1,D3_2,D3_3,D4_1,D4_2,D4_3,D4_4,D5_1,D5_2,D5_3,D5_4,D5_5,D6_1,D6_2,D6_3,D6_4,D6_5,D6_6,D7_1,D7_2,D7_3,D7_4,D7_5,D7_6,D7_7);

		//Add the pane in the scene
		Scene scene = new Scene(pane, 660, 660);

		//Make the title of the stage
		primaryStage.setTitle(" U10416043   廖崑智 ");

		//Add scene in the stage
		primaryStage.setScene(scene);

		//Show the stage
		primaryStage.show();
	}
}
