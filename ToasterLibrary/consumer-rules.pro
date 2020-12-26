-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose

-keep, allowobfuscation class com.test.toasterlibrary*
-keepclassmembers, allowobfuscation class * {
    *;
}
-keep public class com.test.toasterlibrary.ToasterMessage
-keep public class com.test.toasterlibrary.R
-keepclassmembernames class com.test.toasterlibrary.ToasterMessage{
                                                                      private <methods>;
                                                                        private <fields>;
                                                                      #!private *; also tried this but it didn't work
                                                                  }