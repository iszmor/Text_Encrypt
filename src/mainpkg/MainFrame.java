package mainpkg;

import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.*;

public class MainFrame {

    //Initial width and height
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;
    //Windows title
    private final String title = "test";
    
    //Other fields
    private final JFrame frame;
    private final Container contentpane;
    

    public MainFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setTitle(title);
        //Set contentpane
        contentpane = frame.getContentPane();
        //Set layout
        frame.setLayout(new GridBagLayout());
        //Get menubar from MenuBar class and attach it to frame
        MenuBar menubar = new MenuBar();
        frame.setJMenuBar(menubar.returnMenuBar());
        //Get mainpanel and add it to container
        MainPanel mainpanel = new MainPanel();
        contentpane.add(mainpanel.returnPanel());
        //Set the frame to visible
        frame.setVisible(true);
    }

}