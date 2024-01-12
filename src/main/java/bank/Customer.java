package bank;

public class Customer {

  private int id;
  private String name;
  private String username;
  private String password;
  private long accountId;

  public Customer(int id, String name, String username, String password, int accountId) {
    setId(id);
    setName(name);
    setPassword(password);
    setUsername(username);
    setAccountId(accountId);
  }


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public long getAccountId() {
    return this.accountId;
  }

  public void setAccountId(long accountId) {
    this.accountId = accountId;
  }

}
