public class Main {

    public static void main(String[] args) {
        // Обобщения Generics
        // Оболочка типов
        // int - Integer
        // char - Charackter// оболочка типов - классы

        Account<Integer> acc3 = new Account<Integer>(2589, 4000);// вот вторых <> скобках необязательно указывать тип
        int acc3Id = acc3.getId();
        System.out.println(acc3Id);

        Account<String> acc4 = new Account<String>("2589", 4000);
        String acc4Id = acc4.getId();
        System.out.println(acc4Id);

        Account acc1 = new Account(2334, 5000);
        int acc1Id = (int) acc1.getId(); // (int) => Object преобразуется в int
        System.out.println(acc1Id);

        Account acc2 = new Account("215546554", 6000);
        String acc2Id = (String) acc2.getId(); // (String) => Object преобразуется в String
        System.out.println(acc2Id);

        Object obj = acc2.getId();
        System.out.println(obj);

//      int i = (int) acc4.getId(); // НЕЛЬЗЯ поменять тип String на int!!! Благодаря типу T подчеркивает!

        int a = 1;
        Integer j = 2;

//      int Array[][]  = {[3],[5]};
//
//        for (int i = 0; i < Array.length, i++) {
//            for (int j = 0, j < Array.length, j++)
//        }


    }
}
