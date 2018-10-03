package week3;

import java.util.Scanner;
public class Week3 {

    private static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>=n)
            return m;
        else
            return n;

    }

    private static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min)
            {
                min =array[i];
            }
        }
        return  min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    private static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height*height);
        String Display="";
        if ( BMI<18.5){
            Display="Thiếu cân";
        }
        if ( 18.5<=BMI && BMI<=22.99){
            Display ="Bình thường";
        }
        if ( BMI>=23&&BMI<=24.99){
            Display ="Thừa cân";
        }
        if ( BMI>=25){
            Display ="Béo phì";
        }
        return Display;
    }
    public static void main(String[] args) {
        // TODO code application logic here

        //max
        /*int m,n;
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter the first number >>> ");
        m=scan.nextInt();
        System.out.print("Please enter the first number >>> ");
        n=scan.nextInt();
        System.out.print("giá trị lớn nhất là ");
        System.out.print(max(m,n));*/



        //minOfArray
        /*int[] array;
        Scanner scan= new Scanner(System.in);
        array=new int[100];
        for (int i=0; i<100; i++){
            System.out.print("Array "+(i+1)+" : ");
            array[i]=scan.nextInt();
        }
        System.out.println("giá trị nhỏ nhất trong mảng là = " + minOfArray(array));
        */


        //BMI
        float nang,cao;
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your weight >>> ");
        nang= scan.nextFloat();
        System.out.print("Please enter your height >>> ");
        cao= scan.nextFloat();
        System.out.print(calculateBMI(nang,cao));

    }
}
