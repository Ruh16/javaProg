package readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHelper {

    String name;

    public FileHelper(String name) {
        this.name = name;
    }

    public void readFile() throws IOException, FileNotFoundException {
//        FileInputStream fis = new FileInputStream(name);
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//        
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(name)
                )
        );
        
        String str = br.readLine();

        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }
        br.close();

    }

    public void writeFile() throws FileNotFoundException, IOException {
//        FileOutputStream fos = new FileOutputStream(name,true);
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//        PrintWriter pw = new PrintWriter(bw);
        
        PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(name,true)
                        )
                )
        );
        
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader kin = new BufferedReader(is);
        //Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter \"end\" to stop writing.");

        System.out.println("Enter a String ");
        str = kin.readLine();
        while (!str.equals("end")) {
            pw.write(str+".\n");
            System.out.println("Enter a String ");
            str = kin.readLine();
        }

        pw.close();

    }
}
