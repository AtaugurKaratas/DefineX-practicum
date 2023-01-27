import Model.House;
import Model.RoomAndLivingRoom;
import Service.HouseService;
import Util.HouseList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseService houseService = new HouseService();
        HouseList houseListUtil = new HouseList();

        //List of all flats
        List<House> flatList = houseListUtil.allFlatList();
        //List of all villas
        List<House> villaList = houseListUtil.allVillaList();
        //List of all summer houses
        List<House> summerHouseList = houseListUtil.allSummerHouseList();
        //List of all houses
        List<House> houseList = houseListUtil.allHouseList();

        //Outputs about house prices
        System.out.println("Flats Total Price: $" + houseService.totalHousePrice(flatList));
        System.out.println("Villas Total Price: $" + houseService.totalHousePrice(villaList));
        System.out.println("Summerhouses Total Price: $" + houseService.totalHousePrice(summerHouseList));
        System.out.println("All Houses Total Price: $" + houseService.totalHousePrice(houseList));

        //Outputs about house sizes
        System.out.printf("Flats Average Size: %.2f %s\n", houseService.averageHouseSize(flatList), "m²");
        System.out.printf("Villas Average Size: %.2f %s\n", houseService.averageHouseSize(villaList), "m²");
        System.out.printf("Summerhouses Average Size: %.2f %s\n", houseService.averageHouseSize(summerHouseList), "m²");
        System.out.printf("All Houses Average Size: %.2f %s\n", houseService.averageHouseSize(houseList), "m²");

        //Filters the number of rooms and living rooms
        List<RoomAndLivingRoom> list = houseService.houseRoomAndLivingRoom(houseList);
        list.forEach((x) -> System.out.printf("HouseType: %s, Room: %s, Living Room: %s\n", x.getHouseType(), x.getRoom(), x.getLivingRoom()));
    }
}