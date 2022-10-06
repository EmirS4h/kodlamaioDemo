package kodlamaioDemo.business;

import kodlamaioDemo.core.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) {
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
