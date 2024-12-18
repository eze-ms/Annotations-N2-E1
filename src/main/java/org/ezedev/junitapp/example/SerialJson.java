package org.ezedev.junitapp.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ezedev.junitapp.example.annotations.JsonPath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerialJson {
    static void serialize(Object o, String name) {

        // Obtener la clase del objeto
        Class<?> objectClass = o.getClass();

        // Crear un ObjectMapper de Jackson
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Verificar si la clase tiene la anotación JsonPath
            if (objectClass.isAnnotationPresent(JsonPath.class)) {
                // Obtener el directorio donde se guardará el archivo JSON
                String path = objectClass.getAnnotation(JsonPath.class).path();

                // Crear el directorio si no existe (y cualquier directorio intermedio)
                if (!Files.exists(Paths.get(path))) {
                    Files.createDirectories(Paths.get(path));  // Usar createDirectories para asegurar que se creen todos los directorios necesarios
                }

                // Serializar el objeto y guardarlo como JSON en el directorio especificado
                objectMapper.writeValue(new File(path, name + ".json"), o);
                System.out.println("Json file created in output directory.");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());  // Manejar cualquier excepción relacionada con la serialización
        }
    }
}
