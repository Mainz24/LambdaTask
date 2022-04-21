package LambdaTaskTwo;

public class Main {
    public static void main (String[] args){
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener oneErrorListener = System.out::println;
        Worker worker = new Worker(listener, oneErrorListener);
        worker.start();
    }
}
