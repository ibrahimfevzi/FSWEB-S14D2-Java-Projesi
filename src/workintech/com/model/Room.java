package workintech.com.model;

public class Room {
    private String name;
    private Wall northWall;
    private Wall southWall;
    private Wall eastWall;
    private Wall westWall;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Room(String name, Wall northWall, Wall southWall, Wall eastWall, Wall westWall,
                Ceiling ceiling, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        this.name = name;
        this.northWall = northWall;
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.westWall = westWall;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    // Getter ve setter metotlarını ekleyebilirsiniz.

    public String getName() {
        return name;
    }

    public Wall getNorthWall() {
        return northWall;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public Wall getWestWall() {
        return westWall;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }


    // ...

    // Bedroom içerisindeki metotları Room sınıfının metotları olarak da çağırabiliriz.
    public void turnOnLamp() {
        lamp.turnOn();
    }

    public void makeBed() {
        bed.make();
    }

    public void addWardrobe() {
        wardrobe.add();
    }

    public void lyingCarpet() {
        carpet.lying();
    }

    public void createCeiling() {
        ceiling.create();
    }
}
