package lt.gerasimovas.patterns.singleton_pattern;

public class SingletonObj {
    //create an object of SingleObject
    private static SingletonObj instance = new SingletonObj();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingletonObj(){}

    //Get the only object available
    public static SingletonObj getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
