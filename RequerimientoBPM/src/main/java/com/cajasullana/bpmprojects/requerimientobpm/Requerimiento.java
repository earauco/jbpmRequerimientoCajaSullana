package com.cajasullana.bpmprojects.requerimientobpm;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Requerimiento implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Fecha")
   private java.util.Date fecha;
   @org.kie.api.definition.type.Label("Cliente")
   private com.cajasullana.bpmprojects.requerimientobpm.Cliente cliente;

   @org.kie.api.definition.type.Label("Detalle")
   private java.lang.String detalle;

   @org.kie.api.definition.type.Label("Canal de Respuesta")
   private java.lang.String canalRpta;

   @org.kie.api.definition.type.Label("Plazo M\u00E1ximo de Atenci\u00F3n")
   private java.lang.String plazoAtencion;

   public Requerimiento()
   {
   }

   public java.util.Date getFecha()
   {
      return this.fecha;
   }

   public void setFecha(java.util.Date fecha)
   {
      this.fecha = fecha;
   }

   public com.cajasullana.bpmprojects.requerimientobpm.Cliente getCliente()
   {
      return this.cliente;
   }

   public void setCliente(
         com.cajasullana.bpmprojects.requerimientobpm.Cliente cliente)
   {
      this.cliente = cliente;
   }

   public java.lang.String getDetalle()
   {
      return this.detalle;
   }

   public void setDetalle(java.lang.String detalle)
   {
      this.detalle = detalle;
   }

   public java.lang.String getCanalRpta()
   {
      return this.canalRpta;
   }

   public void setCanalRpta(java.lang.String canalRpta)
   {
      this.canalRpta = canalRpta;
   }

   public java.lang.String getPlazoAtencion()
   {
      return this.plazoAtencion;
   }

   public void setPlazoAtencion(java.lang.String plazoAtencion)
   {
      this.plazoAtencion = plazoAtencion;
   }

   public Requerimiento(java.util.Date fecha,
         com.cajasullana.bpmprojects.requerimientobpm.Cliente cliente,
         java.lang.String detalle, java.lang.String canalRpta,
         java.lang.String plazoAtencion)
   {
      this.fecha = fecha;
      this.cliente = cliente;
      this.detalle = detalle;
      this.canalRpta = canalRpta;
      this.plazoAtencion = plazoAtencion;
   }

}