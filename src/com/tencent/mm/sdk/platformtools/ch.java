package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import com.tencent.mm.a.f;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import junit.framework.Assert;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public final class ch
{
  private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
  private static final long[] dMQ = { 300L, 200L, 300L, 200L };
  private static final char[] gWy = { 60, 62, 34, 39, 38 };
  private static final String[] gWz = { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;" };
  private static final long[] igX = { 300L, 50L, 300L, 50L };

  public static String AX(String paramString)
  {
    if (paramString != null)
      paramString = paramString.replace("../", "");
    return paramString;
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

  public static String S(float paramFloat)
  {
    if (paramFloat < 1024.0F)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Float.valueOf(paramFloat);
      return String.format("%.1fB", arrayOfObject4);
    }
    if (paramFloat < 1048576.0F)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Float.valueOf(paramFloat / 1024.0F);
      return String.format("%.1fKB", arrayOfObject3);
    }
    if (paramFloat < 1.073742E+09F)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Float.valueOf(paramFloat / 1024.0F / 1024.0F);
      return String.format("%.1fMB", arrayOfObject2);
    }
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F);
    return String.format("%.1fGB", arrayOfObject1);
  }

  public static boolean S(Context paramContext)
  {
    String str1 = paramContext.getClass().getName();
    String str2 = T(paramContext);
    z.d("!24@/B4Tb64lLpKIVTyJhzV/jw==", "top activity=" + str2 + ", context=" + str1);
    return str2.equalsIgnoreCase(str1);
  }

  private static String T(Context paramContext)
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
    if (paramLong >> 30 > 0L)
    {
      float f2 = Math.round(10.0F * (float)paramLong / 1.073742E+09F) / 10.0F;
      return f2 + " GB";
    }
    if (paramLong >> 20 > 0L)
      return aa(paramLong);
    if (paramLong >> 9 > 0L)
    {
      float f1 = Math.round(10.0F * (float)paramLong / 1024.0F) / 10.0F;
      return f1 + " KB";
    }
    return paramLong + " B";
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

  public static long a(Long paramLong, long paramLong1)
  {
    if (paramLong == null)
      return paramLong1;
    return paramLong.longValue();
  }

  public static String a(LinkedHashMap paramLinkedHashMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<key>");
    Iterator localIterator = paramLinkedHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject1 = localEntry.getKey();
      Object localObject2 = localEntry.getValue();
      if (localObject1 == null)
        localObject1 = "unknow";
      if (localObject2 == null)
        localObject2 = "unknow";
      localStringBuilder.append("<" + localObject1 + ">");
      localStringBuilder.append(localObject2);
      localStringBuilder.append("</" + localObject1 + ">");
    }
    localStringBuilder.append("</key>");
    return localStringBuilder.toString();
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

  public static void a(ZipFile paramZipFile)
  {
    if (paramZipFile != null);
    try
    {
      paramZipFile.close();
      return;
    }
    catch (IOException localIOException)
    {
      z.printErrStackTrace("!24@/B4Tb64lLpKIVTyJhzV/jw==", localIOException, "qualityClose", new Object[0]);
    }
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

  public static byte[] aHG()
  {
    try
    {
      FileInputStream localFileInputStream = new FileInputStream("/dev/urandom");
      byte[] arrayOfByte = new byte[16];
      int i = localFileInputStream.read(arrayOfByte);
      localFileInputStream.close();
      if (i == 16)
        return arrayOfByte;
    }
    catch (Exception localException)
    {
      UUID localUUID = UUID.randomUUID();
      return f.e((localUUID.toString() + System.currentTimeMillis()).getBytes());
    }
  }

  public static boolean aHH()
  {
    int i = new GregorianCalendar().get(11);
    return (i >= 6L) && (i < 18L);
  }

  public static String aHI()
  {
    TimeZone localTimeZone = TimeZone.getDefault();
    int i = localTimeZone.getRawOffset() / 1000;
    if ((localTimeZone.useDaylightTime()) && (localTimeZone.inDaylightTime(new java.sql.Date(System.currentTimeMillis()))));
    for (int j = 1; ; j = 0)
    {
      double d = i / 3600.0D + j;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Double.valueOf(d);
      return String.format("%.2f", arrayOfObject);
    }
  }

  public static String aHJ()
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)ak.getContext().getSystemService("phone");
    if (localTelephonyManager != null)
    {
      String str = localTelephonyManager.getNetworkCountryIso();
      if (jb(str))
        return null;
      return str.toLowerCase().trim();
    }
    return null;
  }

  public static boolean aHK()
  {
    return (Locale.getDefault().equals(Locale.CHINA)) || (Locale.getDefault().equals(Locale.TAIWAN)) || (Locale.getDefault().toString().startsWith(Locale.CHINESE.toString()));
  }

  public static boolean aHL()
  {
    return y.aGW().equals("zh_CN");
  }

  public static View.OnTouchListener aHM()
  {
    return new ci();
  }

  public static cl aHN()
  {
    return new cl();
  }

  public static int aHO()
  {
    return new Random().nextInt();
  }

  public static long aa(Object paramObject)
  {
    if (paramObject == null);
    while (!(paramObject instanceof Long))
      return 0L;
    return ((Long)paramObject).longValue();
  }

  public static String aa(long paramLong)
  {
    float f = Math.round(10.0F * (float)paramLong / 1048576.0F) / 10.0F;
    return f + " MB";
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

  public static void ak(View paramView)
  {
    try
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)paramView.getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
        return;
      localInputMethodManager.hideSoftInputFromWindow(paramView.getApplicationWindowToken(), 0);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static boolean al(Context paramContext, String paramString)
  {
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(2147483647).iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator.next();
      if ((localRunningServiceInfo != null) && (localRunningServiceInfo.service != null) && (localRunningServiceInfo.service.getClassName().toString().equals(paramString)))
      {
        z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "service " + paramString + " is running");
        return true;
      }
    }
    z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "service " + paramString + " is not running");
    return false;
  }

  public static boolean am(Context paramContext, String paramString)
  {
    try
    {
      List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
      if (localList == null)
        return false;
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if ((localRunningAppProcessInfo != null) && (localRunningAppProcessInfo.processName != null) && (localRunningAppProcessInfo.processName.equals(paramString)))
        {
          z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "process " + paramString + " is running");
          return true;
        }
      }
      z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "process " + paramString + " is not running");
      label132: return false;
    }
    catch (Exception localException)
    {
      break label132;
    }
  }

  // ERROR //
  public static String b(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 519	java/io/BufferedReader
    //   3: dup
    //   4: new 521	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 524	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: invokespecial 527	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: astore_1
    //   16: new 128	java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   23: astore_2
    //   24: aload_1
    //   25: invokevirtual 530	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload 7
    //   32: ifnull +43 -> 75
    //   35: aload_2
    //   36: new 128	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   43: aload 7
    //   45: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc_w 532
    //   51: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: goto -37 -> 24
    //   64: astore 5
    //   66: aload_0
    //   67: invokevirtual 535	java/io/InputStream:close	()V
    //   70: aload_2
    //   71: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: areturn
    //   75: aload_0
    //   76: invokevirtual 535	java/io/InputStream:close	()V
    //   79: goto -9 -> 70
    //   82: astore 9
    //   84: goto -14 -> 70
    //   87: astore_3
    //   88: aload_0
    //   89: invokevirtual 535	java/io/InputStream:close	()V
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

  public static String b(Throwable paramThrowable)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
      paramThrowable.printStackTrace(localPrintStream);
      String str = localByteArrayOutputStream.toString();
      localPrintStream.close();
      localByteArrayOutputStream.close();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
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

  public static void bG(Context paramContext)
  {
    Vibrator localVibrator = (Vibrator)paramContext.getSystemService("vibrator");
    if (localVibrator == null)
      return;
    localVibrator.vibrate(igX, -1);
  }

  public static String bH(Context paramContext)
  {
    if (paramContext == null)
      return null;
    try
    {
      TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager == null)
        return null;
      String str1 = localTelephonyManager.getDeviceId();
      if (str1 == null)
        return null;
      String str2 = str1.trim();
      return str2;
    }
    catch (SecurityException localSecurityException)
    {
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getDeviceId failed, security exception");
      return null;
    }
    catch (Exception localException)
    {
      label55: break label55;
    }
  }

  public static long bI(Context paramContext)
  {
    ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
    if (localActivityManager == null)
      return 0L;
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    localActivityManager.getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem / 1024L / 1024L;
  }

  public static String bJ(Context paramContext)
  {
    if (paramContext == null);
    while (true)
    {
      return null;
      try
      {
        if ((TelephonyManager)paramContext.getSystemService("phone") == null)
        {
          z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "get line1 number failed, null tm");
          return null;
        }
      }
      catch (SecurityException localSecurityException)
      {
        z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getLine1Number failed, security exception");
        return null;
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public static String bK(Context paramContext)
  {
    if (paramContext == null)
      return null;
    return i(paramContext.getPackageName(), paramContext);
  }

  public static ck bL(Context paramContext)
  {
    return new ck(paramContext);
  }

  public static ComponentName bM(Context paramContext)
  {
    List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localList != null) && (localList.size() > 0))
      return ((ActivityManager.RunningTaskInfo)localList.get(0)).topActivity;
    return null;
  }

  public static int bo(String paramString1, String paramString2)
  {
    try
    {
      ZipInputStream localZipInputStream = new ZipInputStream(new FileInputStream(paramString1));
      while (true)
      {
        ZipEntry localZipEntry = localZipInputStream.getNextEntry();
        if (localZipEntry == null)
          break;
        String str1 = localZipEntry.getName();
        if (localZipEntry.isDirectory())
        {
          String str2 = str1.substring(0, -1 + str1.length());
          new File(paramString2 + File.separator + str2).mkdirs();
        }
        else
        {
          File localFile = new File(paramString2 + File.separator + str1);
          localFile.createNewFile();
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
          byte[] arrayOfByte = new byte[1024];
          while (true)
          {
            int i = localZipInputStream.read(arrayOfByte);
            if (i == -1)
              break;
            localFileOutputStream.write(arrayOfByte, 0, i);
            localFileOutputStream.flush();
          }
          localFileOutputStream.close();
        }
      }
      localZipInputStream.close();
      return 0;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      return -1;
    }
    catch (IOException localIOException)
    {
    }
    return -2;
  }

  private static int c(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0)
      return 0;
    if ((paramArrayOfChar[paramInt1] != '#') || ((paramInt2 > 1) && ((paramArrayOfChar[(paramInt1 + 1)] == 'x') || (paramArrayOfChar[(paramInt1 + 1)] == 'X'))));
    try
    {
      int j = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 2, paramInt2 - 2), 16);
      return j;
      try
      {
        int i = Integer.parseInt(new String(paramArrayOfChar, paramInt1 + 1, paramInt2 - 1), 10);
        return i;
        new String(paramArrayOfChar, paramInt1, paramInt2);
        return 0;
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        return 0;
      }
    }
    catch (NumberFormatException localNumberFormatException2)
    {
    }
    return 0;
  }

  public static void c(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
      z.printErrStackTrace("!24@/B4Tb64lLpKIVTyJhzV/jw==", localIOException, "qualityClose", new Object[0]);
    }
  }

  public static String cF(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null)
      return "(null)";
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    int j = paramArrayOfByte.length;
    char[] arrayOfChar2 = new char[j * 3];
    int k = 0;
    while (i < j)
    {
      int m = paramArrayOfByte[i];
      int n = k + 1;
      arrayOfChar2[k] = ' ';
      int i1 = n + 1;
      arrayOfChar2[n] = arrayOfChar1[(0xF & m >>> 4)];
      k = i1 + 1;
      arrayOfChar2[i1] = arrayOfChar1[(m & 0xF)];
      i++;
    }
    return new String(arrayOfChar2);
  }

  public static int cG(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return -1;
    return paramArrayOfByte.length;
  }

  public static String cH(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    if (paramArrayOfByte != null)
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(0xFF & paramArrayOfByte[i]);
        localStringBuilder.append(String.format("%02x", arrayOfObject));
      }
    return localStringBuilder.toString();
  }

  public static String cS(long paramLong)
  {
    return new SimpleDateFormat("[yy-MM-dd HH:mm:ss]").format(new java.util.Date(1000L * paramLong));
  }

  @TargetApi(19)
  public static String d(Context paramContext, Uri paramUri)
  {
    String str1 = null;
    if ((paramContext == null) || (paramUri == null))
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "context is null or uri is null");
    Object localObject1;
    int i;
    boolean bool1;
    do
    {
      int j;
      do
      {
        return str1;
        String str2 = paramUri.getScheme();
        if (str2.equalsIgnoreCase("file"))
        {
          z.i("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getFilePath : scheme is SCHEME_FILE");
          return paramUri.getPath();
        }
        if (!str2.equalsIgnoreCase("content"))
          break label445;
        z.i("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getFilePath : scheme is SCHEME_CONTENT: " + paramUri.toString());
        localObject1 = paramContext.getContentResolver().query(paramUri, null, null, null, null);
        if (localObject1 == null)
        {
          z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getFilePath : fail, cursor is null");
          return null;
        }
        if ((((Cursor)localObject1).getCount() <= 0) || (!((Cursor)localObject1).moveToFirst()))
        {
          ((Cursor)localObject1).close();
          z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getFilePath : fail, cursor getCount is 0 or moveToFirst fail");
          return null;
        }
        i = ((Cursor)localObject1).getColumnIndex("_data");
        if (i != -1)
          break;
        ((Cursor)localObject1).close();
        z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "getFilePath : columnIdx is -1, column with columnName = _data does not exist");
        j = Build.VERSION.SDK_INT;
        str1 = null;
      }
      while (j < 19);
      bool1 = DocumentsContract.isDocumentUri(paramContext, paramUri);
      str1 = null;
    }
    while (!bool1);
    String[] arrayOfString1 = DocumentsContract.getDocumentId(paramUri).split(":");
    String str4 = arrayOfString1[0];
    if ("image".equals(str4));
    label445: label455: for (Uri localUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI; ; localUri = null)
    {
      while (true)
      {
        String[] arrayOfString2 = new String[1];
        arrayOfString2[0] = arrayOfString1[1];
        String[] arrayOfString3 = { "_data" };
        try
        {
          Cursor localCursor = paramContext.getContentResolver().query(localUri, arrayOfString3, "_id=?", arrayOfString2, null);
          localObject1 = localCursor;
          if (localObject1 == null)
          {
            str1 = null;
            return null;
            if ("video".equals(str4))
            {
              localUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            }
            else
            {
              if (!"audio".equals(str4))
                break label455;
              localUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
          }
          else
          {
            boolean bool2 = ((Cursor)localObject1).moveToFirst();
            str1 = null;
            if (bool2)
              str1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndexOrThrow("_data"));
            ((Cursor)localObject1).close();
            return str1;
          }
        }
        finally
        {
          if (localObject1 != null)
            ((Cursor)localObject1).close();
        }
      }
      String str3 = ((Cursor)localObject1).getString(i);
      ((Cursor)localObject1).close();
      return str3;
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "unknown scheme");
      return null;
    }
  }

  // ERROR //
  public static String d(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 823	java/lang/StringBuffer
    //   9: dup
    //   10: invokespecial 824	java/lang/StringBuffer:<init>	()V
    //   13: astore_1
    //   14: sipush 4096
    //   17: newarray byte
    //   19: astore 6
    //   21: aload_0
    //   22: aload 6
    //   24: invokevirtual 825	java/io/InputStream:read	([B)I
    //   27: istore 7
    //   29: iload 7
    //   31: iconst_m1
    //   32: if_icmpeq +34 -> 66
    //   35: aload_1
    //   36: new 43	java/lang/String
    //   39: dup
    //   40: aload 6
    //   42: iconst_0
    //   43: iload 7
    //   45: invokespecial 827	java/lang/String:<init>	([BII)V
    //   48: invokevirtual 830	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   51: pop
    //   52: goto -31 -> 21
    //   55: astore 4
    //   57: aload_0
    //   58: invokevirtual 535	java/io/InputStream:close	()V
    //   61: aload_1
    //   62: invokevirtual 831	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   65: areturn
    //   66: aload_0
    //   67: invokevirtual 535	java/io/InputStream:close	()V
    //   70: goto -9 -> 61
    //   73: astore 9
    //   75: goto -14 -> 61
    //   78: astore_2
    //   79: aload_0
    //   80: invokevirtual 535	java/io/InputStream:close	()V
    //   83: aload_2
    //   84: athrow
    //   85: astore 5
    //   87: goto -26 -> 61
    //   90: astore_3
    //   91: goto -8 -> 83
    //
    // Exception table:
    //   from	to	target	type
    //   14	21	55	java/lang/Exception
    //   21	29	55	java/lang/Exception
    //   35	52	55	java/lang/Exception
    //   66	70	73	java/io/IOException
    //   14	21	78	finally
    //   21	29	78	finally
    //   35	52	78	finally
    //   57	61	85	java/io/IOException
    //   79	83	90	java/io/IOException
  }

  public static boolean deleteFile(String paramString)
  {
    if (jb(paramString));
    File localFile;
    do
    {
      return false;
      localFile = new File(paramString);
      if (!localFile.exists())
        return true;
    }
    while (localFile.isDirectory());
    return localFile.delete();
  }

  public static String eY(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramInt / 60L);
    arrayOfObject[1] = Long.valueOf(paramInt % 60L);
    return String.format("%d:%02d", arrayOfObject);
  }

  // ERROR //
  public static boolean f(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 403	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   4: ifne +10 -> 14
    //   7: aload_1
    //   8: invokestatic 851	com/tencent/mm/sdk/platformtools/ch:B	([B)Z
    //   11: ifeq +13 -> 24
    //   14: ldc 126
    //   16: ldc_w 853
    //   19: invokestatic 500	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: iconst_0
    //   23: ireturn
    //   24: new 646	java/io/FileOutputStream
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 854	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   32: astore_2
    //   33: aload_2
    //   34: aload_1
    //   35: invokevirtual 857	java/io/FileOutputStream:write	([B)V
    //   38: aload_2
    //   39: invokevirtual 657	java/io/FileOutputStream:flush	()V
    //   42: aload_2
    //   43: invokevirtual 658	java/io/FileOutputStream:close	()V
    //   46: ldc 126
    //   48: ldc_w 859
    //   51: invokestatic 149	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: iconst_1
    //   55: ireturn
    //   56: astore 8
    //   58: aconst_null
    //   59: astore_2
    //   60: ldc 126
    //   62: ldc_w 861
    //   65: invokestatic 500	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload_2
    //   69: ifnull -47 -> 22
    //   72: aload_2
    //   73: invokevirtual 658	java/io/FileOutputStream:close	()V
    //   76: iconst_0
    //   77: ireturn
    //   78: astore 6
    //   80: iconst_0
    //   81: ireturn
    //   82: astore 4
    //   84: aconst_null
    //   85: astore_2
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 658	java/io/FileOutputStream:close	()V
    //   94: aload 4
    //   96: athrow
    //   97: astore 7
    //   99: goto -53 -> 46
    //   102: astore 5
    //   104: goto -10 -> 94
    //   107: astore 4
    //   109: goto -23 -> 86
    //   112: astore_3
    //   113: goto -53 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   24	33	56	java/lang/Exception
    //   72	76	78	java/io/IOException
    //   24	33	82	finally
    //   42	46	97	java/io/IOException
    //   90	94	102	java/io/IOException
    //   33	42	107	finally
    //   60	68	107	finally
    //   33	42	112	java/lang/Exception
  }

  public static String formatNumber(String paramString)
  {
    String str;
    if (jb(paramString))
      str = "";
    do
    {
      return str;
      str = paramString.replaceAll(",", "");
    }
    while (str.length() <= 3);
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = -1 + str.length(); i >= 0; i--)
    {
      localStringBuffer.append(str.charAt(i));
      if (((str.length() - i) % 3 == 0) && (i != 0))
        localStringBuffer.append(",");
    }
    return localStringBuffer.reverse().toString();
  }

  public static void g(String paramString1, String paramString2, long paramLong)
  {
    if (jb(paramString1));
    while (true)
    {
      return;
      File localFile1 = new File(paramString1);
      if ((localFile1.exists()) && (localFile1.isDirectory()))
      {
        File[] arrayOfFile = localFile1.listFiles();
        if ((arrayOfFile != null) && (arrayOfFile.length != 0))
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            File localFile2 = arrayOfFile[j];
            if ((localFile2.isFile()) && (localFile2.getName().startsWith(paramString2)) && (System.currentTimeMillis() - localFile2.lastModified() - paramLong >= 0L))
              localFile2.delete();
          }
        }
      }
    }
  }

  public static boolean g(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == paramObject2);
    while ((paramObject1 != null) && (paramObject2 != null) && (paramObject1.equals(paramObject2)))
      return true;
    return false;
  }

  public static int getInt(String paramString, int paramInt)
  {
    if (paramString != null)
      try
      {
        if (paramString.length() <= 0)
          return paramInt;
        int i = Integer.parseInt(paramString);
        return i;
      }
      catch (NumberFormatException localNumberFormatException)
      {
      }
    return paramInt;
  }

  public static long getLong(String paramString, long paramLong)
  {
    if (paramString == null)
      return paramLong;
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return paramLong;
  }

  public static int h(Object paramObject, int paramInt)
  {
    if (paramObject == null);
    do
    {
      return paramInt;
      if ((paramObject instanceof Integer))
        return ((Integer)paramObject).intValue();
    }
    while (!(paramObject instanceof Long));
    return ((Long)paramObject).intValue();
  }

  public static String i(String paramString, Context paramContext)
  {
    if ((paramContext == null) || (jb(paramString)))
      return null;
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      byte[] arrayOfByte = localPackageManager.getPackageInfo(paramString, 64).signatures[0].toByteArray();
      return f.d(arrayOfByte);
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean i(Context paramContext, Intent paramIntent)
  {
    List localList = paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536);
    return (localList != null) && (localList.size() > 0);
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
    return paramString.trim().matches("^[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$");
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

  public static void l(String paramString, Context paramContext)
  {
    paramContext.startActivity(xo(paramString));
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

  public static int nV(int paramInt)
  {
    if (paramInt > 0);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      return 0 + new Random(System.currentTimeMillis()).nextInt(1 + (paramInt + 0));
    }
  }

  public static long nW(int paramInt)
  {
    return 1000L * paramInt;
  }

  public static boolean o(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (paramInt2 > paramInt3)
      if (paramInt1 < paramInt2)
      {
        bool = false;
        if (paramInt1 > paramInt3);
      }
      else
      {
        bool = true;
      }
    do
    {
      do
      {
        return bool;
        if (paramInt2 >= paramInt3)
          break;
        bool = false;
      }
      while (paramInt1 > paramInt3);
      bool = false;
    }
    while (paramInt1 < paramInt2);
    return true;
    return true;
  }

  public static byte[] o(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap.recycle();
    byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return arrayOfByte;
  }

  // ERROR //
  public static byte[] oE(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 403	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   4: ifeq +13 -> 17
    //   7: ldc 126
    //   9: ldc_w 1075
    //   12: invokestatic 500	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aconst_null
    //   16: areturn
    //   17: new 634	java/io/File
    //   20: dup
    //   21: aload_0
    //   22: invokespecial 638	java/io/File:<init>	(Ljava/lang/String;)V
    //   25: astore_1
    //   26: aload_1
    //   27: invokevirtual 835	java/io/File:exists	()Z
    //   30: ifne +21 -> 51
    //   33: ldc 126
    //   35: ldc_w 1077
    //   38: iconst_1
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: aload_0
    //   45: aastore
    //   46: invokestatic 1080	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   49: aconst_null
    //   50: areturn
    //   51: aload_1
    //   52: invokevirtual 1082	java/io/File:length	()J
    //   55: l2i
    //   56: istore 9
    //   58: new 322	java/io/FileInputStream
    //   61: dup
    //   62: aload_1
    //   63: invokespecial 1083	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   66: astore_3
    //   67: iload 9
    //   69: newarray byte
    //   71: astore 11
    //   73: aload_3
    //   74: aload 11
    //   76: invokevirtual 329	java/io/FileInputStream:read	([B)I
    //   79: istore 12
    //   81: iload 12
    //   83: iload 9
    //   85: if_icmpeq +52 -> 137
    //   88: iconst_3
    //   89: anewarray 4	java/lang/Object
    //   92: astore 13
    //   94: aload 13
    //   96: iconst_0
    //   97: aload_0
    //   98: aastore
    //   99: aload 13
    //   101: iconst_1
    //   102: iload 9
    //   104: invokestatic 700	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   107: aastore
    //   108: aload 13
    //   110: iconst_2
    //   111: iload 12
    //   113: invokestatic 700	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   116: aastore
    //   117: ldc 126
    //   119: ldc_w 1085
    //   122: aload 13
    //   124: invokestatic 1080	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_3
    //   128: invokevirtual 330	java/io/FileInputStream:close	()V
    //   131: aconst_null
    //   132: areturn
    //   133: astore 14
    //   135: aconst_null
    //   136: areturn
    //   137: ldc 126
    //   139: ldc_w 1087
    //   142: invokestatic 149	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: aload_3
    //   146: invokevirtual 330	java/io/FileInputStream:close	()V
    //   149: aload 11
    //   151: areturn
    //   152: astore 6
    //   154: aconst_null
    //   155: astore 7
    //   157: aload 7
    //   159: ifnull -144 -> 15
    //   162: aload 7
    //   164: invokevirtual 330	java/io/FileInputStream:close	()V
    //   167: aconst_null
    //   168: areturn
    //   169: astore 8
    //   171: aconst_null
    //   172: areturn
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_3
    //   176: aload_2
    //   177: astore 4
    //   179: aload_3
    //   180: ifnull +7 -> 187
    //   183: aload_3
    //   184: invokevirtual 330	java/io/FileInputStream:close	()V
    //   187: aload 4
    //   189: athrow
    //   190: astore 15
    //   192: goto -43 -> 149
    //   195: astore 5
    //   197: goto -10 -> 187
    //   200: astore 4
    //   202: goto -23 -> 179
    //   205: astore 10
    //   207: aload_3
    //   208: astore 7
    //   210: goto -53 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   127	131	133	java/io/IOException
    //   51	67	152	java/lang/Exception
    //   162	167	169	java/io/IOException
    //   51	67	173	finally
    //   145	149	190	java/io/IOException
    //   183	187	195	java/io/IOException
    //   67	81	200	finally
    //   88	127	200	finally
    //   137	145	200	finally
    //   67	81	205	java/lang/Exception
    //   88	127	205	java/lang/Exception
    //   137	145	205	java/lang/Exception
  }

  public static CharSequence p(CharSequence paramCharSequence)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramCharSequence.length(); i++)
    {
      char c = paramCharSequence.charAt(i);
      if ((c >= '0') && (c <= '9'))
        localStringBuffer.append(c);
    }
    return localStringBuffer.toString();
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

  public static String w(Context paramContext, int paramInt)
  {
    if ((paramContext == null) || (paramInt <= 0))
      return "";
    byte[] arrayOfByte;
    try
    {
      Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      while (localIterator.hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if ((localRunningAppProcessInfo.pid == paramInt) && (!jb(localRunningAppProcessInfo.processName)))
        {
          String str2 = localRunningAppProcessInfo.processName;
          return str2;
        }
      }
    }
    catch (Exception localException1)
    {
      arrayOfByte = new byte[''];
    }
    while (true)
    {
      int j;
      try
      {
        FileInputStream localFileInputStream = new FileInputStream("/proc/" + paramInt + "/cmdline");
        i = localFileInputStream.read(arrayOfByte);
        localFileInputStream.close();
        if (i > 0)
        {
          j = 0;
          if (j < i)
          {
            if (arrayOfByte[j] > 128)
              break label196;
            if (arrayOfByte[j] > 0)
              break label190;
            break label196;
          }
          String str1 = new String(arrayOfByte, 0, i);
          return str1;
        }
      }
      catch (Exception localException2)
      {
      }
      return "";
      label190: j++;
      continue;
      label196: int i = j;
    }
  }

  public static ActivityManager.RunningTaskInfo x(Context paramContext, int paramInt)
  {
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1000).iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningTaskInfo localRunningTaskInfo = (ActivityManager.RunningTaskInfo)localIterator.next();
      if (localRunningTaskInfo.id == paramInt)
        return localRunningTaskInfo;
    }
    return null;
  }

  public static double xA(String paramString)
  {
    double d1 = 0.0D;
    try
    {
      double d2 = Double.parseDouble(paramString);
      d1 = d2;
      return d1;
    }
    catch (Exception localException)
    {
      while (paramString == null);
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "parseDouble error " + paramString);
    }
    return d1;
  }

  public static byte[] xB(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "httpGet, url is null");
      return null;
    }
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    try
    {
      localHttpResponse = localDefaultHttpClient.execute(new HttpGet(paramString));
      if (localHttpResponse.getStatusLine().getStatusCode() != 200)
      {
        z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "httpGet fail, status code = " + localHttpResponse.getStatusLine().getStatusCode());
        return null;
      }
    }
    catch (Exception localException)
    {
      HttpResponse localHttpResponse;
      z.printErrStackTrace("!24@/B4Tb64lLpKIVTyJhzV/jw==", localException, "httpGet failed.", new Object[0]);
      return null;
      byte[] arrayOfByte = EntityUtils.toByteArray(localHttpResponse.getEntity());
      return arrayOfByte;
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
    {
      z.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
      throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
    }
    catch (Throwable localThrowable)
    {
      z.printErrStackTrace("!24@/B4Tb64lLpKIVTyJhzV/jw==", localThrowable, "httpGet failed.", new Object[0]);
    }
    return null;
  }

  public static String xC(String paramString)
  {
    return paramString.replaceAll("[\\.\\-]", "").trim();
  }

  public static String xD(String paramString)
  {
    int i = 0;
    if ((jb(paramString)) || (paramString.startsWith("+")))
      paramString = "";
    while (paramString.length() <= 5)
      return paramString;
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.subSequence(0, 3));
    if (i < -5 + paramString.length())
    {
      char c = paramString.charAt(i + 3);
      if ((c >= '0') && (c <= '9'))
        localStringBuffer.append('*');
      while (true)
      {
        i++;
        break;
        localStringBuffer.append(c);
      }
    }
    localStringBuffer.append(paramString.charAt(-2 + paramString.length()));
    localStringBuffer.append(paramString.charAt(-1 + paramString.length()));
    return localStringBuffer.toString();
  }

  public static String xE(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      int i = paramString.lastIndexOf("@");
      if (i != -1)
        paramString = paramString.substring(0, i);
    }
    return paramString;
  }

  public static long xF(String paramString)
  {
    if (jb(paramString))
      return 0L;
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    try
    {
      long l1 = localSimpleDateFormat.parse(paramString).getTime();
      long l2 = System.currentTimeMillis();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(l1);
      arrayOfObject[1] = Long.valueOf(l2);
      z.i("!24@/B4Tb64lLpKIVTyJhzV/jw==", "todate:[%d], now date:[%d]", arrayOfObject);
      return l2 - l1;
    }
    catch (ParseException localParseException)
    {
    }
    return 0L;
  }

  public static boolean xG(String paramString)
  {
    if (jb(paramString));
    int i;
    do
    {
      return false;
      i = paramString.lastIndexOf(".");
    }
    while (i == -1);
    return xH(paramString.substring(i + 1));
  }

  public static boolean xH(String paramString)
  {
    if (jb(paramString));
    String str;
    do
    {
      return false;
      str = paramString.toLowerCase();
    }
    while ((!str.equals("jpg")) && (!str.equals("gif")) && (!str.equals("bmp")) && (!str.equals("jpeg")) && (!str.equals("png")));
    return true;
  }

  public static Intent xo(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("")));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setDataAndType(Uri.fromFile(new File(paramString)), "application/vnd.android.package-archive");
      return localIntent;
    }
  }

  public static int xp(String paramString)
  {
    if (paramString == null)
      return -1;
    return paramString.length();
  }

  public static int xq(String paramString)
  {
    try
    {
      long l = new SimpleDateFormat("yyyy-MM-dd").parse(paramString).getTime() / 1000L;
      return (int)l;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public static double xr(String paramString)
  {
    if (paramString == null)
      return 0.0D;
    try
    {
      double d = Double.parseDouble(paramString);
      return d;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0.0D;
  }

  public static int xs(String paramString)
  {
    if (paramString == null)
      return 0;
    try
    {
      long l = Long.decode(paramString).longValue();
      return (int)(l & 0xFFFFFFFF);
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return 0;
  }

  public static int[] xt(String paramString)
  {
    if (paramString == null)
      return null;
    String[] arrayOfString = paramString.split(":");
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfString.length;
    int j = 0;
    while (true)
      if (j < i)
      {
        String str = arrayOfString[j];
        if ((str != null) && (str.length() > 0));
        try
        {
          localArrayList.add(Integer.valueOf(Integer.valueOf(str).intValue()));
          j++;
        }
        catch (Exception localException)
        {
          while (true)
            z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "invalid port num, ignore");
        }
      }
    int[] arrayOfInt = new int[localArrayList.size()];
    for (int k = 0; k < arrayOfInt.length; k++)
      arrayOfInt[k] = ((Integer)localArrayList.get(k)).intValue();
    return arrayOfInt;
  }

  public static final String xu(String paramString)
  {
    if (jb(paramString))
      return "";
    try
    {
      String str = new URL(paramString).getHost();
      return str;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      z.w("!24@/B4Tb64lLpKIVTyJhzV/jw==", "get host error");
    }
    return paramString;
  }

  public static String xv(String paramString)
  {
    if (paramString == null)
      return "";
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      char c = paramString.charAt(j);
      int k = 1;
      for (int m = -1 + gWy.length; ; m--)
        if (m >= 0)
        {
          if (gWy[m] == c)
          {
            localStringBuffer.append(gWz[m]);
            k = 0;
          }
        }
        else
        {
          if (k != 0)
            localStringBuffer.append(c);
          j++;
          break;
        }
    }
    return localStringBuffer.toString();
  }

  public static String xw(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while (Build.VERSION.SDK_INT >= 8)
      return paramString;
    int i = paramString.length();
    char[] arrayOfChar = new char[i];
    int j = 0;
    int k = 0;
    int m = -1;
    int n;
    int i1;
    if (j < i)
    {
      char c = paramString.charAt(j);
      n = k + 1;
      arrayOfChar[k] = c;
      if ((c == '&') && (m == -1))
        m = n;
      while ((m == -1) || (Character.isLetter(c)) || (Character.isDigit(c)) || (c == '#'))
      {
        j++;
        k = n;
        break;
      }
      if (c == ';')
      {
        i1 = c(arrayOfChar, m, -1 + (n - m));
        if (i1 > 65535)
        {
          int i2 = i1 - 65536;
          arrayOfChar[(m - 1)] = ((char)(55296 + (i2 >> 10)));
          arrayOfChar[m] = ((char)(56320 + (i2 & 0x3FF)));
          m++;
        }
      }
    }
    while (true)
    {
      n = m;
      m = -1;
      break;
      if (i1 != 0)
      {
        arrayOfChar[(m - 1)] = ((char)i1);
        continue;
        m = -1;
        break;
        return new String(arrayOfChar, 0, k);
      }
      m = n;
    }
  }

  public static boolean xx(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "isImgFile, invalid argument");
    BitmapFactory.Options localOptions;
    do
    {
      do
        return false;
      while ((paramString.length() < 3) || (!new File(paramString).exists()));
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(paramString, localOptions);
    }
    while ((localOptions.outWidth <= 0) || (localOptions.outHeight <= 0));
    return true;
  }

  public static int xy(String paramString)
  {
    try
    {
      int j = Integer.parseInt(paramString);
      i = j;
      return i;
    }
    catch (Exception localException)
    {
      do
        int i = 0;
      while (paramString == null);
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "parserInt error " + paramString);
    }
    return 0;
  }

  public static long xz(String paramString)
  {
    long l1 = 0L;
    try
    {
      long l2 = Long.parseLong(paramString);
      l1 = l2;
      return l1;
    }
    catch (Exception localException)
    {
      while (paramString == null);
      z.e("!24@/B4Tb64lLpKIVTyJhzV/jw==", "parseLong error " + paramString);
    }
    return l1;
  }

  public static boolean ys()
  {
    if (!Locale.getDefault().equals(Locale.CHINA))
      return true;
    TimeZone localTimeZone1 = TimeZone.getDefault();
    TimeZone localTimeZone2 = TimeZone.getTimeZone("GMT+08:00");
    if (localTimeZone1.getRawOffset() != localTimeZone2.getRawOffset())
      return true;
    TelephonyManager localTelephonyManager = (TelephonyManager)ak.getContext().getSystemService("phone");
    if (localTelephonyManager != null)
    {
      String str = localTelephonyManager.getNetworkCountryIso();
      if ((!jb(str)) && (!str.contains("cn")) && (!str.contains("CN")))
        return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ch
 * JD-Core Version:    0.6.2
 */