package es.iesquevedo.modelo;

import java.math.BigDecimal;
import java.util.Objects;

public class Pelicula {
    private Long id;
    private String titulo;
    private int anio;
    private BigDecimal precio;
    private boolean disponible = true;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, BigDecimal precio) {
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
        this.disponible = true;
    }

    public Pelicula(Long id, String titulo, int anio, BigDecimal precio, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo='" + titulo + '\'' + ", anio=" + anio + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(id, pelicula.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
