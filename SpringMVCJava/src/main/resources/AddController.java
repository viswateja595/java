import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	public String add(@RequestParam("t1") int i,@RequestParam("t2") int j)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		
		int k=i+j;
		mv.addObject("result", k);
		
		return "result";
	}
}
