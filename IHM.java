import clavier.In;

    public class IHM {
        public static void main(String[] args) {
            int choix = 0;
            String message = null;

            System.out.println("Entrer votre choix");
            choix = In.readInteger();
            switch (choix) {
                case 1:
                    message = new String("Menu 1");
                    break;
                case 2:
                    message = new String("Menu 2");
                    break;
                case 3:
                    message = new String("Menu 3");
                    break;
                case 4:
                    message = new String("Menu 4");
                    break;
                case 5:
                    message = new String("Menu 5");
                    break;
            }
            if(message != null) {
                System.out.println("Le choix du menu est : " + message);
            } else {
                System.out.println("Mauvaise saisie");
            }

        }
    }

}
