package org.example.Ejercicio2.Files;

import org.example.Ejercicio2.Files.File;

public class NormalFile extends File {
    public NormalFile(String name, int size) {
        super(name, size);
    }

    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent.toString() + getName() + " (Tamaño: " + getSize() + ")");
    }
}
