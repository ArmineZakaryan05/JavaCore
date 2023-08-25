package ClassWork.chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) ;
        int y = 20;
        System.out.println(" x, y:" + x + " " + y);
        x = y * 2;
    //у= 100; //ОШИБКА! переменная у недоступна
// в этой области действия, тогда как
//переменная х доступна и здесь
    System.out.println (" x равно " + x );
   }
}
