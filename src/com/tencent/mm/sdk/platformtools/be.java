package com.tencent.mm.sdk.platformtools;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class be
{
  public static bf iEQ = null;

  public static String AT(String paramString)
  {
    String str = AV(paramString).replace("+", "");
    if (iEQ == null)
      iEQ = new bf();
    Iterator localIterator = iEQ.iER.iterator();
    while (localIterator.hasNext())
    {
      bg localbg = (bg)localIterator.next();
      if (str.startsWith(localbg.iET))
      {
        int i = str.length() - localbg.iET.length();
        if ((i >= localbg.iEU) && (i <= localbg.iEV))
          return localbg.iET;
      }
    }
    return null;
  }

  public static String AU(String paramString)
  {
    if (ch.jb(paramString));
    while (!ch.ji(paramString).booleanValue())
      return paramString;
    new be();
    String str = "86";
    if (paramString.startsWith("+"))
    {
      paramString = paramString.replace("+", "");
      str = AT(paramString);
      if (str != null)
        paramString = paramString.substring(str.length());
    }
    return bC(str, paramString);
  }

  public static String AV(String paramString)
  {
    if (ch.jb(paramString))
      return "";
    return paramString.replaceAll("[\\.\\-\\ ]", "").trim();
  }

  private static int ag(String paramString, int paramInt)
  {
    Pattern localPattern = Pattern.compile(paramString);
    String str = "1";
    for (int i = 0; (i < paramInt) && (!localPattern.matcher(str).find()); i++)
      str = str + "1";
    return i + 1;
  }

  public static String bC(String paramString1, String paramString2)
  {
    Object localObject;
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)))
      localObject = paramString2;
    while (true)
    {
      return localObject;
      if (iEQ == null)
        iEQ = new bf();
      bg localbg;
      bh localbh;
      label345: label486: 
      do
      {
        StringBuffer localStringBuffer2;
        int n;
        do
        {
          Iterator localIterator1 = iEQ.iER.iterator();
          Iterator localIterator2;
          while (!localIterator2.hasNext())
          {
            do
            {
              if (!localIterator1.hasNext())
                break;
              localbg = (bg)localIterator1.next();
            }
            while ((localbg.iET == null) || (!paramString1.trim().toLowerCase().equals(localbg.iET.trim().toLowerCase())) || (localbg.iEW == null));
            localObject = AV(paramString2);
            if ((localObject != null) && (((String)localObject).length() > localbg.iEU))
              break;
            localIterator2 = localbg.iEW.iterator();
          }
          localbh = (bh)localIterator2.next();
          if (!ch.jb(localbh.iEX))
            break label486;
          if (localbg.iEW.size() <= 1)
            break label345;
          localStringBuffer2 = new StringBuffer();
          localStringBuffer2.append((String)localObject);
          n = ((String)localObject).length();
        }
        while (n > ag(localbh.iEZ, localbg.iEV));
        while (localStringBuffer2.toString().length() < localbg.iEV)
          localStringBuffer2.append("0");
        String str2 = x(localbh.iEZ, localbh.iEY, localStringBuffer2.toString());
        int i1 = 0;
        localObject = str2;
        for (int i2 = 0; i2 < ((String)localObject).length(); i2++)
        {
          int i3 = ((String)localObject).charAt(i2);
          if (i1 >= n)
            localObject = ((String)localObject).substring(0, i2);
          if ((i3 != 32) && (i3 != 45) && (i3 != 12290))
            i1++;
        }
        break;
        StringBuffer localStringBuffer3 = new StringBuffer();
        localStringBuffer3.append((String)localObject);
        int i4 = ((String)localObject).length();
        while (localStringBuffer3.toString().length() < localbg.iEV)
          localStringBuffer3.append("0");
        String str3 = x(localbh.iEZ, localbh.iEY, localStringBuffer3.toString());
        int i5 = 0;
        localObject = str3;
        for (int i6 = 0; i6 < ((String)localObject).length(); i6++)
        {
          int i7 = ((String)localObject).charAt(i6);
          if (i5 >= i4)
            localObject = ((String)localObject).substring(0, i6);
          if ((i7 != 32) && (i7 != 45) && (i7 != 12290))
            i5++;
        }
        break;
      }
      while (!Pattern.compile(localbh.iEX).matcher((CharSequence)localObject).lookingAt());
      StringBuffer localStringBuffer1 = new StringBuffer();
      localStringBuffer1.append((String)localObject);
      int i = ((String)localObject).length();
      while (localStringBuffer1.toString().length() < localbg.iEV)
        localStringBuffer1.append(((String)localObject).charAt(i - 1));
      String str1 = x(localbh.iEZ, localbh.iEY, localStringBuffer1.toString());
      int j = 0;
      localObject = str1;
      for (int k = 0; k < ((String)localObject).length(); k++)
      {
        int m = ((String)localObject).charAt(k);
        if (j >= i)
          localObject = ((String)localObject).substring(0, k);
        if ((m != 32) && (m != 45) && (m != 12290))
          j++;
      }
    }
    return paramString2;
  }

  private static String x(String paramString1, String paramString2, String paramString3)
  {
    Pattern localPattern = Pattern.compile(paramString1);
    String str = "";
    Matcher localMatcher = localPattern.matcher(paramString3);
    if (localMatcher.find())
      str = localMatcher.replaceAll(paramString2);
    return str;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.be
 * JD-Core Version:    0.6.2
 */