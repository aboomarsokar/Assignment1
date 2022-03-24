
package assignment1;

import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {

        TabPane root = new TabPane();
        
        HashMap<Integer, Class<? extends assignment1.InterfaceTab>> map = TabFactory.getTabMap();

        for (Integer key : map.keySet()) {
            InterfaceTab dd = TabFactory.createTap(key);
            root.getTabs().add(dd.generateTab());
        }
        
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Assignment 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
