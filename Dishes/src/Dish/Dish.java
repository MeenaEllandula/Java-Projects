package Dish;

public class Dish implements Comparable<Dish> {

	private String name;
	private boolean vegeterian;
	private int calories;
	private DishType dishType;
	
	
	@Override
	public int compareTo(Dish item2) {
		if(this.calories > item2.calories) {
			return 1;
		}else if(this.calories < item2.calories) {
			return -1;
		}
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((dishType == null) ? 0 : dishType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegeterian ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (calories != other.calories)
			return false;
		if (dishType != other.dishType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegeterian != other.vegeterian)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegeterian=" + vegeterian + ", calories=" + calories + ", dishType=" + dishType
				+ "]";
	}

	public Dish() {
		
	}
	

public Dish(String name, boolean vegeterian, int calories, DishType dishType) {
		super();
		this.name = name;
		this.vegeterian = vegeterian;
		this.calories = calories;
		this.dishType = dishType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(boolean vegeterian) {
		this.vegeterian = vegeterian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public DishType getDishType() {
		return dishType;
	}

	public void setDishType(DishType dishType) {
		this.dishType = dishType;
	}
	
}
