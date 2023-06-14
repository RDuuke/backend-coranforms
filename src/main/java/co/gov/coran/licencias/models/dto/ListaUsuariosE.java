package co.gov.coran.licencias.models.dto;

import java.util.List;

public class ListaUsuariosE {
    private Boolean result;
    List<ConsultaUsuarioDTO>lista_usuario;

    public ListaUsuariosE() {this.result = false;}
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public List<ConsultaUsuarioDTO> getLista_usuario() {
        return lista_usuario;
    }

    public void setLista_usuario(List<ConsultaUsuarioDTO> lista_usuario) {
        this.lista_usuario = lista_usuario;
    }
}
