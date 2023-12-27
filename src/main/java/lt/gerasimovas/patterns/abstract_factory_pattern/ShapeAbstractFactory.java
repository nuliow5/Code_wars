package lt.gerasimovas.patterns.abstract_factory_pattern;

import lt.gerasimovas.patterns.abstract_factory_pattern.shapes.Shape;

public abstract class ShapeAbstractFactory {
    protected abstract Shape getShape(String shapeType);
}
