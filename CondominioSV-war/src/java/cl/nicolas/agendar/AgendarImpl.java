package cl.nicolas.agendar;

import java.util.List;

public final class AgendarImpl implements Agendar {

    @Override
    public boolean agendar(final List<String> input) {
	
	//TODO: esto es una tontera
//	switch (input.get(0)) {
//	case "depA":
//	    //TODO: EX: asignar a Juan Ortega
//	    break;
//	case "depB":
//	    //TODO: EX: asignar a Martín Hazo
//	    break;
//	case "depC":
//	    //TODO: EX: asignar a X
//	    break;
//	case "depD":
//	    //TODO: EX: asignar a Y
//	    break;
//	default:
//	    //TODO: asignar a AnaKonda
//	    break;
//	}
	//esto también
	return new java.util.Random().nextBoolean();
    }
    
}
