import java.io.*

public class Dept implements Serializable {
	private Integer deptno ;
	private String dname ;
	private String loc ;
	private Date createdAt ;
	private Date updatedAt ;
	public void setDeptno(Integer deptno){
		this.deptno = deptno ;
	}
	public Integer getDeptno(){
		return this.deptno ;
	}
}