package di.servicioemergencias.modelos;

import java.util.List;

public class Bombero extends UnidadEmergencias implements SistemaEmergencias {
	
	public Bombero(int id, List<Trabajador> equipo, String provincia) {
		super(id, equipo, provincia);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String llamadaEmergencias(TipoEmergencia te, String provincia) {
		String text="";
		if (this.provincia.equals(provincia) 
				&& (te.equals(TipoEmergencia.AccidenteTrafico) 
						|| te.equals(TipoEmergencia.IncendioInundacion))) {
			//System.out.println("## Unidad de Bomberos: " + this.id + " con base en " + this.provincia + " se dirige a la llamada! ");
			text = "## Unidad de Bomberos: " + this.id + " con base en " + this.provincia + " se dirige a la llamada! "  +"\n";
		}
		
		return text;
	}
	
	
	@Override
	public String toString() {
		return "Bombero [id=" + id + ", equipo=" + equipo + ", provincia=" + provincia  + "]";
	}
}
