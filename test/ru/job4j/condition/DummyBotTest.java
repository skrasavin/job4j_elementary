package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenHelloBotthenHelloNerd() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String result = DummyBot.answer(in);
        assertThat(result, is(expected));
    }

    @Test
    public void whenByethenSeeYourLater() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String result = DummyBot.answer(in);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAnotherQuestionthenAnotherAnswer() {
        String in = "Любая другая фраза.";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String result = DummyBot.answer(in);
        assertThat(result, is(expected));
    }
}