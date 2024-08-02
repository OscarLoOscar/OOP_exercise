package exercise2;

public enum MemberType {
  REGULAR, //
  SILVER, //
  GOLD,//
  ;

  public MemberType upgrade() {
    return this == REGULAR ? SILVER : (this == SILVER ? GOLD : GOLD);
  }

  public MemberType downgrade() {
    return this == GOLD ? SILVER : (this == SILVER ? REGULAR : REGULAR);
  }
}
