package servidorAlertas.sop_corba;

/**
* servidorAlertas/sop_corba/IPatientCallbackHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 3:10:22 PM COT
*/

public final class IPatientCallbackHolder implements org.omg.CORBA.portable.Streamable
{
  public servidorAlertas.sop_corba.IPatientCallback value = null;

  public IPatientCallbackHolder ()
  {
  }

  public IPatientCallbackHolder (servidorAlertas.sop_corba.IPatientCallback initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = servidorAlertas.sop_corba.IPatientCallbackHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    servidorAlertas.sop_corba.IPatientCallbackHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return servidorAlertas.sop_corba.IPatientCallbackHelper.type ();
  }

}
