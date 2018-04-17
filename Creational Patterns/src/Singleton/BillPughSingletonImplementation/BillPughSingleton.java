package Singleton.BillPughSingletonImplementation;

class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    void sayFlash(){
        System.out.println("My name is Barry Allen and I am the fastest man alive!");
    }
}