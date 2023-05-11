package org.example.Ejercicio2.Directories;

import org.example.Ejercicio2.Components.DirectoryComponent;
import org.example.Ejercicio2.Directories.Directory;

public abstract class DirectoryLink extends Directory {
    private DirectoryComponent linkedDirectory;

    public DirectoryLink(String name, DirectoryComponent linkedDirectory) {
        super(name);
        this.linkedDirectory = linkedDirectory;
    }

    public int getSize() {
        return linkedDirectory.getSize();
    }

    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent.toString() + getName() + " (Tamaño: " + getSize() + ")");

        linkedDirectory.display(depth + 1);
    }
}
