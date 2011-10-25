package net.teilin.uib.ind220;

public class BRS3 implements BinaryRelation<BRS3> {

	private int data;
	
	public BRS3(final int data) {
		this.data = data;
	}
	
	@Override
	public boolean triangleleft(BRS3 y) {
		return this.data - y.data < 5;
	}

}
