/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.tabs;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import assignment1.main;
import javafx.scene.control.Tab;
import assignment1.InterfaceTab;

public class Tab1 implements assignment1.InterfaceTab{

        
    public Tab1(){}
    
    @Override
    public Tab generateTab() {
        
        Tab tab = new Tab("Tab 1   ");
        Label l = new Label("Label 1");
        l.setAlignment(Pos.CENTER);
        l.setPadding(new Insets(100));
        tab.setContent(l);
        return tab;
    }
}
