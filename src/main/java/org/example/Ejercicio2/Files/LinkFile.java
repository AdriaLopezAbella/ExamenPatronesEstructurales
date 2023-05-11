package org.example.Ejercicio2.Files;

import org.example.Ejercicio2.Components.FileComponent;
import org.example.Ejercicio2.Files.File;

public class LinkFile extends File {
    private FileComponent linkedFile;

    public LinkFile(String name, FileComponent linkedFile) {
        super(name, 0); // Tamaño siempre será el tamaño del archivo vinculado
        this.linkedFile = linkedFile;
    }

    public int getSize() {
        return linkedFile.getSize();
    }

    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent.toString() + getName() + " (Tamaño: " + getSize() + ")");
    }
}
