package AssignmentOne;

public class Nine {

	public static void main(String[] args) {
		 int stu1[] = {41,50,60};
		 int stu2[] = {54,80,65};
		 int stu3[] = {48,55,83};
		 
		 int eachStudentTotal[] = new int[3]; 
		 int subStudentAve[] = new int[3]; 
		 
		 int eachSubjectAvg[] = new int[3]; 
		 
		 eachStudentTotal[0] = stu1[0]+stu1[1]+stu1[2];
		 eachStudentTotal[1] = stu2[0]+stu2[1]+stu2[2];
		 eachStudentTotal[2] = stu3[0]+stu3[1]+stu3[2];
		  
		 subStudentAve[0]= eachStudentTotal[0]/3;
		 subStudentAve[1]= eachStudentTotal[1]/3;
		 subStudentAve[2]= eachStudentTotal[2]/3;
		 
		 eachSubjectAvg[0] = (stu1[0]+stu2[0]+stu3[0])/3;
		 eachSubjectAvg[1] = (stu1[1]+stu2[1]+stu3[1])/3;
		 eachSubjectAvg[2] = (stu1[2]+stu2[2]+stu3[2])/3;
		 
		 for (int i = 0; i < 3; i++) {
			 
			 System.out.println();
			System.out.println("student "+(i+1)+" :");
			System.out.println("Total : "+eachStudentTotal[i]);
			System.out.println("Average : "+ subStudentAve[i]);
			
			for (int j = 0; j < 3; j++) {
				System.out.println("subject "+ (j+1) +" mark : "+ stu1[j] + 
						"  Subject "+ (i+1) +" Avg :"+eachSubjectAvg[i]);
			}
			 
		}
		 
		 
	}

}
