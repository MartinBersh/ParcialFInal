package EjerRevista;

import java.io.IOException;
import java.util.List;

abstract class ARevista implements IRevista{


    public Revista encontrarId(int id){

        return null;
    };


    public List<Revista> encontrarTodo() throws IOException, ClassNotFoundException{

        return null;
    };

    public void guardar(Revista revista) throws IOException {

    }

    public void actualizar(Revista revista) throws IOException{

    };

    public void borrar(Revista revista) throws IOException{

    };



}
