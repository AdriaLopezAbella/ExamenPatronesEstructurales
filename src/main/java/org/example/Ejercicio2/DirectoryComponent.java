package org.example.Ejercicio2;

public interface DirectoryComponent extends FileComponent {
    void add(FileComponent component);
    void remove(FileComponent component);
}
