package by.academy.week1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

/**
 * Solution for week 1 task 3.
 * <p>
 * Description:1.3 Очередь в супермаркете
 * В супермаркете есть определенное количество
 * касс для обслуживания покупателей.
 * У каждого покупателя есть корзина товаров. Кассир затрачивает
 * ровно 1 секунду для того, чтобы пробить каждый товар в корзине.
 * Следовательно, если в корзине покупателя 10 товаров,
 * то кассир сможет обслужить его ровно за 10 секунд.
 * 1.3 Очередь в супермаркете Задача - написать сервис,
 * который возвращает общее время в секундах,
 * которое было затрачено кассирами для обслуживания всех покупателей.
 * Принимать во внимание, что покупатели будут
 * обслуживаться ровно в том порядке,
 * в котором они идут в списке.
 * Для решения воспользоваться классами из  пакета java.util.concurrent.
 */
public class Cashiers {
    private CopyOnWriteArrayList<Integer> buyers;
    private int numberOfCashiers;
    private Iterator<Integer> iterator;

    public static int computeteTotalDuration(int numberOfCashiers, List<Integer> buyers) {
        Cashiers cashiers = new Cashiers();
        cashiers.setBuyers(new CopyOnWriteArrayList<>(buyers));
        cashiers.setNumberOfCashiers(numberOfCashiers);
        cashiers.init();

        ExecutorService service = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> durations = new ArrayList<>();
        for (int i = 0; i < cashiers.getNumberOfCashiers(); i++)
            durations.add(service.submit(cashiers.new Cashier()));
        int totalDurationOfCustomerService = 0;
        for (Future<Integer> future : durations) {
            try {
                int result = future.get();
                totalDurationOfCustomerService = (result > totalDurationOfCustomerService) ? result : totalDurationOfCustomerService;
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                service.shutdown();
            }
        }
        return totalDurationOfCustomerService;
    }

    private void init() {
        setIterator(getBuyers().iterator());
    }

    private Integer evaluateDurationPerCashier() {
        int totalDuration = 0;
        while (iterator.hasNext()) {
            int duration = iterator.next();
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            totalDuration += duration;
        }
        return totalDuration;
    }

    private CopyOnWriteArrayList<Integer> getBuyers() {
        return buyers;
    }

    private void setBuyers(CopyOnWriteArrayList<Integer> buyers) {
        this.buyers = buyers;
    }

    private void setIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    private int getNumberOfCashiers() {
        return numberOfCashiers;
    }

    private void setNumberOfCashiers(int numberOfCashiers) {
        this.numberOfCashiers = numberOfCashiers;
    }

    private class Cashier implements Callable<Integer> {
        @Override
        public Integer call() {
            return evaluateDurationPerCashier();
        }
    }
}


