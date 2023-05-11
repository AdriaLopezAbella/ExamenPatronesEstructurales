package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
abstract class Directory implements DirectoryComponent {
    protected String name;
    protected List<FileComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display(int depth);
}