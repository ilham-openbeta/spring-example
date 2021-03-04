package id.web.ilham.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Store store = context.getBean(Store.class);
        System.out.println(store.getFruit().getName());
    }
}
