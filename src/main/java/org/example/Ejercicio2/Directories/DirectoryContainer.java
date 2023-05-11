package org.example.Ejercicio2.Directories;

import org.example.Ejercicio2.Components.FileComponent;
import org.example.Ejercicio2.Directories.Directory;

public class DirectoryContainer extends Directory {
    public DirectoryContainer(String name) {
        super(name);
    }

    public int getSize() {
        int totalSize = 0;
        for (FileComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    public void add(FileComponent component) {
        components.add(component);
    }

    public void remove(FileComponent component) {
        components.remove(component);
    }

    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent.toString() + getName() + " (Tamaño: " + getSize() + ")");

        for (FileComponent component : components) {
            component.display(depth + 1);
        }
    }
}
