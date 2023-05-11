package org.example.Ejercicio2.Components;

import org.example.Ejercicio2.Components.FileComponent;

public interface DirectoryComponent extends FileComponent {
    void add(FileComponent component);
    void remove(FileComponent component);
}
