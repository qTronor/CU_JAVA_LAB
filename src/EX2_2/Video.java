package EX2_2;

public class Video {

    public String title;
    public boolean checkedOut;
    public int userRating;
    public  float averageUserRating;
    public int views;

    public Video(String title, boolean checkedOut, float averageUserRating){
        this.title = title;
        this.checkedOut = checkedOut;
        this.averageUserRating = averageUserRating;
        views = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean getCheckedOut() {
        return checkedOut;
    }

    public float getAverageUserRating() {
        return averageUserRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setAverageUserRating(int userRating) {
        views++;
        averageUserRating = ((averageUserRating * (views - 1)) + userRating) / views;

    }
}
