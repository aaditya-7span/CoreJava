package design_pattern.facade_pattern;

public class Test {
    public static void main(String[] args) {

    HomeTheatre homeTheatre=new HomeTheatre();
    Lights lights=new Lights();
    Tv tv=new Tv();
    FacadeDemo facade=new FacadeDemo(tv,homeTheatre,lights);
    facade.watchmovie();

    facade.stopMovie();
    }
}
