package circl;

public class CIRCL {

    public static void main(String[] args) {
        Circlnew c = new Circlnew(10, "red");
        Circlnew c2 = new Circlnew(10, "red");
        c.setRadius(5);
        c.setColor("blue");
        c2.setColor("black");
        c2.setRadius(1);
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.println(c2.getColor());
        System.out.println(c2.getRadius());
    }
}
