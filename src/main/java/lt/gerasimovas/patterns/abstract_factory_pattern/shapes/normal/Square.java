package lt.gerasimovas.patterns.abstract_factory_pattern.shapes.normal;

import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
}
