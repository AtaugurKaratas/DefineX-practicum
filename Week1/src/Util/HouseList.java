package Util;

import Model.Flat;
import Model.House;
import Model.SummerHouse;
import Model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseList {
    private List<House> houseList = new ArrayList<>();
    private List<House> flatList = new ArrayList<>(
            List.of(new Flat(2, 1, 180_000, 90),
                    new Flat(1, 1, 140_000, 70),
                    new Flat(3, 1, 220_000, 120)
            )
    );
    List<House> villaList = new ArrayList<>(
            List.of(new Villa(7, 2, 650_000, 220),
                    new Villa(9, 3, 950_000, 340),
                    new Villa(8, 3, 850_000, 270)
            )
    );
    List<House> summerHouseList = new ArrayList<>(
            List.of(new SummerHouse(3, 2, 250_000, 135),
                    new SummerHouse(4, 1, 280_000, 140),
                    new SummerHouse(4, 2, 320_000, 155)
            )
    );

    public List<House> allFlatList() {
        return flatList;
    }

    public List<House> allVillaList() {
        return villaList;
    }

    public List<House> allSummerHouseList() {
        return summerHouseList;
    }

    public List<House> allHouseList() {
        flatList.forEach(x -> houseList.add(x));
        villaList.forEach(x -> houseList.add(x));
        summerHouseList.forEach(x -> houseList.add(x));
        return houseList;
    }
}
