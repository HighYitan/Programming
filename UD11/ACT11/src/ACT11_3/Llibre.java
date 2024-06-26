package ACT11_3;

import java.util.Objects;

/**
 *
 * @author srhig
 */
public class Llibre {
    private int id;
    private String titol, autor;
    private int anyPublicacio;
    public Llibre(int id, String titol, String autor, int anyPublicacio){
        this.id = id;
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
    }
    public String getTitol(){
        return titol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Llibre other = (Llibre) obj;
        return Objects.equals(this.id, other.id);
    }
    
    @Override
    public String toString() {
        return "Llibre{" + "id=" + id + ", titol=" + titol + ", autor=" + autor + ", anyPublicacio=" + anyPublicacio + '}';
    }
}