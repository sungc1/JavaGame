package java.game.tetrominoes.enums;

public enum RotationDegree {
    Degree0, Degree90, Degree180, Degree270;

    public RotationDegree rotate(final RotationDirection rotationDirection) {
	switch (rotationDirection) {
	case Left:
	    return rotateLeft();
	case Right:
	    return rotateRight();
	default:
	    return this;
	}
    }

    public RotationDegree rotateRight() {
	if (this == Degree0) {
	    return Degree270;
	}
	return RotationDegree.values()[ordinal() - 1];
    }

    public RotationDegree rotateLeft() {
	if (this == Degree270) {
	    return Degree0;
	}
	return RotationDegree.values()[ordinal() + 1];
    }
}