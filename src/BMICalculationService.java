public class BMICalculationService {
    public double calculate(double bodyWeight, double height) {
        double bodyMassIndex = bodyWeight / (height * height);
        return bodyMassIndex;
    }
}
