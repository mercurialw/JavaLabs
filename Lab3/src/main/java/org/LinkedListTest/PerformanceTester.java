package org.LinkedListTest;

/**
 * Интерфейс PerformanceTester задает контракт для тестирования производительности коллекций.
 * Содержит методы для добавления, получения и удаления элементов в коллекции.
 */
public interface PerformanceTester {

    /**
     * Тестирует производительность операции добавления элементов в коллекцию.
     *
     * @param iterations количество итераций добавления элементов
     */
    void testAdd(int iterations);

    /**
     * Тестирует производительность операции получения элементов из коллекции.
     *
     * @param iterations количество итераций получения элементов
     */
    void testGet(int iterations);

    /**
     * Тестирует производительность операции удаления элементов из коллекции.
     *
     * @param iterations количество итераций удаления элементов
     */
    void testRemove(int iterations);
}