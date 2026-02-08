package Servicios;

import es.iesquevedo.modelo.Alquiler;
import es.iesquevedo.servicios.AlquilerService;
import es.iesquevedo.servicios.AlquilerService_Implementacion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlquilerServiceTest {

    private AlquilerService alquilerService;

    @BeforeEach
    void setUp() {
        String basePath = System.getProperty("user.dir") + "/test-data";
        alquilerService = new AlquilerService_Implementacion(basePath);
    }

    @Test
    void listarAlquileres_devuelveArrayList() {
        List<Alquiler> alquileres = alquilerService.listarAlquileres();

        assertNotNull(alquileres);
        assertTrue(alquileres instanceof ArrayList);
        assertEquals(3, alquileres.size());
    }
}


