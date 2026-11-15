public abstract class EffectDecorator implements AudioStream {
    protected final AudioStream stream;

    public EffectDecorator(AudioStream stream) {
        this.stream = stream;
    }
}
