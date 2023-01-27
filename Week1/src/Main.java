import Model.House;
import Model.RoomAndLivingRoom;
import Service.HouseService;
import Util.HouseList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseService houseService = new HouseService();
        HouseList houseListUtil = new HouseList();

        List<House> flatList = houseListUtil.allFlatList();
        List<House> villaList = houseListUtil.allVillaList();
        List<House> summerHouseList = houseListUtil.allSummerHouseList();
        List<House> houseList = houseListUtil.allHouseList();

        System.out.println("Flats Total Price: $" + houseService.totalHousePrice(flatList));
        System.out.println("Villas Total Price: $" + houseService.totalHousePrice(villaList));
        System.out.println("Summerhouses Total Price: $" + houseService.totalHousePrice(summerHouseList));
        System.out.println("All Houses Total Price: $" + houseService.totalHousePrice(houseList));

        System.out.printf("Flats Average Size: %.2f %s\n", houseService.averageHouseSize(flatList), "m²");
        System.out.printf("Villas Average Size: %.2f %s\n", houseService.averageHouseSize(villaList), "m²");
        System.out.printf("Summerhouses Average Size: %.2f %s\n", houseService.averageHouseSize(summerHouseList), "m²");
        System.out.printf("All Houses Average Size: %.2f %s\n", houseService.averageHouseSize(houseList), "m²");

        List<RoomAndLivingRoom> list = houseService.houseRoomAndLivingRoom(houseList);
        list.forEach((x) -> System.out.printf("HouseType: %s, Room: %s, Living Room: %s\n", x.getHouseType(), x.getRoom(), x.getLivingRoom()));
    }
}