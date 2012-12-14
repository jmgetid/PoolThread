
class Task implements Runnable
{
    private final int i;
    private final Object obj;
    Task(int i, Object obj) {
        this.i = i;
        this.obj = obj;
    }

    @Override
    public void run() {
        System.out.println("I am in Task: "+ i + " executed by thread " + Thread.currentThread().getName());
    }
}
