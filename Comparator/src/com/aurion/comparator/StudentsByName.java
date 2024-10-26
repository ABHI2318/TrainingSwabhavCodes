package com.aurion.comparator;
import java.util.Comparator;

import com.aurion.model.StudentModel;

public class StudentsByName implements Comparator<StudentModel> {

	@Override
	public int compare(StudentModel student1, StudentModel student2) {
		return student1.getName().compareTo(student2.getName());
	}

}
