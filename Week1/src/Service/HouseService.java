package Service;

import Model.House;
import Model.RoomAndLivingRoom;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    //returns the total price of all types of houses and all houses
    public int totalHousePrice(List<House> houseList) {
        int total = 0;
        for (House house : houseList) {
            total += house.getPrice();
        }
        return total;
    }
    //returns the average size of all types of houses and all houses
    public float averageHouseSize(List<House> houseList) {
        float totalSize = 0;
        for (House house : houseList) {
            totalSize += house.getSize();
        }
        return (totalSize / houseList.size());
    }
    //method that filters the number of rooms and living rooms
    public List<RoomAndLivingRoom> houseRoomAndLivingRoom(List<House> houseList) {
        List<RoomAndLivingRoom> list = new ArrayList<>();
        RoomAndLivingRoom roomAndLivingRoom;
        for (House house : houseList) {
            roomAndLivingRoom = new RoomAndLivingRoom(house.getClass().getSimpleName(), house.getRoom(), house.getLivingRoom());
            list.add(roomAndLivingRoom);
        }
        return list;
    }
}
