/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.tabs;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import assignment1.InterfaceTab;

/**
 *
 * @author hp
 */
public class Tab3 implements InterfaceTab{

    @Override
    public Tab generateTab() { 
        Tab tab = new Tab("tab 3     ");
        Label l = new Label("Label 3");
        l.setAlignment(Pos.CENTER);
        l.setPadding(new Insets(100));
        tab.setContent(l);
        return tab;    
    }
}
