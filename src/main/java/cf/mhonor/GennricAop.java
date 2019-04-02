package cf.mhonor;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;

public interface GennricAop {
     void before(JoinPoint joinpoint);
     void after(JoinPoint joinpoint);
     Object around(JoinPoint joinpoint);
     void afterReturning(JoinPoint joinpoint,Object object);
     void afterThrowing(JoinPoint joinPoint, Throwable ex);
}
