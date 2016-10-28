public abstract class Pohi{
	String varv;
	public Pohi(String uusVarv){
		varv=uusVarv;
	}
	public abstract double katab();
	public String varvKatab(){
		return "Seinakate: "+varv+" Sellega saab katta "+katab()+" ruutmeetrit seina";

	}
}
