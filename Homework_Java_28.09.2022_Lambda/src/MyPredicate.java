//Определяем свой функциональный интерфейс
@FunctionalInterface
interface MyPredicate {
    boolean test(String x, String y);

}