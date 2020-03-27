package servidorNotificaciones.dto;


/**
* servidorNotificaciones/sop_corba/INotificationsManagementPackage/NotificationDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Notifications.idl
* Friday, March 27, 2020 4:20:49 PM COT
*/

abstract public class NotificationDTOHelper
{
  private static String  _id = "IDL:sop_corba/INotificationsManagement/NotificationDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, servidorNotificaciones.dto.NotificationDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static servidorNotificaciones.dto.NotificationDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [8];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "roomNumber",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "nameComplete",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "age",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "hour",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "date",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "message",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (servidorNotificaciones.dto.listHelper.id (), "list", _tcOf_members0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "indicators",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (servidorNotificaciones.dto.listHelper.id (), "list", _tcOf_members0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "lastFiveAlerts",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (servidorNotificaciones.dto.NotificationDTOHelper.id (), "NotificationDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static servidorNotificaciones.dto.NotificationDTO read (org.omg.CORBA.portable.InputStream istream)
  {
        servidorNotificaciones.dto.NotificationDTO value = new servidorNotificaciones.dto.NotificationDTO ();
    value.roomNumber = istream.read_long ();
    value.nameComplete = istream.read_string ();
    value.age = istream.read_string ();
    value.hour = istream.read_string ();
    value.date = istream.read_string ();
    value.message = istream.read_string ();
    value.indicators = servidorNotificaciones.dto.listHelper.read (istream);
    value.lastFiveAlerts = servidorNotificaciones.dto.listHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, servidorNotificaciones.dto.NotificationDTO value)
  {
    ostream.write_long (value.roomNumber);
    ostream.write_string (value.nameComplete);
    ostream.write_string (value.age);
    ostream.write_string (value.hour);
    ostream.write_string (value.date);
    ostream.write_string (value.message);
        servidorNotificaciones.dto.listHelper.write (ostream, value.indicators);
        servidorNotificaciones.dto.listHelper.write (ostream, value.lastFiveAlerts);
  }

}
