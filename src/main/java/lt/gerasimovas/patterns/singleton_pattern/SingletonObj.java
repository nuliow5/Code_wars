package lt.gerasimovas.patterns.singleton_pattern;

public class SingletonObj {
    private static SingletonObj instance = new SingletonObj();

    public SingletonObj() {
    }

    public static SingletonObj getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from SingletonObj");
    }
}
