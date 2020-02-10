package ocp.watchService;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class WatchServiceDemo{
  public static void main(String[] args) throws IOException  {
    Path dir = Paths.get("zoo");

    WatchService watcher = FileSystems.getDefault().newWatchService();
    dir.register(watcher, ENTRY_DELETE);

    while(true){
      WatchKey key;
      try{
        key = watcher.take();
      }catch(InterruptedException e){return;}
      for(WatchEvent<?> event  : key.pollEvents()){
        WatchEvent.Kind<?> kind = event.kind();
        System.out.println(kind.name());
        System.out.println(kind.type());
        System.out.println(event.context());
        String name = event.context().toString();
        if(name.equals("dir1")){
          System.out.format("directory deleted, now procede ");
          return;
        }
      }
      key.reset();
    }
  }

}
