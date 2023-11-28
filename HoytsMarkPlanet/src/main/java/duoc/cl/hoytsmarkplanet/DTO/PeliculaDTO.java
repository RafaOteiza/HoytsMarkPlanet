package duoc.cl.hoytsmarkplanet.DTO;

/**
 *
 * @AntoniaPacheco / RafaelOteiza
 */

public class PeliculaDTO {
    private String titulo;
    private String director;
    private int año;
    private int duracion;
    private String genero;
    

    public PeliculaDTO(String titulo, String director, int año, int duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}