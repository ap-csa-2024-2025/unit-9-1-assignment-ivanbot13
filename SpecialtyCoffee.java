public class SpecialtyCoffee extends Coffee {

    private String flavor;

    public SpecialtyCoffee(){
        this.size = "small";
        this.isSkinny = false;
        this.shots = 1;
        this.type = "latte";
        this.flavor = "vanilla";
    }

    public SpecialtyCoffee(String size, String type, String flavor){
        this.size = size;
        this.type = type;
        this.flavor = flavor;
    }

    public SpecialtyCoffee(String size, boolean isSkinny, int shots, String type, String flavor){
        this.size = size;
        this.type = type;
        this.flavor = flavor;
        this.shots = shots;
        this.isSkinny = isSkinny; 
    }

}