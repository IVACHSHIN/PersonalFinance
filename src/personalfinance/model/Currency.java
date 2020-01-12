package personalfinance.model;

import personalfinance.exception.ModelException;

import java.util.Objects;








    public class Currency extends Common {

        private String title;
        private String code;
        private double rate;
        private boolean isOn;
        private boolean isBase;

        public Currency() {
        }

        public Currency(String title, String code, double rate, boolean isOn, boolean isBase) throws ModelException {
            if (title.length() == 0) throw new ModelException(ModelException.TITLE_EMPTY);
            if (code.length() == 0) throw new ModelException(ModelException.CODE_EMPTY);
            if (rate <= 0) throw new ModelException(ModelException.RATE_INCORRECT);

            this.title = title;
            this.code = code;
            this.rate = rate;
            this.isOn = isOn;
            this.isBase = isBase;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public double getRate() {
            return rate;
        }

        public void setRate(double rate) {
            this.rate = rate;
        }

        public boolean isIsOn() {
            return isOn;
        }

        public void setIsOn(boolean isOn) {
            this.isOn = isOn;
        }

        public boolean isIsBase() {
            return isBase;
        }

        public void setIsBase(boolean isBase) {
            this.isBase = isBase;
        }

        @Override
        public String toString() {
            return "Currency{" +
                    "title='" + title + '\'' +
                    ", code='" + code + '\'' +
                    ", rate=" + rate +
                    ", isOn=" + isOn +
                    ", isBase=" + isBase +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Currency currency = (Currency) o;

            return new org.apache.commons.lang.builder.EqualsBuilder()
                    .append(code, currency.code)
                    .isEquals();
        }

        @Override
        public int hashCode() {
            return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37)
                    .append(code)
                    .toHashCode();
        }
        @Override
        public String getValueForComboBox() {
            return title;
        }

        public double getRateByCurrency(Currency currency) {
            return rate / currency.rate;
        }

    }