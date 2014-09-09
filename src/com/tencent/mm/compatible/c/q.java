package com.tencent.mm.compatible.c;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;

public final class q
{
  private static Map dNp = null;

  private static String a(Map paramMap, String paramString)
  {
    return (String)paramMap.get(paramString);
  }

  private static String cw(String paramString)
  {
    if (paramString != null)
      try
      {
        if (paramString.length() > 0)
          while (!i(paramString.charAt(0)))
          {
            if (paramString.length() == 1)
              return null;
            String str = paramString.substring(1);
            paramString = str;
          }
      }
      catch (Exception localException)
      {
      }
    return paramString;
  }

  private static String cx(String paramString)
  {
    int j;
    for (int i = 0; ; i = j)
    {
      j = i + 1;
      try
      {
        if ((!i(paramString.charAt(i))) || (paramString.length() <= j))
        {
          int k = j - 1;
          if ((paramString.length() > k + 1) && (k > 0))
          {
            String str = paramString.substring(0, k);
            paramString = str;
          }
          return paramString;
        }
      }
      catch (Exception localException)
      {
        return paramString;
      }
    }
  }

  private static boolean i(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }

  public static Map mW()
  {
    if (dNp == null)
      dNp = nc();
    return dNp;
  }

  public static String mX()
  {
    if (dNp == null)
      dNp = nc();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(": ");
    localStringBuilder.append(a(dNp, "Features"));
    localStringBuilder.append(": ");
    localStringBuilder.append(a(dNp, "Processor"));
    localStringBuilder.append(": ");
    localStringBuilder.append(a(dNp, "CPU architecture"));
    localStringBuilder.append(": ");
    localStringBuilder.append(a(dNp, "Hardware"));
    localStringBuilder.append(": ");
    localStringBuilder.append(a(dNp, "Serial"));
    return localStringBuilder.toString();
  }

  public static boolean mY()
  {
    if (dNp == null)
      dNp = nc();
    if (dNp != null)
    {
      String str = a(dNp, "Features");
      if ((str != null) && (str.contains("neon")))
        return true;
    }
    return false;
  }

  public static boolean mZ()
  {
    try
    {
      if (Build.VERSION.SDK_INT >= 4);
      for (int i = 1; (i != 0) && (Build.class.getField("CPU_ABI").get(null).toString().startsWith("armeabi-v7")); i = 0)
      {
        boolean bool = mY();
        if (!bool)
          break;
        return true;
      }
      return false;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  public static boolean na()
  {
    if (dNp == null)
      dNp = nc();
    if (dNp != null)
    {
      String str = a(dNp, "CPU architecture");
      z.d("!24@L1cC8s87OdiHYjVaLdwXjw==", "arch " + str);
      if (str != null)
        try
        {
          if (str.length() > 0)
          {
            int i = Integer.parseInt(cx(cw(str)));
            z.d("!24@L1cC8s87OdiHYjVaLdwXjw==", "armarch " + i);
            if (i >= 6)
              return true;
          }
        }
        catch (Exception localException)
        {
        }
    }
    return false;
  }

  public static int nb()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu/").listFiles(new r()).length;
      return i;
    }
    catch (Exception localException)
    {
    }
    return 1;
  }

  // ERROR //
  public static java.util.HashMap nc()
  {
    // Byte code:
    //   0: new 178	java/util/HashMap
    //   3: dup
    //   4: invokespecial 179	java/util/HashMap:<init>	()V
    //   7: astore_0
    //   8: aconst_null
    //   9: astore_1
    //   10: new 181	java/lang/ProcessBuilder
    //   13: dup
    //   14: iconst_2
    //   15: anewarray 20	java/lang/String
    //   18: dup
    //   19: iconst_0
    //   20: ldc 183
    //   22: aastore
    //   23: dup
    //   24: iconst_1
    //   25: ldc 185
    //   27: aastore
    //   28: invokespecial 188	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   31: invokevirtual 192	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   34: invokevirtual 198	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   37: astore_1
    //   38: new 200	java/io/BufferedReader
    //   41: dup
    //   42: new 202	java/io/InputStreamReader
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 205	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   50: invokespecial 208	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   53: astore 6
    //   55: aload 6
    //   57: invokevirtual 211	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   60: astore 7
    //   62: aload 7
    //   64: ifnull +89 -> 153
    //   67: aload 7
    //   69: ldc 213
    //   71: iconst_2
    //   72: invokevirtual 217	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   75: astore 8
    //   77: aload 8
    //   79: ifnull -24 -> 55
    //   82: aload 8
    //   84: arraylength
    //   85: iconst_2
    //   86: if_icmplt -31 -> 55
    //   89: aload 8
    //   91: iconst_0
    //   92: aaload
    //   93: invokevirtual 220	java/lang/String:trim	()Ljava/lang/String;
    //   96: astore 9
    //   98: aload 8
    //   100: iconst_1
    //   101: aaload
    //   102: invokevirtual 220	java/lang/String:trim	()Ljava/lang/String;
    //   105: astore 10
    //   107: aload_0
    //   108: aload 9
    //   110: invokevirtual 221	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   113: ifnonnull -58 -> 55
    //   116: aload_0
    //   117: aload 9
    //   119: aload 10
    //   121: invokevirtual 225	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: pop
    //   125: goto -70 -> 55
    //   128: astore 4
    //   130: ldc 139
    //   132: aload 4
    //   134: ldc 227
    //   136: iconst_0
    //   137: anewarray 4	java/lang/Object
    //   140: invokestatic 129	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: aload_1
    //   144: ifnull +7 -> 151
    //   147: aload_1
    //   148: invokevirtual 232	java/io/InputStream:close	()V
    //   151: aload_0
    //   152: areturn
    //   153: aload_1
    //   154: ifnull -3 -> 151
    //   157: aload_1
    //   158: invokevirtual 232	java/io/InputStream:close	()V
    //   161: aload_0
    //   162: areturn
    //   163: astore 12
    //   165: aload_0
    //   166: areturn
    //   167: astore_2
    //   168: aload_1
    //   169: ifnull +7 -> 176
    //   172: aload_1
    //   173: invokevirtual 232	java/io/InputStream:close	()V
    //   176: aload_2
    //   177: athrow
    //   178: astore 5
    //   180: aload_0
    //   181: areturn
    //   182: astore_3
    //   183: goto -7 -> 176
    //
    // Exception table:
    //   from	to	target	type
    //   10	55	128	java/io/IOException
    //   55	62	128	java/io/IOException
    //   67	77	128	java/io/IOException
    //   82	125	128	java/io/IOException
    //   157	161	163	java/io/IOException
    //   10	55	167	finally
    //   55	62	167	finally
    //   67	77	167	finally
    //   82	125	167	finally
    //   130	143	167	finally
    //   147	151	178	java/io/IOException
    //   172	176	182	java/io/IOException
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.c.q
 * JD-Core Version:    0.6.2
 */