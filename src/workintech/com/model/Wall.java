package workintech.com.model;

public class Wall {

    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void create(String direction){
        System.out.println("Wall direction: " + direction);
    }

}
