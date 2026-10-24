public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        try {
            homeTheater.watchMovie("");
        } catch (HomeTheaterException e) {
            System.out.println("Error: " + e.getMessage());
        }
        homeTheater.endMovie();
        }
}