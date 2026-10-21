public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Star Wars");
        homeTheater.endMovie();

        System.out.println();

        try {
            homeTheater.watchMovie("");
        } catch (HomeTheaterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}