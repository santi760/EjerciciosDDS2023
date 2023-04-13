package tendenciasMusicales.popularidades;

import tendenciasMusicales.Cancion;

public abstract class Popularidad {//se le delega la reproduccion a popularidad porque puedo saber como moverme de popularidad


    public abstract void reproducir(Cancion cancion);

    protected abstract String icono();
    protected abstract String leyenda(Cancion cancion);

    public String detalle(Cancion cancion) {
        String titulo = this.icono();
        titulo += this.leyenda(cancion);
        return titulo;
    }

    public void recibirDislike() {

    }
}
