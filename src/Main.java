import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int twixPrice = 77;
        int marsPrice = 78;
        int snickersPrice = 100;
        int bonAquaPrice = 50;

        boolean isCanBuy = false;

        System.out.println("Введите количество денег: ");
        int manyAmount = new Scanner(System.in).nextInt();

        if (manyAmount >= twixPrice) {
            System.out.println("Вы можете купить твикс!");
            isCanBuy = true;
        }
        if (manyAmount >= marsPrice) {
            System.out.println("Вы можете купить марс!");
            isCanBuy = true;
        }
        if (manyAmount >= snickersPrice) {
            System.out.println("Вы можете купить сникерс");
            isCanBuy = true;
        }
        if (manyAmount >= bonAquaPrice) {
            System.out.println("Вы можете купить воду");
            isCanBuy = true;
        }
        if (isCanBuy == false) {
            System.out.println("У вас не хватает денег");
        }





//        System.out.println("Первая: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Вторая: ");
//        int b = new Scanner(System.in).nextInt();
//
//        if(a > 5 && b < 5){
//        System.out.println("HW");
//        }
//
//        if (a < 5 && b > 5){
//            System.out.println("GW");
//        }

//        лог. и &&
//        лог. или ||

        // лог &&               лог ||
//        t    t  = t     t     t  = t
//        t    f  = f     t     f  = t
//        f    t  = f     f     t  = t
//        f    f  = f     f     f  = f








//        if (a > 5) {
//            System.out.println("Hellow world");
//        }
//        if (a < 5){
//            System.out.println("Goodbye world");
//        }
    }
}