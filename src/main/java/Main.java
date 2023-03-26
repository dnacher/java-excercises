

import java.util.*;

public class Main {

    public static int checkChocolates(Integer number){
        if(number==1) return 1;
        else if(number==2) return 1;
        else if(number==3) return 2;
        else{
            return (checkChocolates(number - 3) + checkChocolates(number -1));
        }
    }


    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    private static int checkLevel(int level){
        int total = 0;
        int ret = level%10;
        if(ret==0){
            total = level / 10;
        }
        if(level>0){
            total += level + checkLevel(level-1);
        }
        if(ret==0){
            int mul10 = level / 10;
            total *= mul10;
        }
        return total;
    }




    public static void main(String[] args) {

        Animal an = new Animal(4);
        Animal cu = new Cuadrupedos();
        Animal ga = new Gato();
        Animal pe = new Perro();
        Gato gato2 = new Gato();
        an.comer();
        cu.comer();
        ga.comer();
        pe.comer();
        gato2.comer();
        gato2.ronronea();
    }
    //        }
//        String a = "c";
//        String b = "c";
//        String c = new String("c");
//        System.out.println(Locale.getDefault());
//        LocalDate local = LocalDate.now();
//        Date d = Date.valueOf(local);
//        System.out.println(local);
//        System.out.println(d);
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(c==b);
//        String d = c.intern();
//        String f = c;
//        System.out.println("-----------------");
//        System.out.println(c==d);
//        System.out.println(d==f);
//        MainView mainView = new MainView("Select an option or type Q to exit \n" +
//                "A - Fibonacci\n" +
//                "B - Palindrome word\n" +
//                "C - Prime number\n" +
//                "D - Palindrome number\n" +
//                "Q - Exit program\n");
//        mainView.display();
    }

