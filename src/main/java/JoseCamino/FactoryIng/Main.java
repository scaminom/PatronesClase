package JoseCamino.FactoryIng;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Figure square = factory.create("square");
        Figure triangle = factory.create("triangle");
        square.draw();
        triangle.draw();
    }
}