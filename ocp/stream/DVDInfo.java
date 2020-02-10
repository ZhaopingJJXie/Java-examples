package ocp.stream;

public class DVDInfo{
  String title;
  String genre;
  String leadActor;

  DVDInfo(String t, String g, String l){
    title = t;
    genre = g;
    leadActor = l;
  }

  public String toString()
{
  return title +  " / " + genre + " / " + leadActor;
}

public String getTitle(){return title;}
public String getGenre(){return genre;}
public String getLeadActor(){return leadActor;}
}
