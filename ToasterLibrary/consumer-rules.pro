-keep public class com.test.toasterlibrary.ToasterMessage
-keep public class com.test.toasterlibrary.R
-keepclassmembers class com.test.toasterlibrary.ToasterMessage{
                                                                      private <methods>;
                                                                        private <fields>;
                                                                      #!private *; also tried this but it didn't work
                                                                  }