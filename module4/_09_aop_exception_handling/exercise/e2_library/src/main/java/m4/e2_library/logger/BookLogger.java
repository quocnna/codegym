package m4.e2_library.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class BookLogger {
//    @After("execution(* m4.e2_library.service.BorrowService.*(..))")
//    public void logAfterAllMethods(JoinPoint joinPoint)
//    {
//        System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
//    }

    @After("execution(* m4.e2_library.service.BorrowService.borrow(..))")
    public void logAfterAllMethods(JoinPoint joinPoint)
    {
        System.out.println("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }

//    @After("execution(* m4.e2_library.service.BorrowService.borrow(..))")
//    public void logAfterReturningAllMethods() throws Throwable
//    {
//        System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
//    }

//    @AfterReturning(pointcut="execution(* m4.e2_library.service.BorrowService.borrow(..))", returning="retVal")
//    public void logAfterReturningGetEmployee(Object retVal) throws Throwable
//    {
//        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
//    }


}
