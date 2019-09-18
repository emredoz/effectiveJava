package com.efectivejava;

public class ExceptionHandling {

    public static void main(String[] args) {
        throwException();
    }

    public static void throwException(){
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Exception handle edilmeli veya fırlatılmalıdır.");
    }

    public static void throwRuntimeException(){
        System.out.println("RuntimeException handle edilmeye veya fırlatmaya zorlanmaz.");
        throw new RuntimeException();
    }

    public static void throwError(){
        System.out.println("Error handle edilmeye veya fırlatmaya zorlanmaz.");
        throw new OutOfMemoryError();
    }
}
