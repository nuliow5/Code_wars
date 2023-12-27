package lt.gerasimovas.patterns.abstract_factory_pattern.shapes.rounded;

import lt.gerasimovas.patterns.abstract_factory_pattern.ShapeAbstractFactory;
import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.Shape;


public class RoundedShapeFactory extends ShapeAbstractFactory {
    @Override
    protected Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        } else {
            throw new RuntimeException(shapeType + " unknow shape type");
        }
    }
}
