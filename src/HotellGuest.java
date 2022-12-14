public class HotellGuest {

    String name;
    String ucn;
    int maritalStatus;
    int nights;
    double beds;
    String city;

    public HotellGuest(String name, String ucn, int maritalStatus, int nights, double beds, String city) {
        this.name = name;
        this.ucn = ucn;
        this.maritalStatus = maritalStatus;
        this.nights = nights;
        this.beds = beds;
        this.city = city;
    }

    public HotellGuest() {

    }

    @Override
    public String toString() {
        return "HotelGuests{" +
                "name='" + name + '\'' +
                ", ucn='" + ucn + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", nights=" + nights +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                '}';
    }
}