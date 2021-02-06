
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.*;

public class Main extends Application {

    public static String[] rallies = new String[]{"Catamarca Province, Argentina", "Monaro, Australia", "Hawkes Bay, New Zealand",
            "Ribadelles, Spain", "New England, USA", "Łęczna County, Poland", "Monte Carlo, Monaco", "Värmland, Sweden",
            "Baumholder, Germany", "Jämsä, Finland", "Argolis, Greece", "Powys, Wales", "Perth and Kinross, Scotland"};

    public static String[] classes = new String[]{"H1 (FWD)", "H2 (FWD)", "H2 (RWD)", "H3 (RWD)", "Group B (RWD)",
            "Group B (4WD)", "R2", "F2 Kit Car", "Group A", "NR4/R4", "Up to 2000cc", "R5", "Rally GT"};

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Pair Randomizer");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {


        launch(args);







    }


}
