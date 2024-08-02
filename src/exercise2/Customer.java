package exercise2;

import java.util.Objects;

public class Customer {
  private String name;
  private MemberType memberType;

  public Customer(String name) {
    this.name = name;
    this.memberType = MemberType.REGULAR;
  }

  // Getters and setters
  public String getName() {
    return name;
  }

  public MemberType getMemberType() {
    return memberType;
  }

  public void setMemberType(MemberType memberType) {
    this.memberType = memberType;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Customer))
      return false;
    Customer customer = (Customer) obj;
    return Objects.equals(customer.name, this.name) && //
        customer.memberType == this.memberType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, memberType);
  }
}
