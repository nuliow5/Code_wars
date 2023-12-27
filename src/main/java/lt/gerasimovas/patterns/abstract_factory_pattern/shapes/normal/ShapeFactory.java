package lt.gerasimovas.patterns.abstract_factory_pattern.shapes.normal;

import lt.gerasimovas.patterns.abstract_factory_pattern.ShapeAbstractFactory;
import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.normal.Rectangle;
import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.Shape;
import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.normal.Square;

public class ShapeFactory extends ShapeAbstractFactory {
    @Override
    protected Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else {
            throw new RuntimeException(shapeType + " unknow shape type");
        }
    }
}
