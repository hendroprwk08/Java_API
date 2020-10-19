package java_api;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Java_API {

    public static void main(String[] args) {
        //set style
        try { 
            //windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");                   
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) { 
            ex.printStackTrace(); 
        }
        
        //menampilkan form
        FApi f = new FApi();
        f.setVisible(true);
        f.setDefaultCloseOperation(FApi.EXIT_ON_CLOSE);
    }    
}
