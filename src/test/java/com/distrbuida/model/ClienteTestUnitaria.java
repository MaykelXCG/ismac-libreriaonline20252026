package com.distrbuida.model;

import com.distribuida.model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestUnitaria {

    // clase test

    private Cliente cliente ;
    @BeforeEach
    public void setup(){

        cliente = new Cliente(1,"17554326589","Juan",
                "Garcia","av por ahi nomas","095862671",
                "toystory@correo.com");
        
    }
 @Test
  public void testClienteConstructor(){
        assertAll("validar datos del cliente - constructor ",
                () -> assertEquals(1,cliente.getIdCliente()),
                () -> assertEquals("17554326589", cliente.getCedula()),
                () -> assertEquals("Juan",cliente.getNombre()),
                () -> assertEquals("Garcia", cliente.getApellido()),
                () -> assertEquals("av por ahi nomas", cliente.getDireccion()),
                () -> assertEquals("095862671", cliente.getTelefono()),
                () -> assertEquals("toystory@correo.com", cliente.getCorreo())
                );
  }
   @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("175563394");
        cliente.setNombre("Juan2");
        cliente.setApellido("Taipe2");
        cliente.setDireccion("Direccion por las calles");
        cliente.setTelefono("095486271");
        cliente.setCorreo("jtaipe2@correo.com");

        assertAll("Validar datos del cliente - Setter",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("175563394",cliente.getCedula()),
                () -> assertEquals("Juan2",cliente.getNombre()),
                () -> assertEquals("Taipe2",cliente.getApellido()),
                () -> assertEquals("Direccion por las calles",cliente.getDireccion()),
                () -> assertEquals("095486271",cliente.getTelefono()),
                () -> assertEquals("jtaipe2@correo.com",cliente.getCorreo())
                );
   }

   @Test
    public void testClienteToString() {
       String str = cliente.toString();
       assertAll("validar datos del cliente - string",
               () -> assertTrue(str.contains("1")),
               () -> assertTrue(str.contains("17554326589")),
               () -> assertTrue(str.contains("Juan")),
               () -> assertTrue(str.contains("Garcia")),
               () -> assertTrue(str.contains("av por ahi nomas")),
               () -> assertTrue(str.contains("095862671")),
               () -> assertTrue(str.contains("toystory@correo.com"))
              );
       }
   }




