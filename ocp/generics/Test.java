package ocp.generics;

import java.io.*;
   class LastError<T> {
        private T lastError;
        void setError(T t){
            lastError = t;
            System.out.println("LastError: setError");
        }
}
   class StrLastError<S extends CharSequence> extends LastError<String>{
        public StrLastError(S s) {
        }
        void setError(S s){//not overriding,but ouverloading
           System.out.println("StrLastError: setError");
        }
}
   class Test {
     public static void m1(Object obj){System.out.println("object");}
     public static void m1(CharSequence ch){System.out.println("charsequence");}

        public static void main(String []args) {
          m1("Java");//charsequence
           StrLastError<String> err = new StrLastError<String>("Error");
           err.setError("Last error");// LastError: setError

           //at compile time, in class LastError class {setErrot(T extends Object)}
           // in class StrLastError{setError( S extends CharSequence)}, they are overloaded
           //not overriding methods.
        }
}
