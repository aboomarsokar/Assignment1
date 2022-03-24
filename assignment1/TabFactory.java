
package assignment1;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;


public class TabFactory {

    private static HashMap<Integer, Class<? extends InterfaceTab>> tabMap = new HashMap<>();

    static {
        File d = new File("C:\\Users\\hp\\OneDrive - students.iugaza.edu.ps\\Documents\\NetBeansProjects\\as1\\src\\assignment1\\tabs");
        File[] files = d.listFiles();
        int i = 1;
        for (File f : files) {
            String className = f.getName().split("\\.")[0];
            try {
                Class<? extends InterfaceTab> c = Class.forName("assignment1.tabs." + className).asSubclass(InterfaceTab.class);
                tabMap.put(i, c);
                i++;
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
            }
        }
    }

    public static InterfaceTab createTap(int id) {
        try {
            return tabMap.get(id).getConstructor().newInstance();
            
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {}
        return (InterfaceTab) new IllegalArgumentException();
    }

    public static HashMap<Integer, Class<? extends InterfaceTab>> getTabMap() {
        return tabMap;
    }
}
