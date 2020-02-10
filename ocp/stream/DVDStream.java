package ocp.stream;

import java.util.stream.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class DVDStream{
  public static void main(String[] args){
    try(Stream<String> stream = Files.lines(Paths.get("ocp/stream/dvdinfo.txt"))){
      List<DVDInfo> DVDList = stream.map(l -> {String[] strs = l.split("/");
                                                return new DVDInfo(strs[0], strs[1], strs[2]);})
                                    .filter( d -> d.getGenre().equals("sci-fi"))
                              .collect(Collectors.toCollection(ArrayList::new));
//stream is already closed after the termainate operation!
      System.out.println("DVDInfo list is: ");
      DVDList.forEach(System.out::println);
      System.out.println("***************************");
Stream<String> stream1 = Files.lines(Paths.get("ocp/stream/dvdinfo.txt"));
    String ss = stream1.collect(Collectors.joining(",","start ", "end" ));
    System.out.println(ss);

    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
