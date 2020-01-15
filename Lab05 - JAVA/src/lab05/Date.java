package lab05;

public class Date {

    int month;
    int day;
    int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {

        this.month = m;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        this.day = d;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {

        this.year = y;
    }

    public Date() {

        this.month = 1;
        this.day = 1;
        this.year = 2019;
    }

    public Date(int m, int d, int y) {

        if (m <= 0 || m > 12) {
            this.month = 1;
        } else {
            this.month = m;
        }

        if (d <= 0 || d > 31) {
            this.day = 1;
        } else {
            this.day = d;
        }

        if (y <= 0 || y > 3000) {
            this.year = 2019;
        } else {
            this.year = y;
        }

    }

    public void displayDate() {
        System.out.println("The date you entered is: " + month + " / " + day + " / " + year);
    }

}
