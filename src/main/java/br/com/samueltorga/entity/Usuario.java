package br.com.samueltorga.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Usuario implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
    @SequenceGenerator(name = "usuario_id_seq", sequenceName = "usuario_id_seq", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Integer id;

    @Column
    private String nome;

    @Column
    private String uuid;

    @Column(insertable = false, updatable = false)
    private Instant criado;

    @Column
    private Instant atualizado;

    @Column
    private String email;

    @Column(name = "email_verificado")
    private boolean emailVerificado;

    @Column(name = "primeiro_nome")
    private String primeiroNome;

    @Column
    private String sobrenome;

}
