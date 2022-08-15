package src.com.bridgelabz;

public class GenericsTestMaximum {
    public static Integer compareTo(Integer a,Integer b,Integer c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Java Core - Generics Test Maximum");
        int max=compareTo(50,200,90);
        System.out.println("Maximum from 3 Integer : "+max);
    }
}
