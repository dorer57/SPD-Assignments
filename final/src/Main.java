public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("Night Drive", "Neon Waves", 200,
                new String[] {"City lights are calling", "We drive into the night"}));
        library.addSong(new Song("Morning Coffee", "The Sleepy Cats", 150,
                new String[] {"Steam is rising slowly", "A new day says hello"}));
        library.addSong(new Song("Rainy Window", "Blue Lanterns", 240,
                new String[] {"Drops are racing down the glass", "I count them one by one"}));
        library.addPodcast(new Podcast("Tech Talk", "Alex", 1800));

        LyricsDisplay lyricsDisplay = new LyricsDisplay();
        KaraokeScreen karaokeScreen = new KaraokeScreen();

        System.out.println("=== 1. Premium + Headphones, effects on ===");
        MusicService premium = new MusicService(library, new PremiumPlayer(new Headphones()));
        premium.subscribe(lyricsDisplay);
        premium.subscribe(karaokeScreen);
        premium.enableBassBoost();
        premium.enableEcho();
        premium.play("Night Drive");

        System.out.println();
        System.out.println("=== 2. Free + Speakers ===");
        MusicService free = new MusicService(library, new FreePlayer(new Speakers()));
        free.subscribe(lyricsDisplay);
        free.play("Night Drive");

        System.out.println();
        System.out.println("=== 3. Karaoke screen unsubscribed ===");
        premium.unsubscribe(karaokeScreen);
        premium.play("Morning Coffee");

        System.out.println();
        System.out.println("=== 4. Play order: reverse ===");
        premium.unsubscribe(lyricsDisplay);
        premium.clearEffects();
        premium.setPlayOrder(new ReverseOrder());
        premium.playAll();

        System.out.println();
        System.out.println("=== 5. Play order: shortest first ===");
        premium.setPlayOrder(new ShortestFirst());
        premium.playAll();

        System.out.println();
        System.out.println("=== 6. Library stats ===");
        premium.showLibraryStats();

        System.out.println();
        System.out.println("=== 7. Unknown song ===");
        premium.play("Lost Song");
    }
}
