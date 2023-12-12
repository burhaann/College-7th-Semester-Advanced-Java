package mainPackage;

//Declaring Interface 'interfaceClass'
interface interfaceClass{
    public void interfaceMethod();
}

//Declaring Abstract Class 'abstractClass' which implements Interface 'interfaceClass'
abstract class abstractClass implements interfaceClass{
    void abstractMethod(){
        System.out.println("I'm a regular Method in Abstract Class.");
    }    
}

//Declaring Main Class 'App' which extends Abstract Class 'abstractClass'
class App extends abstractClass{
    public void interfaceMethod(){
        System.out.println("I'm a Interface Method in Main Class.");
    }
    public static void main(String[] args) {
        System.out.println("I'm a Regular Method in Main Class.");

        App obj = new App();
        obj.interfaceMethod();
        obj.abstractMethod();
    }
}