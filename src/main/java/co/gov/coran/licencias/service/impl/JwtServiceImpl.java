package co.gov.coran.licencias.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.gov.coran.licencias.models.dto.AdDTO;
import co.gov.coran.licencias.models.dto.UserDetailsCustom;
import co.gov.coran.licencias.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.jackson2.SimpleGrantedAuthorityMixin;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;

@Service
public class JwtServiceImpl implements JwtService {
    @Value("${app.jwt.secret}")
    private String secretsJwt;
    @Value("${app.jwt.expiration:1d}")
    private Duration expirationDate;

    public static final String TOKEN_PREFIX = "Bearer ";

    @Override
    public String generateToken(AdDTO user) {
       if(user.getVoerror() == "null") {
           String token = Jwts.builder().setSubject(user.getVonombrecompleto())
                   .signWith(SignatureAlgorithm.HS512,
                           Base64.getEncoder().encodeToString(secretsJwt.getBytes()))
                   .setIssuedAt(new Date()).setExpiration(new Date(System.currentTimeMillis()
                           + expirationDate.toMillis()))
                   .compact();
           System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx  " + token);
           return token;
       }else{
           return null;
       }
    }

    @Override
    public boolean validate(String token) {
        try {
            getClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public Claims getClaims(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(
                        Base64.getEncoder().encodeToString(secretsJwt.getBytes()))
                .parseClaimsJws(resolve(token)).getBody();
        return claims;
    }


    @Override
    public String getUsername(String token) {
        return getClaims(token).getSubject();
    }

    @Override
    public Collection<? extends GrantedAuthority> getRoles(String token) throws IOException {
        Object roles = getClaims(token).get("authorities");

        Collection<? extends GrantedAuthority> authorities = Arrays.asList(new ObjectMapper()
                .addMixIn(SimpleGrantedAuthority.class, SimpleGrantedAuthorityMixin.class)
                .readValue(roles.toString().getBytes(), SimpleGrantedAuthority[].class));

        return authorities;
    }

    @Override
    public String resolve(String token) {
        if (token != null && token.startsWith(TOKEN_PREFIX)) {
            return token.replace(TOKEN_PREFIX, "");
        }
        return null;
    }
}
