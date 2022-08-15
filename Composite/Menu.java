package Composite;

import java.util.ArrayList;

public class Menu implements IMenu {
    private ArrayList<IMenu> menus;

    public Menu() {
        this.menus = new ArrayList<IMenu>();
    }

    @Override
    public boolean open() {
        System.out.println("Open!");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Close!");
        return true;
    }

    public void addMenu(IMenu menu) {
        this.menus.add(menu);
    }

    public IMenu getMenu(int position) {
        return this.menus.get(position);
    }

}
