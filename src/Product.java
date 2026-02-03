public class Product {

    private String name;
    private String description;
    private String ID;
    private double cost;

    public Product(double cost, String ID, String description, String name) {
        this.cost = cost;
        this.ID = ID;
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String toCSV()
    {
        String CSV = this.name + ", " + this.description + ", " + this.ID + ", " + this.cost;
        return CSV;
    }

    public String toJSON()
    {
        String JSON = "\"name\": \"" + this.name + "\",\n \"description\": \"" + this.description + "\",\n\"ID\":\"" + this.ID
                + "\",\n \"cost\": \"" + this.cost;
        return JSON;
    }

    public String toXML()
    {
        String XML = "<product>\n\n" + "<name>" + this.name + "</name>" + "\n<description>" + this.description + "</description>"
                + "\n<ID>" + this.ID + "</ID>" + "\n<cost>" + this.cost + "</cost>" + "\n\n</product>";
        return XML;
    }


}
