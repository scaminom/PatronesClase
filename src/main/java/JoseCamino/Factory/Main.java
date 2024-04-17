package JoseCamino.Factory;

public class Main {
    public static void main(String[] args) {
        FigureFactory tr = new TriangleFactory();
        tr.createAndDraw();

        FigureFactory sq = new SquareFactory();
        sq.createAndDraw();
    }
}
