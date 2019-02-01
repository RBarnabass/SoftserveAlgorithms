package main;

public class Menu {

    private final Algorithm[] values = Algorithm.values();

    // todo: only used
    public void showAlgorithmList() {

        System.out.println("Choose your algorithm please:");
        System.out.println();

        for (int i = 1; i < values.length; i++) {
            System.out.println(" " + i + " - " + values[i].name().replaceAll("_", " "));
        }

        System.out.println(" 0 - " + values[0]);
    }

    public void showMainMenu() {

        System.out.println(" 1 - Choose algorithm");
        System.out.println(" 2 - Lock algorithm");
        System.out.println(" 3 - Unlock algorithm");
        System.out.println(" 0 - Exit");
    }

    public void hello() {

        String hi = "WELCOME";
        char[] chars = hi.toCharArray();

        for (char aChar : chars) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(aChar + " ");
        }

        System.out.println();
    }

    public void tryAgain() {

        System.out.println("Do you like to try again?");
        System.out.println("Y/N");
    }
}
