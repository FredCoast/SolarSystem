public class addAsteroid {
    //Declares the variables
    private int distanceFromSun;
    private int asteroidBeltWidth;
    private int asteroidCount;
    private int asteroidMaxWidth;
    private int asteroidMaxMultiplier;
    private double planetDistance;
    private double planetMult;
    private double[][] asteroids;

    private SolarSystem solar;
    public addAsteroid(int distanceFromPlanet, int asteroidBeltWidth, int asteroidCount, int asteroidMaxWidth, int asteroidMaxAngleMultiplier, double planetDistance , double planetMult, SolarSystem solar){
        //Sets all the instance variables
        this.distanceFromSun = distanceFromPlanet;
        this.asteroidBeltWidth = asteroidBeltWidth;
        this.asteroidCount = asteroidCount;
        this.asteroidMaxWidth = asteroidMaxWidth;
        this.asteroidMaxMultiplier = asteroidMaxAngleMultiplier;
        this.planetDistance = planetDistance;
        this.planetMult = planetMult;
        this.asteroids = new double[asteroidCount][3];
        this.solar = solar;
    }
    //Create Asteroids as moons around the sun
    public void createAsteroids(){
        for(int i = 0;i<asteroidCount-1;i++){
            //Modifes an array to store each of the asteroids location
            //Sets the distance from the sun
            asteroids[i][0] = distanceFromSun+(asteroidBeltWidth*Math.random());
            //Sets the speed of each asteroid
            asteroids[i][1] = asteroidMaxMultiplier*Math.random();
            //Sets the width of each asteroid
            asteroids[i][2] = asteroidMaxWidth+Math.random();
        }
    }
    public void drawAsteroids(double ang){
        //Creates a loop to draw all the asteroids
        for(int i = 0;i<asteroidCount-1;i++){
            //Creates the asteroid as a moon
            addMoon asteroid = new addMoon((int)asteroids[i][0], asteroids[i][1], (int)asteroids[i][2], "WHITE",planetDistance , planetMult, solar);
            //Draws the asteroid onto the screen
            asteroid.drawMoon(ang);
        }
    }
}
