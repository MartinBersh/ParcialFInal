package Ejer2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String num = "1";
        IRevista loc = new RevistaMetodos();
        while (num != "6"){
            Scanner s = new Scanner(System.in);
            System.out.println("\" Menú \n 1. Añadir  \n 2. Mostrar todo \n 3. Editar" +
                    "                    \n 4. Borrar  \n 5. Buscar por id \n 6. Salir");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("id Revista: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre revista: ");
                    String nombreRevista = s.next();
                    System.out.println("Categría de revista: ");
                    String categoria = s.next();
                    System.out.println("Fecha de publicación: ");
                    String horario = s.next();
                    loc.guardar(new Revista(id,nombreRevista,categoria, horario));
                    break;
                }
                case "2":{
                    List<Revista> revistaList = loc.encontrarTodo();
                    revistaList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDIT");
                    System.out.println("Id de revista: ");
                    Integer id = s.nextInt();
                    System.out.println("Nombre de su revista: ");
                    String nombreRevista = s.next();
                    System.out.println("Categoría de revista: ");
                    String categoria = s.next();
                    System.out.println("Fecha de publicación: ");
                    String horario = s.next();
                    loc.actualizar(new Revista(id,nombreRevista,categoria, horario));
                    break;
                }
                case "4":{
                    System.out.println("BORRAR");
                    System.out.println("Escriba la id de la revista que desea borrar: ");
                    Integer id = s.nextInt();
                    loc.borrar(loc.encontrarId(id));
                    break;
                }

                case "5":{
                    System.out.println("ENCONTRAR POR ID");
                    System.out.println("Ingrese la id que desea encontrar: ");
                    Integer id = s.nextInt();
                    System.out.println(loc.encontrarId(id));
                    break;
                }

                case "6":{
                    num = "6";
                    break;
                }
            }
        }
    }

}
