package co.gov.coran.licencias.models.dto;

import java.math.BigDecimal;
import java.util.Date;

public class AntecedentesDTO {

   public BigDecimal doc_sec;
    public String    radicado;
    public String      fecha;
    public String    tipo_documento;
    public  String   descriptor;
    public  String   link_descarga;
    public  String   fecha_notificacion;

 public BigDecimal getDoc_sec() {
  return doc_sec;
 }

 public void setDoc_sec(BigDecimal doc_sec) {
  this.doc_sec = doc_sec;
 }

 public String getRadicado() {
  return radicado;
 }

 public void setRadicado(String radicado) {
  this.radicado = radicado;
 }

 public String getFecha() {
  return fecha;
 }

 public void setFecha(String fecha) {
  this.fecha = fecha;
 }

 public String getTipo_documento() {
  return tipo_documento;
 }

 public void setTipo_documento(String tipo_documento) {
  this.tipo_documento = tipo_documento;
 }

 public String getDescriptor() {
  return descriptor;
 }

 public void setDescriptor(String descriptor) {
  this.descriptor = descriptor;
 }

 public String getLink_descarga() {
  return link_descarga;
 }

 public void setLink_descarga(String link_descarga) {
  this.link_descarga = link_descarga;
 }

 public String getFecha_notificacion() {
  return fecha_notificacion;
 }

 public void setFecha_notificacion(String fecha_notificacion) {
  this.fecha_notificacion = fecha_notificacion;
 }
}
