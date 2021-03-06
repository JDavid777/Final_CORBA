package servidorAlertas.sop_corba;


/**
* servidorAlertas/sop_corba/IPatientManagementPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 5:05:35 PM COT
*/

public abstract class IPatientManagementPOA extends org.omg.PortableServer.Servant
 implements servidorAlertas.sop_corba.IPatientManagementOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registerPatient", new java.lang.Integer (0));
    _methods.put ("findPatient", new java.lang.Integer (1));
    _methods.put ("modifyPatient", new java.lang.Integer (2));
    _methods.put ("selectAllPatients", new java.lang.Integer (3));
    _methods.put ("sendIndicators", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/IPatientManagement/registerPatient
       {
         servidorAlertas.dto.PatientDTO objPatient = servidorAlertas.dto.PatientDTOHelper.read (in);
         boolean $result = false;
         $result = this.registerPatient (objPatient);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/IPatientManagement/findPatient
       {
         int roomId = in.read_long ();
         servidorAlertas.dto.PatientDTOHolder objPatient = new servidorAlertas.dto.PatientDTOHolder ();
         boolean $result = false;
         $result = this.findPatient (roomId, objPatient);
         out = $rh.createReply();
         out.write_boolean ($result);
         servidorAlertas.dto.PatientDTOHelper.write (out, objPatient.value);
         break;
       }

       case 2:  // sop_corba/IPatientManagement/modifyPatient
       {
         int roomId = in.read_long ();
         servidorAlertas.dto.PatientDTO objPatientModified = servidorAlertas.dto.PatientDTOHelper.read (in);
         boolean $result = false;
         $result = this.modifyPatient (roomId, objPatientModified);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // sop_corba/IPatientManagement/selectAllPatients
       {
         String $result[] = null;
         $result = this.selectAllPatients ();
         out = $rh.createReply();
         servidorAlertas.dto.PatientsListDTOHelper.write (out, $result);
         break;
       }

       case 4:  // sop_corba/IPatientManagement/sendIndicators
       {
         int roomId = in.read_long ();
         servidorAlertas.dto.IndicatorsDTO indicators = servidorAlertas.dto.IndicatorsDTOHelper.read (in);
         servidorAlertas.sop_corba.IPatientCallback callback = servidorAlertas.sop_corba.IPatientCallbackHelper.read (in);
         boolean $result = false;
         $result = this.sendIndicators (roomId, indicators, callback);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/IPatientManagement:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public IPatientManagement _this() 
  {
    return IPatientManagementHelper.narrow(
    super._this_object());
  }

  public IPatientManagement _this(org.omg.CORBA.ORB orb) 
  {
    return IPatientManagementHelper.narrow(
    super._this_object(orb));
  }


} // class IPatientManagementPOA
