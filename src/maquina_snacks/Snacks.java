package maquina_snacks;

import java.util.List;
import java.util.ArrayList;

public class Snacks {
    private static final List<Snack> snacks;

    //Bloque statico inicializador (Sirve para inicializar atributos estaticos)
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));

    }
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }
    public static void mostrarSnack(){
        var inventarioSnacks = "";
        for(var snack : snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }
    public static List<Snack> getSnacks(){
        return snacks;
    }

}
