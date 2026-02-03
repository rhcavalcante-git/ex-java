import java.util.Locale;

public class casting {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        int x, y;
        x = 2;
        y = 5 * x;
        System.out.println(x);
        System.out.println(y);

        
        int r;
        double z;
        r = 2;
        z = 5 * r;
        System.out.println(r);
        System.out.println(String.format("%.1f", z));

        
        double b1, b2, area, h;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2) / 2.0 * h;
        System.out.println(area);


        int n;
        double o;
        o = 7.0;
        n = (int)o;
        System.out.println(o);

    }

}
