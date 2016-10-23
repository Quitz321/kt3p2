public abstract class Pohi{
	double korgus;
	public Pohi(double uusKorgus){
		korgus=uusKorgus;
	}
	public abstract double pohjaPindala();
	public double ruumala(){
		return pohjaPindala()*korgus;
	}
}
