package Rpg.util;

import java.util.Scanner;

public class InputUtil {
    static Scanner sc = new Scanner(System.in);

    //Return action input.
    public static byte readByte(String message) {
        System.out.println(message);
        return sc.nextByte();
    }

    public static String readString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int readInt() {
        return sc.nextInt();
    }
}
