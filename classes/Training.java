package classes;

public class Training {
    private int[] numberList;

    public void setNumberList(int[] numberList) {
        this.numberList = numberList;
    }

    public int[] getNumberList() {
        return numberList;
    }

    public void getValuesFromList() {
        for (int x = 0; x < numberList.length; x++) {
            System.out.println(x);
        }
    }

}