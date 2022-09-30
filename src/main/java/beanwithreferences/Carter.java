package beanwithreferences;

public class Carter {
	@Override
	public String toString() {
		return "Carter [volumenAceite=" + volumenAceite + "]";
	}

	private double volumenAceite;
	
	public Carter() {}
	
	public Carter( double volumenAceite ) {
		this.volumenAceite = volumenAceite;
	}
	
	public double getVolumenAceite() {
		return volumenAceite;
	}
	
	public void setVolumenAceite(double volumenAceite) {
		this.volumenAceite = volumenAceite;
	}
}
