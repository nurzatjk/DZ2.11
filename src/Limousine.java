public class Limousine  extends Car
{
    public String passengerSeats;

    public Limousine(int year, String name,String passengerSeats) {
        super(year, name);
    }

    public String getPassengerSeats() {
        return passengerSeats;
    }

    @Override
    public void print() {
        System.out.println(
                "\nName" + getName()+
                        "\nYear:" + getYear() +
                        "\nPassengerSeats:" + passengerSeats);



    }
}
