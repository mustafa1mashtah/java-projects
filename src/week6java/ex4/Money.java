package week6java.ex4;

public abstract class Money {
    private Integer cent;

    public Money(Integer cent) {
        this.cent = cent;
    }

    public Integer getCent() {
        return cent;

    }

    public Boolean isApplicable(Integer change) {
        return change >= getCent();
    }

    @Override
    public String toString() {
        return "" + cent;
    }
}
