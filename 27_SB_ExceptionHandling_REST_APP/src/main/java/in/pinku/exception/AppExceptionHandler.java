package in.pinku.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.pinku.binding.Exceptioninfo;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value = CustomernotfoundException.class)
	public ResponseEntity<Exceptioninfo> getmsg(CustomernotfoundException cnfe)
	{
		Exceptioninfo ex=new Exceptioninfo();
		ex.setCode("pk108");
		ex.setMsg(cnfe.getMessage());
		ex.setDate(LocalDateTime.now());;
		return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
	}

}
