package com.tencent.mm.an;

import android.content.Context;
import android.content.res.Resources;
import android.os.StatFs;
import android.util.DisplayMetrics;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import java.io.File;

public final class b
{
  // ERROR //
  public static String aFm()
  {
    // Byte code:
    //   0: new 10	java/lang/ProcessBuilder
    //   3: dup
    //   4: iconst_2
    //   5: anewarray 12	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc 14
    //   12: aastore
    //   13: dup
    //   14: iconst_1
    //   15: ldc 16
    //   17: aastore
    //   18: invokespecial 20	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   21: invokevirtual 24	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   24: invokevirtual 30	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   27: astore 7
    //   29: aload 7
    //   31: astore_1
    //   32: new 32	java/io/BufferedReader
    //   35: dup
    //   36: new 34	java/io/InputStreamReader
    //   39: dup
    //   40: aload_1
    //   41: invokespecial 37	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   44: invokespecial 40	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   47: astore 8
    //   49: ldc 42
    //   51: astore 5
    //   53: aload 8
    //   55: invokevirtual 45	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   58: astore 10
    //   60: aload 10
    //   62: ifnull +48 -> 110
    //   65: aload 10
    //   67: invokestatic 51	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   70: ifne -17 -> 53
    //   73: new 53	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   80: aload 5
    //   82: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload 10
    //   87: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: ldc 62
    //   92: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokestatic 69	com/tencent/mm/an/b:wl	(Ljava/lang/String;)Ljava/lang/String;
    //   101: astore 11
    //   103: aload 11
    //   105: astore 5
    //   107: goto -54 -> 53
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 74	java/io/InputStream:close	()V
    //   118: aload 5
    //   120: areturn
    //   121: astore 4
    //   123: aconst_null
    //   124: astore_1
    //   125: ldc 42
    //   127: astore 5
    //   129: aload_1
    //   130: ifnull -12 -> 118
    //   133: aload_1
    //   134: invokevirtual 74	java/io/InputStream:close	()V
    //   137: aload 5
    //   139: areturn
    //   140: astore 6
    //   142: aload 5
    //   144: areturn
    //   145: astore_0
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_0
    //   149: astore_2
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 74	java/io/InputStream:close	()V
    //   158: aload_2
    //   159: athrow
    //   160: astore 12
    //   162: aload 5
    //   164: areturn
    //   165: astore_3
    //   166: goto -8 -> 158
    //   169: astore_2
    //   170: goto -20 -> 150
    //   173: astore 13
    //   175: ldc 42
    //   177: astore 5
    //   179: goto -50 -> 129
    //   182: astore 9
    //   184: goto -55 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   0	29	121	java/io/IOException
    //   133	137	140	java/io/IOException
    //   0	29	145	finally
    //   114	118	160	java/io/IOException
    //   154	158	165	java/io/IOException
    //   32	49	169	finally
    //   53	60	169	finally
    //   65	103	169	finally
    //   32	49	173	java/io/IOException
    //   53	60	182	java/io/IOException
    //   65	103	182	java/io/IOException
  }

