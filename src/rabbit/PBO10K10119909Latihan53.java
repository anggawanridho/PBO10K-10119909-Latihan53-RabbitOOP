package rabbit;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan53 {

    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("Peter",false,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + rabbit1.getName());
        System.out.println(rabbit1.getName() + " is Vegetarian? " + rabbit1.isVegetarian());
        System.out.println(rabbit1.getName() + " eat " + rabbit1.getEats());
        System.out.println(rabbit1.getName() + " has " + rabbit1.getNoOfLegs() + " legs");
        System.out.println(rabbit1.getName() + " color is " + rabbit1.getColor());
    }
}
