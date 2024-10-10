
public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject {
	void select();

	void insert();

	void update();

	void delete();
}

class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySQL DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySQL DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySQL DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySQL DB에서 삭제");
	}
}

class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}

