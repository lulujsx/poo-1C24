package empleados;

public class Mozo extends Empleado{
	
	private float propina;
	
	public Mozo(String nom, float suel, float prop) {
		super(nom,suel);
		this.setPropina(prop);
	}

	public float getPropina() {
		return propina;
	}

	public void setPropina(float propina) {
		this.propina = propina;
	}
	
	@Override
	public float getSueldo() {
		return super.getSueldo() + getPropina();
	}
}
