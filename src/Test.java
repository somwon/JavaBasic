
public class Test {
	String sSubject;
	int nPoint;
	
	Test(){}
	
     Test(String a,int b) {
    	  sSubject = a;
    	  nPoint = b;
     }
     
	void setPoint(String s, int p) {
		sSubject = s;
		nPoint = p;
	}
	
	String getPoint() {
		return sSubject + " : " + nPoint;
	}

}
