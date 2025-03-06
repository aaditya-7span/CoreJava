package design_pattern.facade_pattern;

public class FacadeDemo {
    Tv tv;
    HomeTheatre homeTheatre;
    Lights lights;

    public FacadeDemo(Tv tv, HomeTheatre homeTheatre, Lights lights) {
        this.tv = tv;
        this.homeTheatre = homeTheatre;
        this.lights = lights;
    }

  public void watchmovie(){
        tv.TvOn();
        homeTheatre.HometheatreOn();
        lights.LightsOff();
    }
   public void stopMovie(){
        tv.TvOff();
        homeTheatre.HometheatreOff();
        lights.LightsOn();
     }
}
