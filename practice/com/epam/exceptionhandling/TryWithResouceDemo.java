package com.epam.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// before 1.6 programmer is responsible to close the resources used.
// so, in case of any exception may raise, finally needs to be written mandatory.
// so try with resouce is introduced to reduce complexity and length of the code
// only in this case try block may not be followed by any catch or finally
// Resourced opened in try gets closed once the control reaches end of the try block.
// The condition is they needs to implement AutoClosable interface that contains public void close() throws Excepiton method.
// All the resouce reference variables inside try block are implicitly final
public class TryWithResouceDemo {
    public static void main(String[] args) throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt")) ){
            br.readLine();
//            the below assignmet gives error as br is final implicitly
//            br = new BufferedReader( new FileReader("input.txt"));
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
