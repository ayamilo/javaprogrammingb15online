package day048;

public interface Flyable {
    // an interface can only have public static final field
    public static final boolean HAVE_WING = true;

    // can we have constructor ? : ABSOLUTELY NO !!!!!!!!!!!

    public abstract void fly();

}
