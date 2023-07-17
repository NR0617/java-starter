package chapter12.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter<Powder> printerPowder = new ThreeDPrinter<Powder>();
        printerPowder.setMaterial(new Powder());
        Powder powder =  printerPowder.getMaterial();
        System.out.println(powder);

        ThreeDPrinter<Plastic> plasticPowder = new ThreeDPrinter<Plastic>();
        plasticPowder.setMaterial(new Plastic());
        Plastic plastic =  plasticPowder.getMaterial();
        System.out.println(plastic);

        // Material을 상속받지 않은 클래스는 사용 제한
//        ThreeDPrinter<Water> plasticWater = new ThreeDPrinter<Water>();
//        plasticWater.setMaterial(new Water());
//        Water water =  plasticWater.getMaterial();
//        System.out.println(water);

        plastic.doPrinting();
    }
}
