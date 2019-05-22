package lesson19.praktika;

public abstract class TaskImpl implements Task {
    private int count;

    public TaskImpl(){

    }

    @Override
    public int getTryCount() {
        return count;
    }

    @Override
    public void incTryCount() {
        count++;
    }
}
