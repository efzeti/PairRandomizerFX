import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;

public class MainController {




    private String ralliesExample = "Catamarca Province, Argentina;\nMonaro, Australia;\nHawkes Bay, New Zealand;\nRibadelles, Spain;\n" +
            "New England, USA;\nŁęczna County, Poland;\nMonte Carlo, Monaco;\nVärmland, Sweden;\nBaumholder, Germany;\n" +
            "Jämsä, Finland;\nArgolis, Greece;\nPowys, Wales;\nPerth and Kinross, Scotland";

    private String classesExample = "H1 (FWD);\nH2 (FWD);\nH2 (RWD);\nH3 (RWD);\nGroup B (RWD);\nGroup B (4WD);\nR2;\nF2 Kit Car;\nGroup A;" +
            "NR4/R4;\nUp to 2000cc;\nR5;\nRally GT";


    private String firstPrompt = "This program assigns a value from column B to each value from column A.";

    private String secondPrompt = "Insert values into column A and B using \";\" as a delimiter. New line character is " +
            "optional and doesn't change the output (it is deleted in process).";

    private PairRandomizer pairRandomizer = new PairRandomizer();




    @FXML
    public TextArea firstListTA;
    @FXML
    public TextArea secondListTA;
    @FXML
    public TextArea resultTA;
    @FXML
    public ToggleButton randToggleYes;

    @FXML
    public void initialize(){
        firstListTA.setText(classesExample);
        secondListTA.setText(ralliesExample);
    }

    @FXML
    public void handleClear(ActionEvent event) {
        firstListTA.clear();
        secondListTA.clear();
    }

    @FXML
    public void handleExample(ActionEvent event) {
        firstListTA.setText(classesExample);
        secondListTA.setText(ralliesExample);
    }

    @FXML
    public void assignPairs(ActionEvent event) {

        resultTA.setText(pairRandomizer.assignPairs(
        new ArrayList<>(Arrays.asList((firstListTA.getText()).replaceAll("\n","").split(";"))),
        new ArrayList<>(Arrays.asList((secondListTA.getText()).replaceAll("\n","").split(";"))),
                randToggleYes.isSelected()));

    }

    @FXML
    public void handleHelp(ActionEvent event) {
        firstListTA.setText(firstPrompt);
        secondListTA.setText(secondPrompt);
    }
}
