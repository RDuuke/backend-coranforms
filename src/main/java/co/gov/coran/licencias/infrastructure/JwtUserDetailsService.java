package co.gov.coran.licencias.infrastructure;

import co.gov.coran.licencias.models.dto.AdDTO;
import co.gov.coran.licencias.repository.DirectoryActiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {


    @Autowired
    private DirectoryActiveRepository directoryActiveRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdDTO user = new AdDTO();
        user.setUsuario(username);

        user = directoryActiveRepository.conexionAd(user);

        return new User(username, user.Password,
                new ArrayList<>());

    /*    if ("javainuse".equals(username)) {
            return new User(username, user.Password,
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }*/
    }
}