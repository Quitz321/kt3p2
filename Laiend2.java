public class Laiend2 extends Pohi{
	int purki;
	double suurus;
	public Laiend2(String varv, int purki, double suurus){
		super(varv);
		this.purki=purki;
		this.suurus=suurus;
	}
	public double katab(){
		return 7*(purki*suurus);
	}
}
