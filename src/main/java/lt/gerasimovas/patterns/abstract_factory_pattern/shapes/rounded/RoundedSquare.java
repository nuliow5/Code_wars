package lt.gerasimovas.patterns.abstract_factory_pattern.shapes.rounded;

import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw rounded square");
    }
}
