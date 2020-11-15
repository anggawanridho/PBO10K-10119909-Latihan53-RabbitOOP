package rabbit;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Rabbit extends Animal {
    private final String color;
    private final String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public String getName(){
        return name;
    }
}
