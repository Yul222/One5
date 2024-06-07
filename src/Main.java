public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87; //рост
        int a = (int) h;
        System.out.println(a);
        int w = 98; //вес
        int b = (int) w;
        System.out.println(b);
        int iresult = service.calculate(iresult); // должно получиться 28
        System.out.println(iresult);
    }
}