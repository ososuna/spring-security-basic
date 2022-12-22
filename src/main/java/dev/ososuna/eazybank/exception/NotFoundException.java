package dev.ososuna.eazybank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NotFoundException extends EazyBankException {

  public NotFoundException(String message) {
    super(message);
  }
}
