public class Date{
    public static void main(String args[]){
        DateTest d1=new DateTest(4, 11, 2005);
        System.out.println(+d1.getday()+"/"+d1.getmonth()+"/"+d1.getyear());


        

    }
}
class DateTest{
    int month,day,year;


      DateTest(int day,int month,int year){
        this.month=month;
        this.day=day;
        this.year=year;

    }
    void setmonth(int month){
        this.month=month;
    }
    void setday(int day){
        this.day=day;
    }
    void setyear(int year){
        this.year=year;
    }

    int getmonth(){
        return month;
    }
    int getday(){
        return day;

    }
    int getyear(){
        return year;
    }


}