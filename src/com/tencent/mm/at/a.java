package com.tencent.mm.at;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.widget.Toast;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class a
{
  public static final String iHr = m.getExternalStorageDirectory() + "/tencent/MicroMsg/memory/";

  public static void aNX()
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      ActivityManager localActivityManager = (ActivityManager)ak.getContext().getSystemService("activity");
      localActivityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " wechat heap info ");
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " Runtime.totalMemory " + Runtime.getRuntime().totalMemory());
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " Runtime.freeMemory " + Runtime.getRuntime().freeMemory());
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " Debug.nativeHeapSize " + Debug.getNativeHeapSize());
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " Debug.nativeHeapAllocatedSize " + Debug.getNativeHeapAllocatedSize());
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = Process.myPid();
      for (Debug.MemoryInfo localMemoryInfo : localActivityManager.getProcessMemoryInfo(arrayOfInt))
      {
        z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " wechat memory info");
        z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " pidMemoryInfo.getTotalPrivateDirty(): " + localMemoryInfo.getTotalPrivateDirty() + "\n");
        z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " pidMemoryInfo.getTotalPss(): " + localMemoryInfo.getTotalPss() + "\n");
        z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " pidMemoryInfo.getTotalSharedDirty(): " + localMemoryInfo.getTotalSharedDirty() + "\n");
      }
    }
    aNY();
  }

  // ERROR //
  private static void aNY()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: new 10	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 152
    //   8: invokespecial 79	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: invokestatic 115	android/os/Process:myPid	()I
    //   14: invokevirtual 131	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   17: invokevirtual 32	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   20: astore_1
    //   21: invokestatic 85	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   24: aload_1
    //   25: invokevirtual 156	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   28: astore 12
    //   30: new 158	java/io/InputStreamReader
    //   33: dup
    //   34: aload 12
    //   36: invokevirtual 164	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   39: invokespecial 167	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   42: astore 6
    //   44: new 169	java/io/LineNumberReader
    //   47: dup
    //   48: aload 6
    //   50: invokespecial 172	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   53: astore_3
    //   54: aload_3
    //   55: invokevirtual 175	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   58: astore 16
    //   60: aload 16
    //   62: ifnull +45 -> 107
    //   65: ldc 66
    //   67: aload 16
    //   69: invokestatic 74	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: goto -18 -> 54
    //   75: astore 15
    //   77: aload 6
    //   79: astore 4
    //   81: ldc 66
    //   83: ldc 177
    //   85: invokestatic 180	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   88: aload_3
    //   89: ifnull +7 -> 96
    //   92: aload_3
    //   93: invokevirtual 183	java/io/LineNumberReader:close	()V
    //   96: aload 4
    //   98: ifnull +8 -> 106
    //   101: aload 4
    //   103: invokevirtual 184	java/io/InputStreamReader:close	()V
    //   106: return
    //   107: aload 12
    //   109: invokevirtual 187	java/lang/Process:waitFor	()I
    //   112: pop
    //   113: aload 12
    //   115: invokevirtual 190	java/lang/Process:destroy	()V
    //   118: aload_3
    //   119: invokevirtual 183	java/io/LineNumberReader:close	()V
    //   122: aload 6
    //   124: invokevirtual 184	java/io/InputStreamReader:close	()V
    //   127: return
    //   128: astore 18
    //   130: return
    //   131: astore 10
    //   133: aconst_null
    //   134: astore 6
    //   136: ldc 66
    //   138: ldc 192
    //   140: invokestatic 180	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   143: aload_0
    //   144: ifnull +7 -> 151
    //   147: aload_0
    //   148: invokevirtual 183	java/io/LineNumberReader:close	()V
    //   151: aload 6
    //   153: ifnull -47 -> 106
    //   156: aload 6
    //   158: invokevirtual 184	java/io/InputStreamReader:close	()V
    //   161: return
    //   162: astore 11
    //   164: return
    //   165: astore 7
    //   167: aconst_null
    //   168: astore 6
    //   170: aload_0
    //   171: ifnull +7 -> 178
    //   174: aload_0
    //   175: invokevirtual 183	java/io/LineNumberReader:close	()V
    //   178: aload 6
    //   180: ifnull +8 -> 188
    //   183: aload 6
    //   185: invokevirtual 184	java/io/InputStreamReader:close	()V
    //   188: aload 7
    //   190: athrow
    //   191: astore 8
    //   193: goto -5 -> 188
    //   196: astore 7
    //   198: goto -28 -> 170
    //   201: astore 14
    //   203: aload_3
    //   204: astore_0
    //   205: aload 14
    //   207: astore 7
    //   209: goto -39 -> 170
    //   212: astore 5
    //   214: aload 4
    //   216: astore 6
    //   218: aload_3
    //   219: astore_0
    //   220: aload 5
    //   222: astore 7
    //   224: goto -54 -> 170
    //   227: astore 20
    //   229: aconst_null
    //   230: astore_0
    //   231: goto -95 -> 136
    //   234: astore 13
    //   236: aload_3
    //   237: astore_0
    //   238: goto -102 -> 136
    //   241: astore 9
    //   243: return
    //   244: astore_2
    //   245: aconst_null
    //   246: astore_3
    //   247: aconst_null
    //   248: astore 4
    //   250: goto -169 -> 81
    //   253: astore 19
    //   255: aload 6
    //   257: astore 4
    //   259: aconst_null
    //   260: astore_3
    //   261: goto -180 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   54	60	75	java/io/IOException
    //   65	72	75	java/io/IOException
    //   107	118	75	java/io/IOException
    //   118	127	128	java/io/IOException
    //   21	44	131	java/lang/InterruptedException
    //   147	151	162	java/io/IOException
    //   156	161	162	java/io/IOException
    //   21	44	165	finally
    //   174	178	191	java/io/IOException
    //   183	188	191	java/io/IOException
    //   44	54	196	finally
    //   136	143	196	finally
    //   54	60	201	finally
    //   65	72	201	finally
    //   107	118	201	finally
    //   81	88	212	finally
    //   44	54	227	java/lang/InterruptedException
    //   54	60	234	java/lang/InterruptedException
    //   65	72	234	java/lang/InterruptedException
    //   107	118	234	java/lang/InterruptedException
    //   92	96	241	java/io/IOException
    //   101	106	241	java/io/IOException
    //   21	44	244	java/io/IOException
    //   44	54	253	java/io/IOException
  }

  private static boolean u(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool;
    if (!m.nI())
    {
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", "Hprof sdcard is invalid");
      bool = false;
    }
    File[] arrayOfFile2;
    do
    {
      return bool;
      File localFile1 = new File(iHr);
      if (!localFile1.exists())
      {
        localFile1.mkdirs();
        return true;
      }
      File[] arrayOfFile1 = localFile1.listFiles();
      if (arrayOfFile1.length == 0)
        return true;
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
      long l1 = new Date().getTime();
      int i = arrayOfFile1.length;
      bool = true;
      int j = 0;
      while (true)
        if (j < i)
        {
          File localFile2 = arrayOfFile1[j];
          String str1 = localFile2.getName();
          int k = str1.indexOf(".hprof");
          String str2;
          if (k > 0)
            str2 = str1.substring(0, k);
          try
          {
            localDate = localSimpleDateFormat.parse(str2);
            if (localDate == null)
            {
              localFile2.delete();
              while (true)
              {
                j++;
                break;
                localFile2.delete();
              }
            }
          }
          catch (ParseException localParseException)
          {
            while (true)
            {
              Date localDate;
              z.e("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", "hprofFileCheck parse date fail %s", new Object[] { str2 });
              localFile2.delete();
              continue;
              long l2 = localDate.getTime();
              if (l2 >= l1)
              {
                localFile2.delete();
              }
              else
              {
                long l3 = (l1 - l2) / 86400000L;
                if (l3 >= 3L)
                  localFile2.delete();
                else if ((paramBoolean1) && (l3 < 1L))
                  bool = false;
              }
            }
          }
        }
      arrayOfFile2 = localFile1.listFiles();
    }
    while (arrayOfFile2.length <= 5);
    if (paramBoolean2)
      Toast.makeText(ak.getContext(), "dump fail, hprof file size exceed", 0).show();
    z.w("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", "hprofFileCheck hprofFileDir.length() too large " + arrayOfFile2.length);
    return false;
  }

  public static String v(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!u(paramBoolean1, paramBoolean2))
      return null;
    long l = System.currentTimeMillis();
    String str1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(iHr).append(str1).append(".hprof");
    String str2 = localStringBuffer.toString();
    try
    {
      System.gc();
      System.gc();
      Debug.dumpHprofData(str2);
      if (paramBoolean2)
        Toast.makeText(ak.getContext(), str2 + " hprof file has saved ", 0).show();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = str1;
      arrayOfObject[1] = Long.valueOf(ch.ac(l));
      z.i("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", "dump file %s, use time %d", arrayOfObject);
      return str2;
    }
    catch (IOException localIOException)
    {
      z.e("!44@/B4Tb64lLpI67oPDTT86rGpV5UYBJBo2TPukf7fPbzI=", " dumpHprofFile IOException");
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a
 * JD-Core Version:    0.6.2
 */