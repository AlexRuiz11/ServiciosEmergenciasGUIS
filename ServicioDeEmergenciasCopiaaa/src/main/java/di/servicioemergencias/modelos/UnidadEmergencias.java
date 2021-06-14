/**
 * 
 */
package di.servicioemergencias.modelos;

import java.util.List;

/**
 * @author darioaxel
 *
 */
public abstract class UnidadEmergencias implements SistemaEmergencias{
	protected int id;
	protected List<Trabajador> equipo;
	protected String provincia;
	
	public UnidadEmergencias(int id, List<Trabajador> equipo, String provincia) {
		this.id = id;
		this.equipo = equipo;
		this.provincia = provincia;
	}	
	public String llamadaEmergencias(TipoEmergencia te, String provincia) {
		return null;};
}
