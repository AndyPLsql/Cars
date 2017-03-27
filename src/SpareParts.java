/**
 * Created by idergunov on 16.03.2017.
 */
    abstract class SpareParts {
    private String PartNumber;
    public String PartName;

    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String partNumber) {
        PartNumber = partNumber;
    }

    public String getPartName() {
        return PartName;
    }
public void PrintInfo() {
    System.out.println("Тип: " + PartName);
    System.out.println("Серийный номер: " + PartNumber);
}

}
class Bumper extends SpareParts {
    public Bumper() {
        this.PartName = "Бампер";
    }
}