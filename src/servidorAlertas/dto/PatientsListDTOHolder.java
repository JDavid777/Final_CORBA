package servidorAlertas.dto;


/**
* servidorAlertas/sop_corba/IPatientManagementPackage/PatientsListDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 5:05:35 PM COT
*/

public final class PatientsListDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[];

  public PatientsListDTOHolder ()
  {
  }

  public PatientsListDTOHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = servidorAlertas.dto.PatientsListDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        servidorAlertas.dto.PatientsListDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return servidorAlertas.dto.PatientsListDTOHelper.type ();
  }

}
