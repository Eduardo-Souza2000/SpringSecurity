package com.example.SpringSecurity.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "tb_entrada", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

}
