package net.teilin.uib.ind220;

public class BRS1 implements BinaryRelation<BRS1> {

	private short data;
	
	public BRS1(final short data) {
		this.data = data;
	}
	
	@Override
	public boolean triangleleft(BRS1 y) {
		return this.data <= y.data;
	}

}
