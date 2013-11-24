package text_encrypt01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    //Initial width and height
    private int WINDOW_WIDTH = 800;
    private int WINDOW_HEIGHT = 600;
    //Windows title
    private String title = "asdf";
    private Container contentpane;

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle(title);
        contentpane = getContentPane();
        //Set layout
        setLayout(new GridBagLayout());
        //Adding components to the frame
        menubar();
        mainPanel();
        //Set the frame to visible
        setVisible(true);
    }

    private void menubar() {
        //Create menu bar
        JMenuBar menubar = new JMenuBar();
        //Set it to the frame
        setJMenuBar(menubar);
        //Adding items to the menu bar
        JMenu menu = new JMenu("Menu");
        menubar.add(menu);
        //Adding items to "menu"
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
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