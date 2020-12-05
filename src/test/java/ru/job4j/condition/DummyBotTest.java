package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertEquals("Привет, умник.", DummyBot.answer("Привет, Бот."));
    }

    @Test
    public void whenByeBot() {
        assertEquals("До скорой встречи.", DummyBot.answer("Пока."));
    }

    @Test
    public void whenUnknownBot() {
        assertEquals("Это ставит меня в тупик. Задайте другой вопрос.",
                DummyBot.answer("Сколько будет 2 + 2?"));
    }
}