package Training;

public class Date {

    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println(month+"/"+day+"/"+year);
    }
}

class DateTest{
    public static void main(String[] args) {
        Date date = new Date(07,27,1999);
        date.display();
    }
}
