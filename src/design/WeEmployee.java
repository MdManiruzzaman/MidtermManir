package design;

public abstract class WeEmployee {
    static String companyName = "Police Staff College";
    public final String vission = "Establish an efficient cadre of Police officers";
    public final String mission = "Provide appropriate training to all officers";
    public String address = "Section 14, Mirpur, Dhaka";

    public void collegeestablished(){
        System.out.println(companyName+"\n"+address);
        System.out.println("Police Staff College was established in 2002.\n");
    }
    public abstract void empProfile();

}
