///////////////////////////////////////////////////////////////////////////////
// Project:     Zwischen
// File:        Main.java
// Group:       3
// Date:        September 29, 2018
// Description: Driver Class for the program Zwischen
///////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.stage.Stage;
import other.Globals;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    Path path = Paths.get("lib/UserData");

    //Make sure userdata directory exists
    if (!new File(path.toString()).exists()) {
      try {
        Files.createDirectory(path);
      } catch (IOException exception) {
        exception.printStackTrace();
      }
    }

    Globals.changeScene("login/Login.fxml");
    //Todo Known issues:
    //  Ride request needs functionality
    //  Correct FindBugs and CheckStyle errors!!!
    //  Driver Schedule only use available times, days cannont have the same time for driving
    //  Store friends list using serialization
  }
}
