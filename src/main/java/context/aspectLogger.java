package context;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy 
public class aspectLogger {
	
	@Pointcut("execution(* owo.Redactor.undo())")
	public void undo() {}
	
	@Pointcut("execution(* owo.Redactor.redo())")
	public void redo() {}
	
	@Before("undo()")
	public void undoLog(JoinPoint jp)
	{System.out.println("UNDO!---------------------------------------"+
			"-----------------------------------------------");	}
	@Before("redo()")
	public void redoLog(JoinPoint jp)
	{System.out.println("REDO!---------------------------------------"+
			"-----------------------------------------------");	}
	
}
