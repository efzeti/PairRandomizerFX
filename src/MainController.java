import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    public TextArea firstListTA;
    @FXML
    public TextArea secondListTA;

    @FXML
    public void initialize(){
        firstListTA.setText("Catamarca Province, Argentina;Monaro, Australia;Hawkes Bay, New Zealand;Ribadelles, Spain;" +
                "New England, USA;Łęczna County, Poland;Monte Carlo, Monaco;Värmland, Sweden;Baumholder, Germany;" +
                "Jämsä, Finland;Argolis, Greece;Powys, Wales;Perth and Kinross, Scotland");

        secondListTA.setText("H1 (FWD);H2 (FWD);H2 (RWD);H3 (RWD);Group B (RWD);Group B (4WD);R2;F2 Kit Car;Group A;" +
                "NR4/R4;Up to 2000cc;R5;Rally GT");

    }

    public void handleClear(ActionEvent event) {
        firstListTA.setText("This program assigns a value from column B to each value from column A.");
        secondListTA.setText("Insert values into column A and B using \";\" as a delimiter. Do not use new line.");
    }

    public void handleExample(ActionEvent event) {
        firstListTA.setText("Catamarca Province, Argentina;Monaro, Australia;Hawkes Bay, New Zealand;Ribadelles, Spain;" +
                "New England, USA;Łęczna County, Poland;Monte Carlo, Monaco;Värmland, Sweden;Baumholder, Germany;" +
                "Jämsä, Finland;Argolis, Greece;Powys, Wales;Perth and Kinross, Scotland");

        secondListTA.setText("H1 (FWD);H2 (FWD);H2 (RWD);H3 (RWD);Group B (RWD);Group B (4WD);R2;F2 Kit Car;Group A;" +
                "NR4/R4;Up to 2000cc;R5;Rally GT");
    }
}
