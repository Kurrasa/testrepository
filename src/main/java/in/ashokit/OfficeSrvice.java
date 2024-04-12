package in.ashokit;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class OfficeSrvice {
	@Autowired
	private Officerepod repod;

	public boolean Savedetalis(Officedetalis o) {
		Officedetalis saveDetalis = repod.save(o);
		if (saveDetalis.getoId() != null) {
			return true;
		}
		return false;
	}

	public List<Officedetalis> getAllDetalis() {
		List<Officedetalis> all = repod.findAll();
		return all;
	}
	
	public void deletedetalis(Integer oId)
	{
		repod.deleteById(oId);
	}
	public Officedetalis editById(Integer oId)
	{
		Optional<Officedetalis> byId = repod.findById(oId);
		if(byId.isPresent())
		{
			return byId.get();
		}
		return null;
	}
	
	

}
