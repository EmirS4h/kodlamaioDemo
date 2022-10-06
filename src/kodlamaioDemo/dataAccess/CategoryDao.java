package kodlamaioDemo.dataAccess;

import java.util.List;

import kodlamaioDemo.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();
}
