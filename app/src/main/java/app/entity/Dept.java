package app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Dept {
	@Id
	@Column(name = "deptno")
	private Integer deptno;
	
	@Column(name="dname")
	private String dname;
	
	@Column(name = "loc")
	private String loc;
	
}
