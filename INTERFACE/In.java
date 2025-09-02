package INTERFACE;

public interface In {
    int i = 10;
    void m1();
}

class B implements In {
    int i = 20;

    @Override
    public void m1() {
        System.out.println("m1() in b");
    }
}


