package co.gov.coran.licencias.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import co.gov.coran.licencias.models.dto.AdDTO;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.GrantedAuthority;

import java.io.IOException;
import java.util.Collection;

public interface JwtService {

    public String generateToken (AdDTO user) throws JsonProcessingException;

    public boolean validate(String token);

    public Claims getClaims(String token);

    public String getUsername(String token);

    public Collection<? extends GrantedAuthority> getRoles(String token) throws IOException;

    public String resolve(String token);
}
