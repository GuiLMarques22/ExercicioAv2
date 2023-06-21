import java.util.ArrayList;

public class VendaSite {
    private ArrayList<Ingresso> ingressoEvento;
    private int qtdemax;

    public VendaSite(int i) {
        this.ingressoEvento = new ArrayList<Ingresso>();

    }
    public void insereVenda(Ingresso ingresso) {
        ingressoEvento.add(ingresso);
    }
    public int getQtdemax() {
        return qtdemax;
    }
    public void setQtdemax(int qtdemax) {
        this.qtdemax = qtdemax;
    }
    public boolean validaQtdeIngresso() {
        return ingressoEvento.size() < qtdemax;
    }

    public void cadastrarIngresso(Ingresso ingresso1) {
    }
}