
public class Student {
	int nId;
	String sName;
	int nSubnum;
	Test[] list;
	
	Student(){
		
	}
	
	Student(int i, String n, int s){
		nId = i;
		sName = n;
		nSubnum = s;
		list = new Test[s];
		
		for(int j = 0; j < s; j++) {
			list[j] = new Test();
		}
	}
	
	String getName() {
		return nId + " : " + sName;
	}
	
	int getGrade() {
		int nSum = 0;
		
		for(int i = 0 ; i < nSubnum; i++) {
			nSum += list[i].nPoint;
		}
		
		return nSum;
		
	}
	
}
