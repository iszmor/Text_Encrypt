package mainpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuBar extends JMenu {
    
    private final JMenuBar menubar = new JMenuBar();
    private final JMenu menu = new JMenu("Menu");
    private final JMenuItem exitItem = new JMenuItem("Exit");
    
    private final JMenu languages = new JMenu("Language");
    private final JMenuItem en = new JMenuItem("English");
    private final JMenuItem th = new JMenuItem("Thai");
    private final JMenuItem jp = new JMenuItem("Japanese");
    
    public MenuBar(){
        //Adding menus to the menu bar
        menubar.add(menu);
        menu.add(exitItem);        
        
        menubar.add(languages);
        languages.add(en);
        languages.add(th);
        languages.add(jp);
        
        //Action listener
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        
        //Locale switcher, needs to call setText() to every class with text that needs to be localized
        en.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                MainFrame.in.switchLocale("en", "US");
                setText();
                MainFrame.setText();
                MainPanel.setText();
            }
        });        
        
        th.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                MainFrame.in.switchLocale("th", "TH");
                setText();
                MainFrame.setText();
                MainPanel.setText();
            }
        });
        
        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                MainFrame.in.switchLocale("ja", "JP");
                setText();
                MainFrame.setText();
                MainPanel.setText();
            }
        });
       
        //Init text
        setText();
    }
    
    public JMenuBar returnMenuBar(){
        return menubar;
    }    
        
    //Call this method when init/changing locale
    private void setText(){
        menu.setText(MainFrame.in.messages.getString("menu"));
        exitItem.setText(MainFrame.in.messages.getString("exit"));
        languages.setText(MainFrame.in.messages.getString("languages"));
        en.setText(MainFrame.in.messages.getString("english"));
        th.setText(MainFrame.in.messages.getString("thai"));
        jp.setText(MainFrame.in.messages.getString("japanese"));
    }
    
}
