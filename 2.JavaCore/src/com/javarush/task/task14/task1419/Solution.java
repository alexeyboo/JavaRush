package com.javarush.task.task14.task1419;

import org.w3c.dom.events.EventException;

import javax.crypto.ExemptionMechanismException;
import javax.swing.tree.ExpandVetoException;
import java.awt.image.RasterFormatException;
import java.io.EOFException;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new RasterFormatException("dfs");
        } catch (RasterFormatException e) {
            exceptions.add(e);
        }
        try {
            throw new RejectedExecutionException();
        } catch (RejectedExecutionException e) {
            exceptions.add(e);
        }
        try {
            throw new NegativeArraySizeException();
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }
        try {
            throw new GeneralSecurityException();
        } catch (GeneralSecurityException e) {
            exceptions.add(e);
        }
        try {
            throw new EmptyStackException();
        } catch (EmptyStackException e) {
            exceptions.add(e);
        }
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            exceptions.add(e);
        }







        //напишите тут ваш код

    }
}
