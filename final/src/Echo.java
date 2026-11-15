public class Echo extends EffectDecorator {
    public Echo(AudioStream stream) {
        super(stream);
    }

    public String getSound() {
        return stream.getSound() + " + Echo";
    }
}
