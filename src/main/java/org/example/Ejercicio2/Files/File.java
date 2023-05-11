package org.example.Ejercicio2.Files;

import org.example.Ejercicio2.Components.FileComponent;

public abstract class File implements FileComponent {
    protected String name;
    protected int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public abstract void display(int depth);
}