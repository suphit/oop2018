package week10;

import java.util.Random;

public class Task2 {
    public static void BubbleSort(float a[]){
        for(int i=0;i<1000;i++)
        {
            for(int j = 0; j < 999; j++)
            {
                if(a[j] > a[j+1]){
                    float tg = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tg;
                }
            }
        }
    }
    public static void main(String [] args) {
        float [] a = new float[1000];
        Random rd = new Random();
        for(int i = 0; i<1000;i++)
        {
            a[i] = rd.nextFloat();
        }
        Task2.BubbleSort(a);
        for(int i = 0; i<1000;i++)
        {
            System.out.println(a[i]);
        }
    }
}