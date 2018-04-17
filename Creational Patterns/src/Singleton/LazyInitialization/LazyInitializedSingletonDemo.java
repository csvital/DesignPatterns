package Singleton.LazyInitialization;

public class LazyInitializedSingletonDemo {
    public static void main(String[] args) {
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        lazyInitializedSingleton.sayHello();
    }
}
