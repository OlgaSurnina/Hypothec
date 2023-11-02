public class Hypothec {


    public static void main(String[] args) {

        int costHouse = 7200000;
        System.out.println("Стоимость жилья " + costHouse);

        final double firstPayProcent = 0.2;
        System.out.println("Процент первоначального взноса " + firstPayProcent);

        double firstPay = costHouse * firstPayProcent;
        System.out.println("Сумма первоначального взноса " + firstPay);
    }
}
