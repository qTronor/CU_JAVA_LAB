package ProjectBasedOnJava.EX1_2;

public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("The Matrix");
        videoStore.addVideo( "Godfather II");
        videoStore.addVideo( "Star Wars Episode IV: A New Hop");

        videoStore.receiveRating("The Matrix", 8);
        videoStore.receiveRating("Godfather II", 7);
        videoStore.receiveRating("Star Wars Episode IV: A New Hop", 6);
        videoStore.receiveRating("The Matrix", 1);
        videoStore.receiveRating("Star Wars Episode IV: A New Hop", 4);

        videoStore.checkOut("The Matrix");
        videoStore.checkOut("Godfather II");
        videoStore.checkOut("The Matrix");

        videoStore.returnVideo("The Matrix");

        videoStore.checkOut("Star Wars Episode IV: A New Hop");

        videoStore.returnVideo("Godfather II");
        videoStore.returnVideo("Star Wars Episode IV: A New Hop");
        videoStore.checkOut("The Matrix");
    }
}
