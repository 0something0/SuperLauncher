package com.something.superlauncher;

import javafx.fxml.FXML;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


public class Controller {


    public static void main(String[] args) {

    }

    @FXML
    public TextField applicationFolder;

    @FXML
    public TextField gameInstallFolder;

    /*
        Changes settings for where program is stored.
     */
    public String[] applySettings(ActionEvent actionEvent) {

        String varAppFolder = applicationFolder.getText();
        System.out.println("Application Folder: " + varAppFolder);

        String varInstallFolder = gameInstallFolder.getText();
        System.out.println("Game Install Folder: " + varInstallFolder);

        String[] Directories = {varAppFolder, varInstallFolder};
        System.out.print("Settings applied");

        return Directories;
    }



    //apply.setOnAction(new EventHandler<ActionEvent>() {}


}
