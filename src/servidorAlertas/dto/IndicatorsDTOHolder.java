package servidorAlertas.dto;

/**
* servidorAlertas/sop_corba/IPatientManagementPackage/IndicatorsDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 5:05:35 PM COT
*/

public final class IndicatorsDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public servidorAlertas.dto.IndicatorsDTO value;

  public IndicatorsDTOHolder ()
  {
  }

  public IndicatorsDTOHolder (servidorAlertas.dto.IndicatorsDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = servidorAlertas.dto.IndicatorsDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        servidorAlertas.dto.IndicatorsDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return servidorAlertas.dto.IndicatorsDTOHelper.type ();
  }

}
