package Ejer2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public interface IRevista {
    Revista encontrarId(int id);

    List<Revista> encontrarTodo() throws IOException, ClassNotFoundException;

    void guardar(Revista revista) throws IOException;

    void actualizar(Revista revista) throws IOException;

    void borrar(Revista revista) throws IOException;

}
