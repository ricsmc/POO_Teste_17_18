import java.time.LocalDate;

public class Fatura implements Comparable<Fatura>{
    private String numero;
    private LocalDate data;
    private double valor;
    private Atividade atividade;

    public double getValor(){
        return this.valor;
    }

    public Fatura(Fatura fatura) {
        this.numero = fatura.getNumero();
        this.data = fatura.getData();
        this.valor = fatura.getValor();
        this.atividade = fatura.getAtividade();
    }

    public String getNumero() {
        return this.numero;
    }

    public Atividade getAtividade(){
        return this.atividade;
    }

    public LocalDate getData(){
        return this.data;
    }

    public int compareTo(Fatura f){
        return this.data.compareTo(f.getData());
    }

    public Fatura clone(){
        return new Fatura(this);
    }

}
