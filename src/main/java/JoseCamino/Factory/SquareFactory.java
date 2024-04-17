package JoseCamino.Factory;

public class SquareFactory extends FigureFactory {
    @Override
    public Figure createFigure() {
        return new Square();
    }
}
