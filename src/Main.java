public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        
        System.out.println("Ежемесячный платеж на 1 год составляет:");
        System.out.println(service.calculate(1_000_000, 1, 9.99));
        
        System.out.println("Ежемесячный платеж на 2 года составляет:");
        System.out.println(service.calculate(1_000_000, 2, 9.99));
        
        System.out.println("Ежемесячный платеж на 3 года составляет:");
        System.out.println(service.calculate(1_000_000, 3, 9.99));
    }
}
