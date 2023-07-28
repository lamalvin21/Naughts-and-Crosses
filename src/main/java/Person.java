public class Person {
    private boolean isTurn;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void changeTurn() {
        isTurn = !isTurn;
    }
}
