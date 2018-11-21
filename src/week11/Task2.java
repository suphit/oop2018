package week11;
import java.util.ArrayList;
import java.util.Random;
public class Task2 {
    public static <T extends Comparable> T max(ArrayList<T> a) {
        T max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (max.compareTo(a.get(i)) < 0) {
                max = a.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Character> a = new ArrayList<Character>();
        a.add(0, 'a');
        a.add(1, 'd');
        a.add(2, 'e');
        a.add(3, 'u');
        a.add(4, 'i');
        System.out.println(max(a) + "\n");
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0, 10);
        b.add(1, 2);
        b.add(2, -10);
        b.add(3, 100);
        b.add(4, 20);
        System.out.println(max(b) + "\n");
        ArrayList<Byte> c = new ArrayList<Byte>();
        c.add(0, (byte) -128);
        c.add(1, (byte) 20);
        c.add(2, (byte) 100);
        c.add(3, (byte) 50);
        c.add(4, (byte) 127);
        System.out.println(max(c) + "\n");
        ArrayList<Short> d = new ArrayList<Short>();
        d.add(0, (short) -32768);
        d.add(1, (short) 100);
        d.add(2, (short) 20);
        d.add(3, (short) -190);
        d.add(4, (short) 32767);
        System.out.println(max(d) + "\n");
        ArrayList<Long> e = new ArrayList<Long>();
        e.add(0, (long) 2L);
        e.add(1, (long) 3L);
        e.add(2, (long) 0L);
        e.add(3, (long) -4L);
        e.add(4, (long) 9L);
        System.out.println(max(e) + "\n");
        ArrayList<Float> f = new ArrayList<Float>();
        f.add(0, 1.2f);
        f.add(1, -0.56f);
        f.add(2, 90.0002f);
        f.add(3, 4.45f);
        f.add(4, -2.67f);
        System.out.println(max(f) + "\n");
        ArrayList<Double> g = new ArrayList<Double>();
        g.add(0, 2.4567d);
        g.add(1, -34.0987d);
        g.add(2, 56.0023d);
        g.add(3, 34.34567d);
        g.add(4, 25.0056791d);
        System.out.println(max(g) + "\n");
    }
}
