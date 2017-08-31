package decorator.bverage;

public abstract class Beverage {

   public String description="Unknown Beverage";

   public enum Size{TALL,GRANDE,VENTI}

   Size size=Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
