public class Building {
    private String name;
    private int numRooms;

    public Building(String name) { this.name = name; }
    public String getName() { return name; }
    public int getNumRooms() { return numRooms; }

    public class Room {
        private String name; // shadows outer class' name field
        
        public Room(String name) {
            this.name = name;
            numRooms++;
        }

        public String getName() { return name; }
        public String getBuildingName() { return Building.this.name; }
    }

    public static void main(String[] args) {
        Building building = new Building("My Building");
        Building.Room room1 = building.new Room("New Room 1");
        Building.Room room2 = building.new Room("New Room 2");
        System.out.println("Num rooms: " + building.getNumRooms());
    }
}
