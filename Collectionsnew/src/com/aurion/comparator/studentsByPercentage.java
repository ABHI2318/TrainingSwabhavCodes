package com.aurion.comparator;
import java.util.Comparator;
import com.aurion.model.studentHashsetModel;
public class studentsByPercentage implements Comparator<studentHashsetModel>{

	@Override
	public int compare(studentHashsetModel student1, studentHashsetModel student2) {
		
		
		
		return student1.getPercentage()-student2.getPercentage();
	}

}
