package me.miliblue.youareidiot;

import me.miliblue.youareidiot.utils.MathUtil;

import java.util.ConcurrentModificationException;

public class SetPosThread extends Thread{
    public static boolean inDelay = false;
    public void run(){
        while (true){
            inDelay = false;
            try {
                for (IdiotWindow iw : Instance.instance.idiotWindows) {
                    iw.setPos(MathUtil.randomInRange(0, Instance.instance.screenSize.width), MathUtil.randomInRange(0, Instance.instance.screenSize.height));
                }
            }catch (ConcurrentModificationException e){}
            try {
                inDelay = true;
                Thread.sleep(200); //:P
            } catch (InterruptedException e) {
            }
        }
    }
}
