package week11;

public class Task1 {
    public static < T extends Comparable> void xapxep(T[] a){
        int n = a.length;
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n-1; j++)
            {
                if(a[j].compareTo(a[j+1]) > 0)
                {
                    T tg = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tg;
                }
            }
        }
    }
    public static < T extends Comparable> void print(T[] a){
        int n = a.length;
        for(int i = 0; i< n; i++){
            System.out.println(a[i]);
        }
        System.out.println("\n\n");
    }
    public static void main(String [] args){
        Character [] a = {'d','f','g','h','o','p','q'};
        Integer [] b = {1,-3,6,8,88,-30,0,30};
        Byte [] c = {-128, 100,-90,90,50,-40,127};
        Short [] d = {-32768, 20 ,100,1000, -200, 32767};
        Long [] e = {2L,-3L,0L,6L,4L,1L};
        Float [] f ={1.2F,2.6F,-9.8F,3F,4.09F,10.78888F,8.9F};
        Double [] g = {1.1d,3.144d,4.5d,-1.6d,-10.98877d,2.5d};
        xapxep(a);
        print(a);
        xapxep(b);
        print(b);
        xapxep(c);
        print(c);
        xapxep(d);
        print(d);
        xapxep(e);
        print(e);
        xapxep(f);
        print(f);
        xapxep(g);
        print(g);
    }
}
