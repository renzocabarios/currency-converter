public class Currency {
    private double valueToPHP;
    private String sign;

    public Currency() {
    }

    public Currency(double valueToPHP, String sign) {
        this.valueToPHP = valueToPHP;
        this.sign = sign;
    }

    public double getValueToPHP() {
        return valueToPHP;
    }

    public void setValueToPHP(double valueToPHP) {
        this.valueToPHP = valueToPHP;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
