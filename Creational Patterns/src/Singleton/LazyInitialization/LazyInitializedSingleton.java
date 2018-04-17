package Singleton.LazyInitialization;

class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance = null;

    private LazyInitializedSingleton(){}

    static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    void sayHello(){
        System.out.println("Say Hello to my little friend!");
    }
}
