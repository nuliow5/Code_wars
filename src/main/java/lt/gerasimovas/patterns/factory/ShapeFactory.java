package lt.gerasimovas.patterns.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }

        return null;
    }


}
