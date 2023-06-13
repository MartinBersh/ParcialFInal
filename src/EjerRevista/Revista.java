package EjerRevista;

import java.io.Serializable;

public class Revista implements Serializable {

        public int id;
        private String nombreRevista;
        private String categoria;
        private String horario;

    public Revista(int id, String NombreRevista, String categoria, String horario) {
        this.id = id;
        this.nombreRevista = NombreRevista;
        this.categoria = categoria;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

        public void setId(int id) {
        this.id = id;
    }

        public String getNombreRevista() {
        return nombreRevista;
    }

        public void setNombreRevista(String NombreRevista) {
        this.nombreRevista = NombreRevista;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Revista: " + "\n"+
                "id: " + id + "\n"+
                "NombreRevista: " + nombreRevista + '\n' +
                "categoria: " + categoria + '\n' +
                "Fecha de publicación: " + horario + '\n';
    }
}

