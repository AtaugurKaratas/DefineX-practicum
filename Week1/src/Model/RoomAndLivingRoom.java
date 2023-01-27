package Model;

public class RoomAndLivingRoom {

    private String houseType;
    private int room;
    private int livingRoom;

    public RoomAndLivingRoom(String houseType, int room, int livingRoom) {
        this.houseType = houseType;
        this.room = room;
        this.livingRoom = livingRoom;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoom() {
        return room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }
}
