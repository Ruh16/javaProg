package readwrite;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readwrite {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileHelper fh = new FileHelper("Demo.Txt");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader kin = new BufferedReader(is);
        String str;
        do {
            System.out.println("Welcome to File Handeling.\n"
                    + "press 1 to read a file.\n"
                    + "press 2 to write a file.\n"
                    + "press 3 to exit.");
            str = kin.readLine();
            switch (str) {
                case "1":
                    fh.readFile();
                    break;
                case "2":
                    fh.writeFile();
                    break;
                case "3":
                    System.out.println("Bye.");
                    break;
                default:
                    System.out.println("Invalid Case !!!");
            }
        } while (!str.equals("3"));
    }
}
