package Bai_Tap1;

public class Common {
    public static String giaiB1(float a, float b){
        if (a==0)
            if (b==0)
                return "Phương trình vô số nghiệm !!!";
            else
                return "Phương trình vô nghiêm !!!";
        else
            return ""+(-b/a);
    }
    public static String giaiB2(float a, float b, float c){
        if (a==0) {
            return giaiB1(b, c);
        }
        else {
            float d= b*b-4*a*c;
            if (d<0){
                return "Phuong trinh bac 2 vo nghiem !!!";
            }else if(d==0){
                return "x1=x2="+(-b/(2*a));
            }else {
                float x1=(float)(-b+ Math.sqrt(d))/(2*a);
                float x2=(float)(-b+ Math.sqrt(d))/(2*a);
                return "x1= "+x1+" x2= "+x2;
            }

        }
    }
}
