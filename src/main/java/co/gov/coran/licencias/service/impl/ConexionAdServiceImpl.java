package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.AdDTO;
import co.gov.coran.licencias.repository.DirectoryActiveRepository;
import co.gov.coran.licencias.service.ConexionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class ConexionAdServiceImpl implements ConexionAdService {
    private DirectoryActiveRepository directoryActiveRepository;

    @Autowired
    private JwtServiceImpl jwtServiceImpl;

    public  ConexionAdServiceImpl(DirectoryActiveRepository directoryActiveRepository){
        this.directoryActiveRepository= directoryActiveRepository;
    }
    public AdDTO conexionAd(AdDTO adDTO){
        AdDTO user = directoryActiveRepository.conexionAd(adDTO);

            user.setToken(jwtServiceImpl.generateToken(user));

        return  user;

    }

}
