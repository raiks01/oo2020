package app;

public class Memo2 {
    
    public int count;
    private String date;
    private String time;
    private String memoName;
    private String description;

    public Memo2(String date, String time ,String memoName, String description) {
        this.date = date;
        this.time = time;
        this.memoName = memoName;
        this.description = description;
    }

    public Memo2() {
        date = "2. aprill 2020";
        time = "14:56";
        memoName = "Läheb lappama";
        description = "päris pikalt juba istunud kodus. Tunnen et läheb käest ära";
    }

	public String getDate(){
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getMemoName(){
        return memoName;
    }

    public String getDescription(){
        return description;
    }

    public int getCount(){
        return count;
    }

}