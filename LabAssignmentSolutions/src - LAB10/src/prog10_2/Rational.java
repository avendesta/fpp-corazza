package prog10_2;

public class Rational implements Comparable<Rational>{

	private int p;
	private int q;
	public Rational (int p, int q) {
		if(q<=0) throw new IllegalArgumentException("Invalid denominator: denominator should be postive");
		this.p = p;
		this.q = q;
	}
	
	public Rational add(Rational rat) {
		return new Rational(this.p*rat.q + rat.p*this.q, this.q*rat.q);
	}
	
	public Rational multiply(Rational rat) {
		return new Rational(this.p*rat.p, this.q*rat.q);
	}
	
	@Override
	public int compareTo(Rational rat) {
		if((this.p*rat.q)>(this.q*rat.p))
			return 1;
		else if((this.p*rat.q)<(this.q*rat.p))
			return 1;
		else
			return 0;
	}
	@Override
	public boolean equals(Object ob) {
		Rational rat = (Rational) ob;
		return (this.p*rat.q)==(this.q*rat.p);
	}
	@Override
	public int hashCode() { // 2^p * 3^q , uniquely represent a rational number if q, p are coprimes
							// otherwise we can divide by their common divisor to make it unique
		if(p>0)
			return (int) ( Math.pow(2, p/GCF(p,q))*Math.pow(3, q/GCF(p,q)) );
		return -(int) ( Math.pow(2, -p/GCF(-p,q))*Math.pow(3, q/GCF(-p,q)) );
	}
	public static int GCF(int a, int b) {
	    if (b == 0) return a;
	    else return (GCF (b, a % b));
	}
	@Override
	public String toString() {
		return p+"/"+q;
	}
	
	public static void main(String[] args) {
		Rational a = new Rational(2,3);
		Rational b = new Rational(-17,5);
		Rational c = new Rational(1,3);
		
		Rational ps1 = (a.multiply(b)).add(c);
		Rational ps2 = a.multiply(b.add(c));
	
		if(ps1.compareTo(ps2)>0)
			System.out.format("(%s * %s) + %s is greater than %s * (%s + %s)", a,b,c,a,b,c);
		else if(ps2.compareTo(ps1)<0)
			System.out.format("(%s * %s) + %s is less than %s * (%s + %s)", a,b,c,a,b,c);
		else
			System.out.format("(%s * %s) + %s is equal to %s * (%s + %s)", a,b,c,a,b,c);

//		System.out.println();
//		System.out.println(new Rational(2,5).hashCode());
//		System.out.println(new Rational(-2,5).hashCode());
//		System.out.println(new Rational(4,10).hashCode());
	}

}
