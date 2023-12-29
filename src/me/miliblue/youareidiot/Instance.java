package me.miliblue.youareidiot;

import java.awt.*;
import java.util.ArrayList;

public class Instance {
    public static Instance instance = new Instance();
    public int windows = 4;//默认创建4个窗口
    public ArrayList<IdiotWindow> idiotWindows = new ArrayList<>();
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public void start(){
        for (int i = 0; i < windows; i++){
            idiotWindows.add(new IdiotWindow());
        }

        //Run
        new SetPosThread().start();
    }
}
