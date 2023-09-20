package com.ucatolica.task.jpa;

import com.ucatolica.task.persistencia.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.swing.text.html.Option;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface UsuarioEntityRepository extends PagingAndSortingRepository<UsuarioEntity,Long> {
    @Query( "SELECT usr FROM UsuarioEntity usr where usr.email = ?1")
    Optional<UsuarioEntity> findUserByEmail(String email);

//    NativeQuery
    @Query(value = "SELECT * FROM  acceso.usuario usr  WHERE usr.primer_apellido ilike ?1%",nativeQuery = true)
    List<UsuarioEntity> findUsuariosPrimerApellidoLike(String nombre);

//    Lista object

}
