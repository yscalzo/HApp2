import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{

    public MainPanel(){
        JPanel mainPan = new JPanel();
        mainPan.setLayout(new BoxLayout(mainPan, BoxLayout.Y_AXIS));
        JPanel ImgPan = new JPanel();
        JLabel titImgLab = new JLabel();
        titImgLab.setIcon(new ImageIcon("HospAppBackground.png"));

        ImgPan.add(titImgLab);
        mainPan.add(ImgPan);
        add(mainPan);

    }

}
