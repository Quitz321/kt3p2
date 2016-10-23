public class Laiend extends Pohi{
	double r;
	public Laiend(double korgus, double raadius){
		super(korgus);
		r=raadius;
	}
	public double pohjaPindala(){
		return 3.14*r*r;
	}
	//Lisage klass risttahuka tarbeks
}
