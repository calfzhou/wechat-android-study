package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class bc
{
  private static String ac(Object paramObject)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject;
    if ((paramObject instanceof byte[]))
    {
      localObject = (byte[])paramObject;
      localStringBuilder.append("##");
    }
    while (i < localObject.length)
    {
      String str2 = Integer.toHexString(0xFF & localObject[i]);
      if (str2.length() == 1)
        str2 = "0" + str2;
      localStringBuilder.append(str2);
      i++;
      continue;
      String str1 = paramObject.toString();
      if (ch.jb(str1))
        return "";
      try
      {
        byte[] arrayOfByte = str1.getBytes("UTF-8");
        localObject = arrayOfByte;
        boolean bool = ch.B((byte[])localObject);
        i = 0;
        if (bool)
          return "";
      }
      catch (Exception localException)
      {
        z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException, "", new Object[0]);
        return "";
      }
    }
    return localStringBuilder.toString();
  }

  public static String j(Object[] paramArrayOfObject)
  {
    String str = "";
    int i = paramArrayOfObject.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfObject[j];
      str = str + ac(localObject) + ",";
    }
    z.v("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", "to buffer:" + str);
    return str + ";";
  }

  private static Object zM(String paramString)
  {
    if ((ch.jb(paramString)) || (paramString.length() % 2 != 0))
      return "";
    boolean bool = paramString.startsWith("##");
    if (bool)
      paramString = paramString.replace("##", "");
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    while (i < paramString.length())
      try
      {
        arrayOfByte[(i / 2)] = ((byte)Integer.parseInt(paramString.substring(i, i + 2), 16));
        i += 2;
      }
      catch (Exception localException2)
      {
        z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException2, "", new Object[0]);
        return "";
      }
    if (bool)
      return arrayOfByte;
    try
    {
      String str = new String(arrayOfByte, "UTF-8");
      return str;
    }
    catch (Exception localException1)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localException1, "", new Object[0]);
    }
    return "";
  }

  public static Object[] zN(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    Object[] arrayOfObject = new Object[arrayOfString.length];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfObject[i] = zM(arrayOfString[i]);
    return arrayOfObject;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bc
 * JD-Core Version:    0.6.2
 */