package exercises;

import java.util.Collections;
import java.util.function.Predicate;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		Collections.sort(JobCandidate.jobCandidates, (First, Second) -> Second.getSalaryRequired() - First.getSalaryRequired());
		System.out.println(JobCandidate.jobCandidates.toString());
		Predicate<JobCandidate> predicate = jc -> !jc.getTeacherName().contains("June");
		JobCandidate.jobCandidates.removeIf(predicate);
		System.out.println(JobCandidate.jobCandidates);
	}
		
	}

