public class asteroid extends moon {
    //Declares the variables
    private int asteroidBeltWidth;
    private int asteroidCount;
    private double[][] asteroids;
    /**
     * Creates a new asteroid belt made out of moons
     * Can specify the size of the asteroids, their colours, how many asteroids there are
     * Can also specify how far the asteroids are from their planet/sun and how wide the asteroid belt is
     * Returns nothing
     * 
     * @param distanceFromPlanet Sets how far away the belt is from its planet/sun
     * @param asteroidBeltWidth Sets how wide the asteroid belt is
     * @param asteroidCount Sets how many asteroids there are
     * @param asteroidMaxWidth Sets how large the max asteroid can be
     * @param asteroidMaxAngleMultiplier Sets the maximum speed of the asteroids
     * @param planetDistance How far the planet is away from the origin
     * @param planetMult The speed at which the planet is that the asteroids are going around
     * @param solar The solar system that the asteroid belt is in
     */
    //Creates a new asteroidBelt
    public asteroid(int distanceFromPlanet, int asteroidBeltWidth, int asteroidCount, int asteroidMaxWidth, int asteroidMaxAngleMultiplier, double planetDistance , double planetMult, SolarSystem solar){
        super(distanceFromPlanet, asteroidMaxAngleMultiplier, asteroidMaxWidth, "WHITE",planetDistance,planetMult, solar);
        //Sets all the instance variables
        this.asteroidBeltWidth = asteroidBeltWidth;
        this.asteroidCount = asteroidCount;
        this.asteroids = new double[asteroidCount][4];
        //Creates the asteroids and stores them in an array
        createAsteroids();
    }
    /** 
     * Creates the asteroids based on how many there are and stores them in an array
     * Multiplies the max size, distance in the belt and how fast they spin
     * Returns nothing
     */
    //Create Asteroids as moons around the respective planet
    public void createAsteroids(){
        for(int i = 0;i<asteroidCount-1;i++){
            //Modifes an array to store each of the asteroids location
            //Sets the distance from the solar object
            asteroids[i][0] =  moonDistance+(asteroidBeltWidth*Math.random());
            //Sets the speed of each asteroid
            asteroids[i][1] = moonAngleMult*Math.random();
            //Sets the diameter of each asteroid
            asteroids[i][2] = diameter+Math.random();
            //Randomly places the asteroid a distance around the origin 
            asteroids[i][3] = (int)(365*Math.random());
        }
    }
    /** 
     * Draws the asteroids onto the solar system
     * Returns nothign
     * @param ang The angle at which earth is rotating
     */
    public void drawAsteroids(double ang){
        //Creates a loop to draw all the asteroids
        for(int i = 0;i<asteroidCount-1;i++){
            solar.drawSolarObjectAbout(asteroids[i][0], ang*asteroids[i][1]+asteroids[i][3], asteroids[i][2], colour, distance, ang*angleMult);
        }
    }
}
