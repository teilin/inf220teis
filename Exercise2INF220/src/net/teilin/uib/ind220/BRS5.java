package net.teilin.uib.ind220;

public class BRS5 implements BinaryRelation<BRS5> {

	private long data;
	
	public BRS5(final long data) {
		this.data = data;
	}
	
	@Override
	public boolean triangleleft(BRS5 y) {
		return this.data <= y.data;
	}

}