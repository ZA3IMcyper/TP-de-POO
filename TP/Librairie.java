import java.util.ArrayList;

public class Librairie {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void ajouter(Produit p) {
        produits.add(p);
    }

    public void supprimer(String code) throws ProduitIntrouvableException {
        Produit p = rechercher(code);
        produits.remove(p);
    }

    public Produit rechercher(String code) throws ProduitIntrouvableException {
        for (Produit p : produits) {
            if (p.getCode().equals(code)) {
                return p;
            }
        }
        throw new ProduitIntrouvableException("Produit avec code " + code + " introuvable !");
    }

    public void afficher() {
        for (Produit p : produits) {
            System.out.println(p);
        }
    }

    public double totalPrixTTC() {
        double total = 0;
        for (Produit p : produits)
            total += p.getPrixTTC();
        return total;
    }
}
