package text_encrypt01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuBar extends JMenu {
    
    private final JMenuBar menubar = new JMenuBar();
    private final JMenu menu = new JMenu("Menu");
    private final JMenuItem exitItem = new JMenuItem("Exit");
    
    public MenuBar(){
        //Adding menus to the menu bar
        menubar.add(menu);
        menu.add(exitItem);
        
        //Action listener
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
    }
    
        public JMenuBar returnMenuBar(){
        return menubar;
    }
    
}
