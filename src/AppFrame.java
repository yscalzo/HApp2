import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame {
    static JFrame frame = new JFrame("Hospital Application");

    public static void main(String[] args) {
        String devInf = new String("Developer: Yuri Scalzo & Elena Roncolino \n");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, devInf);
            }
        });
        JMenu menu = new JMenu("Menu");
        JMenuBar menuBar = new JMenuBar();
        menu.add(about);
        menu.add(exit);
        menuBar.add(menu);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);

        frame.setPreferredSize(new Dimension(1200, 600));
        frame.setResizable(false);
        //frame.getContentPane().add(new AppPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
