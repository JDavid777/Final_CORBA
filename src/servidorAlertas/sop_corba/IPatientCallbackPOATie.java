package servidorAlertas.sop_corba;


/**
* servidorAlertas/sop_corba/IPatientCallbackPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 5:05:35 PM COT
*/

public class IPatientCallbackPOATie extends IPatientCallbackPOA
{

  // Constructors

  public IPatientCallbackPOATie ( servidorAlertas.sop_corba.IPatientCallbackOperations delegate ) {
      this._impl = delegate;
  }
  public IPatientCallbackPOATie ( servidorAlertas.sop_corba.IPatientCallbackOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public servidorAlertas.sop_corba.IPatientCallbackOperations _delegate() {
      return this._impl;
  }
  public void _delegate (servidorAlertas.sop_corba.IPatientCallbackOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public String notifyAlert (int roomNumber, String message)
  {
    return _impl.notifyAlert(roomNumber, message);
  } // notifyAlert

  private servidorAlertas.sop_corba.IPatientCallbackOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class IPatientCallbackPOATie
