package com.tencent.mm.model;

import com.tencent.mm.a.f;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class w
{
  public static String a(String paramString, long paramLong)
  {
    String str1 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(paramLong));
    if ((paramString != null) && (paramString.length() > 1));
    for (String str2 = str1 + f.d(paramString.getBytes()).substring(0, 7); ; str2 = str1 + "fffffff")
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str2);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(paramLong % 65535L);
      String str3 = String.format("%04x", arrayOfObject);
      return str3 + (100L + paramLong % 7L);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.w
 * JD-Core Version:    0.6.2
 */