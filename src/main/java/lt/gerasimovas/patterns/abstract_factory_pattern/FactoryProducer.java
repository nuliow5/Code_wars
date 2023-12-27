package lt.gerasimovas.patterns.abstract_factory_pattern;

import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.normal.ShapeFactory;
import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.rounded.RoundedShapeFactory;

public class FactoryProducer {
    public static ShapeAbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
