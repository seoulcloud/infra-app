package app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Dept;
import app.repository.DeptRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeptService {
	
	private final DeptRepository deptRepository;

	@Transactional
	public List<Dept> getDepts() {
		return deptRepository.findAll();
	}
	
	@Transactional
	public Dept getDeptByDeptno(Integer deptno) {
		return deptRepository.findById(deptno)
								.orElseThrow(() -> new EntityNotFoundException("정보가 존재하지 않습니다."));
	}

	@Transactional
	public Dept registerDept(Dept newDept) {
		return deptRepository.save(newDept);
	}
	
	@Transactional
	public Dept updateDept(Dept updateDept, Integer deptno) {
		Dept dept = deptRepository.findById(deptno)
									.orElseThrow(() -> new EntityNotFoundException("정보가 존재하지 않습니다."));
		
		dept.setDname(updateDept.getDname());
		dept.setLoc(updateDept.getLoc());
		
		return dept;
	}

	@Transactional
	public Dept deleteDeptByDeptno(Integer deptno) {
		Dept dept = deptRepository.findById(deptno)
									.orElseThrow(() -> new EntityNotFoundException("정보가 존재하지 않습니다."));
		deptRepository.delete(dept);
		return dept;
	}
	
}
