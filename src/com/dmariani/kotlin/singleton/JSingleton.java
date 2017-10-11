package com.dmariani.kotlin.singleton;

/**
 * This class represents a Singleton in Java
 *
 * @author danielle.mariani
 */
public class JSingleton {

    private static JSingleton instance;

    private JSingleton() {
    }

    public static JSingleton getInstance() {
        if (instance == null) {
            instance = new JSingleton();
        }

        return instance;
    }

    public void print() {
        System.out.println("Hello World from Java Singleton");
    }
}
