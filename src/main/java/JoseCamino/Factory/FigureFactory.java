package JoseCamino.Factory;

public abstract class FigureFactory {
    public void createAndDraw() {
        Figure figure = createFigure();
        figure.draw();
    }

    public abstract Figure createFigure();
}
