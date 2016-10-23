public class Laiend extends Pohi{
	int r;
	double l, p;

	public Laiend(String varv, int rulli, double laius, double pikkus){
		super(varv);
		r=rulli;
		l=laius;
		p=pikkus;
	}
	public double katab(){
		return (r*(l*p))*0.8;
	}
	//Lisage klass risttahuka tarbeks
}
