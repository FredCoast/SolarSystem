public class solar { 
    //Stores the angle of the earth
    public static double angle;
    //Creates the window in which the planets are drawn in
    public static SolarSystem solar = new SolarSystem(1000, 1000);
    //GIT PUSH TEST
    
    public static void main(String[] args) {
        //Sets the starting angle of all the planets
        angle = 0.0;
        //Creates The sun
        addPlanet sun = new addPlanet(0, 0, 40, "ORANGE");
        //Creates Mercury
        addPlanet mercury = new addPlanet(30, 2, 4, "#A9A9A9");
        //Creates Venus
        addPlanet venus = new addPlanet(60, 1.5, 9, "#FFFFE0");
        //Creates Earth
        addPlanet earth = new addPlanet(90, 1.0, 10, "#0074D9");
        //Creates Mars
        addPlanet mars = new addPlanet(120, 0.85, 5, "#FF5733");
        //Creates Jupiter
        addPlanet jupiter = new addPlanet(190, 0.7, 30, "#E4D058");
        //Creates  Saturn
        addPlanet saturn = new addPlanet(260, 0.55, 23, "#DAA520");
        //Creates Uranus
        addPlanet uranus = new addPlanet(350, 0.4, 16, "#70DB93");
        //Creates Neptune
        addPlanet neptune = new addPlanet(420, 0.25, 14, "#0047AB");
        //Adds the moon
        addMoon moon = new addMoon(10,10.0,2,"WHITE", earth.returnDistance(),earth.returnMult());
        //Adds Jupiters moons
        addMoon ganymede = new addMoon(40, 2, 5, "WHITE", jupiter.returnDistance(),jupiter.returnMult());
        addMoon callisto = new addMoon(37, 1.5, 4, "YELLOW", jupiter.returnDistance(),jupiter.returnMult());
        addMoon io = new addMoon(50,1,4,"ORANGE",jupiter.returnDistance(),jupiter.returnMult());
        addMoon Europa = new addMoon(45, 0.7, 3, "RED",jupiter.returnDistance(),jupiter.returnMult());
        //Adds asteroid belt
        addAsteroid asteroid = new addAsteroid(130,10,300,2,3,sun.returnDistance(),sun.returnMult());
        asteroid.createAsteroids();
        //Adds saturns rings
        addAsteroid saturnsRings = new addAsteroid(26, 5, 500, 1, 3, saturn.returnDistance(), saturn.returnMult());
        saturnsRings.createAsteroids();
        addAsteroid rings = new addAsteroid(100, 100, 50, 10, 90, jupiter.returnDistance(), jupiter.returnMult());
        rings.createAsteroids();
        //Loop to keep drawing the planets
        while(true){
            //Adds the sun
            sun.drawPlanet();
            //Draws the planets
            mercury.drawPlanet();
            venus.drawPlanet();
            earth.drawPlanet();
            mars.drawPlanet();
            jupiter.drawPlanet();
            saturn.drawPlanet();
            uranus.drawPlanet();
            neptune.drawPlanet();
            //Draws the moons
            moon.drawMoon();
            ganymede.drawMoon();
            callisto.drawMoon();
            io.drawMoon();
            Europa.drawMoon();
            //Draws the asteroids
            asteroid.drawAsteroids();
            //Draws saturns rings
            saturnsRings.drawAsteroids();
            rings.drawAsteroids();
            //Increases the angle of all the planets
            angle += 0.5;
            //Allows it to redraw the solar system
            solar.finishedDrawing();
        }
    }
}