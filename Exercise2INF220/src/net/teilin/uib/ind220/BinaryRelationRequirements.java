package net.teilin.uib.ind220;

import org.junit.Assert;

public class BinaryRelationRequirements<S extends BinaryRelation<S>> {
	
	public static <S> void reflexive(S x) {
		Assert.assertTrue("x="+x,x.triangleleft(x));
	}
	
	public static <S> void symmetric(S x, S y) {
		if(x.triangleleft(y))
			Assert.assertTrue("x="+x+"_y="+y, y.triangleleft(x));
	}
	
	public static <S> void irreflexive(S x) {
		
	}
	
	public static <S> void total(S x, S y) {
		
	}
	
	public static <S> void transitive(S x, S y, S z) {
		
	}
	
}
