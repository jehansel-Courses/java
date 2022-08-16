package com.paginaswebrr;

import com.paginaswebrr.model.Persona;
import com.paginaswebrr.services.IPersonaService;
import com.paginaswebrr.services.PersonaServiceImpl;

public class App {

    private static final String HOLA_MUNDO = "Hola, Mundo!";

    public static void main(String[] args) throws Exception {
        System.out.println(HOLA_MUNDO);
        System.out.println(HOLA_MUNDO);
        System.out.println(HOLA_MUNDO);

        Persona juan = new Persona(1, "Juanito");
        IPersonaService personaService = new PersonaServiceImpl();
        personaService.registrar(juan);

        int i=9;
        calcular(i);

    } // fin main

    private static void calcular(int i) {
        System.out.println(i*10);
    }
} // fin clase
