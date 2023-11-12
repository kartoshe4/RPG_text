public class Player {
    private String name; // Имя игрока
    private Unit[] units = new Unit[3]; // Герои игрока
    private byte countUnits = 0; // Номер героя

    public Unit getUnit(int index) {
        return units[index];
    }

    public Player(String name) {
        this.name = name;
    } // seter name
    public void setNew_unit(char unitType, String characterName) {
        if (countUnits<3)
            units[countUnits++] = new Unit(characterName, unitType);
    } // Задаём нового героя
}
