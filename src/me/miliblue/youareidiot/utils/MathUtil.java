package me.miliblue.youareidiot.utils;

import java.util.concurrent.ThreadLocalRandom;

public class MathUtil {
    public static int randomInRange(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
