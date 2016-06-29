package app;


public enum Type {
    FILE,
    DIRECTORY;

    @Override
    public String toString() {
        if (this == Type.FILE)
            return "P";
        else
            return "K";
    }
}

