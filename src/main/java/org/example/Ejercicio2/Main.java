package org.example.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        FileComponentFactory factory = new FileComponentFactory();

        // Crear archivos normales
        FileComponent file1 = factory.createFile("archivo1.txt", 10);
        FileComponent file2 = factory.createFile("archivo2.txt", 5);
        FileComponent file3 = factory.createFile("archivo3.txt", 8);

        // Crear archivos enlaces
        FileComponent link1 = factory.createLinkFile("enlace1.txt", file1);
        FileComponent link2 = factory.createLinkFile("enlace2.txt", file2);

        // Crear directorios
        DirectoryComponent directory1 = factory.createDirectory("Directorio1");
        DirectoryComponent directory2 = factory.createDirectory("Directorio2");

        // Agregar archivos y directorios al directorio1
        directory1.add(file1);
        directory1.add(file2);
        directory1.add(directory2);
        directory1.add(link1);

        // Agregar archivos y directorios al directorio2
        directory2.add(file3);
        directory2.add(link2);

        // Mostrar estructura y tamaños
        directory1.display(0);
    }
}
