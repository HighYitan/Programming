package ACT11_5;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Map;
/**
 *
 * @author srhig
 */
public class Persona extends ValidadorDispositius{
    private String nom;
    public Persona(Map<TipusPatro, String> patrons, String nom){
        super(patrons);
        this.nom = nom;
    }
    /*public Persona(String nom) {
        super(new ArrayList<>(Arrays.asList(null, null, null, null)));
        this.nom = nom;
    }*/
    @Override
    public boolean validaPatrons(Object o) {
        /*Telefon telefon = null;
        if(o instanceof Android){
            telefon = (Android) o;
        }
        if(o instanceof IPhone8){
            telefon = (IPhone8) o;
        }
        if(o instanceof IPhone10){
            telefon = (IPhone10) o;
        }*/
        Telefon telefon = (Telefon) o;
        if(telefon.getOnOff()){
            for(Map.Entry<TipusPatro, String> entryPersona : this.getPatrons().entrySet()){
                TipusPatro patroClauPersona = entryPersona.getKey();
                String patroValorPersona = entryPersona.getValue();
                for(Map.Entry<TipusPatro, String> entryTelefon : telefon.getPatrons().entrySet()){
                    TipusPatro patroClauTelefon = entryTelefon.getKey();
                    String patroValorTelefon = entryTelefon.getValue();
                    if(patroClauPersona == patroClauTelefon){
                        return patroValorPersona.equals(patroValorTelefon);
                    }
                }
            }
            return false;
            /*if(this.getPatroCodiPin() != null){
                return this.getPatroCodiPin().equals(telefon.getPatroCodiPin());
            }
            if(this.getPatroTeclat() != null){
                return this.getPatroTeclat().equals(telefon.getPatroTeclat());
            }
            if(this.getPatroEmpremta() != null){
                return this.getPatroEmpremta().equals(telefon.getPatroEmpremta());
            }
            if(this.getPatroRostre() != null){
                return this.getPatroRostre().equals(telefon.getPatroRostre());
            }
            return false;*/ 
        }
        else {
            System.out.println("Telèfon no encès");
            return false;
        }
    }
    /*@Override
    public void setPatrons(String patroCodiPin, String patroTeclat, String patroEmpremta, String patroRostre) {
        super.setPatroCodiPin(patroCodiPin);
        super.setPatroTeclat(patroTeclat);
        super.setPatroEmpremta(patroEmpremta);
        super.setPatroRostre(patroRostre);        
    }*/
    public String getNom(){
        return nom;
    }
    /*public void setNom(String nom) {
        this.nom = nom;
    }*/
}