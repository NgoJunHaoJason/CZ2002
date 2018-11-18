package registration;

import java.util.ArrayList;
import universityMembers.Student;
import courses.Course;
import grading.MarksEntryInterface;
import grading.OverallResult;

/**
 * 
 * @version 1.3
 * @since 2018/11/13
 * @author Jason
 *
 */
public class Registration
{
	private Student registeredStudent;
	private Course registeredCourse;
	private ArrayList<Integer> lessonIDArrayList;
	private OverallResult overallResult;
	
	public Registration(Student student, Course course, ArrayList<Integer> lessonIDArrayList)
	{
		this.registeredStudent = student;
		this.registeredCourse = course;
		this.lessonIDArrayList = lessonIDArrayList;
		this.overallResult = new OverallResult(course.getAllComponentsWeightage());
	}
	
	public Student getRegisteredStudent()
	{
		return registeredStudent;
	}
	
	public Course getRegisteredCourse()
	{
		return registeredCourse;
	}
	public ArrayList<Integer> getLessonArrayList() 
	{
		return lessonIDArrayList;
	}
	
	public OverallResult getOverallResult()
	{
		return overallResult;
	}
	public void setOverallResult(OverallResult overallResults)
	{
		this.overallResult = overallResults;
	}

	public void enterMarks()
	{
		MarksEntryInterface.enterMarksForCourse(this);
	}
	
	@Override
	public String toString()
	{
		return "CourseRegistrationRecord [student: " + registeredStudent.toString() + ", course: " + 
				registeredCourse.getCourseCode() + ' ' + registeredCourse.getName() + ']';
	}

}
