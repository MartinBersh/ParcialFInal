package EjerRevista;

import java.io.IOException;
import java.util.List;

public interface IRevista {
    Revista encontrarId(int id);

    List<Revista> encontrarTodo() throws IOException, ClassNotFoundException;

    void guardar(Revista revista) throws IOException;

    void actualizar(Revista revista) throws IOException;

    void borrar(Revista revista) throws IOException;

}
