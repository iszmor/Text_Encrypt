package mainpkg;

import java.awt.*;
import javax.swing.*;

public final class MainFrame {

    //Initial windows width and height
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    //The frame
    private static JFrame frame;
    private final Container contentpane;
    
    //Init I18N to use with all other components
    public static I18N in = new I18N();

    public MainFrame() {
        //Create and set up the frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
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
        
        //Init text
        setText();
    }

    //Call this method when init/changing locale
    public static void setText() {
        frame.setTitle(in.messages.getString("windowtitle"));
    }   

}
