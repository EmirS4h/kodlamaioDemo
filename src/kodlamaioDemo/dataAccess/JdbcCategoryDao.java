package kodlamaioDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	private List<Category> categories;

	public JdbcCategoryDao() {
		categories = new ArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		this.categories.add(category);
		System.out.println("JDBC ile eklendi " + category.getCategoryName());
	}

	@Override
	public List<Category> getAll() {
		return this.categories;
	}

}
