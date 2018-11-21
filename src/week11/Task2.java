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
        a.add(0, 'i');
        a.add(1, 'b');
        a.add(2, 'w');
        a.add(3, 'o');
        a.add(4, 'z');
        System.out.println(max(a) + "\n");
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0, 4);
        b.add(1, 6);
        b.add(2, 1);
        b.add(3, 10);
        b.add(4, 15);
        System.out.println(max(b) + "\n");
        ArrayList<Byte> c = new ArrayList<Byte>();
        c.add(0, (byte) 5);
        c.add(1, (byte) -1);
        c.add(2, (byte) 6);
        c.add(3, (byte) 4);
        c.add(4, (byte) 16);
        System.out.println(max(c) + "\n");
        ArrayList<Short> d = new ArrayList<Short>();
        d.add(0, (short) 15);
        d.add(1, (short) -7);
        d.add(2, (short) 9);
        d.add(3, (short) 4);
        d.add(4, (short) 19);
        System.out.println(max(d) + "\n");
        ArrayList<Long> e = new ArrayList<Long>();
        e.add(0, (long) 1L);
        e.add(1, (long) -9L);
        e.add(2, (long) 4L);
        e.add(3, (long) 34L);
        e.add(4, (long) 20L);
        System.out.println(max(e) + "\n");
        ArrayList<Float> f = new ArrayList<Float>();
        f.add(0, 0.6f);
        f.add(1, -9.99f);
        f.add(2, 8.008f);
        f.add(3, 100.11f);
        f.add(4, 44.4f);
        System.out.println(max(f) + "\n");
        ArrayList<Double> g = new ArrayList<Double>();
        g.add(0, 5.22d);
        g.add(1, 9.44d);
        g.add(2, 6.66d);
        g.add(3, 100.234d);
        g.add(4, -21.2121d);
        System.out.println(max(g) + "\n");
    }
}
