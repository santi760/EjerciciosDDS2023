package tendenciasMusicales;

import lombok.Getter;
import lombok.Setter;

public class Album {
    @Setter @Getter private String nombre;
    @Setter @Getter private Integer anio;
    @Setter @Getter private Artista artista;
}
