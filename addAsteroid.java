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
    public addAsteroid(int distanceFromPlanet, int asteroidBeltWidth, int asteroidCount, int asteroidMaxWidth, int asteroidMaxAngleMultiplier, double planetDistance , double planetMult){
        this.distanceFromSun = distanceFromPlanet;
        this.asteroidBeltWidth = asteroidBeltWidth;
        this.asteroidCount = asteroidCount;
        this.asteroidMaxWidth = asteroidMaxWidth;
        this.asteroidMaxMultiplier = asteroidMaxAngleMultiplier;
        this.planetDistance = planetDistance;
        this.planetMult = planetMult;
        this.asteroids = new double[asteroidCount][3];
    }
    //Create Asteroids as moons around the sun
    public void createAsteroids(){
        
        for(int i = 0;i<asteroidCount-1;i++){
            asteroids[i][0] = distanceFromSun+(asteroidBeltWidth*Math.random());
            asteroids[i][1] = asteroidMaxMultiplier*Math.random();
            asteroids[i][2] = asteroidMaxWidth+Math.random();
        }
    }
    public void drawAsteroids(){
        for(int i = 0;i<asteroidCount-1;i++){
            addMoon asteroid = new addMoon((int)asteroids[i][0], asteroids[i][1], (int)asteroids[i][2], "WHITE",planetDistance , planetMult);
            asteroid.drawMoon();
        }
    }
}
