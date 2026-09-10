public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    public Libro (String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
    public void mostrarInfo(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("autor: "+ autor);
        System.out.println("Disponible: "+ disponible);
    }
    public void prestar(){
        if (disponible == true){
            disponible = false;
            System.out.println("el libro ha sido prestado");
        }else{
            System.out.println("el libro ya ha sido prestado");
        }
    }
    public void devolver(){
        disponible = true;
        System.out.println("su libro ha sido devuelto");
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
