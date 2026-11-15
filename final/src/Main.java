public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Bayan (Bonus Track)", "Ozoi the Maid, Yakui the Maid", 200);
        Song song2 = new Song("Без Меня", "Гражданская Оборона", 150,
                "И убегает весь мир", "Убегает земля");
        Song song3 = new Song("You're not Here", "Akira Yamaoka", 240,
                "Blue sky to forever","The green grass blows in the wind, dancing");
        Song song4 = new Song("Neuma", "Yakui the Maid", 180);

        MusicLibrary library = new MusicLibrary();
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);
        library.addSong(song4);
        library.addPodcast(new Podcast("Podcastname", "Someone", 1800));

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
