package lt.gerasimovas.patterns.singleton_pattern;

public class MainSingleton {
    public static void main(String[] args) {
        SingletonObj singletonObj = new SingletonObj();
        singletonObj.showMessage();

        SingletonObj singletonObj1 = SingletonObj.getInstance();
        singletonObj1.showMessage();

    }
}
