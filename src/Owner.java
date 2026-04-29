public class Owner {
    private String name;
    private String address;
    private int petAdopted =0;
    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void adoptPet(Pet pet) {
        petAdopted++;
        System.out.println("You have adopted " + pet.getName()+"!");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPetAdopted() {
        return petAdopted;
    }



}
