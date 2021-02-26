package lk.mongo_with_spring.asset.user_management.enums;

import lombok.Getter;
@Getter
public enum LoginStatus {
  LOGIN,
  LOGOUT,
  SESSION_EXPIRED
}
