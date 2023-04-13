package tendenciasMusicales.popularidades;

import tendenciasMusicales.Cancion;

public class Normal extends Popularidad {
    private static int cantReproduccionesMaximas = 1000;
    private Integer cantReproduccionesIniciales;

    private int cantReproducciones;

    public Normal(){
        this.cantReproducciones = 0;
    }

    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if (this.cantReproducciones > cantReproduccionesMaximas) {
            cancion.setPopularidad(new EnAuge());

        }
    }

    private Boolean superaReproducciones(Cancion cancion) {
        return this.cantReproduccionesEnEstaPopularidad(cancion) > cantReproduccionesMaximas;
    }

    private Integer cantReproduccionesEnEstaPopularidad(Cancion cancion) {
        return cancion.getCantReproducciones() - this.cantReproduccionesIniciales;
    }

    @Override
    protected String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return armarLeyendaPara(cancion);
    }

    public static String armarLeyendaPara(Cancion cancion) {
        return String.format("%s - %s - %s", cancion.getArtista().getNombre(), cancion.getAlbum().getNombre(), cancion.getNombre());
    }
}
