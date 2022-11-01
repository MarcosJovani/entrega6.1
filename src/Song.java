public class Song implements Composite{
    private String titulo;
    private String autor;
    private String lista;

    public Song (String titulo, String autor){
        this.autor = autor;
        this.titulo = titulo;
    }

    public void clasificar (String lista) {
        this.lista = lista;
    }

    public void play() {
        System.out.println(lista);
        System.out.println("Escuchando..." + titulo + " BY " + autor);
    }
}
