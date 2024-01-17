 
    public class ProgPrincipal {
        public static void main(String[] args){
        Personne p1 = new Personne("Jean", "Durand", 25);
        Personne p2 = new Personne("Patrick", "Martin", 30);

        p1.affichePersonne1();
        p2.affichePersonne1();

        System.out.println(Personne.nbPersonnes);
        System.out.println(p1.prenom);

       p1.anniversaire();//fontion* anniversaire\\
        }
        }