package owo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(context.ApplicationContext.class);
		DocxRedactor docxRedactor = ctx.getBean(DocxRedactor.class);
		docxRedactor = new DocxRedactor(docxRedactor.Document);
		System.out.println(docxRedactor.Saves);
		System.out.println(docxRedactor.toString());
		docxRedactor.save();
		docxRedactor.addString("Лишняя строка");
		docxRedactor.save();
		System.out.println(docxRedactor.Saves); 
		System.out.println(docxRedactor.toString());
		docxRedactor.undo();
		System.out.println(docxRedactor.toString());
		docxRedactor.save();
		System.out.println(docxRedactor.toString());
		ctx.close();
		
	}
}
