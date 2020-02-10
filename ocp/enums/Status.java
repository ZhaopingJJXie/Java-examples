package ocp.enums;

import java.awt.Color;

enum Status
{
  OFF ("Off"),
    // ON("On", "good"),
  TRAINING ("Training", new Color(255, 191, 128)),
  BEGINNER ("Beginner", new Color(128, 255, 138)),
  INTERMEDIATE ("Intermediate", new Color(128, 212, 255)),
  ADVANCED ("Advanced", new Color(255, 128, 128));

  public final String name;
  public final Color color;

  // public final String age;

 // final String defaultAge = "good";
public static  final Color defaultColor = Color.WHITE;
   // Status(String name, String age ){this.name = name; this.age = defaultAge;}
  Status(String name)
  {
    this.name = name;
    this.color = defaultColor;
  }
  Status(String name, Color color)
  {
    this.name = name;
    this.color = color;
  }
}
