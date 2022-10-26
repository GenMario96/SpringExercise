 
package it.gennaro.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloWorldController {
	private String message = "Bella ragass, so genny";
	private String message2 = "E STO PROVANDO NUOVE COSE";
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("message", this.message);
		model.put("nuovomess", this.message2);
		return "helloWorld";
	}
}