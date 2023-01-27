package Model;

public abstract class House {
    private int room;
    private int livingRoom;
    private int price;
    private int size;

    public House(int room, int livingRoom, int price, int size) {
        this.room = room;
        this.livingRoom = livingRoom;
        this.price = price;
        this.size = size;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(int livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
