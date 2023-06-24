import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    private int size;
    private int currentSize;

    MagicBox(int size){
        items = (T[]) new Object[size];
        this.size = size;
        currentSize = 0;
    }

    public boolean add(T item){
        if(size == currentSize) return false;
        items[currentSize] = item;
        currentSize++;
        return true;
    }

    public T pick(){
        if(size != currentSize) {
            throw new RuntimeException("Ошибка запроса: коробка не полностью заполнена");
        }else {
            Random random = new Random();
            int randomInt = random.nextInt(size);
            return items[randomInt];
        }
    }

}
