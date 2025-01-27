package lab10.Task3;
/*
* Так как операции чтения и записи значения переменной count не атомарны, то мы можем столкнуться с проблемой "состояние гонки".
*  Что б избежать этой проблемы я использовал synchronized,
*  то есть в определенный момент времени только один поток может использовать ресурс
* synchronized устанавливает блокировку на объект Counter, когда поток вызывает метод increment или getCount.
* Снимает блокировку после завершения выполнения метода.
* Гарантирует атомарность операций внутри метода. */

public class Counter {

    private int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public synchronized int getCount() {
        return count;
    }
}
