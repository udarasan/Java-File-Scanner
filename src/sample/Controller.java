package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {


    public TextArea javaCode;

    public void getUploadedFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(new Stage());

        try {
            Scanner scanner=new Scanner(file);
            while (scanner.hasNext()){
                // put your logic here
                javaCode.appendText(scanner.nextLine()+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
