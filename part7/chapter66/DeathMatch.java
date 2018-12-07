import java.util.Random;

class DeathMatch {

    Random rand = new Random();
    private FireFly[] deathMatch; 
    double distance;

    public DeathMatch()    // constructor
    {
    
        deathMatch = new FireFly[3] ;

        deathMatch[0] = new FireFly(Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, true);
        deathMatch[1] = new FireFly(Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, true);
        deathMatch[2] = new FireFly(Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, Math.random() * 20.0 - 10.0, true);
    }

    public void play() {
        for (int i = 0; i < deathMatch.length; i++) {
            deathMatch[i].move();
        }
    }

}