package net.teilin.uib.ind220;

public interface BinaryRelation<S extends BinaryRelation<S>> {
	abstract public boolean triangleleft(S y);
}
