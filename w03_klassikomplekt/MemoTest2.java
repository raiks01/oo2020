package app;

public class MemoTest2 {
    public static void main(String[] args) {
        Memo2 memo1 = new Memo2();
        Memo2 memo2 = new Memo2("15. jaanuar", "9:12" ,"Trip", "Nothing special kiire trip linna");
        Memo2 memo3 = new Memo2("1. veebruar", "18:33" ,"Already new month" , "jaanuar lendas nii kiiresti, et jube");
        Memo2 memo4 = new Memo2("15. aprill", "21:02" ,"Ei teagi enam", "pole siia enam eriti midagi kirjutada kui midagi teha ei ole ja midagi meeles pidada pole");
        Memo2[] memos = {memo1, memo2, memo3, memo4};
        int count = 1;
        

        for(int i = 0; i < memos.length; i++){
            System.out.println(count + i + ". | " + memos[i].getDate() + " | " + memos[i].getTime() + " | " + memos[i].getMemoName());
            System.out.println(memos[i].getDescription());
            if(memos.length > i + 1) {
                System.out.println(" ");
            }
        }
    }
}