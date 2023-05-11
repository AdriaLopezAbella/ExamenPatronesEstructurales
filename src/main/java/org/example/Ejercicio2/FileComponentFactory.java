package org.example.Ejercicio2;

class FileComponentFactory {
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
