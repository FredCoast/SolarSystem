public class solar { 
    public static void main(String[] args) {
        //Sets the starting angle of all the planets
        double angle = 0.0;
        //Creates the window in which the planets are drawn in
        SolarSystem solar = new SolarSystem(1000, 1000);
        //Creates The sun
        sun Sun = new sun(40,"ORANGE",solar);
        //Creates Mercury
        planet mercury = new planet(30, 2, 4, "#A9A9A9",solar);
        //Creates Venus
        planet venus = new planet(60, 1.5, 9, "#FFFFE0",solar);
        //Creates Earth
        planet earth = new planet(90, 1.0, 10, "#0074D9",solar);
        //Creates Mars
        planet mars = new planet(120, 0.85, 5, "#FF5733",solar);
        //Creates Jupiter
        planet jupiter = new planet(190, 0.7, 30, "#E4D058",solar);
        //Creates  Saturn
        planet saturn = new planet(260, 0.55, 23, "#DAA520",solar);
        //Creates Uranus
        planet uranus = new planet(350, 0.4, 16, "#70DB93",solar);
        //Creates Neptune
        planet neptune = new planet(420, 0.25, 14, "#0047AB",solar);
        //Adds the moon
        moon moon = new moon(10,10.0,2,"WHITE", earth.getDistance(),earth.getAngleMult(),solar);
        //Adds Jupiters moons
        moon ganymede = new moon(40, 2, 5, "WHITE", jupiter.getDistance(),jupiter.getAngleMult(),solar);
        moon callisto = new moon(37, 1.5, 4, "YELLOW", jupiter.getDistance(),jupiter.getAngleMult(),solar);
        moon io = new moon(50,1,4,"ORANGE",jupiter.getDistance(),jupiter.getAngleMult(),solar);
        moon Europa = new moon(45, 0.7, 3, "RED",jupiter.getDistance(),jupiter.getAngleMult(),solar);
        //Adds asteroid belt
        asteroid asteroid = new asteroid(130,10,300,2,3,0,0,solar);
        //Adds saturns rings
        asteroid saturnsRings = new asteroid(26, 5, 500, 0.1, 3, saturn.getDistance(), saturn.getAngleMult(),solar);


        //Loop to keep drawing the planets
        while(true){
            //Adds the sun
            Sun.drawSun(angle);
            //Draws the planets
            mercury.drawPlanet(angle);
            venus.drawPlanet(angle);
            earth.drawPlanet(angle);
            mars.drawPlanet(angle);
            jupiter.drawPlanet(angle);
            saturn.drawPlanet(angle);
            uranus.drawPlanet(angle);
            neptune.drawPlanet(angle);
            //Draws the moons
            moon.drawMoon(angle);
            ganymede.drawMoon(angle);
            callisto.drawMoon(angle);
            io.drawMoon(angle);
            Europa.drawMoon(angle);
            //Draws the asteroids
            asteroid.drawAsteroids(angle);
            //Draws saturns rings
            saturnsRings.drawAsteroids(angle);
            //Increases the angle of all the planets
            angle += 1;
            //Allows it to redraw the solar system
            solar.finishedDrawing();
        }
    }
}