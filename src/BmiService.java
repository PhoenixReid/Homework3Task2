public class BmiService {
    public int calculate(double kg, double m) {
        int bmi = (int) (kg / (m * m));
        return bmi;
    }
}
