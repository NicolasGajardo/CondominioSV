package cl.nicolas.controller;

import java.util.List;

import cl.nicolas.agendar.Agendar;
import cl.nicolas.agendar.AgendarImpl;

public final class AgendarControllerImpl implements AgendarController {

    private static final Agendar agendarImpl = new AgendarImpl();

    @Override
    public boolean agendar(final List<String> input) {
	
	return agendarImpl.agendar(input);
    }

}
