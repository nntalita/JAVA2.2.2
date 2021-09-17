public class Main {
    public static void main(String[] args) {
        BMICalculationService service = new BMICalculationService();
        double result = service.calculate(100, 2.00);
        result = Math.round(result * 100.0) / 100.0;
        System.out.println("Индекс Массы Тела " + result);
    }
}
