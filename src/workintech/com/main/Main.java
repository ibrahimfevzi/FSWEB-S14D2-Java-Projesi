package workintech.com.main;
import workintech.com.model.Bedroom;
import workintech.com.model.Ceiling;
import workintech.com.model.Wall;
import workintech.com.model.Bed;
import workintech.com.model.Lamp;
import workintech.com.model.Wardrobe;
import workintech.com.model.Carpet;
import workintech.com.enums.PaintColor;
import workintech.com.enums.Lamptype;
import workintech.com.model.Room;


public class Main {
    public static void main(String[] args) {

        System.out.println("-------------BEDROOM -----------------------");
        Bedroom bedroom = new Bedroom("My Bedroom", new Wall("North"),
                            new Wall("South"), new Wall("East"),
                            new Wall("West"),
                            new Ceiling(12, PaintColor.BLUE),
                            new Bed("Modern", 4, 3, 2, 1),
                            new Lamp(true, 75, Lamptype.LED),
                            new Wardrobe(2, 2, 10),
                            new Carpet(2, 2, 1));

        // Bedroom sınıfının getter metodlarıyla içerisindeki diğer sınıfların değerlerine erişebiliriz.
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Painted Color: " + bedroom.getCeiling().getPaintedColor());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Bed Pillows: " + bedroom.getBed().getPillows());
        System.out.println("Bed Height: " + bedroom.getBed().getHeight());
        System.out.println("Bed Sheets: " + bedroom.getBed().getSheets());
        System.out.println("Bed Quilts: " + bedroom.getBed().getQuilt());
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Lamp Has Battery: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp Global Rating: " + bedroom.getLamp().getGlobRating());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Wardrobe Height: " + bedroom.getWardrobe().getHeight());
        System.out.println("Wardrobe Weight: " + bedroom.getWardrobe().getWeight());
        System.out.println("Carpet Width: " + bedroom.getCarpet().getWidth());
        System.out.println("Carpet Height: " + bedroom.getCarpet().getHeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        // Metodları çağırıyoruz.
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();

        System.out.println("-------------ROOM - BEDROOM COMPOSITION İLİŞKİSİ -----------------------");

        // Room objesini oluşturuyoruz.
        Room room = new Room("My Room",
                new Wall("North"), new Wall("South"), new Wall("East"), new Wall("West"),
                new Ceiling(300, PaintColor.BLUE),
                new Bed("Modern", 2, 2, 2, 1),
                new Lamp(true, 100, Lamptype.LED),
                new Wardrobe(150, 200, 100),
                new Carpet(200, 200, 1));

        // Room sınıfının getter metodlarıyla içerisindeki diğer sınıfların değerlerine erişebiliriz.
        System.out.println("Room Name: " + room.getName());
        System.out.println("Ceiling Height: " + room.getCeiling().getHeight());
        System.out.println("Ceiling Painted Color: " + room.getCeiling().getPaintedColor());
        System.out.println("Bed Style: " + room.getBed().getStyle());
        System.out.println("Bed Pillows: " + room.getBed().getPillows());
        System.out.println("Bed Height: " + room.getBed().getHeight());
        System.out.println("Bed Sheets: " + room.getBed().getSheets());
        System.out.println("Bed Quilts: " + room.getBed().getQuilt());
        System.out.println("Lamp Style: " + room.getLamp().getStyle());
        System.out.println("Lamp Has Battery: " + room.getLamp().isBattery());
        System.out.println("Lamp Global Rating: " + room.getLamp().getGlobRating());
        System.out.println("Wardrobe Width: " + room.getWardrobe().getWidth());
        System.out.println("Wardrobe Height: " + room.getWardrobe().getHeight());
        System.out.println("Wardrobe Weight: " + room.getWardrobe().getWeight());
        System.out.println("Carpet Width: " + room.getCarpet().getWidth());
        System.out.println("Carpet Height: " + room.getCarpet().getHeight());
        System.out.println("Carpet Color: " + room.getCarpet().getColor());

        // Bedroom içerisindeki metotları Room üzerinden çağırıyoruz.
        room.turnOnLamp();
        room.makeBed();
        room.addWardrobe();
        room.lyingCarpet();
        room.createCeiling();
    }
}