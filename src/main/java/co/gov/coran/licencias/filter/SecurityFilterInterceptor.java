package co.gov.coran.licencias.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import co.gov.coran.licencias.service.JwtService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@AllArgsConstructor
public class SecurityFilterInterceptor  implements Filter {

    @Autowired
    private JwtService jwtUtil;

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityFilterInterceptor.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        LOGGER.info("ENTRANDO AL FILTRO");


        HttpServletRequest httpRequest = (HttpServletRequest) request;

        RequestWrapper requestWrapper = new RequestWrapper(httpRequest);
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        ResponseWrapper responseWrapper = new ResponseWrapper(httpResponse);
        LOGGER.info("EXTRACT TOKEN " + httpRequest.getHeader("Authorization"));

        try{

            if(!jwtUtil.validate(httpRequest.getHeader("Authorization"))){
                System.out.println(httpRequest.getHeader("Authorization"));
                System.out.println("desde back");
                LOGGER.error("TOKEN INVALIDO");
                throw new Exception("TOKEN INVALIDO");
            }

            filterChain.doFilter(requestWrapper, responseWrapper);

            httpResponse.setStatus(responseWrapper.getStatus());
            httpResponse.setContentType(httpRequest.getContentType());
            httpResponse.getOutputStream().write(responseWrapper.getByteArray());

        } catch (Exception e){

            httpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
            httpResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
        }


    }
}
