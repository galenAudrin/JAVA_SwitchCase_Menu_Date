import clavier.In;

public class IHM {
    public static void main(String[] args) {
        int choix = 0;
        String sJour = new String("rien"); // initialisation de la variable de recuperation de la date pour l'ecriture
        String sMois = new String("rien"); // initialisation de la variable de recuperation de la date pour l'ecriture
        int nbJour = 0; // initialisation de la variable nombre de jour
        int jour = 0; // initialisation de la variable jour
        int mois = 0; // initialisation de la variable mois
        int date = 0;
        int annee = 0;
        int bisexctille = 0;

        System.out.println("bonjour, plusieurs menu vous sont proposé :\n" +
                "1  :  affichage du jour de la semaine\n" +
                "2  :  affichage du mois\n" +
                "3  :  affichage du nombre de jour de jour en fonction du mois\n" +
                "4  :  affichage de la date du jour ( jour XX mois XXXX )");
        choix = In.readInteger();


        switch (choix) {
            case 1:
                //_____________________________Récuperation de la valeur du jour______________________________
                System.out.println("Bonjour, Veuillez selectionner un jour\n" +
                        "1 : lundi\n" +
                        "2 : mardi\n" +
                        "3 : mercredi\n" +
                        "4 : jeudi\n" +
                        "5 : vendredi\n" +
                        "6 : samedi\n" +
                        "7 : dimanche");

                jour = In.readInteger();
                //_________________Affectation du jour _____________________
                switch (jour) {
                    case 1:
                        sJour = new String("lundi");
                        break;
                    case 2:
                        sJour = new String("mardi");
                        break;
                    case 3:
                        sJour = new String("mercredi");
                        break;
                    case 4:
                        sJour = new String("jeudi");
                        break;
                    case 5:
                        sJour = new String("vendredi");
                        break;
                    case 6:
                        sJour = new String("samedi");
                        break;
                    case 7:
                        sJour = new String("dimanche");
                        break;
                }
                //_________________Affichage du jour_____________
                System.out.println("le jour est " + sJour);
                break;
            case 2:
                //____________récupération de la valeur du mois_____________________
                System.out.println("Bonjour, Veuillez selectionner un mois\n" +
                        "1  : janvier                7  : juillet\n" +
                        "2  : fevrier                8  : aout\n" +
                        "3  : mars                   9  : septembre\n" +
                        "4  : avril                  10 : octobre\n" +
                        "5  : mai                    11 : novembre\n" +
                        "6  : juin                   12 : decembre\n");

                mois = In.readInteger();
                //______________affectation du mois en fonction de sa valeur___________________
                switch (mois) {
                    case 1:
                        sMois = new String("janvier");
                        break;
                    case 2:
                        sMois = new String("fevrier");
                        break;
                    case 3:
                        sMois = new String("mars");
                        break;
                    case 4:
                        sMois = new String("avril");
                        break;
                    case 5:
                        sMois = new String("mai");
                        break;
                    case 6:
                        sMois = new String("juin");
                        break;
                    case 7:
                        sMois = new String("juillet");
                        break;
                    case 8:
                        sMois = new String("aout");
                        break;
                    case 9:
                        sMois = new String("septembre");
                        break;
                    case 10:
                        sMois = new String("octobre");
                        break;
                    case 11:
                        sMois = new String("novembre");
                        break;
                    case 12:
                        sMois = new String("decembre");
                        break;
                }
                //_____________affichage du mois_________________
                System.out.println("Le mois est " + sMois);

                break;
            case 3:
                //____________récupération de la valeur du mois_____________________
                System.out.println("Bonjour, Veuillez selectionner un mois\n" +
                        "1  : janvier                7  : juillet\n" +
                        "2  : fevrier                8  : aout\n" +
                        "3  : mars                   9  : septembre\n" +
                        "4  : avril                  10 : octobre\n" +
                        "5  : mai                    11 : novembre\n" +
                        "6  : juin                   12 : decembre\n");

                mois = In.readInteger();
                //___________________Affectatiion du nombre de jours____________________________
                switch (mois) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        nbJour = 31;
                        break;
                    case 4, 6, 9, 11:
                        nbJour = 30;
                        break;
                    case 2:
                        System.out.println("de quelle année parlez vous ?");
                        annee = In.readInteger() ;
                        if (((annee % 4 == 0) && (annee % 100 != 0) || (annee % 400 == 0))) {
                            nbJour = 29;
                        } else {
                            nbJour = 28;
                        }
                        break;
                }
                //______________affectation du mois en fonction de sa valeur___________________
                switch (mois) {
                    case 1:
                        sMois = new String("janvier");
                        break;
                    case 2:
                        sMois = new String("fevrier");
                        break;
                    case 3:
                        sMois = new String("mars");
                        break;
                    case 4:
                        sMois = new String("avril");
                        break;
                    case 5:
                        sMois = new String("mai");
                        break;
                    case 6:
                        sMois = new String("juin");
                        break;
                    case 7:
                        sMois = new String("juillet");
                        break;
                    case 8:
                        sMois = new String("aout");
                        break;
                    case 9:
                        sMois = new String("septembre");
                        break;
                    case 10:
                        sMois = new String("octobre");
                        break;
                    case 11:
                        sMois = new String("novembre");
                        break;
                    case 12:
                        sMois = new String("decembre");
                        break;
                }
                //_____________affichage du mois_________________
                System.out.println("il y a " + nbJour + " jours dans le mois de " + sMois);

                break;
               case 4:
                   //____________récupération de la valeur du mois_____________________
                   System.out.println("Bonjour, Veuillez selectionner un mois\n" +
                           "1  : janvier                7  : juillet\n" +
                           "2  : fevrier                8  : aout\n" +
                           "3  : mars                   9  : septembre\n" +
                           "4  : avril                  10 : octobre\n" +
                           "5  : mai                    11 : novembre\n" +
                           "6  : juin                   12 : decembre\n");

                   mois = In.readInteger();
                   //_______________________Demande et affectation de la date____________________________
                   System.out.println("entrez la date ( entre 1 et 30 ou 31 suivant votre mois");
                   date = In.readInteger();

                   //_____________________________Récuperation de la valeur du jour______________________________
                   System.out.println("Bonjour, Veuillez selectionner un jour\n" +
                           "1 : lundi\n" +
                           "2 : mardi\n" +
                           "3 : mercredi\n" +
                           "4 : jeudi\n" +
                           "5 : vendredi\n" +
                           "6 : samedi\n" +
                           "7 : dimanche");
                   jour = In.readInteger();
                   //______________________Demande et affectation de l'année________________
                   System.out.println("entrez l'année ");
                   annee = In.readInteger();
                   //_________________Affectation du jour _____________________
                   switch (jour) {
                       case 1:
                           sJour = new String("lundi");
                           break;
                       case 2:
                           sJour = new String("mardi");
                           break;
                       case 3:
                           sJour = new String("mercredi");
                           break;
                       case 4:
                           sJour = new String("jeudi");
                           break;
                       case 5:
                           sJour = new String("vendredi");
                           break;
                       case 6:
                           sJour = new String("samedi");
                           break;
                       case 7:
                           sJour = new String("dimanche");
                           break;
                   }
                   //______________affectation du mois en fonction de sa valeur___________________
                   switch (mois) {
                       case 1:
                           sMois = new String("janvier");
                           break;
                       case 2:
                           sMois = new String("fevrier");
                           break;
                       case 3:
                           sMois = new String("mars");
                           break;
                       case 4:
                           sMois = new String("avril");
                           break;
                       case 5:
                           sMois = new String("mai");
                           break;
                       case 6:
                           sMois = new String("juin");
                           break;
                       case 7:
                           sMois = new String("juillet");
                           break;
                       case 8:
                           sMois = new String("aout");
                           break;
                       case 9:
                           sMois = new String("septembre");
                           break;
                       case 10:
                           sMois = new String("octobre");
                           break;
                       case 11:
                           sMois = new String("novembre");
                           break;
                       case 12:
                           sMois = new String("decembre");
                           break;
                   }
                   System.out.println(sJour + " " + date + " " + sMois + " " + annee );
                    break;

                case 5:

                    break;
        }


    }
}



