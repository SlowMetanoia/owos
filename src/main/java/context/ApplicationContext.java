package context;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import owo.Doc;
import owo.DocxRedactor;

@Configuration
@ComponentScan("owo")
@ComponentScan("context")
@Component
public class ApplicationContext {
	@Bean
	public DocxRedactor getDocx() {
		Doc docx = new Doc<ArrayList<String>>("context-created","docx", new ArrayList<String>());
		DocxRedactor result = new DocxRedactor(docx);
		result.addString("Альтмир от браги бледен,");
		result.addString("Дай мне рог, я выпью.");
		result.addString("Ливнем она из рога");
		result.addString("Сквозь усы прольётся");
		result.addString("Ты беды не чуешь,");
		result.addString("Ливень мечей зовущий");
		result.addString("Слушай вису скальда,");
		result.addString("Одина ливень шумный");
		result.addString("\t\tЭгиль Скалагримсон,");
		result.addString("\t\tСага об Эгиле");
		result.save();
		System.out.println(result.Saves);
		System.out.println(result.Document);
		return result;
	}
}
