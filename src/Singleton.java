public class Singleton {
    private Singleton(){

    }



    private static Object  getInstance(){
       Singleton singleton = new Singleton();
       return singleton;
    }
}
