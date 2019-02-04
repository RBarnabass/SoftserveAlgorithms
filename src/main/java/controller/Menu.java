package controller;

import static controller.Controller.EXIT_CODE;

/**
 * Class holds view part of program.
 *
 * @author Roman Berezhnov
 */
class Menu {

    /**
     * Array of all enum fields.
     */
    private final Algorithm[] values = Algorithm.values();

    /**
     * The variable holds list of algorithms in appropriate way.
     */
    private String list;

    /**
     * This method shows menu.
     */
    void printMenu() {

        System.out.println("Choose your algorithm please:");

        if (list == null) {
            list = getList();
        }

        System.out.println(list);
        System.out.println(" 0 - " + values[EXIT_CODE] + "\n");
        System.out.print("Type here please: ");
    }

    /**
     * This method shows greetings.
     */
    void printWelcome() {

        String hi = "WELCOME";
        char[] chars = hi.toCharArray();

        for (char currentChar : chars) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(currentChar + " ");
        }
        System.out.println("\n");
    }

    /**
     * This method transform list of enum fields to string
     * and give it appropriate look.
     *
     * @return list with algorithms names
     */
    private String getList() {

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < values.length; i++) {

            builder.append(" ")
                    .append(i).append(" - ")
                    .append(values[i].name().replaceAll("_", " "))
                    .append("\n");
        }

        String line = builder.toString();
        return line.substring(0, line.length() - 2);
    }
}
