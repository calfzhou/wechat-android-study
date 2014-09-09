package com.tencent.mm.app;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import android.util.StringBuilderPrinter;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.model.bf;
import com.tencent.mm.sandbox.monitor.ExceptionMonitorService;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.aw;
import com.tencent.mm.sdk.platformtools.ax;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.WebView;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

public class h
  implements c, ax
{
  public static final long cGf = ch.CM();
  private static final String cGo = str;
  private static final String cGp = com.tencent.mm.a.k.getString(str.hashCode());
  private static String cGq = "";
  private aw cGg = null;
  private j cGh;
  private volatile long cGi = 0L;
  HashSet cGj;
  String cGk;
  String cGm;
  ConditionVariable cGn;
  volatile k cGr;

  static
  {
    String str = v.nh();
  }

  // ERROR //
  static String a(String paramString, int paramInt, long paramLong, android.app.ActivityManager.ProcessErrorStateInfo paramProcessErrorStateInfo)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: new 79	java/lang/StringBuilder
    //   6: dup
    //   7: sipush 4096
    //   10: invokespecial 82	java/lang/StringBuilder:<init>	(I)V
    //   13: astore 6
    //   15: new 84	java/text/SimpleDateFormat
    //   18: dup
    //   19: ldc 86
    //   21: invokespecial 89	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   24: astore 7
    //   26: new 79	java/lang/StringBuilder
    //   29: dup
    //   30: ldc 91
    //   32: invokespecial 92	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: iload_1
    //   36: invokevirtual 96	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   39: ldc 98
    //   41: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore 8
    //   49: aload 4
    //   51: ifnull +19 -> 70
    //   54: aload 6
    //   56: aload 4
    //   58: getfield 109	android/app/ActivityManager$ProcessErrorStateInfo:longMsg	Ljava/lang/String;
    //   61: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: bipush 10
    //   66: invokevirtual 112	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: new 114	java/io/BufferedReader
    //   73: dup
    //   74: new 116	java/io/FileReader
    //   77: dup
    //   78: aload_0
    //   79: invokespecial 117	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   82: invokespecial 120	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   85: astore 9
    //   87: aload 9
    //   89: invokevirtual 123	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   92: astore 14
    //   94: aload 14
    //   96: ifnull +220 -> 316
    //   99: iload 5
    //   101: tableswitch	default:+274 -> 375, 0:+27->128, 1:+92->193, 2:+142->243
    //   129: dconst_0
    //   130: aload 8
    //   132: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   135: ifeq -48 -> 87
    //   138: aload 8
    //   140: invokevirtual 130	java/lang/String:length	()I
    //   143: istore 22
    //   145: aload 7
    //   147: aload 14
    //   149: iload 22
    //   151: iload 22
    //   153: bipush 19
    //   155: iadd
    //   156: invokevirtual 134	java/lang/String:substring	(II)Ljava/lang/String;
    //   159: invokevirtual 138	java/text/SimpleDateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   162: invokevirtual 143	java/util/Date:getTime	()J
    //   165: lload_2
    //   166: lsub
    //   167: lstore 23
    //   169: lload 23
    //   171: ldc2_w 144
    //   174: lcmp
    //   175: iflt -88 -> 87
    //   178: lload 23
    //   180: ldc2_w 146
    //   183: lcmp
    //   184: ifgt -97 -> 87
    //   187: iconst_1
    //   188: istore 5
    //   190: goto -103 -> 87
    //   193: aload 6
    //   195: aload 14
    //   197: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: bipush 10
    //   202: invokevirtual 112	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload 14
    //   208: ldc 149
    //   210: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   213: ifeq +9 -> 222
    //   216: iconst_2
    //   217: istore 5
    //   219: goto -132 -> 87
    //   222: aload 14
    //   224: ldc 151
    //   226: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   229: istore 20
    //   231: iload 20
    //   233: ifeq -146 -> 87
    //   236: aload 9
    //   238: invokevirtual 154	java/io/BufferedReader:close	()V
    //   241: aconst_null
    //   242: areturn
    //   243: aload 14
    //   245: ldc 156
    //   247: invokevirtual 127	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   250: ifeq +23 -> 273
    //   253: aload 6
    //   255: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: astore 17
    //   260: aload 9
    //   262: invokevirtual 154	java/io/BufferedReader:close	()V
    //   265: aload 17
    //   267: areturn
    //   268: astore 18
    //   270: aload 17
    //   272: areturn
    //   273: aload 6
    //   275: aload 14
    //   277: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: bipush 10
    //   282: invokevirtual 112	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: goto -199 -> 87
    //   289: astore 12
    //   291: ldc 158
    //   293: aload 12
    //   295: ldc 160
    //   297: iconst_0
    //   298: anewarray 4	java/lang/Object
    //   301: invokestatic 166	com/tencent/mm/sdk/platformtools/z:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: aload 9
    //   306: ifnull +8 -> 314
    //   309: aload 9
    //   311: invokevirtual 154	java/io/BufferedReader:close	()V
    //   314: aconst_null
    //   315: areturn
    //   316: aload 9
    //   318: invokevirtual 154	java/io/BufferedReader:close	()V
    //   321: goto -7 -> 314
    //   324: astore 15
    //   326: goto -12 -> 314
    //   329: astore 10
    //   331: aconst_null
    //   332: astore 9
    //   334: aload 9
    //   336: ifnull +8 -> 344
    //   339: aload 9
    //   341: invokevirtual 154	java/io/BufferedReader:close	()V
    //   344: aload 10
    //   346: athrow
    //   347: astore 21
    //   349: goto -108 -> 241
    //   352: astore 13
    //   354: goto -40 -> 314
    //   357: astore 11
    //   359: goto -15 -> 344
    //   362: astore 10
    //   364: goto -30 -> 334
    //   367: astore 12
    //   369: aconst_null
    //   370: astore 9
    //   372: goto -81 -> 291
    //   375: goto -288 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   260	265	268	java/io/IOException
    //   87	94	289	java/lang/Exception
    //   128	169	289	java/lang/Exception
    //   193	216	289	java/lang/Exception
    //   222	231	289	java/lang/Exception
    //   243	260	289	java/lang/Exception
    //   273	286	289	java/lang/Exception
    //   316	321	324	java/io/IOException
    //   70	87	329	finally
    //   236	241	347	java/io/IOException
    //   309	314	352	java/io/IOException
    //   339	344	357	java/io/IOException
    //   87	94	362	finally
    //   128	169	362	finally
    //   193	216	362	finally
    //   222	231	362	finally
    //   243	260	362	finally
    //   273	286	362	finally
    //   291	304	362	finally
    //   70	87	367	java/lang/Exception
  }

  public static boolean aq(String paramString)
  {
    cGq = paramString;
    try
    {
      c localc = (ax)Class.forName("com.tencent.mm.crash.RDMCrashReporter").newInstance();
      ak.getContext();
      localc.hS();
      bf.dkH.z("last_login_uin", cGp);
      b.a(localc);
      new i();
      return true;
    }
    catch (Exception localException)
    {
      z.w("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "rdm crash reporter load failed");
      h localh = new h();
      ak.getContext();
      localh.hS();
      b.a(localh);
      o.a("wechatCrashForJni", h.class.getClassLoader());
    }
    return false;
  }

  private static void ar(String paramString)
  {
    try
    {
      while (paramString.length() > 896)
      {
        int i = paramString.substring(0, 896).lastIndexOf("\n");
        if (-1 == i)
          break;
        z.e("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", paramString.substring(0, i));
        paramString = paramString.substring(i + 1);
      }
      z.e("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", paramString);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  private static void c(String paramString, int paramInt)
  {
    ar(paramString);
    if ((paramInt > 0) && (paramString.length() > paramInt))
      paramString = paramString.substring(0, paramInt);
    Intent localIntent = new Intent(ak.getContext(), ExceptionMonitorService.class);
    localIntent.setAction("uncatch_exception");
    localIntent.putExtra("exceptionPid", Process.myPid());
    localIntent.putExtra("exceptionTime", SystemClock.elapsedRealtime());
    localIntent.putExtra("userName", hR());
    localIntent.putExtra("exceptionMsg", Base64.encodeToString(paramString.getBytes(), 2));
    ak.getContext().startService(localIntent);
  }

  private static String hR()
  {
    String str = bf.dkH.z("login_weixin_username", "");
    if (ch.jb(str))
      str = bf.dkH.z("login_user_name", "never_login_crash");
    return str;
  }

  private static String ia()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      localObject = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { "dalvik.vm.stack-trace-file", null });
      if ((localObject == null) || (((String)localObject).length() == 0))
        localObject = "/data/anr/traces.txt";
      int i = ((String)localObject).lastIndexOf('.');
      if (i != -1)
      {
        String str1 = ak.aHm();
        if ((str1 == null) || (str1.length() == 0))
          str1 = "com.tencent.mm";
        String str2 = ((String)localObject).substring(0, i) + '_' + str1 + ((String)localObject).substring(i);
        if (new File(str2).isFile())
        {
          localObject = str2;
          return localObject;
        }
      }
    }
    catch (Exception localException)
    {
      Object localObject;
      do
        while (true)
        {
          z.printErrStackTrace("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", localException, "Failed finding out ANR trace file path, using default.", new Object[0]);
          localObject = "/data/anr/traces.txt";
        }
      while (new File((String)localObject).isFile());
    }
    return null;
  }

  private static String ib()
  {
    StringBuilder localStringBuilder1 = new StringBuilder(256);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder1);
    Context localContext = ak.getContext();
    localStringBuilderPrinter.println("#client.version=" + com.tencent.mm.protocal.a.hrn);
    localStringBuilderPrinter.println("#accinfo.revision=798589");
    localStringBuilderPrinter.println("#accinfo.uin=" + bf.dkH.z("last_login_uin", cGp));
    localStringBuilderPrinter.println("#accinfo.dev=" + cGo);
    localStringBuilderPrinter.println("#accinfo.runtime=" + (ch.CM() - cGf) + "(" + ch.ja(cGq) + ")");
    localStringBuilderPrinter.println("#accinfo.build=08/28/2014 02:01 PM:amm-dev");
    localStringBuilderPrinter.println("#qbrwoser.corever=" + WebView.getQQBrowserCoreVersion(localContext));
    localStringBuilderPrinter.println("#qbrowser.ver=" + WebView.getQQBrowserVersion());
    StringBuilder localStringBuilder2 = new StringBuilder("#accinfo.env=");
    String str1;
    if (b.foreground)
      str1 = "f";
    while (true)
    {
      localStringBuilderPrinter.println(str1 + ":" + Thread.currentThread().getName() + ":" + b.iDb);
      try
      {
        File localFile = Environment.getDataDirectory();
        StatFs localStatFs1 = new StatFs(localFile.getPath());
        StatFs localStatFs2 = new StatFs(com.tencent.mm.compatible.g.h.dOH);
        int i = ((ActivityManager)localContext.getSystemService("activity")).getMemoryClass();
        Object[] arrayOfObject2 = new Object[9];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = localFile.getAbsolutePath();
        arrayOfObject2[2] = Integer.valueOf(localStatFs1.getBlockSize());
        arrayOfObject2[3] = Integer.valueOf(localStatFs1.getBlockCount());
        arrayOfObject2[4] = Integer.valueOf(localStatFs1.getAvailableBlocks());
        arrayOfObject2[5] = com.tencent.mm.compatible.g.h.dOH;
        arrayOfObject2[6] = Integer.valueOf(localStatFs2.getBlockSize());
        arrayOfObject2[7] = Integer.valueOf(localStatFs2.getBlockCount());
        arrayOfObject2[8] = Integer.valueOf(localStatFs2.getAvailableBlocks());
        String str3 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", arrayOfObject2);
        str2 = str3;
        localStringBuilderPrinter.println("#accinfo.data=" + str2);
        Date localDate = new Date();
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + localSimpleDateFormat.format(localDate));
        localStringBuilderPrinter.println("#crashContent=");
        return localStringBuilder1.toString();
        str1 = "b";
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localException.getMessage();
          z.e("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "check data size failed :%s", arrayOfObject1);
          String str2 = "";
        }
      }
    }
  }

  public final void a(com.tencent.mm.sdk.b.a parama)
  {
    if (this.cGg == null)
    {
      z.e("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "null ueh, not init ?");
      return;
    }
    this.cGg.a(parama);
  }

  public final void av(String paramString)
  {
    c(ib() + paramString, 0);
  }

  public final void b(int paramInt, String paramString)
  {
    String str1 = null;
    if (paramInt == 6);
    try
    {
      String str3 = ia();
      str1 = null;
      if (str3 != null)
        str1 = a(str3, Process.myPid(), System.currentTimeMillis(), null);
      StringBuilder localStringBuilder = new StringBuilder(1024);
      localStringBuilder.append("#[jin_crash]sig=").append(paramInt).append('\n');
      localStringBuilder.append(ib());
      localStringBuilder.append(paramString).append('\n');
      if (str1 != null)
      {
        localStringBuilder.append("******* ANR Trace *******\n");
        localStringBuilder.append(str1);
      }
      String str2 = localStringBuilder.toString();
      if (paramInt == 6);
      for (int i = 0; ; i = 8192)
      {
        c(str2, i);
        z.e("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        z.appenderClose();
        return;
      }
    }
    catch (Exception localException)
    {
      z.printErrStackTrace("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", localException, "Failed reporting JNI crash.", new Object[0]);
    }
  }

  final void d(String paramString, int paramInt)
  {
    ar(paramString);
    long l = System.currentTimeMillis();
    if (l - this.cGi < 120000L)
      return;
    this.cGi = l;
    StringBuilder localStringBuilder = new StringBuilder(4096);
    localStringBuilder.append(ib());
    localStringBuilder.append("******* ANR Trace *******\n");
    localStringBuilder.append(paramString);
    Intent localIntent = new Intent(ak.getContext(), ExceptionMonitorService.class);
    localIntent.setAction("uncatch_exception");
    localIntent.putExtra("tag", "anr");
    localIntent.putExtra("exceptionPid", paramInt);
    localIntent.putExtra("exceptionTime", SystemClock.elapsedRealtime());
    localIntent.putExtra("userName", bf.dkH.z("login_user_name", "never_login_crash"));
    localIntent.putExtra("exceptionMsg", Base64.encodeToString(localStringBuilder.toString().getBytes(), 2));
    ak.getContext().startService(localIntent);
  }

  public final void hS()
  {
    if (this.cGg != null)
      z.w("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", "skipped duplicated init");
    do
    {
      return;
      this.cGg = new aw(this);
    }
    while (!ak.aHm().endsWith(":push"));
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      str = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { "dalvik.vm.stack-trace-file", null });
      if ((str == null) || (str.length() == 0))
        str = "/data/anr/traces.txt";
      File localFile = new File(str);
      this.cGk = localFile.getParent();
      if ((this.cGk == null) || (this.cGk.length() == 0))
        this.cGk = "/";
      this.cGm = localFile.getName();
      this.cGn = new ConditionVariable();
      this.cGj = new HashSet();
      this.cGh = new j(this, this.cGk);
      this.cGh.startWatching();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        z.printErrStackTrace("!44@/B4Tb64lLpJbU4CbMF/fcEMVphCeQGA2PrZyfioj0fM=", localException, "Failed finding out ANR trace file path, using default.", new Object[0]);
        String str = "/data/anr/traces.txt";
      }
    }
  }

  public final void m(String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(ak.getContext(), ExceptionMonitorService.class);
    localIntent.setAction("custom_exception");
    localIntent.putExtra("userName", hR());
    localIntent.putExtra("tag", paramString2);
    localIntent.putExtra("exceptionMsg", paramString1);
    ak.getContext().startService(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.h
 * JD-Core Version:    0.6.2
 */