  // ERROR //
  public static String aFn()
  {
    // Byte code:
    //   0: new 10	java/lang/ProcessBuilder
    //   3: dup
    //   4: iconst_2
    //   5: anewarray 12	java/lang/String
    //   8: dup
    //   9: iconst_0
    //   10: ldc 14
    //   12: aastore
    //   13: dup
    //   14: iconst_1
    //   15: ldc 77
    //   17: aastore
    //   18: invokespecial 20	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   21: invokevirtual 24	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   24: invokevirtual 30	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   27: astore 7
    //   29: aload 7
    //   31: astore_1
    //   32: new 32	java/io/BufferedReader
    //   35: dup
    //   36: new 34	java/io/InputStreamReader
    //   39: dup
    //   40: aload_1
    //   41: invokespecial 37	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   44: invokespecial 40	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   47: astore 8
    //   49: ldc 42
    //   51: astore 5
    //   53: aload 8
    //   55: invokevirtual 45	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   58: astore 10
    //   60: aload 10
    //   62: ifnull +48 -> 110
    //   65: aload 10
    //   67: invokestatic 51	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   70: ifne -17 -> 53
    //   73: new 53	java/lang/StringBuilder
    //   76: dup
    //   77: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   80: aload 5
    //   82: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: aload 10
    //   87: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: ldc 62
    //   92: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 65	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokestatic 69	com/tencent/mm/an/b:wl	(Ljava/lang/String;)Ljava/lang/String;
    //   101: astore 11
    //   103: aload 11
    //   105: astore 5
    //   107: goto -54 -> 53
    //   110: aload_1
    //   111: ifnull +7 -> 118
    //   114: aload_1
    //   115: invokevirtual 74	java/io/InputStream:close	()V
    //   118: aload 5
    //   120: areturn
    //   121: astore 4
    //   123: aconst_null
    //   124: astore_1
    //   125: ldc 42
    //   127: astore 5
    //   129: aload_1
    //   130: ifnull -12 -> 118
    //   133: aload_1
    //   134: invokevirtual 74	java/io/InputStream:close	()V
    //   137: aload 5
    //   139: areturn
    //   140: astore 6
    //   142: aload 5
    //   144: areturn
    //   145: astore_0
    //   146: aconst_null
    //   147: astore_1
    //   148: aload_0
    //   149: astore_2
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 74	java/io/InputStream:close	()V
    //   158: aload_2
    //   159: athrow
    //   160: astore 12
    //   162: aload 5
    //   164: areturn
    //   165: astore_3
    //   166: goto -8 -> 158
    //   169: astore_2
    //   170: goto -20 -> 150
    //   173: astore 13
    //   175: ldc 42
    //   177: astore 5
    //   179: goto -50 -> 129
    //   182: astore 9
    //   184: goto -55 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   0	29	121	java/io/IOException
    //   133	137	140	java/io/IOException
    //   0	29	145	finally
    //   114	118	160	java/io/IOException
    //   154	158	165	java/io/IOException
    //   32	49	169	finally
    //   53	60	169	finally
    //   65	103	169	finally
    //   32	49	173	java/io/IOException
    //   53	60	182	java/io/IOException
    //   65	103	182	java/io/IOException
  }

  public static String aFo()
  {
    try
    {
      new DisplayMetrics();
      DisplayMetrics localDisplayMetrics = ak.getContext().getResources().getDisplayMetrics();
      int i = localDisplayMetrics.widthPixels;
      int j = localDisplayMetrics.heightPixels;
      float f1 = localDisplayMetrics.density;
      float f2 = localDisplayMetrics.xdpi;
      float f3 = localDisplayMetrics.ydpi;
      String str1 = "" + "width:" + String.valueOf(i) + ";";
      String str2 = str1 + "height:" + String.valueOf(j) + ";";
      String str3 = str2 + "density:" + String.valueOf(f1) + ";";
      String str4 = str3 + "xd:" + String.valueOf(f2) + ";";
      String str5 = str4 + "yd:" + String.valueOf(f3) + ";";
      return str5;
    }
    catch (Exception localException)
    {
    }
    return "";
  }

  public static String aFp()
  {
    String str1 = "";
    try
    {
      StatFs localStatFs = new StatFs(m.getDataDirectory().getPath());
      long l = localStatFs.getBlockSize();
      str1 = str1 + "AvailableSizes:" + l * localStatFs.getAvailableBlocks() + ";";
      str1 = str1 + "FreeSizes:" + l * localStatFs.getFreeBlocks() + ";";
      String str2 = str1 + "AllSize:" + l * localStatFs.getBlockCount() + ";";
      return str2;
    }
    catch (Exception localException)
    {
    }
    return str1;
  }

  public static String aFq()
  {
    String str1 = "";
    try
    {
      StatFs localStatFs = new StatFs(m.getExternalStorageDirectory().getPath());
      long l = localStatFs.getBlockSize();
      str1 = str1 + "AvailableSizes:" + l * localStatFs.getAvailableBlocks() + ";";
      str1 = str1 + "FreeSizes:" + l * localStatFs.getFreeBlocks() + ";";
      String str2 = str1 + "AllSize:" + l * localStatFs.getBlockCount() + ";";
      return str2;
    }
    catch (Exception localException)
    {
    }
    return str1;
  }

  public static String aFr()
  {
    return (String)bg.qW().oQ().get(71, null);
  }

  private static String wl(String paramString)
  {
    if (ch.jb(paramString))
      return "";
    return paramString.replaceAll(" ", "").trim().replaceAll("kB", "").trim().replaceAll("\\t", "").trim();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.b
 * JD-Core Version:    0.6.2
 */