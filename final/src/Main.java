public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Night Drive", "Neon Waves", 200,
                "City lights are calling", "We drive into the night");
        Song song2 = new Song("Morning Coffee", "The Sleepy Cats", 150,
                "Steam is rising slowly", "A new day says hello");
        Song song3 = new Song("Rainy Window", "Blue Lanterns", 240,
                "Drops are racing down the glass", "I count them one by one");
        Song song4 = new Song("Ocean Breeze", "Calm Tides", 180);

        MusicLibrary library = new MusicLibrary();
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addPodcast(new Podcast("Tech Talk", "Alex", 1800));

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TvDisplay tvDisplay = new TvDisplay();

        System.out.println("=== 1. Premium + Headphones, effects on ===");
        MusicService premium = new MusicService(library, new PremiumPlayer(new Headphones()));
        premium.subscribe(phoneDisplay);
        premium.subscribe(tvDisplay);
        premium.enableBassBoost();
        premium.enableEcho();
        premium.play(song1.getTitle());

        System.out.println();
        System.out.println("=== 2. Free + Speakers ===");
        MusicService free = new MusicService(library, new FreePlayer(new Speakers()));
        free.subscribe(phoneDisplay);
        free.play(song1.getTitle());

        System.out.println();
        System.out.println("=== 3. TV unsubscribed ===");
        premium.unsubscribe(tvDisplay);
        premium.play(song2.getTitle());

        System.out.println();
        System.out.println("=== 4. Song without lyrics ===");
        premium.play(song4.getTitle());

        System.out.println();
        System.out.println("=== 5. Play order: reverse ===");
        premium.unsubscribe(phoneDisplay);
        premium.clearEffects();
        premium.setPlayOrder(new ReverseOrder());
        premium.playAll();

        System.out.println();
        System.out.println("=== 6. Play order: shortest first ===");
        premium.setPlayOrder(new ShortestFirst());
        premium.playAll();

        System.out.println();
        System.out.println("=== 7. Library stats ===");
        premium.showLibraryStats();

        System.out.println();
        System.out.println("=== 8. Unknown song ===");
        premium.play("Lost Song");
    }
}
