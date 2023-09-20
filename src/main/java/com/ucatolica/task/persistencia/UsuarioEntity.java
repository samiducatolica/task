package com.ucatolica.task.persistencia;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "usuario", schema = "acceso", catalog = "taskmanager_tyxa")
public class UsuarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "idusuario")
    private long idusuario;

    public long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    @Basic
    @Column(name = "idrol")
    private long idrol;

    public long getIdrol() {
        return idrol;
    }

    public void setIdrol(long idrol) {
        this.idrol = idrol;
    }

    @Basic
    @Column(name = "primer_nombre")
    private String primerNombre;

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "segundo_nombre")
    private String segundoNombre;

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "primer_apellido")
    private String primerApellido;

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "movil")
    private String movil;

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "passwordhash")
    private String passwordhash;

    public String getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(String passwordhash) {
        this.passwordhash = passwordhash;
    }

    @Basic
    @Column(name = "fecha_de_registro")
    private Timestamp fechaDeRegistro;

    public Timestamp getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Timestamp fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    @Basic
    @Column(name = "fecha_ultimo_login")
    private Timestamp fechaUltimoLogin;

    public Timestamp getFechaUltimoLogin() {
        return fechaUltimoLogin;
    }

    public void setFechaUltimoLogin(Timestamp fechaUltimoLogin) {
        this.fechaUltimoLogin = fechaUltimoLogin;
    }

    @Basic
    @Column(name = "detalles")
    private String detalles;

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    @Basic
    @Column(name = "intentos")
    private Integer intentos;

    public Integer getIntentos() {
        return intentos;
    }

    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }

    @Basic
    @Column(name = "fecha_bloqueo")
    private Timestamp fechaBloqueo;

    public Timestamp getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Timestamp fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    @Basic
    @Column(name = "idestado")
    private Long idestado;

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    @Basic
    @Column(name = "segundo_apellido")
    private String segundoApellido;

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return idusuario == that.idusuario && idrol == that.idrol && Objects.equals(primerNombre, that.primerNombre) && Objects.equals(segundoNombre, that.segundoNombre) && Objects.equals(primerApellido, that.primerApellido) && Objects.equals(movil, that.movil) && Objects.equals(email, that.email) && Objects.equals(passwordhash, that.passwordhash) && Objects.equals(fechaDeRegistro, that.fechaDeRegistro) && Objects.equals(fechaUltimoLogin, that.fechaUltimoLogin) && Objects.equals(detalles, that.detalles) && Objects.equals(intentos, that.intentos) && Objects.equals(fechaBloqueo, that.fechaBloqueo) && Objects.equals(idestado, that.idestado) && Objects.equals(segundoApellido, that.segundoApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusuario, idrol, primerNombre, segundoNombre, primerApellido, movil, email, passwordhash, fechaDeRegistro, fechaUltimoLogin, detalles, intentos, fechaBloqueo, idestado, segundoApellido);
    }
}
