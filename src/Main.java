public class Main {
    public static void main(String[] args) {
       int deliveryDistance = 95;
       int deliveryDays = 0;
       if (deliveryDistance <= 20) {
           deliveryDays = 1;
       } else if (deliveryDistance<=60) {
           deliveryDays = 2;
       } else if (deliveryDistance<=100) {
           deliveryDays = 3;
       }
        System.out.println("Потребуется дней " + deliveryDays);
    }
}