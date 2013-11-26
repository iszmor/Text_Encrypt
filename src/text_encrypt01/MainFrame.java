package text_encrypt01;

import java.awt.*;
import javax.swing.*;

public class MainFrame {

    //Initial width and height
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;
    //Windows title
    private final String title = "asdf";
    
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
        //Get menubar from MenuBar class
        MenuBar menubar = new MenuBar();
        //Set it to the frame
        frame.setJMenuBar(menubar.returnMenuBar());
        //Set the frame to visible
        frame.setVisible(true);
    }

    //TODO: Move to MainPanel class
    private void mainPanel() {
        JPanel mainPane = new JPanel();
        mainPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.00;
        c.weighty = 1.00;
        contentpane.add(mainPane, c);

        JLabel insname_la = new JLabel("mainPanel");
        Font labelfontdef = insname_la.getFont();
        insname_la.setFont(new Font(labelfontdef.getName(), labelfontdef.getStyle(), 20));
        c.gridx = 0;
        c.gridy = 0;
//        c.gridwidth = 1;
//        c.gridheight = 1;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0.00;
        c.weighty = 0.00;
//        c.insets = new Insets(0,10,0,0);
        mainPane.add(insname_la, c);
    }
}