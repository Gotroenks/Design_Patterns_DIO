package one.digitalinnovation.gof.Singleton;

public class Test {

    public static void main(String[] args) {

        //test Design Pattern Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(lazy);
        System.out.println(eager);
        System.out.println(holder);
    }
}
