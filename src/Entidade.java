import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Entidade {
    private String nif;
    private String name;
    private Map<LocalDate, Fatura> faturas;

    public String getNif(){
        return this.nif;
    }

    public Map<Atividade , List<Fatura>> porAtividade(){
        return this.faturas.values().stream().map(Fatura::clone).collect(Collectors.groupingBy(Fatura::getAtividade));
    }
}
