public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Double heightInMeters = 1.87;
        int weightInKg = 98;//вес
        int bmi = service.calculate(weightInKg, heightInMeters); // должно получиться 28
        System.out.println(bmi);
    }
}