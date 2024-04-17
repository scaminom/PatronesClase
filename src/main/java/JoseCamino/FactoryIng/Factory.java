package JoseCamino.FactoryIng;

import java.util.HashMap;

public class Factory {

    private final HashMap<String, Figure> figures = new HashMap<>();

    public Factory() {
        figures.put("square", new Square());
        figures.put("triangle", new Triangle());
    }

    public Figure create(String figure) {
        return figures.get(figure);
    }
}
