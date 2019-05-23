import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CasaInteligente{
    private Map<Lampada, String> lampadas;

    public int qtEmEco(){
        int x = 0;
        for (Lampada i : this.lampadas.keySet()){
            if(i.getEstado() == 2) x++;
        }
        return x;
    }

    public void removeLampada(String id){
        this.lampadas.remove(id);
    }

    public double consumoTotal(){
        return this.lampadas.keySet().stream().mapToDouble(x->x.totalConsumo()).sum();
    }

    public Set<String> topConsumo(int x){
        Set<String> st = new TreeSet<>(new LampadaComparator());
        for (String i : this.lampadas.values()){
            st.add(i);
        }
        st.sort
    }

}
