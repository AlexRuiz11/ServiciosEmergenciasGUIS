package ServiciosDeEmergenciasDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import di.servicioemergencias.modelos.TipoEmergencia;
import di.servicioemergencias.modelos.UnidadEmergencias;

public class ServicioDeEmergenciasDAO implements DAO<UnidadEmergencias>{

    private List<UnidadEmergencias> unidadesActivas = new ArrayList<>();

	
	@Override
	public Optional get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return unidadesActivas;
	}

	@Override
	public void save(UnidadEmergencias t) throws Exception {
		// TODO Auto-generated method stub
		unidadesActivas.add(t);
	}

	@Override
	public void update(UnidadEmergencias t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UnidadEmergencias t) {
		// TODO Auto-generated method stub
		
		unidadesActivas.remove(0);
	}
	
	
	@Override
	public String enviarEmergencia(TipoEmergencia te, String provincia) {
		String texto;
		//System.out.println("### Atención a todas las Unidades ###\n ## Emergencia: " + te.toString() + " en la provincia de " + provincia);
		texto="### Atención a todas las Unidades ###\n ## Emergencia: " + te.toString() + " en la provincia de " + provincia +"\n";
		//unidadesActivas.stream().forEach(e -> e.llamadaEmergencias(te, provincia));
		
		for(UnidadEmergencias trabajador : unidadesActivas) {
			
			texto = texto +trabajador.llamadaEmergencias(te, provincia);
			
		}
		return texto;
	}


}
