package ClassWork.chapter3;

public class ClassLight {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // /указать количество дней
        seconds = days * 24 * 60 * 60 ;
        distance = lightspeed * seconds;
        // вычислить расстояние
        System.out.print("За" + days);
        System.out.print("дней свет пройдет около ");
        System.out.println ( distance + " миль. ");
    }
}
