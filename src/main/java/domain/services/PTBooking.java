package domain.services;

import domain.actors.Patient;

public class PTBooking {
    private Patient patientDetails;

    private PTBooking(){}
    private PTBooking(Builder builder){
        this.patientDetails = builder.patientDetails;
    }

    public Patient getPTPatientDetails() {
        return patientDetails;
    }

    public static class Builder{
        private Patient patientDetails;

        public Builder patientDetails(Patient patientDetails){
            this.patientDetails = patientDetails;
            return this;
        }

        public PTBooking build(){
            return new PTBooking(this);
        }
    }

    @Override
    public String toString() {
        return "PTBooking{" +
                "patientDetails=" + patientDetails +
                '}';
    }
}
