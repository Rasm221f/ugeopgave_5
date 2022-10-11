package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room myRoom = new Room(1, 3, 1);
        Room livingRoom = new Room(4, 14,3);
        Room bathRoom = new Room (1, 8, 8);

        Building building = new Building(2, 6, false);
        building.addRoom(myRoom);
        building.addRoom(livingRoom);
        building.addRoom(bathRoom);
        countLampsInBuilding(building);
        System.out.println(building.getRooms().size());
        isNormal(building);

    }
   public static int countLampsInBuilding(Building building){
        int sum = 0;
       for (Room room: building.getRooms())
       {
           sum += room.getNumberOfLamps();
       }
       return sum;
   }
   public static boolean isNormal(Building building){
        if(building.getNumberOfFloors() > building.getRooms().size())
        {
            System.out.println("This is a normal building");
            return true;
        }
       else {
            System.out.println("This is an odd building");
            return false;
        }

   }


}
