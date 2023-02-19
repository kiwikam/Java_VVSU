public class lab_2 {
    public static void main(String[] args) {
        Ball ball = new Ball(3);
        Cylinder cylinder = new Cylinder(5, 6);
        Pyramid pyramid = new Pyramid(10, 20);
        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.toString(ball.getVolume(), box.info()));
        System.out.println("------------------------");
        System.out.println(box.add(cylinder));
        System.out.println(box.toString(cylinder.getVolume(), box.info()));
        System.out.println("------------------------");
        System.out.println(box.add(pyramid));
        System.out.println(box.toString(pyramid.getVolume(), box.info()));
        System.out.println("------------------------");

        Cylinder cylinder1 = new Cylinder(2, 4);

        System.out.println(box.add(cylinder1));
        System.out.println(box.toString(cylinder1.getVolume(), box.info()));
    }
}