package com.tencent.mm.ui.e;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Process;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.Base64;
import com.tencent.mm.ad.l;
import com.tencent.mm.ad.s;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.t;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class f
  implements m
{
  private static final String cGo = str;
  private static final String cGp = com.tencent.mm.a.k.getString(str.hashCode());
  private static f jXK;
  private static final String jXL = com.tencent.mm.compatible.g.h.dOH + "/tencent/MicroMsg/SQLTrace/";
  private static List jXT = Arrays.asList(new String[] { "IndexMicroMsg.db" });
  private SharedPreferences dkI = ak.aHj();
  private long jXA = 0L;
  private volatile boolean jXB = false;
  private long jXM;
  private long jXN;
  private long jXO;
  private long jXP;
  private long jXQ;
  private long jXR;
  private long jXS;
  private long[] jXz = { 0L, 0L, 0L };

  static
  {
    String str = v.nh();
  }

  public f()
  {
    bbN();
  }

  private static String Ds(String paramString)
  {
    File localFile = new File(paramString);
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(localFile);
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      localFileInputStream.read(arrayOfByte);
      localFileInputStream.close();
      String str = new String(com.tencent.mm.at.j.cS(arrayOfByte));
      return str;
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  private static long a(String paramString, com.tencent.mm.as.h paramh)
  {
    Cursor localCursor = paramh.rawQuery("select count(*) from " + paramString, null);
    long l = 0L;
    if (localCursor.moveToFirst())
      l = localCursor.getLong(0);
    localCursor.close();
    return l;
  }

  private static void a(com.tencent.mm.as.h paramh, PrintStream paramPrintStream, List paramList)
  {
    if ((paramh == null) || (!paramh.isOpen()))
    {
      z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "db is not open!");
      return;
    }
    long l = System.currentTimeMillis();
    Iterator localIterator;
    if ((paramList != null) && (paramList.size() > 0))
      localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      paramPrintStream.println("#table : " + str2 + " count=" + a(str2, paramh));
      continue;
      Cursor localCursor = paramh.rawQuery("select name from sqlite_master where type='table' ", null);
      while (localCursor.moveToNext())
      {
        String str1 = localCursor.getString(0);
        paramPrintStream.println("#table : " + str1 + " count=" + a(str1, paramh));
      }
      localCursor.close();
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(System.currentTimeMillis() - l);
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "dump all table count last %d", arrayOfObject);
  }

  private void b(File paramFile, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "build log file ,needRecreate %b", arrayOfObject);
    if (paramFile.exists())
    {
      if (!paramBoolean)
        break label84;
      paramFile.delete();
    }
    try
    {
      paramFile.createNewFile();
      Context localContext = ak.getContext();
      long l = System.currentTimeMillis();
      PreferenceManager.getDefaultSharedPreferences(localContext).edit().putLong("sql_trace_log_file_create_time", l).commit();
      k(ak.getContext(), 0L);
      label84: n(paramFile);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "recreate log file fail");
    }
  }

  public static f bbM()
  {
    if (jXK == null)
      jXK = new f();
    return jXK;
  }

  private void bbN()
  {
    this.jXM = this.dkI.getLong("sql_trace_main_thread_select_interval_time", 300L);
    this.jXN = this.dkI.getLong("sql_trace_main_thread_update_interval_time", 500L);
    this.jXO = this.dkI.getLong("sql_trace_child_thread_interval_time", 1500L);
    long l = cK(ak.getContext());
    if (l > 0L)
    {
      this.jXM = (l + this.jXM);
      this.jXN = (l + this.jXN);
      this.jXO = (l + this.jXO);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Long.valueOf(l);
      z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "auto adapte Time %d", arrayOfObject2);
    }
    this.jXP = this.dkI.getLong("sql_trace_child_transaction_interval_time", 5000L);
    this.jXS = this.dkI.getLong("sql_trace_file_full_size", 30720L);
    this.jXQ = this.dkI.getLong("sql_trace_log_file_max_size", 35840L);
    this.jXR = this.dkI.getLong("sql_upload_time_interval", 21600000L);
    n(new File(jXL, "MMSQL.trace"));
    Object[] arrayOfObject1 = new Object[7];
    arrayOfObject1[0] = Long.valueOf(this.jXM);
    arrayOfObject1[1] = Long.valueOf(this.jXN);
    arrayOfObject1[2] = Long.valueOf(this.jXO);
    arrayOfObject1[3] = Long.valueOf(this.jXP);
    arrayOfObject1[4] = Long.valueOf(this.jXS);
    arrayOfObject1[5] = Long.valueOf(this.jXQ);
    arrayOfObject1[6] = Long.valueOf(this.jXR);
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "update arg %d %d %d %d %d %d %d", arrayOfObject1);
  }

  public static long cH(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_report_lastUploadTime", 0L);
  }

  private static long cI(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_create_time", 0L);
  }

  private static long cJ(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_file_full_time", 0L);
  }

  private static long cK(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("sql_trace_log_autoAdaptaTime", 0L);
  }

  private String ib()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    localPrintStream.println("#client.version=" + a.hrn);
    localPrintStream.println("#accinfo.revision=798589");
    localPrintStream.println("#accinfo.uin=" + bf.dkH.z("last_login_uin", cGp));
    localPrintStream.println("#accinfo.dev=" + cGo);
    localPrintStream.println("#accinfo.build=08/28/2014 02:01 PM:amm-dev");
    String str2;
    try
    {
      File localFile = com.tencent.mm.compatible.g.m.getDataDirectory();
      StatFs localStatFs1 = new StatFs(localFile.getPath());
      StatFs localStatFs2 = new StatFs(com.tencent.mm.compatible.g.h.dOH);
      int i = ((ActivityManager)ak.getContext().getSystemService("activity")).getMemoryClass();
      Object[] arrayOfObject3 = new Object[9];
      arrayOfObject3[0] = Integer.valueOf(i);
      arrayOfObject3[1] = localFile.getAbsolutePath();
      arrayOfObject3[2] = Integer.valueOf(localStatFs1.getBlockSize());
      arrayOfObject3[3] = Integer.valueOf(localStatFs1.getBlockCount());
      arrayOfObject3[4] = Integer.valueOf(localStatFs1.getAvailableBlocks());
      arrayOfObject3[5] = com.tencent.mm.compatible.g.h.dOH;
      arrayOfObject3[6] = Integer.valueOf(localStatFs2.getBlockSize());
      arrayOfObject3[7] = Integer.valueOf(localStatFs2.getBlockCount());
      arrayOfObject3[8] = Integer.valueOf(localStatFs2.getAvailableBlocks());
      String str3 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", arrayOfObject3);
      str1 = str3;
      localPrintStream.println("#accinfo.data=" + str1);
      Date localDate = new Date();
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
      localPrintStream.println("#accinfo.uploadTime=" + localSimpleDateFormat.format(localDate));
      long l1 = cK(ak.getContext());
      if (l1 > 0L)
        localPrintStream.println("#logfile.autoAdapteTime :" + l1);
      if (cJ(ak.getContext()) != 0L)
      {
        long l2 = cJ(ak.getContext()) - cI(ak.getContext());
        localPrintStream.println("#logfile.fulllast :" + l2);
        if ((l2 > 0L) && (l2 < 28800000L))
        {
          long l3 = l1 + 100L;
          PreferenceManager.getDefaultSharedPreferences(ak.getContext()).edit().putLong("sql_trace_log_autoAdaptaTime", l3).commit();
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Long.valueOf(l3);
          z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "auto Adapte Time to %d", arrayOfObject2);
          bbN();
        }
        arrayOfl = s.yO().ed(21);
        if ((arrayOfl != null) && (arrayOfl.length != 0) && (arrayOfl[0] != null))
          break label961;
        localPrintStream.println("#traceconfig hardcode");
        if (this.jXz[1] != -1L)
          localPrintStream.println("#wxpackage :cache size=" + this.jXz[0] + " data size= " + this.jXz[1] + " code size =" + this.jXz[2]);
        localPrintStream.println("#dbsize : EnMicroMsg.db size=" + new File(bg.qW().ps()).length());
        localPrintStream.println("#dbsize : SnsMicroMsg.db size=" + new File(new StringBuilder().append(bg.qW().pt()).append("SnsMicroMsg.db").toString()).length());
        a(bg.qW().oP(), localPrintStream, Arrays.asList(new String[] { "message", "rconversation", "rcontact", "ImgInfo2", "BizInfo", "img_flag", "fmessage_conversation", "AppInfo", "AppMessage", "EmojiInfo", "EmojiGroupInfo", "bottleconversation", "bottlemessage", "chatroom", "rbottleconversation", "userinfo" }));
        t localt = com.tencent.mm.pluginsdk.am.aym();
        if (localt != null)
          a(localt.amE(), localPrintStream, Arrays.asList(new String[] { "SnsInfo", "SnsComment" }));
        localPrintStream.println("#sql.content:");
        str2 = localByteArrayOutputStream.toString();
      }
    }
    catch (Exception localException1)
    {
      try
      {
        l[] arrayOfl;
        while (true)
        {
          localByteArrayOutputStream.close();
          return str2;
          localException1 = localException1;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = localException1.getMessage();
          z.e("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "check data size failed :%s", arrayOfObject1);
          String str1 = "";
          continue;
          localPrintStream.println("#logfile.fullTimelast :" + (System.currentTimeMillis() - cI(ak.getContext())));
        }
        label961: localPrintStream.println("#traceconfig id=" + arrayOfl[0].getId() + " version=" + arrayOfl[0].getVersion());
      }
      catch (Exception localException2)
      {
      }
    }
    return str2;
  }

  public static void j(Context paramContext, long paramLong)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_report_lastUploadTime", paramLong).commit();
  }

  private static void k(Context paramContext, long paramLong)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("sql_trace_log_file_full_time", paramLong).commit();
  }

  private void n(File paramFile)
  {
    boolean bool1 = true;
    if (paramFile.exists())
    {
      boolean bool2;
      long l;
      Object[] arrayOfObject;
      if (paramFile.length() > this.jXS)
      {
        bool2 = bool1;
        this.jXB = bool2;
        if (this.jXB)
        {
          l = cJ(ak.getContext());
          arrayOfObject = new Object[bool1];
          if (l == 0L)
            break label96;
        }
      }
      while (true)
      {
        arrayOfObject[0] = Boolean.valueOf(bool1);
        z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "has mark lastFullTime %b", arrayOfObject);
        if (l == 0L)
          k(ak.getContext(), System.currentTimeMillis());
        return;
        bool2 = false;
        break;
        label96: bool1 = false;
      }
    }
    this.jXB = false;
  }

  public final void Dr(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(ak.getPackageName(), "com.tencent.mm.sandbox.monitor.ExceptionMonitorService");
    localIntent.setAction("uncatch_exception");
    localIntent.putExtra("exceptionPid", Process.myPid());
    String str = bf.dkH.z("login_weixin_username", "");
    if (ch.jb(str))
      str = bf.dkH.z("login_user_name", "never_login_crash");
    localIntent.putExtra("userName", str);
    localIntent.putExtra("tag", "SqlTrace");
    localIntent.putExtra("exceptionMsg", Base64.encodeToString((ib() + paramString).getBytes(), 2));
    ak.getContext().startService(localIntent);
  }

  public final void aC(Context paramContext, String paramString)
  {
    try
    {
      Method localMethod = PackageManager.class.getMethod("getPackageSizeInfo", new Class[] { String.class, IPackageStatsObserver.class });
      PackageManager localPackageManager = paramContext.getPackageManager();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = new i(this);
      localMethod.invoke(localPackageManager, arrayOfObject);
      return;
    }
    catch (Exception localException)
    {
      this.jXz[0] = -1L;
      this.jXz[1] = -1L;
      this.jXz[2] = -1L;
    }
  }

  public final void bN(String paramString1, String paramString2)
  {
    if (!com.tencent.mm.compatible.g.j.nI())
    {
      z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "sdcard is not  Available,appendToFile fail ");
      return;
    }
    File localFile = new File(paramString1);
    if (localFile.length() > this.jXQ)
    {
      z.e("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "log file invaild foramt,recreate");
      b(localFile, true);
    }
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramString1, "rw");
      localRandomAccessFile.seek(localRandomAccessFile.length());
      localRandomAccessFile.write(com.tencent.mm.at.j.cS(paramString2.getBytes()));
      localRandomAccessFile.close();
      n(new File(jXL + "MMSQL.trace"));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        z.printErrStackTrace("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", localIOException, "appendToFile fail with exception", new Object[0]);
    }
  }

  public final void bbI()
  {
    bg.qQ().n(new h(this));
  }

  public final void bbJ()
  {
    z.i("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "updateIntervalArg ");
    bbN();
  }

  public final void setup()
  {
    com.tencent.mm.dbsupport.newcursor.k.a(new g(this));
    try
    {
      File localFile = new File(jXL);
      if (!localFile.exists())
        localFile.mkdirs();
      b(new File(jXL, "MMSQL.trace"), false);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKVq0DlNcr5ZYTK24nwGF99gD/GefRF2lg=", "init dir fail");
    }
  }

  public final void y(String paramString, long paramLong)
  {
    String str1 = paramString.trim().toUpperCase();
    String str2;
    if ((!str1.startsWith("INSERT")) && (!str1.startsWith("UPDATE")) && (!str1.startsWith("DELETE")) && (!str1.startsWith("COMMIT")) && (!str1.startsWith("SELECT")))
      str2 = null;
    while (str2 == null)
    {
      return;
      if (str1.startsWith("INSERT"))
        str1 = str1.substring(0, str1.indexOf("(", 0));
      while (true)
      {
        if (str1.length() > 512)
          str1 = str1.substring(0, 512) + "...";
        if (!str1.trim().endsWith(";"))
          str1 = str1 + ";";
        str2 = "tid:" + Thread.currentThread().getId() + " sql:" + str1;
        break;
        if (str1.startsWith("COMMIT"))
        {
          if (paramLong <= this.jXP)
            break label269;
          str1 = str1 + "task:" + ch.aHN();
        }
      }
      label269: str2 = null;
    }
    bg.qQ().n(new j(this, str2, paramLong));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.e.f
 * JD-Core Version:    0.6.2
 */