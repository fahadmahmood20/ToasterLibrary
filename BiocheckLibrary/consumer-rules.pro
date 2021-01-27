-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose

-keep, allowobfuscation class com.biocheck.toasterlibrary*
-keepclassmembers, allowobfuscation class * {
    *;
}
-keep public class com.biocheck.library.Calculations
-keep public class com.biocheck.library.R
-keepclassmembernames class com.biocheck.library.Calculations{
                                                                      private <methods>;
                                                                        private <fields>;
                                                                      #!private *; also tried this but it didn't work
                                                                  }