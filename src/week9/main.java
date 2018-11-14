package week9;

public class main {
    public static void main(String [] args){
        String in = "C:\\oop\\file.txt";
        String in1 = "C:\\oop\\file1.txt";
        String in2 = "C:\\oop\\file2.txt";
        System.out.println(" a : ");
        Utils.readContentFromFile(in);
        System.out.println(" b : ");
        Utils.writeContentToFile(in1);
        System.out.println(" c : ");
        Utils.Themvaocuoi(in2);
        System.out.println(" d: ");
        Utils.findFileByName("C:\\oop", "file2.txt");

    }
}