package JoseCamino.Factory;

public class TriangleFactory extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new Triangle();
    }
}
