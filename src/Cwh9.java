public class Cwh9{
static int logic(int x,int y) {
        int z;
        if (x > y)
        {
        z = x + y * 10;
        }
        else
        {
        z = x * y + 100;
        }
        return z;
        }

public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        c=logic(a,b);


        int a1=5,b1=10;
        int c1;
        c1=logic(a1,b1);

        int a2=8,b2=9;
        int c2;
        c2=logic(a2,b2);


        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        }
        }
