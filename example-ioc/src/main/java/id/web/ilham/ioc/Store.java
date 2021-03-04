package id.web.ilham.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store {

    private Fruit fruit;

    @Autowired
    public Store(Fruit fruit){
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }
}
