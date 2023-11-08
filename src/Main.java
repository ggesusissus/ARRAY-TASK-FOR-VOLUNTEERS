public class Main {
    public static void main(String[] args) {
        int[] tab1 = new int[] {1,1,2,-1,2,-1};
        int[] tab2  = {3, 2, -2, 5, -3};
        int[] tab3  = {1,2,3,-4};
        int[] tab4 = {1,1};
        Calculation(tab1);
        Calculation(tab2);
        Calculation(tab3);
        Calculation(tab4);
    }
    static void Calculation(int[] tab)
    {
        int FirstNum = 0,SecondNum = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] == -tab[i]) {
                    FirstNum = tab[j];
                    SecondNum = tab[i];
                }
            }
        }
        if (FirstNum == SecondNum)
        {
            System.out.println("lack of pair");
        }
        else
        {
            System.out.println("FirstNum: " + FirstNum + " SecondNum: " + SecondNum);
        }

    }
}