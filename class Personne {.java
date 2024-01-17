class Personne {

    String prenom;
    String nom;
    private int age;
    static int nbPersonnes = 0;
    public Personne(String p, String n, int a){

         prenom = p;
         nom = n;
         age = a;
         nbPersonnes++;
    }


    public static void anniversaire(Personne p) {

        p.age++;//ajouter 1 a l'age de personne\\
    }

    public void affichePersonne1(){

            System.out.println(prenom+" "+nom+" a "+age+" ans");
    }
}

  