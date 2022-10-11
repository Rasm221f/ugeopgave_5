package task2;

import java.util.ArrayList;

public class Building {
    private ArrayList <Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;


    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        //this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = new ArrayList<>();
    }

    /*public ArrayList<Room> getRooms() {
        return rooms;
    }*/

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
