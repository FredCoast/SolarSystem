public class asteroid extends moon {
    //Declares the variables
    private int asteroidBeltWidth;
    private int asteroidCount;
    private double[][] asteroids;
    public asteroid(int distanceFromPlanet, int asteroidBeltWidth, int asteroidCount, int asteroidMaxWidth, int asteroidMaxAngleMultiplier, double planetDistance , double planetMult, SolarSystem solar){
        super(distanceFromPlanet, asteroidMaxAngleMultiplier, asteroidMaxWidth, "WHITE",planetDistance,planetMult, solar);
        //Sets all the instance variables
        this.asteroidBeltWidth = asteroidBeltWidth;
        this.asteroidCount = asteroidCount;
        this.asteroids = new double[asteroidCount][4];

        createAsteroids();
    }
    //Create Asteroids as moons around the sun
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
    public void drawAsteroids(double ang){
        //Creates a loop to draw all the asteroids
        for(int i = 0;i<asteroidCount-1;i++){
            solar.drawSolarObjectAbout(asteroids[i][0], ang*asteroids[i][1]+asteroids[i][3], asteroids[i][2], colour, distance, ang*angleMult);
        }
    }
}
