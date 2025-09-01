package class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aoubTime = new MovieReview();
        aoubTime.title = "어바웃타임";
        aoubTime.review = "인생 시간 영화";

        
        MovieReview[] reviews = {inception, aoubTime};

        for (MovieReview m : reviews) {
            System.out.println("제목: " + m.title + ", 후기: "+ m.review);
        }
    }
}
