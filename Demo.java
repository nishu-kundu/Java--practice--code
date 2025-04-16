package Accessmodifyer;

public class Demo {
    public static void main(String[] args) {
        Access obj = new Access();
        //private cannot access in dii. class
        //  System.out.println("private x="+obj.x);
        System.out.println(" public y=" + obj.y);
        System.out.println("protected z=" + obj.z);
        System.out.println(" default d=" + obj.d);
    }
}
