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
        Character [] a = {'o','a','l','j','x','w','z'};
        Integer [] b = {6,100,30,90,-5,14,8,11};
        Byte [] c = {-111, 99,6,16,10,-90,10};
        Short [] d = {-517, 450 ,130,900, -560, 500};
        Long [] e = {6L,8L,7L,3L,-9L,0L};
        Float [] f ={0.2F,7.4F,1.8F,3.6F,1.28F,101.566F,5.5555F};
        Double [] g = {2.3d,3.2d,-9.888d,8.99d,6.6d,7.7d};
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
