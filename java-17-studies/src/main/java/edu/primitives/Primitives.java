package edu.primitives;

public class Primitives {

    static int anInt;
    static short aShort;

    static float aFloat;

    int x = 2;   //bit pattern of 2 is : 00000000 00000000 00000000 00000010
    int y = ~x; //bit pattern of ~2 is : 11111111 11111111 11111111 11111101, which is same as -3.
    public static void main(String[] args) {
        cast();
    }

    static void cast(){
        anInt = aShort;
        aFloat = anInt;
        anInt = (int) aFloat;
    }
}
