package in.ashokit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OfficeContro
{
	@Autowired
	private OfficeSrvice service;
	
	@GetMapping("/office")
	public ModelAndView Loadform()
	{
		ModelAndView mac=new ModelAndView();
		mac.addObject("Oobj", new Officedetalis());
		mac.setViewName("index");
		return mac;
	}

	
	
	@PostMapping("/office")
	public ModelAndView SaveDetalis(Officedetalis o)
	{
		ModelAndView max=new ModelAndView();
		 boolean savedetalis = service.Savedetalis(o);
		max.addObject("msg", "Detalis Saved");
		max.addObject("Oobj",new Officedetalis());
		max.setViewName("index");
		return max;
	}
	
	@GetMapping("/O")
	public ModelAndView getAllDetlais()
	{
		ModelAndView mas=new ModelAndView();
		mas.addObject("obj", service.getAllDetalis());
		mas.setViewName("view");
		return mas;
	}
	
	@GetMapping("/delete")
	public ModelAndView deletedetalis(@RequestParam("oId")Integer oId)
	{
		ModelAndView mae=new ModelAndView();
		service.deletedetalis(oId);
		List<Officedetalis> allDetalis = service.getAllDetalis();
		mae.addObject("dobj", allDetalis);
		mae.setViewName("view");
		return mae;
	}
	
	
	
	@GetMapping("/edit")
	public ModelAndView Editdetalis(@RequestParam("oId")Integer oId)
	{
		ModelAndView mag=new ModelAndView();
		Officedetalis editById = service.editById(oId);
		mag.addObject("eobj", editById);
		mag.setViewName("index");
		return mag;
		
	}
	
	
	
	
	

}
