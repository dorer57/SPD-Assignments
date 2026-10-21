public class HomeTheaterTest {
    public static void main(String[] args) {
        testMovieStartsWithValidTitle();
        testEmptyTitleIsRejected();
        testDvdPlayerCannotPlayWhenOff();
    }

    private static void testMovieStartsWithValidTitle() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        try {
            homeTheater.watchMovie("Test Movie");
            System.out.println("PASSED: movie starts with a valid title");
        } catch (HomeTheaterException e) {
            System.out.println("FAILED: movie starts with a valid title");
        }
    }

    private static void testEmptyTitleIsRejected() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        try {
            homeTheater.watchMovie("");
            System.out.println("FAILED: empty title is rejected");
        } catch (HomeTheaterException e) {
            System.out.println("PASSED: empty title is rejected");
        }
    }

    private static void testDvdPlayerCannotPlayWhenOff() {
        DvdPlayer dvd = new DvdPlayer();
        try {
            dvd.play("Test Movie");
            System.out.println("FAILED: DVD player cannot play when off");
        } catch (IllegalStateException e) {
            System.out.println("PASSED: DVD player cannot play when off");
        }
    }
}