
public class getInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EmpDept emp = new EmpDept("이지나", 3000, "교육부");
    System.out.println("이름:" +emp.nameString+" 연봉:"+emp.salary+" 부서:"+emp.departMent);
    emp.print();
	}
	
	

}
