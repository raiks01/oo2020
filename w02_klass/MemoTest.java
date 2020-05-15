package app;

public class MemoTest {
    public static void main(String[] args) {
        Memo memo1 = new Memo();
        Memo memo2 = new Memo("15. jaanuar", "9:12" ,"Trip", "Nothing special kiire trip linna");
        Memo memo3 = new Memo("1. veebruar", "18:33" ,"Already new month" , "jaanuar lendas nii kiiresti, et jube");
        Memo memo4 = new Memo("15. aprill", "21:02" ,"Ei teagi enam", "pole siia enam eriti midagi kirjutada kui midagi teha ei ole ja midagi meeles pidada pole");
        Memo[] memos = {memo1, memo2, memo3, memo4};
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