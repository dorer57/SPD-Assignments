# Final Project — Music Streaming Service

A console Java application that shows six design patterns working together.

| Pattern | Classes |
|---|---|
| Facade | `MusicService` (facade), `MusicLibrary` |
| Observer | `Subject`, `PlayerObserver`, `LyricsDisplay`, `KaraokeScreen` (`MusicPlayer` is the subject) |
| Decorator | `AudioStream`, `BasicStream`, `EffectDecorator`, `BassBoost`, `Echo` |
| Bridge | `MusicPlayer`, `FreePlayer`, `PremiumPlayer`, `AudioOutput`, `Speakers`, `Headphones` |
| Strategy | `PlayOrder`, `InOrder`, `ReverseOrder`, `ShortestFirst` |
| Visitor | `MediaItem`, `Song`, `Podcast`, `LibraryVisitor`, `TotalDuration`, `PlaylistExport` |

`Main` is the client. It builds the library and the players and then calls only `MusicService`.

## Run

```
cd src
javac *.java
java Main
```
