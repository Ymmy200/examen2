

public class Libros {
    
    public static void main(String[] args) {
        
        System.out.println("¡Bienvenido al programa de gestión de libros!");
        
       
        LibroUAC libroUAC = new LibroUAC("Introducción a la Informática", "John Smith", "Ingeniería de Sistemas", "Facultad de Ingeniería");
        libroUAC.imprimirInformacion();

        Novela novela = new Novela("Cien años de soledad", "Gabriel García Márquez", "Realista");
        novela.imprimirInformacion();
    }
}

// Clase Libro que maneja la información asociada a un libro
class Libro {
    
    private String titulo;
    private String autor;
    private String propietario;
    private double precio;

  
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

// Clase LibroTexto que extiende de Libro

class LibroTexto extends Libro {
   
    private String curso;

   
    public LibroTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    // Método para imprimir en pantalla la información del libro de texto

    public void imprimirInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Curso: " + curso);
    }
}

// Clase LibroUAC que extiende de LibroTexto

class LibroUAC extends LibroTexto {
    
    private String facultad;

    
    public LibroUAC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
    }
}


class Novela extends Libro {

    private String tipo;

   
    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    
    public void imprimirInformacion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Tipo de novela: " + tipo);
        System.out.println("Propetario:" + " Yimmy Arcos ");
    }
}
