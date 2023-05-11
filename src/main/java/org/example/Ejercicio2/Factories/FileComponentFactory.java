package org.example.Ejercicio2.Factories;

import org.example.Ejercicio2.Components.DirectoryComponent;
import org.example.Ejercicio2.Components.FileComponent;
import org.example.Ejercicio2.Directories.DirectoryContainer;
import org.example.Ejercicio2.Files.LinkFile;
import org.example.Ejercicio2.Files.NormalFile;


public class FileComponentFactory {
    public FileComponent createFile(String name, int size) {
        return new NormalFile(name, size);
    }

    public FileComponent createLinkFile(String name, FileComponent linkedFile) {
        return new LinkFile(name, linkedFile);
    }

    public DirectoryComponent createDirectory(String name) {
        return new DirectoryContainer(name);
    }

}
