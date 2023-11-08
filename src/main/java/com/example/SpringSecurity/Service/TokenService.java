package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Entity.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TokenService {

    private static final String SECRET = "suaChaveSecretaAqui";

    public String gerarToken(Usuario usuario) {
        return JWT.create()
                .withIssuer("Teste")
                .withSubject(usuario.getUsername())
                .withClaim("id", usuario.getId())
                .withExpiresAt(java.sql.Timestamp.valueOf(LocalDateTime.now().plusMinutes(10)))
                .sign(Algorithm.HMAC256(SECRET));
    }
}
