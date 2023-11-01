/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author PC
 */
public abstract class Menu {
    protected String title;

    public Menu(String title) {
        this.title = title;
    }
    public void display() {
        System.out.println(title);
    }
    public abstract void execute();
    public void run() {
        execute();
    }
    
}