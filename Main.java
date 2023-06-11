package JavaFruit;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Apple> appleBox3 = new Box<>();
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());
        appleBox3.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес Первого ящика с яблоками: " + appleBox1.getWeight());
        System.out.println("Вес Второго ящика с яблоками: " + appleBox2.getWeight());
        System.out.println("Вес Третьего ящика с яблоками: " + appleBox3.getWeight());
        System.out.println("Вес Ящика с апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравнение Первого ящика с яблоками и Второго: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение Второго ящика с яблоками и Третьего: " + appleBox2.compare(appleBox3));
        System.out.println("Сравнение Первого ящика с яблоками и Третьего: " + appleBox1.compare(appleBox3));

        appleBox1.transferFruitsTo(appleBox3);
        appleBox3.transferFruitsTo(appleBox2);
        System.out.println("Вес Первого ящика после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес Третьего ящика после пересыпания: " + appleBox3.getWeight());
        System.out.println("Вес Третьего ящика после пересыпания: " + appleBox3.getWeight());
        System.out.println("Вес Второго ящика после пересыпания: " + appleBox2.getWeight());

    }
}
