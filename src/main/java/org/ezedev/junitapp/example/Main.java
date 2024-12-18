package org.ezedev.junitapp.example;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Person
        Person person = new Person("John", 30);

        // Llamar al metodo serialize de SerialJson y pasar el objeto y el nombre de archivo
        SerialJson.serialize(person, person.getName());  // Usamos el nombre de la persona como nombre del archivo JSON
    }
}

