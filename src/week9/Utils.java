package week9;

import java.io.*;
import java.util.Scanner;
public class Utils {
    public static void main(String[] args)  {
        //Input data and write to file Word.txt
        String fname = "/home/arm/Word.txt"; //in Linux os
        //String fname = "c:\\Word.txt"; //in MS Windows os
        FileWriter f_write = null;
        BufferedWriter b_write = null;
        try {
            f_write = new FileWriter(fname);
            b_write = new BufferedWriter(f_write);
            String c;
            System.out.println("đọc tệp Word.txt");
            System.out.println("===========================");
            System.out.println("nhập * để kết thúc");
            do {
                System.out.print("Nhập dữ liệu : ");
                c = new Scanner(System.in).nextLine();
                if (!(c.equals("*"))) b_write.write(c+"\n");
            } while (!(c.equals("*")));
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            try {
                if (b_write != null)
                    b_write.close();
                System.out.println("Dữ liệu được lưu trong tệp : \n" + fname);
                System.out.println("===========================");
            }
            catch (IOException e){
                System.out.println(e);
            }
        }

        //Read data from file Word.txt
        FileReader f_read = null;
        BufferedReader b_read = null;
        try {
            f_read = new FileReader(fname);
            b_read = new BufferedReader(f_read);
            System.out.println("Đọc dữ liệu từ tệp : \n" + fname);
            System.out.println("===========================");
            String c;
            while ((c = b_read.readLine()) != null) {
                System.out.print(c);
                System.out.print("\t");
            }
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            try {
                if (b_read != null)
                    b_read.close();
                System.out.println("===========================");
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
