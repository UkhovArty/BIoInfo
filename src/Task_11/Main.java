package Task_11;

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
        //String fileName = scanner.nextLine();
        int k = scanner.nextInt();
        String rubish = scanner.nextLine();
        //FileReader stream = new FileReader(fileName);
        //BufferedReader reader = new BufferedReader(stream);
        List<String> patterns = new ArrayList<>();
        String s1 = "SomeString";
        int j = 0;
        while (scanner.hasNextLine()) {
            patterns.add(scanner.nextLine());
            s1 = patterns.get(j);
            j++;
            if (s1.equals("exit")){
                patterns.remove("exit");
                break;
            }
        }
        System.out.println(StringRebuilder.StringRebuild(k, patterns));
}

}

