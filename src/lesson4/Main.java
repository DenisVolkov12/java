package lesson4;

public class Main {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d'};
        char[] b = {'q','w','e','r'};

        char[] c =new char[a.length+b.length];


        c[0] = a[0];
        c[1] = a[1];
        c[2] = a[2];
        c[3] = a[3];

        c[0] = a[0];
        c[1] = a[1];
        c[2] = a[2];
        c[3] = a[3];

        for(int i = 0; i < c.length; i++){
            if(i < a.length) {
                c[i] = a[i];
            }else {
                c[i] = b[i - a.length];
                }
            }


        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }




    }
}
