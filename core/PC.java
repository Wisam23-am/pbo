package core;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component c) {
        components.add(c);
    }

    public void showSpecs() {
        for (Component c : components) {
            System.out.println(c);
        }
    }
}
