public class Player {

    private String name;
    private int age;
    private int rank;

    public Player(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public void passBall() {
        System.out.println("the ball was passed")
    }

    public void shootBall() {
         System.out.println("the ball was shooted")
    }

    public void jump() {
         System.out.println("the player jumped")
    }
