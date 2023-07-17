package chapter12.generics;

public class ThreeDPrinter<T extends Material> {
    // 제네릭에서 static은 인스턴스 생성과 상관없이 메모리를 잡는다 -> 따라서 static 사용할 수 없다
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
    public void printing() {
        material.doPrinting();

    }
    private T material;
}
