package com.gof.structural.a_adaptor_pattern;

 class RoundPeg {
		public void insertTohole(String str) {
			System.out.println("roundpeg insertTohole(): " + str);
		}
	}
	class SquarePeg {
		public void insert(String str) {
			System.out.println("SquarePeg insert(): " + str);
		}
	}


	// adaptoing roundpeg to square pag
	class PegAdaptor extends SquarePeg  {
	
		private RoundPeg peg;
	
		public PegAdaptor(RoundPeg peg) {
			super();
			this.peg = peg;
		}
		
		public void insert(String str) {
			peg.insertTohole(str);
		}
	}



//adaptoing roundpeg to square pag
 class Demo {

	public static void main(String[] args) {
		
		RoundPeg peg=new RoundPeg();
		PegAdaptor adpt=new PegAdaptor(peg);
		adpt.insert("hello");
	}
}