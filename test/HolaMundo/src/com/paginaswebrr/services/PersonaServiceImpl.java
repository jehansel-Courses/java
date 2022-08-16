package com.paginaswebrr.services;

import com.paginaswebrr.model.Persona;

public class PersonaServiceImpl implements IPersonaService {

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona + " registrada");
    }

} // fin clase
