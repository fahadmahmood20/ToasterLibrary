
-keep public class com.test.toasterlibrary.ToasterMessage
-keep public class com.test.toasterlibrary.R
-keepattributes class com.test.toasterlibrary.ToasterMessage
#-keepclassmembernames class com.test.toasterlibrary.ToasterMessage{
#                                                                      public <methods>;
#                                                                      public <fields>;
#                                                                      #!private *; also tried this but it didn't work
#                                                                  }