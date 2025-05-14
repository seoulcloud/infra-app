package app.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Emp;
import app.repository.EmpRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmpAPIController {

	private final EmpRepository empRepository;
	
	// add feature : getEmps, KJY
	@GetMapping("/api/emps")
	public List<Emp> getEmps() {
		return empRepository.findAll();
	}
}
