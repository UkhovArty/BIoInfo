package Task_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        String rubish = scanner.nextLine();

        List<String> patternsLeft = new ArrayList<>();
        List<String> patternsRight = new ArrayList<>();
        String s1 = "SomeString";
        String s0 = "";
        int j = 0;
        while (scanner.hasNextLine()) {
            s0 = scanner.nextLine();
            if (s0.equals("exit")) {
                patternsLeft.remove("exit");
                break;
            }
            patternsLeft.add(s0.substring(0, k));
            patternsRight.add(s0.substring(k + 1, s0.length()));
        }
        //System.out.println(patternsLeft);
        //System.out.println(patternsRight);
        String result = StringRebuilder2.StringRebuild(k, patternsLeft);
        System.out.println(result);
        //System.out.println(SecondStringMaker.BuildNewString(result, patternsRight, k, d));
    }

}