package com.example.quiz;

public class question {
     int s1;
   public String s[]={"q1) number of side of square",
           "q2) number of side of rectangle",
           "q3) number of side of triangle",
           "q4) number of side of prallelogram",
           "q5) number of side of rombus",
           "q6) number of side of circle",
           "q7) number of side of oval",
           "q8) number of side of kite",
           "q9) number of side of trapazium",
           "q10) number of side of quadrilateral"

   };
   private String option[]={"0","2","3","4"};
   private String answer[]={"4","4","3","4","4","0","0","4","4","4"};
   public String getq(int a){
       String q=s[a];
       return q;
   }
    public String getc1(int a){
        String q=option[0];
        return q;
    }
    public String getc2(int a){
        String q=option[1];
        return q;
    }
    public String getc3(int a){
        String q=option[2];
        return q;
    }
    public String getc4(int a){
        String q=option[3];
        return q;
    }
    public String answer(int a){
        String q=answer[a];
        return q;
    }
    public void sets(int a){
       this.s1=a;
    }
    public String gets(){
       String s=Integer.toString(s1);
       return s;
    }
}
