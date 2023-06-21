public class Ingresso {
    private String evento;
    private Double valor;
    private int qtdemax;
    private String tipoIngresso;

    public Ingresso(String evento, Double valor, int qtdemax, String tipoIngresso) {
        this.evento = evento;
        this.valor = valor;
        this.qtdemax = qtdemax;
        this.tipoIngresso = tipoIngresso;
    }

    public Ingresso(String vip) {
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQtdemax() {
        return qtdemax;
    }

    public void setQtdemax(int qtdemax) {
        this.qtdemax = qtdemax;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public String getTipo() {
        return null;
    }
}
