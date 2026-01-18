package es.iesquevedo.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Alquiler {
    private Long id;
    private Socio socio;
    private Pelicula pelicula;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler() {
    }

    public Alquiler(Socio socio, Pelicula pelicula, LocalDate fechaAlquiler) {
        this.socio = socio;
        this.pelicula = pelicula;
        this.fechaAlquiler = fechaAlquiler;
    }

    public Alquiler(Long id, Socio socio, Pelicula pelicula, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.id = id;
        this.socio = socio;
        this.pelicula = pelicula;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isDevuelto() {
        return fechaDevolucion != null;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", socio=" + socio +
                ", pelicula=" + pelicula +
                ", fechaAlquiler=" + fechaAlquiler +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alquiler alquiler = (Alquiler) o;
        if (id != null && alquiler.id != null) {
            return Objects.equals(id, alquiler.id);
        }
        return Objects.equals(socio, alquiler.socio) && Objects.equals(pelicula, alquiler.pelicula) && Objects.equals(fechaAlquiler, alquiler.fechaAlquiler);
    }

    @Override
    public int hashCode() {
        if (id != null) {
            return Objects.hash(id);
        }
        return Objects.hash(socio, pelicula, fechaAlquiler);
    }
}
