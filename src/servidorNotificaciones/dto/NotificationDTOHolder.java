package servidorNotificaciones.dto;

/**
* servidorNotificaciones/sop_corba/INotificationsManagementPackage/NotificationDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Notifications.idl
* Wednesday, March 25, 2020 1:11:47 PM COT
*/

public final class NotificationDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public servidorNotificaciones.dto.NotificationDTO value ;

  public NotificationDTOHolder ()
  {
  }

  public NotificationDTOHolder (servidorNotificaciones.dto.NotificationDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = servidorNotificaciones.dto.NotificationDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        servidorNotificaciones.dto.NotificationDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return servidorNotificaciones.dto.NotificationDTOHelper.type ();
  }

}
