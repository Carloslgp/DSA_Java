package ArrayList;

public class MyArrayList<T> {
    T[] data;
    int capacity;
    int size;

    public MyArrayList() {
        capacity = 2;
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public MyArrayList(int capacity){
        this.capacity = capacity;
    }

    public void add(T o){
        for  (int i = 0; i < capacity; i++) {
            if (i == capacity - 1) {
                raiseCapacity();
            }
            if (data[i] == null ) {
                size += 1;
                data[i] = o;
                return;
            }
        }
    }

    public void add(int index, T o){
        if (index < 0 || index >= capacity) {
            throw new RuntimeException("Estourou o tamanho!");
        }
        else{
            for (int i = index; i < capacity; i++) {
                if (i == capacity - 1) {
                    raiseCapacity();
                }
                if (data[i] == null) {
                    break;
                }
                data[i] = data[i + 1];
            }
            data[index] = o;
            size++;
        }
    }


    public void remove(int index) {
        if (index < 0 || index >= capacity) {
            throw new RuntimeException("Estourou o tamanho!");
        }
        data[index] = null;
        if (index < size - 1) {
            for (int i = index; i < capacity - 1; i++) {
                data[i] = data[i + 1];
            }
        }
        size--;
    }

    public void remove(T o){
        for  (int i = 0; i < capacity; i++) {
            if (data[i] == o) {
                data[i] = null;
                if (i < size - 1) {
                    for (int j = i; j < capacity - 1; j++) {
                        data[j] = data[j + 1];
                    }
                }
            }
        }
        size--;
    }

    public void set(int index, T o) {
        if (index < 0 || index >= capacity) {
            throw new RuntimeException("Estourou o tamanho!");
        }
        data[index] = o;
    }

    public void get(int index) {
        if (index < 0 || index >= capacity) {
            throw new RuntimeException("Estourou o tamanho!");
        }
        System.out.println(data[index]);
    }

    public boolean contains(T o) {
        for  (int i = 0; i < capacity; i++) {
            if (data[i] == o) {
                return true;
            }
        }
        return false;
    }

    public void indexOf(T o) {
        for  (int i = 0; i < capacity; i++) {
            if (data[i] == o) {
                System.out.println(i + "\n");
            }
        }
    }

    public void print(){
        for  (int i = 0; i < capacity; i++) {
            if (data[i] == null) {
                System.out.println("\n");
                return;
            }
            System.out.print(data[i] + " ");


        }
        System.out.println("\n");
    }

    public Object[] toArray(){
        Object[]obj = new Object[capacity];
        for  (int i = 0; i < capacity; i++) {
            obj[i] = data[i];
        }
        return obj;
    }


    private void raiseCapacity(){
        int newCapacity = (int)(capacity * 1.5);
        T[] newData = (T[]) new Object[newCapacity];
        newData = data;
        data = (T[]) new Object[newCapacity];
        for (int j = 0; j < capacity; j++) {
            data[j] = newData[j];
        }
        capacity = newCapacity;
    }

}
