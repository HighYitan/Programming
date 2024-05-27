package ACT12_7;

/**
 *
 * @author srhig
 */
public class MissatgeError {
    private TipusError tipusError;
    private String codiError, descripcio;
    public MissatgeError(TipusError tipusError, String codiError, String descripcio){
        this.tipusError = tipusError;
        this.codiError = codiError;
        this.descripcio = descripcio;
    }
    public TipusError getTipusError() {
        return tipusError;
    }

    public String getCodiError() {
        return codiError;
    }

    public String getDescripcio() {
        return descripcio;
    }

    @Override
    public String toString() {
        return "MissatgeError{" + "tipusError=" + tipusError + ", codiError=" + codiError + ", descripcio=" + descripcio + '}';
    }
}