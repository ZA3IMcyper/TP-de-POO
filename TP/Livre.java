public class Livre extends Produit {
    private String auteur;
    private int pages;

    public Livre(String code, String titre, double prix, String auteur, int pages) {
        super(code, titre, prix);
        this.auteur = auteur;
        this.pages = pages;
    }

    @Override
    public String getType() {
        return "Livre";
    }

    @Override
    public String toString() {
        return super.toString() + " | Auteur=" + auteur + " | Pages=" + pages;
    }
}
