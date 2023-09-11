import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
    int   tal1=8;
    int  tal2=6;
    double kvotD=(double)tal1/tal2;
    System.out.println("Kvoten i decimal blir"+kvotD);
    double kvotH=tal1/tal2;
    System.out.println("Kvoten i heltal blir"+kvotH);


    Scanner tangentbord= new Scanner(System.in);
    System.out.println("Ange täljare");
    int tal3=tangentbord.nextInt();
    System.out.println("Ange nämnare");
    int tal4=tangentbord.nextInt();
    double kvot3=(double)tal3/tal4;
    System.out.println("Kvoten i decimal blir 4 "+kvot3);
    double kvot4=tal1/tal2;
    System.out.println("Kvoten i heltal blir"+kvot4);



    }
}
