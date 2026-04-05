public class OrderTest {
    public static void main(String[] args) {
        // Create instances of the classes
        PlaceOrder placeOrder = new PlaceOrder();
        CalculateTotal calculateTotal = new CalculateTotal();
        GenerateInvoice generateInvoice = new GenerateInvoice();
        SendEmailNotification sendEmailNotification = new SendEmailNotification();

        // Simulate placing an order
        placeOrder.placeOrder("Felix Luis", "12C Street, Manila");

        // Simulate calculating total
        calculateTotal.calculateTotal(70, 3);

        // Simulate generating invoice
        generateInvoice.generateInvoice("invoice_123.pdf");

        // Simulate sending email notification
        sendEmailNotification.sendEmailNotification("john.doe@example.com");
    }
}
