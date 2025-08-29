import ArrayList.MyArrayList;

import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4, 5);
        list.add(5, 6);
        list.remove(2);
        list.remove((Integer)4);
        list.set(0,10);
        list.print();
        list.get(1);
        System.out.printf("\n");


        System.out.println(list.contains(10) + "\n");

        System.out.println(list.contains(20) + "\n");

        list.indexOf(10);


        Object[] array1 = list.toArray();
        for(int i = 0; i < array1.length; i++ ){
            System.out.println(array1[i]);
        }


    }
}
