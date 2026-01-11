package SOLID_DEMO;

// ===== Abstractions (DIP + OCP + LSP) =====
interface PaymentMethod {
    void pay(double amount);
}

interface Refundable {
    void refund(double amount);
}

// ===== Low-level modules (implementations) =====
class CardPayment implements PaymentMethod, Refundable {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded Rs." + amount + " to Credit Card");
    }
}

class UPIPayment implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

class CashOnDelivery implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Cash Rs." + amount + " to be paid on delivery");
    }
}

// ===== SRP: Notification service =====
class NotificationService {

    void sendOrderConfirmation() {
        System.out.println("Order confirmation sent to customer");
    }
}

// ===== High-level module (DIP applied) =====
class OrderService {

    private PaymentMethod paymentMethod;
    private NotificationService notificationService;

    // Dependency Injection
    OrderService(PaymentMethod paymentMethod, NotificationService notificationService) {
        this.paymentMethod = paymentMethod;
        this.notificationService = notificationService;
    }

    void placeOrder(double amount) {
        paymentMethod.pay(amount);
        notificationService.sendOrderConfirmation();
    }
}

// ===== Main class (ONLY public class) =====
public class food_ordering_system {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        // Card payment
        PaymentMethod cardPayment = new CardPayment();
        OrderService order1 = new OrderService(cardPayment, notificationService);
        order1.placeOrder(500);

        System.out.println();

        // UPI payment
        PaymentMethod upiPayment = new UPIPayment();
        OrderService order2 = new OrderService(upiPayment, notificationService);
        order2.placeOrder(300);

        System.out.println();

        // Cash on delivery
        PaymentMethod codPayment = new CashOnDelivery();
        OrderService order3 = new OrderService(codPayment, notificationService);
        order3.placeOrder(700);
    }
}
