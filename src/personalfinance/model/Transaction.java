package personalfinance.model;

import personalfinance.exception.ModelException;

import java.util.Date;

public class Transaction extends Common {

    private Account account;
    private Article article;
    private double amount;
    private String notice;
    private Date date;

    public Transaction() {
    }

    public Transaction(Account account, Article article, double amount, String notice, Date date) throws ModelException {
        if (account == null) throw new ModelException(ModelException.ACCOUNT_EMPTY);
        if (article == null) throw new ModelException(ModelException.ARTICLE_EMPTY);
    }

    public Transaction(Article article) {
        this.article = article;
    }

    public Transaction(double amount) {
        this.amount = amount;
    }

    public Transaction(Date date) {
        this.date = date;
    }

    public Transaction(String notice) {
        this.notice = notice;
    }

    public Transaction(Account account) {
        this.account = account;

    }

    public Transaction(Account account, Article article, double amount, String notice) throws ModelException {
        this(account, article, amount, notice, new Date());
    }

    public Transaction(Account account, Article article, double amount, Date date) throws ModelException {
      this(account, article, amount, "", date);
    }
    public Transaction(Account account, Article article, double amount) throws ModelException {
        this(account, article, amount, "", new Date());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "account=" + account +
                ", article=" + article +
                ", amount=" + amount +
                ", notice='" + notice + '\'' +
                ", date=" + date +
                '}';
    }
}
