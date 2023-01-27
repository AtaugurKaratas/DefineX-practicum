package Service;

import Model.House;
import Model.RoomAndLivingRoom;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    public int totalHousePrice(List<House> houseList) {
        int total = 0;
        for (House house : houseList) {
            total += house.getPrice();
        }
        return total;
    }

    public float averageHouseSize(List<House> houseList) {
        float totalSize = 0;
        for (House house : houseList) {
            totalSize += house.getSize();
        }
        return (totalSize / houseList.size());
    }

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
