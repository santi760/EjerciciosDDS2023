package tendenciasMusicales;

import lombok.Getter;
import lombok.Setter;
import tendenciasMusicales.popularidades.Normal;
import tendenciasMusicales.popularidades.Popularidad;

import java.time.LocalDateTime;

@Getter
@Setter

public class Cancion {
    private String nombre;
    private Integer cantLikes;
    private Integer cantDisLikes;
    private Integer cantReproducciones;
    private Album album;
    private Popularidad popularidad;
    private LocalDateTime ultVezEscuchada;
    private Artista artista;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.cantLikes = 0;
        this.cantDisLikes = 0;
        this.cantReproducciones = 0;
        this.popularidad = new Normal();
    }

    public String detalleCompleto() {
        return this.popularidad.detalle(this);
    }

    public void reproducir() {
        this.cantReproducciones++;
        this.popularidad.reproducir(this);
        this.ultVezEscuchada = LocalDateTime.now();
    }

    public void recibirLike() {
        this.cantLikes++;
    }

    public void recibirDislike() {
        this.cantDisLikes++;
        this.popularidad.recibirDislike();
    }

    public String serEscuchada() {
        this.reproducir();
        return this.detalleCompleto();
    }



}
