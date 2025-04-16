package Accessmodifyer;

public class Access {
    private int x=1;
    public int y=2;
    protected int z=3;
    int d=4;
    void display()
    {
        System.out.println("private x="+x);
        System.out.println(" public y="+y);
        System.out.println("protected z="+z);
        System.out.println(" default d="+d);
    }
    public static void main(String[] args) {
        Access obj = new Access();
        obj.display();
    }
}
