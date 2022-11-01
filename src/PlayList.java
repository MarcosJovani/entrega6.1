import java.util.ArrayList;
import java.util.List;

public class PlayList implements Composite{

    List<Composite> hijos;
    String nombre;
    String lista;

    public PlayList (String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public void play() {
        System.out.println(lista);
        hijos.forEach(Composite::play);
    }

    public void clasificar (String lista) {
        this.lista = lista;
    }

    public void add(Composite comp) {
        hijos.add(comp);
        comp.clasificar("-----" + nombre + "-----");
    }

    public void remove(Composite comp) {
        hijos.remove(comp);
    }
}
