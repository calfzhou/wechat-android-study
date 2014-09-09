package com.tencent.mm.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Vibrator;
import com.tencent.mm.a.f;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sandbox.updater.Updater;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ap
{
  private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
  private static final long[] dMQ = { 300L, 200L, 300L, 200L };

  public static String A(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null)
      return "(null)";
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    char[] arrayOfChar2 = new char[24];
    int j = 0;
    int i1;
    if (j < 8)
    {
      int k = paramArrayOfByte[j];
      int m = i + 1;
      arrayOfChar2[i] = ' ';
      int n = m + 1;
      arrayOfChar2[m] = arrayOfChar1[(0xF & k >>> 4)];
      i1 = n + 1;
      arrayOfChar2[n] = arrayOfChar1[(k & 0xF)];
      if ((j % 16 != 0) || (j <= 0))
        break label210;
      i = i1 + 1;
      arrayOfChar2[i1] = '\n';
    }
    while (true)
    {
      j++;
      break;
      return new String(arrayOfChar2);
      label210: i = i1;
    }
  }

  public static boolean B(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0);
  }

  public static long CL()
  {
    return System.currentTimeMillis() / 1000L;
  }

  public static long CM()
  {
    return System.currentTimeMillis();
  }

  public static long CN()
  {
    return SystemClock.elapsedRealtime();
  }

  public static long CO()
  {
    return 86400000L * (System.currentTimeMillis() / 86400000L);
  }

  public static void DG()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Z(Debug.getGlobalAllocSize());
    arrayOfObject[1] = Z(Debug.getGlobalAllocSize() + Debug.getGlobalFreedSize());
    arrayOfObject[2] = Z(Debug.getGlobalExternalAllocSize());
    arrayOfObject[3] = Z(Debug.getGlobalExternalAllocSize() + Debug.getGlobalExternalFreedSize());
    arrayOfObject[4] = Z(Debug.getNativeHeapAllocatedSize());
    arrayOfObject[5] = Z(Debug.getNativeHeapSize());
    z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", arrayOfObject);
  }

  public static boolean DH()
  {
    if (!"mounted".equals(m.getExternalStorageState()));
    int i;
    long l3;
    do
    {
      StatFs localStatFs;
      long l1;
      long l2;
      do
      {
        return false;
        localStatFs = new StatFs(m.getExternalStorageDirectory().getPath());
        l1 = localStatFs.getBlockCount();
        l2 = localStatFs.getAvailableBlocks();
      }
      while ((l1 <= 0L) || (l1 - l2 < 0L));
      i = (int)(100L * (l1 - l2) / l1);
      l3 = localStatFs.getBlockSize() * localStatFs.getAvailableBlocks();
      z.i("!24@/B4Tb64lLpKIVTyJhzV/jw==", "checkSDCardFull per:" + i + " blockCount:" + l1 + " availCount:" + l2 + " availSize:" + l3);
    }
    while ((95 > i) || (l3 > 52428800L));
    return true;
  }

  public static String DI()
  {
    return "android-" + Build.MODEL + "-" + Build.VERSION.SDK_INT;
  }

  public static ar DJ()
  {
    return new ar();
  }

  public static boolean M(int paramInt1, int paramInt2)
  {
    return paramInt2 > 2.0D * paramInt1;
  }

  public static boolean N(int paramInt1, int paramInt2)
  {
    return paramInt1 > 2.0D * paramInt2;
  }

  public static int P(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= paramInt2)
    {
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getIntRandom failed upLimit:" + paramInt1 + "<= downLimit:" + paramInt2);
      return 0;
    }
    return paramInt2 + new Random(System.currentTimeMillis()).nextInt(1 + (paramInt1 - paramInt2));
  }

  public static int R(Object paramObject)
  {
    if (paramObject == null);
    do
    {
      return 0;
      if ((paramObject instanceof Integer))
        return ((Integer)paramObject).intValue();
    }
    while (!(paramObject instanceof Long));
    return ((Long)paramObject).intValue();
  }

  public static boolean S(Context paramContext)
  {
    String str1 = paramContext.getClass().getName();
    String str2 = T(paramContext);
    z.d("!24@/B4Tb64lLpKIVTyJhzV/jw==", "top activity=" + str2 + ", context=" + str1);
    return str2.equalsIgnoreCase(str1);
  }

  public static String T(Context paramContext)
  {
    try
    {
      String str = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "(null)";
  }

  public static String Y(String paramString1, String paramString2)
  {
    if (paramString1 == null)
      return paramString2;
    return paramString1;
  }

  public static String Z(long paramLong)
  {
    if (paramLong >> 20 > 0L)
      return aa(paramLong);
    if (paramLong >> 9 > 0L)
    {
      float f = Math.round(10.0F * (float)paramLong / 1024.0F) / 10.0F;
      return f + "KB";
    }
    return paramLong + "B";
  }

  public static int a(Integer paramInteger)
  {
    if (paramInteger == null)
      return 0;
    return paramInteger.intValue();
  }

  public static int a(Integer paramInteger, int paramInt)
  {
    if (paramInteger == null)
      return paramInt;
    return paramInteger.intValue();
  }

  public static long a(Long paramLong)
  {
    if (paramLong == null)
      return 0L;
    return paramLong.longValue();
  }

  public static String a(List paramList, String paramString)
  {
    if (paramList == null)
      return "";
    StringBuilder localStringBuilder = new StringBuilder("");
    int i = 0;
    if (i < paramList.size())
    {
      if (i == -1 + paramList.size())
        localStringBuilder.append(((String)paramList.get(i)).trim());
      while (true)
      {
        i++;
        break;
        localStringBuilder.append(((String)paramList.get(i)).trim() + paramString);
      }
    }
    return localStringBuilder.toString();
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    Vibrator localVibrator = (Vibrator)paramContext.getSystemService("vibrator");
    if (localVibrator == null)
      return;
    if (paramBoolean)
    {
      localVibrator.vibrate(dMQ, -1);
      return;
    }
    localVibrator.cancel();
  }

  public static boolean a(Boolean paramBoolean)
  {
    if (paramBoolean == null)
      return true;
    return paramBoolean.booleanValue();
  }

  public static boolean a(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null)
      return paramBoolean1;
    return paramBoolean.booleanValue();
  }

  public static String aa(long paramLong)
  {
    float f = Math.round(10.0F * (float)paramLong / 1048576.0F) / 10.0F;
    return f + "MB";
  }

  public static List aa(String paramString1, String paramString2)
  {
    ArrayList localArrayList = null;
    if (paramString1 != null)
    {
      Matcher localMatcher = Pattern.compile(paramString2).matcher(paramString1);
      int i = localMatcher.groupCount();
      int j = 1;
      localArrayList = new ArrayList();
      if (localMatcher.find())
        while (j <= i)
        {
          localArrayList.add(localMatcher.group(j));
          j++;
        }
    }
    return localArrayList;
  }

  public static long ab(long paramLong)
  {
    return System.currentTimeMillis() / 1000L - paramLong;
  }

  public static long ac(long paramLong)
  {
    return System.currentTimeMillis() - paramLong;
  }

  public static long ad(long paramLong)
  {
    return SystemClock.elapsedRealtime() - paramLong;
  }

  public static boolean af(Context paramContext)
  {
    Updater.oo(16);
    if ((0x1 & l.cFr) != 0)
    {
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "package has set external update mode");
      Uri localUri = Uri.parse(l.iDr);
      Intent localIntent = new Intent("android.intent.action.VIEW", localUri).addFlags(268435456);
      if ((localUri == null) || (localIntent == null) || (!i(paramContext, localIntent)))
      {
        z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "parse market uri failed, jump to weixin.qq.com");
        paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
        return true;
      }
      z.i("!24@/B4Tb64lLpKIVTyJhzV/jw==", "parse market uri ok");
      paramContext.startActivity(localIntent);
      return true;
    }
    ak.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", System.currentTimeMillis() / 1000L).commit();
    Updater.a(paramContext, new aq()).update(3);
    return true;
  }

  public static long b(Long paramLong)
  {
    if (paramLong == null)
      return 0L;
    return paramLong.longValue();
  }

  // ERROR //
  public static String b(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 480	java/io/BufferedReader
    //   3: dup
    //   4: new 482	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 485	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: invokespecial 488	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: astore_1
    //   16: new 149	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 306	java/lang/StringBuilder:<init>	()V
    //   23: astore_2
    //   24: aload_1
    //   25: invokevirtual 491	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload 7
    //   32: ifnull +43 -> 75
    //   35: aload_2
    //   36: new 149	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 306	java/lang/StringBuilder:<init>	()V
    //   43: aload 7
    //   45: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc_w 493
    //   51: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: goto -37 -> 24
    //   64: astore 5
    //   66: aload_0
    //   67: invokevirtual 498	java/io/InputStream:close	()V
    //   70: aload_2
    //   71: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: areturn
    //   75: aload_0
    //   76: invokevirtual 498	java/io/InputStream:close	()V
    //   79: goto -9 -> 70
    //   82: astore 9
    //   84: goto -14 -> 70
    //   87: astore_3
    //   88: aload_0
    //   89: invokevirtual 498	java/io/InputStream:close	()V
    //   92: aload_3
    //   93: athrow
    //   94: astore 6
    //   96: goto -26 -> 70
    //   99: astore 4
    //   101: goto -9 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   24	30	64	java/io/IOException
    //   35	61	64	java/io/IOException
    //   75	79	82	java/io/IOException
    //   24	30	87	finally
    //   35	61	87	finally
    //   66	70	94	java/io/IOException
    //   88	92	99	java/io/IOException
  }

  public static List b(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfString.length; i++)
      localArrayList.add(paramArrayOfString[i]);
    return localArrayList;
  }

  public static boolean b(Boolean paramBoolean)
  {
    if (paramBoolean == null)
      return false;
    return paramBoolean.booleanValue();
  }

  public static String eY(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramInt / 60L);
    arrayOfObject[1] = Long.valueOf(paramInt % 60L);
    return String.format("%d:%02d", arrayOfObject);
  }

  public static boolean ew(int paramInt)
  {
    long l1 = 1000L * paramInt;
    long l2 = l1 - System.currentTimeMillis();
    z.d("!24@/B4Tb64lLpKIVTyJhzV/jw==", "time " + l1 + "  systime " + System.currentTimeMillis() + " diff " + l2);
    return l2 < 0L;
  }

  public static boolean i(Context paramContext, Intent paramIntent)
  {
    return paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() > 0;
  }

  public static String iV(String paramString)
  {
    if (paramString != null)
      paramString = paramString.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "");
    return paramString;
  }

  public static boolean iW(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    while (true)
    {
      return false;
      String str = paramString.trim();
      try
      {
        long l = Long.valueOf(str).longValue();
        if ((l > 0L) && (l <= 4294967295L))
          return true;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    }
    return false;
  }

  public static boolean iX(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
      return false;
    return paramString.trim().matches("^[a-zA-Z0-9][\\w\\.-]*@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
  }

  public static boolean iY(String paramString)
  {
    if (paramString == null);
    String str;
    do
    {
      return false;
      str = paramString.trim();
    }
    while ((str.length() < 6) || (str.length() > 20) || (!m(str.charAt(0))));
    for (int i = 0; ; i++)
    {
      if (i >= str.length())
        break label88;
      char c = str.charAt(i);
      if ((!m(c)) && (!n(c)) && (c != '-') && (c != '_'))
        break;
    }
    label88: return true;
  }

  public static boolean iZ(String paramString)
  {
    if (paramString == null);
    while (paramString.length() < 4)
      return false;
    return paramString.length() >= 9;
  }

  @Deprecated
  public static long jC(String paramString)
  {
    if (paramString == null)
      return 0L;
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0L;
  }

  public static String ja(String paramString)
  {
    if (paramString == null)
      paramString = "";
    return paramString;
  }

  public static boolean jb(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }

  public static String je(String paramString)
  {
    if (paramString == null)
      paramString = "";
    if (paramString.length() <= 16)
      return f.d(paramString.getBytes());
    return f.d(paramString.substring(0, 16).getBytes());
  }

  public static String jf(String paramString)
  {
    return f.d(paramString.getBytes());
  }

  public static byte[] jg(String paramString)
  {
    byte[] arrayOfByte;
    if ((paramString == null) || (paramString.length() <= 0))
      arrayOfByte = new byte[0];
    while (true)
    {
      return arrayOfByte;
      try
      {
        arrayOfByte = new byte[paramString.length() / 2];
        for (int i = 0; i < arrayOfByte.length; i++)
          arrayOfByte[i] = ((byte)(0xFF & Integer.parseInt(paramString.substring(i * 2, 2 + i * 2), 16)));
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    }
    return new byte[0];
  }

  public static boolean jh(String paramString)
  {
    if (jb(paramString))
      return false;
    return Pattern.compile("[\\u4e00-\\u9fa5]+").matcher(paramString).find();
  }

  public static Boolean ji(String paramString)
  {
    Matcher localMatcher1 = Pattern.compile("^[+][0-9]{10,13}$").matcher(paramString);
    Matcher localMatcher2 = Pattern.compile("^1[0-9]{10}$").matcher(paramString);
    if ((localMatcher1.matches()) || (localMatcher2.matches()));
    for (boolean bool = true; ; bool = false)
      return Boolean.valueOf(bool);
  }

  public static boolean l(char paramChar)
  {
    Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramChar);
    return (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (localUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (localUnicodeBlock == Character.UnicodeBlock.GENERAL_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION) || (localUnicodeBlock == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
  }

  public static boolean m(char paramChar)
  {
    return ((paramChar >= 'a') && (paramChar <= 'z')) || ((paramChar >= 'A') && (paramChar <= 'Z'));
  }

  public static boolean n(char paramChar)
  {
    return (paramChar >= '0') && (paramChar <= '9');
  }

  public static boolean t(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    if (!i(paramContext, localIntent))
    {
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "jump to url failed, " + paramString);
      return false;
    }
    paramContext.startActivity(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ap
 * JD-Core Version:    0.6.2
 */