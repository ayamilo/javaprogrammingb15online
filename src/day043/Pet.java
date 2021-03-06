package day043;

public class Pet {
    private String type;
    private String name;

    public Pet() {
        this.type = "unknown";
        this.name = "no-name";
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static void showGeneralPetInfo() {
    }

    public void speak() {

        //switch (type.toLowerCase()  ){
        switch (type) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }

    }

    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
