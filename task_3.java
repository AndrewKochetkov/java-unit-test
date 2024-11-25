@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {17, false}, // Несовершеннолетний
                {18, true},  // Совершеннолетие (ровно 18)
                {19, true},  // Старше 18
                {21, true}   // Совершеннолетие в странах с 21 годом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals(
                "Ошибка: метод checkIsAdult вернул неверный результат для возраста " + age,
                result,
                isAdult
        );
    }
}