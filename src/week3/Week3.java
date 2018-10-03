package week3;

import java.util.Scanner;
public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if(m>=n)
            return m;
        else
            return n;

    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int i, min=array[0];
        for(i=1;i<array.length;i++){
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

        Double nang,cao;
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter your weight >>> ");
        nang= scan.nextDouble();
        System.out.print("Please enter your height >>> ");
        cao= scan.nextDouble();
        System.out.print(calculateBMI(nang,cao));
    }
}
