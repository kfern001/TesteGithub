import classes.Training;

public class Workspace {
    public static void main(String[] args) {
        int[] list = new int[10];

        for (int x = 0; x < list.length; x++) {
            list[x] = (x + 1);
        }

        Training classList = new Training();
        classList.setNumberList(list);

        for (int x : classList.getNumberList()) {
            System.out.println(x);
        }

    }
}