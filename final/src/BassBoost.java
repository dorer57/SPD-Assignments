public class BassBoost extends EffectDecorator {
    public BassBoost(AudioStream stream) {
        super(stream);
    }

    public String getSound() {
        return stream.getSound() + " + Bass Boost";
    }
}
