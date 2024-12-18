package org.ezedev.junitapp.example.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonPath {
    String path();  // Parámetro para especificar el directorio donde se guardará el archivo JSON
}
