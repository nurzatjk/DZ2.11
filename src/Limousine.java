public class Limousine  extends Car
{
    public int  passengerSeats;

    public Limousine(int year, String name,int passengerSeats) {
        super(year, name);
    }

    public int getPassengerSeats() {
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
