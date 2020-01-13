package personalfinance.model;

import personalfinance.exception.ModelException;

import java.util.Objects;




public class Account extends Common {

    private String title;
    private Currency currency;
    private double startAmount;
    private double amount;

    public Account() {}

    public Account(Currency currency) throws ModelException {
        if (title.length() == 0) throw new ModelException(ModelException.TITLE_EMPTY);
        if (currency == null) throw new ModelException(ModelException.CURRENCY_EMPTY);
        this.currency = currency;
    }
    public Account(double startAmount) {
        this.startAmount = startAmount;
    }
    public Account(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return new org.apache.commons.lang.builder.EqualsBuilder()
                .append(title, account.title)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37)
                .append(title)
                .toHashCode();
    }
    @Override
    public String getValueForComboBox() {
        return title;
    }
    public void setAmountFromTransactionAndTransfer() {
        double setAut;

        }
    }
}