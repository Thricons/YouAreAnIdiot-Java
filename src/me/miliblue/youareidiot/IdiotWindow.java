package me.miliblue.youareidiot;

import javax.swing.*;
import java.awt.*;

public class IdiotWindow extends JFrame {
    IdiotWindow(){
        setSize(1176,700);
        setTitle("Still Using Computer?");
        setLayout(new FlowLayout());
        setVisible(true);
        setAlwaysOnTop(true);
        addWindowListener(new FuckListener());
        ImageIcon background = new ImageIcon(this.getClass().getResource("/Idiot.png"));
        JLabel label = new JLabel(background);
        label.setBounds(0, 0, 1176, 700);
        JPanel imagePanel = (JPanel) this.getContentPane();
        imagePanel.setOpaque(false);
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
    }

    public void setPos(int x, int y){
        super.setLocation(x, y);
    }
}
