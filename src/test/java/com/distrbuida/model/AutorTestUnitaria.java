package com.distrbuida.model;

import com.distribuida.model.Autor;
import com.distribuida.model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorTestUnitaria {

    private  Autor Autor;
    @BeforeEach
    public void setup(){

        Autor = new Autor(1,"Gabriel","Rolon","Argentina","av buenos aires por mas alla",
                "0955466224","gabrielro@correo.com");

    }
    @Test
    public void testAutorConstructor(){
        assertAll("validar datos del cliente - constructor ",
                () -> assertEquals(1,Autor.getIdAutor()),
                () -> assertEquals("Gabriel",Autor.getNombre()),
                () -> assertEquals("Rolon", Autor.getApellido()),
                () -> assertEquals("Argentina", Autor.getPais()),
                () -> assertEquals("av buenos aires por mas alla", Autor.getDireccion()),
                () -> assertEquals("0955466224", Autor.getTelefono()),
                () -> assertEquals("gabrielro@correo.com", Autor.getCorreo())
        );
    }
    @Test
    public void testAutorSetters(){
        Autor.setIdAutor(1);
        Autor.setNombre("Gabriel");
        Autor.setApellido("Rolon");
        Autor.setDireccion("av buenos aires por mas alla");
        Autor.setTelefono("0955466224");
        Autor.setCorreo("gabrielro@correo.com");

        assertAll("Validar datos del Autor - Setter",
                () -> assertEquals(2, Autor.getIdAutor()),
                () -> assertEquals("Pepe",Autor.getNombre()),
                () -> assertEquals("luz",Autor.getApellido()),
                () -> assertEquals("Quito y el teleferico",Autor.getDireccion()),
                () -> assertEquals("0987458523",Autor.getTelefono()),
                () -> assertEquals("pepeluz@correo.com",Autor.getCorreo())
        );
    }

    @Test
    public void testAutorToString() {
        String str = Autor.toString();
        assertAll("validar datos del Autor - string",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Gabriel")),
                () -> assertTrue(str.contains("Rolon")),
                () -> assertTrue(str.contains("av buenos aires por mas alla")),
                () -> assertTrue(str.contains("0955466224")),
                () -> assertTrue(str.contains("gabrielro@correo.com"))
        );
    }
}



}
