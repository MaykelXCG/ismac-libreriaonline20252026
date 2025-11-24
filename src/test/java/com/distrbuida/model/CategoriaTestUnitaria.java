import com.distribuida.model.Categoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTestUnitaria {

    private  Categoria Categoria;
    @BeforeEach
    public void setup(){

        Categoria = new Categoria(1,"psicologia","Conocer la mente humana");

    }
    @Test
    public void testCategoriaConstructor(){
        Categoria Descripcion;
        assertAll("validar datos de Categoria - constructor ",
                () -> assertEquals(1,Categoria.getIdCategoria()),
                () -> assertEquals("psicologia",Categoria.getCategoria()),
                () -> assertEquals("Conocer la mente humana",Descripcion.getDescripcion())
        );

    }
    @Test
    public void testCategoriaSetters(){
        Categoria.setIdCategoria(1);
        Categoria.setCategoria("psicologia");
        Categoria.setDescripcion("Conocer la mente humana");


        Object Descripcion;
        assertAll("Validar datos de Categoria - Setter",
                () -> assertEquals(2, Categoria.getIdCategoria()),
                () -> assertEquals("Romance",Categoria.getCategoria()),
                () -> assertEquals("Un amor prohibido",Descripcion.getDescripsion())
        );
    }

    @Test
    public void testCategoriaToString() {
        String str = Categoria.toString();
        assertAll("validar datos de Categoria - string",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("psicologia")),
                () -> assertTrue(str.contains("Conocer la mente humana"))

        );
    }
}

}