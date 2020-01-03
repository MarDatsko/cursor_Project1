package src.main.java.view.impl;


import src.main.java.view.Menu;


public class UserMainMenu implements Menu {
    @Override
    public void show() {
        System.out.println("AHhaaa!!");
    }

    @Override
    public void exit() {
        new view.impl.LoginMenu().show();
    }
}
