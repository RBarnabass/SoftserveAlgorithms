package main;

public class Menu {

    private final Algorithm[] values = Algorithm.values();
    private String list;

    public void showAlgorithmList() {

        System.out.println("Choose your algorithm please:");
        System.out.println();

        if (list == null) {
            list = getList();
        }

        System.out.println(list);
        System.out.println(" 0 - " + values[0]);
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

    private String getList() {

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < values.length; i++) {
            builder.append(" ").append(i).append(" - ").append(values[i].name().replaceAll("_", " ")).append("\n");
        }

        return builder.toString();
    }
}
