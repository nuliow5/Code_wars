package lt.gerasimovas.zero_in_array;

public final class ImmutableClass {
    private int a;
    private String name;

    public ImmutableClass(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }
}
