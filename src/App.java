import java.util.Scanner;

public class App {

    //Scénario de test
    public static void test (){
        Aspirateur aspi = new Aspirateur(5, 5, 0,10,10);
        aspi.Rotation("D"); //D
        aspi.Avance();          //A
        System.out.println(aspi.getStatut());
        aspi.Rotation("D"); //D
        aspi.Avance();          //A
        System.out.println(aspi.getStatut());
        aspi.Rotation("D"); //D
        aspi.Avance();          //A
        System.out.println(aspi.getStatut());
        aspi.Rotation("D"); //D
        aspi.Avance();          //A
        aspi.Avance();          //A
        System.out.println(aspi.getStatut());
    }
    public static void main(String[] args) throws Exception {

        //Démarche avec choix d'un utilisateur lambda
        /*String choix = "D";
        int orient;
        String choixOrient;
        int tailleX;
        int tailleY;
        int px;
        int py;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez la taille de la grille x:");
        tailleX = sc.nextInt();
        System.out.println("Choisissez la taille de la grille y:");
        tailleY = sc.nextInt();
        System.out.println("Choisissez la position x de l'aspirateur:");
        px = sc.nextInt();
        System.out.println("Choisissez la position y de l'aspirateur:");
        py = sc.nextInt();
        System.out.println("Quelle orientation souhaitez vous:");
        choixOrient = sc.nextLine();

        switch (choixOrient){

            case "N":
            orient = 0;
            break;

            case "E":
            orient = 1;
            break;

            case "S":
            orient = 2;
            break;

            case "O":
            orient = 3;
            break;

            //On définit une position par defaut
            default:
            orient = 0;
        }
        Aspirateur aspi = new Aspirateur(px,py,orient);
        System.out.println("Vous pouvez manipuler l'aspirateur");
        while (choix.equals("D") || choix.equals("G") || choix.equals("A")){
            System.out.println("Quelle action voulez vous faire (D,G,A ou F):");
            choix = sc.nextLine();
            if (choix.equals("A")){
                aspi.Avance();
            }

            else if (choix.equals("D") || choix.equals("G")){
                aspi.Rotation(choix);
        }
    }

        /sc.close();

        if (choix.equals("F")){
        aspi.getStatut();
        }*/

        //Appel à la fonction qui génère le test
        test();
}
}