package me.miliblue.youareidiot;

public class Main {
    public static void main(String[] args) {
        if(args.length == 2){
            if(args[0].equalsIgnoreCase("-windows")){
                int i = 0;
                try{
                    i = Integer.parseInt(args[1]);
                }catch (Exception e){
                    e.printStackTrace();
                }
                if(i != 0){
                    Instance.instance.windows = i;
                }
            }
        }
        Instance.instance.start();
    }
}
