package com.cajasullana.bpmprojects.reclamosbpm;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DetalleReclamo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Tipo")
   private java.lang.String tipo;

   public DetalleReclamo()
   {
   }

   public java.lang.String getTipo()
   {
      return this.tipo;
   }

   public void setTipo(java.lang.String tipo)
   {
      this.tipo = tipo;
   }

   public DetalleReclamo(java.lang.String tipo)
   {
      this.tipo = tipo;
   }

}