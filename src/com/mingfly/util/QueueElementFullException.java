package com.mingfly.util;

/**
 * Created by zhuheng on 2014/5/7.
 */
public class QueueElementFullException  extends RuntimeException
{
    public QueueElementFullException() {

    }

    public QueueElementFullException(String message) {
        super(message);
    }

    public QueueElementFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueElementFullException(Throwable cause) {
        super(cause);
    }
}
