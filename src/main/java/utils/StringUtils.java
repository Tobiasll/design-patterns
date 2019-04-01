package utils;

public class StringUtils {

  public static String getCamelCaseStringAndToUpCase(String s) {

    StringBuilder stringBuilder = new StringBuilder(s.charAt(0) + "");

    for (int i = 1; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c >= 'A' && c <= 'Z') {
        stringBuilder.append('_').append(c);
      } else {
        stringBuilder.append(c);
      }
    }
    return stringBuilder.toString().toUpperCase();
  }


}
