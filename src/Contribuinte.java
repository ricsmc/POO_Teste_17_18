import java.util.ArrayList;
import java.util.List;

public class Contribuinte extends Entidade {
    private List<Contribuinte> dependentes;

    public List<Contribuinte> getDependentes(){
        List<Contribuinte> paraRet = new ArrayList<>();
        for(Contribuinte c : this.dependentes){
            paraRet.add(c);
        }
        return paraRet;
    }

}
