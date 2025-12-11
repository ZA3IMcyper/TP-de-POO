public abstract class Produit implements Vendable {
    private String code;
    private String titre;
    private double prix;

    public Produit(String code, String titre, double prix) {
        this.code = code;
        this.titre = titre;
        this.prix = prix;
    }

    public String getCode() { return code; }
    public String getTitre() { return titre; }
    public double getPrix() { return prix; }

    public void setCode(String code) { this.code = code; }
    public void setTitre(String titre) { this.titre = titre; }
    public void setPrix(double prix) { this.prix = prix; }

    @Override
    public double getPrixTTC() {
        return prix * 1.05; // السعر + 5%
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] " + titre + " | Code=" + code + " | Prix HT=" + prix;
    }
}
