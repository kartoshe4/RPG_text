public class Player {
    private String name;

    private Unit[] units = new Unit[3];

    private byte countUnits = -1;
    private char new_unit;

    public Player(String name) {
        this.name = name;
    }

    public void setNew_unit(char new_unit, String character_name) {
        this.new_unit = new_unit;
        countUnits++;
        units[countUnits].setCharacter_name(character_name);
    }
}
