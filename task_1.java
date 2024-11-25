@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);

    // Используем assertEquals для проверки результата
    assertEquals("Ожидалось, что метод checkIsAdult вернёт true для возраста больше 18", true, isAdult);
}