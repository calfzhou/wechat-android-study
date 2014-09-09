package c.a.g;

import c.a.b.b;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public final class c
{
  private static String CHARSET = "UTF-8";
  private static final Map kmF = Collections.unmodifiableMap(localHashMap);

  static
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("*", "%2A");
    localHashMap.put("+", "%20");
    localHashMap.put("%7E", "~");
  }

  public static String decode(String paramString)
  {
    d.b(paramString, "Cannot decode null object");
    try
    {
      String str = URLDecoder.decode(paramString, CHARSET);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new b("Charset not found while decoding string: " + CHARSET, localUnsupportedEncodingException);
    }
  }

  public static String encode(String paramString)
  {
    d.b(paramString, "Cannot encode null object");
    while (true)
    {
      Iterator localIterator;
      try
      {
        String str1 = URLEncoder.encode(paramString, CHARSET);
        localIterator = kmF.entrySet().iterator();
        str2 = str1;
        if (!localIterator.hasNext())
          return str2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new b("Charset not found while encoding string: " + CHARSET, localUnsupportedEncodingException);
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str3 = (String)localEntry.getKey();
      String str4 = (String)localEntry.getValue();
      String str2 = str2.replaceAll(Pattern.quote(str3), str4);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.g.c
 * JD-Core Version:    0.6.2
 */