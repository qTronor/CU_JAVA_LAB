package EX2_2;

import java.util.ArrayList;

public class VideoStore {

    public ArrayList<Video> videoList = new ArrayList<>(); //The task says about array of 10 videos, but I decided add some functions

    public void addVideo(String title){
        videoList.add(new Video(title, false, 0));
    }

     public void checkOut(String title){
        for(int i = 0; i < videoList.size(); i++){
            if(videoList.get(i).getTitle() == title) {
                if(videoList.get(i).getCheckedOut() == false) {
                    videoList.get(i).setCheckedOut(true);
                    System.out.println("Video checked out");
                    break;
                }
            }
            if(i == videoList.size() - 1)
                System.out.println("There is no video with this title");

        }
     }

     public void returnVideo(String title){
         for(int i = 0; i < videoList.size(); i++){
             if(videoList.get(i).getTitle() == title) {
                 videoList.get(i).setCheckedOut(false);
                 System.out.println("Video returned");
                 break;
             }
         }
     }

     public void receiveRating(String title, int rating){
         for(int i = 0; i < videoList.size(); i++){
             if(videoList.get(i).getTitle() == title) {
                 System.out.println("Current rating is: " + videoList.get(i).getAverageUserRating());

                 videoList.get(i).setAverageUserRating(rating);
                 System.out.println("Rating is set");
                 System.out.println("New is: " + videoList.get(i).getAverageUserRating());
                 break;
             }
         }
     }
}
