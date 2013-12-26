package mainpkg;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel {
    
    //The panel
    private final JPanel mainPane;
    
    //Temp label
    private static final JLabel insname_la = new JLabel("temp");    

    public MainPanel() {        
        //Sets up the panel
        mainPane = new JPanel();
        mainPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.00;
        c.weighty = 1.00;

        //Sets up the tmp label
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
        
        //Init text
        setText();
    }
    
    public JPanel returnPanel(){
        return mainPane;
    }

    //Call this method when init/changing locale
    public static void setText(){
        insname_la.setText(MainFrame.in.messages.getString("greetings"));
    }
}