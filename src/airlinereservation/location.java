package airlinereservation;

public class location {
    private String airportID;
    private String city;
    private String country;
    private String selectedTime; 

    public location() {
        this.airportID = "";
        this.city = "";
        this.country = "";
        this.selectedTime = "";
    }

    public location(String airportID, String city, String country, String selectedTime) {
        this.setAirportID(airportID);
        this.setCity(city);
        this.setCountry(country);
        this.setSelectedTime(selectedTime);
    }

    public void setAirportID(String airportID) {
        if (airportID.matches("[a-zA-Z]+$") && airportID.length() == 3) {
            this.airportID = airportID.toUpperCase();
        } else {
            System.out.println("Invalid Airport ID");
        }
    }

    public void setCity(String city) {
        if (city.matches("[a-zA-Z ]+$")) {
            this.city = city;
        } else {
            System.out.println("Invalid City Name");
        }
    }

    public void setCountry(String country) {
        if (country.matches("[a-zA-Z ]+$")) {
            this.country = country;
        } else {
            System.out.println("Invalid Country Name");
        }
    }

    public void setSelectedTime(String selectedTime) {
        
        this.selectedTime = selectedTime;
    }

    public String getAirportID() {
        return airportID;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getSelectedTime() {
        return selectedTime;
    }

    @Override
    public String toString() {
        return this.getAirportID() + "," + this.getCity() + "," + this.getCountry() + "," + this.getSelectedTime();
    }

    public static void main(String[] args) {
        location loc = new location("ABC", "ISTANBUL", "TURKEY", "12:00");
        System.out.println(loc.toString());
    }
}



