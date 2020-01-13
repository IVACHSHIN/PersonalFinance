package personalfinance.model;

import personalfinance.exception.ModelException;

import java.util.Date;

public class Transaction extends Common {

private Account account;
private Article article;
private double amount;
private String notice;
private Date date;

public Transaction () {}
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

    }

