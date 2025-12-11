public class Main {
    public static void main(String[] args) {
        Librairie lib = new Librairie();

        Livre l1 = new Livre("L1", "Java POO", 120, "Martin", 350);
        Livre l2 = new Livre("L2", "Python Guide", 95, "Durand", 250);

        Magazine m1 = new Magazine("M1", "Science Today", 30, 12, 2024);

        lib.ajouter(l1);
        lib.ajouter(l2);
        lib.ajouter(m1);

        System.out.println("=== Affichage ===");
        lib.afficher();

        System.out.println("\n=== Recherche ===");
        try {
            System.out.println(lib.rechercher("L1"));
            lib.rechercher("XX"); // يفشل عمداً
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        System.out.println("\n=== Suppression ===");
        try {
            lib.supprimer("L2");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        lib.afficher();

        System.out.println("\nTotal TTC = " + lib.totalPrixTTC());
    }
}
