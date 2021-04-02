package homework;

public class Main {
    public static void main(String[] args) {
        StringCollection strcol = new StringCollection(6);

        strcol.add("one");
        strcol.add("two");
        strcol.add("tree");
        strcol.add("four");
        strcol.add("five");

        System.out.println(strcol.toString());

        System.out.println("Добавили значение, которое увеличит массив");
        strcol.add("six");

        System.out.println(strcol.toString());
        System.out.println("Добавили значение по индексу");
        strcol.addByIndex("two", 1);
        System.out.println(strcol.toString());

        System.out.println("Удаляем по индексу");
        strcol.delete(2);
        System.out.println(strcol.toString());

        System.out.println("удаляем по значению");
        strcol.deleteByValue("two");
        System.out.println(strcol.toString());

        System.out.println("Достаем с помощью get");
        System.out.println(strcol.get(2));

    }

}
