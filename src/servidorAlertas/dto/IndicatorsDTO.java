package servidorAlertas.dto;


/**
* servidorAlertas/sop_corba/IPatientManagementPackage/IndicatorsDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PatientManagement.idl
* Friday, March 27, 2020 5:05:35 PM COT
*/

public final class IndicatorsDTO implements org.omg.CORBA.portable.IDLEntity
{
  public double cardiacFrequency = (double)0;
  public double systolicBloodPressure = (double)0;
  public double diastolicBloodpressure = (double)0;
  public double breathingFrequency = (double)0;
  public double oxigenSaturation = (double)0;
  public double temperature = (double)0;

  public IndicatorsDTO ()
  {
  } // ctor

  public IndicatorsDTO (double _cardiacFrequency, double _systolicBloodPressure, double _diastolicBloodpressure, double _breathingFrequency, double _oxigenSaturation, double _temperature)
  {
    cardiacFrequency = _cardiacFrequency;
    systolicBloodPressure = _systolicBloodPressure;
    diastolicBloodpressure = _diastolicBloodpressure;
    breathingFrequency = _breathingFrequency;
    oxigenSaturation = _oxigenSaturation;
    temperature = _temperature;
  } // ctor

    public double getCardiacFrequency() {
        return cardiacFrequency;
    }

    public void setCardiacFrequency(double cardiacFrequency) {
        this.cardiacFrequency = cardiacFrequency;
    }

    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getDiastolicBloodpressure() {
        return diastolicBloodpressure;
    }

    public void setDiastolicBloodpressure(double diastolicBloodpressure) {
        this.diastolicBloodpressure = diastolicBloodpressure;
    }

    public double getBreathingFrequency() {
        return breathingFrequency;
    }

    public void setBreathingFrequency(double breathingFrequency) {
        this.breathingFrequency = breathingFrequency;
    }

    public double getOxigenSaturation() {
        return oxigenSaturation;
    }

    public void setOxigenSaturation(double oxigenSaturation) {
        this.oxigenSaturation = oxigenSaturation;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "IndicatorsDTO{" + "cardiacFrequency=" + cardiacFrequency + ", systolicBloodPressure=" + systolicBloodPressure + ", diastolicBloodpressure=" + diastolicBloodpressure + ", breathingFrequency=" + breathingFrequency + ", oxigenSaturation=" + oxigenSaturation + ", temperature=" + temperature + '}';
    }

} // class IndicatorsDTO
