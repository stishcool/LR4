import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>(new Apple(), 3);
        Box<Apple> appleBox2 = new Box<>(new Apple(), 2);
        Box<Orange> orangeBox = new Box<>(new Orange(),4);
        Box<Lemon> lemonBox = new Box<>(new Lemon(),1);

        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Вес коробки с лимоном: " + lemonBox.getWeight());

        System.out.println("Сравнение коробки с яблоками 1 и коробки с апельсинами: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruitsToAnotherBox(appleBox2);


        System.out.println("Содержимое коробки 1:");
        appleBox1.printBox();
        System.out.println("Содержимое коробки 2:");
        appleBox2.printBox();






        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(intArray));

        swapEl(intArray, 1, 3);
        System.out.println("Массив после смены элементов: " + Arrays.toString(intArray));





        String[] stringArray = {"один", "два", "три"};
        ArrayList<String> arrayList = aToL(stringArray);

        System.out.println("List: " + arrayList);
    }

    public static <T> void swapEl(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static <T> ArrayList<T> aToL(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}