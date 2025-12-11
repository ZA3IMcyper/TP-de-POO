public class Magazine extends Produit {
    private int mois;
    private int numero;

    public Magazine(String code, String titre, double prix, int mois, int numero) {
        super(code, titre, prix);
        this.mois = mois;
        this.numero = numero;
    }

    @Override
    public String getType() {
        return "Magazine";
    }

    @Override
    public String toString() {
        return super.toString() + " | Mois=" + mois + " | Numéro=" + numero;
    }
}
