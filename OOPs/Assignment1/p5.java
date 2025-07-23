package OOPs.Assignment1;

public class p5 {
    public static void main(String[] args) {
        holiday h1 = new holiday("Diwali",24,"Oct");
        holiday h2 = new holiday("Holi",10,"Mar");
        holiday h3 = new holiday("MakarSankranti",14,"Jan");
        holiday h4 = new holiday("Christmas",25,"Dec");
        holiday h5 = new holiday("GaneshChaturthi",27,"Aug");
        holiday h6 = new holiday("Janmashtami",16,"Aug");

        System.out.println("GaneshChaturthi and Janmashtami in same month: " + h5.inSameMonth(h6));
        System.out.println("GaneshChaturthi and Diwali in same month: " + h5.inSameMonth(h1));

        holiday[] holidays = {h1, h2, h3, h4, h5, h6};
        System.out.println("Average Day of Holidays: " + h1.avgDate(holidays));
    }
}

class holiday{
    String name;
    int day;
    String month;

    public holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(holiday h) {
        if (month == h.month){
            return true;
        }
        return false;
    }

    public double avgDate(holiday[] holidays) {
        double sum = 0;
        for (int i = 0; i < holidays.length; i++) {
            sum += holidays[i].day;
        }
        return sum / holidays.length;
    }
}
