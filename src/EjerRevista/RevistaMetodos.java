package EjerRevista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RevistaMetodos implements IRevista {

    public List<Revista> revistaList;

    public RevistaMetodos() {
        this.revistaList = new ArrayList<>();
    }


    @Override
    public Revista encontrarId(int id) {
        return revistaList.stream()
                .filter(revista -> revista.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Revista> encontrarTodo() throws IOException, ClassNotFoundException {
        ObjectSerializer.readObjectFromFile("revista.ax");

        return revistaList;

    }

    @Override
    public void guardar(Revista revista) throws IOException {
        this.revistaList.add(revista);
        ObjectSerializer.writeObjectToFile(this.revistaList,"revista.ax");
    }

    @Override
    public void actualizar(Revista revista) throws IOException {
        Revista datosViejos = encontrarId(revista.getId());
        if (datosViejos != null){
            revistaList.remove(datosViejos);
            revistaList.add(revista);
            ObjectSerializer.writeObjectToFile(this.revistaList,"revista.ax");

        }
    }

    @Override
    public void borrar(Revista revista) throws IOException {
        revistaList.remove(revista);
        ObjectSerializer.writeObjectToFile(this.revistaList,"revista.ax");

    }
}
