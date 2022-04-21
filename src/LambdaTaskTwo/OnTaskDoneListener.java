package LambdaTaskTwo;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
