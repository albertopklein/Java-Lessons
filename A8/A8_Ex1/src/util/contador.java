package util;

public class contador {
    private static Integer ID = 1;

    public static Integer pegarID(){
        return ID++;
    }

}
