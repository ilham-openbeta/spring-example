package id.web.ilham.di;

public class MainApp {
    public static void main(String[] args) {
        Store fruit1 = new Store(new Apple());
        Store fruit2 = new Store(new Banana());

        System.out.println(fruit1.getFruit().getName());
        System.out.println(fruit2.getFruit().getName());
    }
}
