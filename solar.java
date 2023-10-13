
class addPlanet{
    //Creates a space in memory for the values to be stored
    private int distance;
    private double angleMult;
    private int diameter;
    private String colour;
    //Stores the values that the planet is using
    public addPlanet(int distance, double angleMult, int diameter, String colour){
        this.distance = distance;
        this.angleMult = angleMult;
        this.diameter = diameter;
        this.colour = colour; 
    }
    //Draws the planet based off the class parameters
    public void drawPlanet(){
        solar.solar.drawSolarObject(distance,solar.angle*angleMult, diameter, colour);
    }
    
    //New nested class so that the moons can be directly attatched to the planets
    class addMoon{
        //Creates a space in memory for the values to be stored
        private int moonDistance;
        private double moonAngleMult;
        private int moonDiameter;
        private String moonColour;
        //Stores the values that the moon is using
        public addMoon(int moonDistance, double moonAngleMult, int moonDiameter, String moonColour){
            this.moonDistance = moonDistance;
            this.moonAngleMult = moonAngleMult;
            this.moonDiameter = moonDiameter;
            this.moonColour = moonColour;
        }
        //Draws a moon relative to the planet it is attatched to aswell as the parameters
        public void drawMoon(){
            solar.solar.drawSolarObjectAbout(moonDistance, solar.angle*moonAngleMult, moonDiameter, moonColour, distance, solar.angle*angleMult);
        }
    }
}

public class solar { 
    //Stores the angle of the earth
    public static double angle;
    //Creates the window in which the planets are drawn in
    public static SolarSystem solar = new SolarSystem(1000, 1000);
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
        addPlanet.addMoon moon = earth.new addMoon(10,10.0,2,"WHITE");
        //Adds Jupiters moons
        addPlanet.addMoon ganymede = jupiter.new addMoon(40, 2, 5, "WHITE");
        addPlanet.addMoon callisto = jupiter.new addMoon(37, 1.5, 4, "YELLOW");
        addPlanet.addMoon io = jupiter.new addMoon(50,1,4,"ORANGE");
        addPlanet.addMoon Europa = jupiter.new addMoon(45, 0.7, 3, "RED");
        
        //Loop to keep drawing the planets
        while(true){
            //Adds the sun
            sun.drawPlanet();
            //Creates an asteroid belt
            for(int i = 0;i<50;i++){
                int randomDistance = (int)(5*Math.random());
                double speedMult = Math.random();
                int diameterRandom = (int)(5*Math.random());
                addPlanet.addMoon asteroid = sun.new addMoon(130+randomDistance, speedMult,diameterRandom , "WHITE");
                asteroid.drawMoon();
            }
            //Draws the planets
            mercury.drawPlanet();
            venus.drawPlanet();
            earth.drawPlanet();
            mars.drawPlanet();
            jupiter.drawPlanet();
            saturn.drawPlanet();
            uranus.drawPlanet();
            neptune.drawPlanet();
            moon.drawMoon();
            ganymede.drawMoon();
            callisto.drawMoon();
            io.drawMoon();
            Europa.drawMoon();
            //Increases the angle of all the planets
            angle += 0.5;
            //Allows it to redraw the solar system
            solar.finishedDrawing();
        }
    }
}