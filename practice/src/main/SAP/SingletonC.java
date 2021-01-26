package main.SAP;

//There
public final  class SingletonC {
   private static  SingletonC INSTANCE;
    private SingletonC(){
        System.out.println("Singleton Initialized");
    }
    public static synchronized SingletonC getInstance(){
      if(INSTANCE==null){
        return new SingletonC();
       }
       return INSTANCE;
    }
    public static void main(String[] args){
        SingletonC.getInstance();
    }
}

