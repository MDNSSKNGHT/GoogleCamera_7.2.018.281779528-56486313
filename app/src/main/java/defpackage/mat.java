package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class mat implements qpe, qpp {
    public mat(miz mizVar) {
    }

    @Override
    public void a(Object obj) {

    }

    @Override
    public void a(Throwable th) {

    }

    @Override
    public void a(Runnable runnable, Executor executor) {

    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object get() throws ExecutionException, InterruptedException {
        return null;
    }

    @Override
    public Object get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return null;
    }
}
