package mainPackage;

class App implements Runnable{
    static int i, j = 0;
    
    @Override
    public void run() {
        while(i < 100){
        System.out.println("I'm also running...Thread 1");
        i++;
        }
    }
    public static void main(String[] args) {        
        App obj = new App();
        Thread t1 = new Thread(obj);
        t1.start();

        while(j < 100){
            System.out.println("I'm running...Default Thread");
            j++;
        }
    }    
}