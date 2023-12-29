package me.miliblue.youareidiot;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FuckListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        //清理
        Instance.instance.idiotWindows.clear();
        //增加新窗口
        Instance.instance.windows++;
        //创建
        if(SetPosThread.inDelay) {
            for (int i = 0; i < Instance.instance.windows; i++) {
                Instance.instance.idiotWindows.add(new IdiotWindow());
            }
        }
        System.out.printf("[DEBUG] Current Windows:"+Instance.instance.windows+"\n");
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
