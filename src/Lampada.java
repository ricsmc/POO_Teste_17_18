import java.time.LocalDateTime;

public class Lampada {
    private String id;
    private LocalDateTime inicio;
    private LocalDateTime parcial;
    private double consumoLigada;
    private double consumoEco;
    private double consumoParcial;
    private int estado;

    public Lampada(String id, LocalDateTime inicio, LocalDateTime parcial, double consumoLigada, double consumoEco, double consumoParcial, int estado) {
        this.id = id;
        this.inicio = inicio;
        this.parcial = parcial;
        this.consumoLigada = consumoLigada;
        this.consumoEco = consumoEco;
        this.consumoParcial = consumoParcial;
        this.estado = estado;
    }

    public void lampadaON(){
        this.estado = 1;
    }

    public void lampadaECO(){
        this.estado = 2;
    }

    public void lampadaOFF(){
        this.estado = 0;
    }

    public double totalConsumo(){
        return 0;
    }

    public double periodoConsumo(){
        return 0;
    }

    public void efetuarResetConsumo(){
    }

    public int getEstado(){
        return this.estado;
    }

    public String getId(){
        return this.id;
    }


}
