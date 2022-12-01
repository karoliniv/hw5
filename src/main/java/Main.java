import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int counter = service.calculate(10, 99);

        System.out.println("\nВсего корней: " + counter);
    }
}