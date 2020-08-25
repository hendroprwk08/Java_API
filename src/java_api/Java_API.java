package java_api;

import javax.swing.UIManager;

public class Java_API {

    public static void main(String[] args) {
        //set style
        try { 
            //windows
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
                  
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        
        //menampilkan form
        FApi f = new FApi();
        f.setVisible(true);
    }    
}
