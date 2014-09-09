package com.tencent.smtt.sdk.a;

import a.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class b
{
  public static byte[] kfl = null;

  static
  {
    try
    {
      kfl = "65dRa93L".getBytes("utf-8");
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
  }

  private static StringBuffer a(a parama)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      localStringBuffer.append("sAppName=").append(URLEncoder.encode(parama.m, "utf-8")).append("|");
      localStringBuffer.append("sTime=").append(URLEncoder.encode(parama.n, "utf-8")).append("|");
      localStringBuffer.append("sQua=").append(URLEncoder.encode(parama.o, "utf-8")).append("|");
      localStringBuffer.append("sLc=").append(URLEncoder.encode(parama.p, "utf-8")).append("|");
      localStringBuffer.append("sGuid=").append(URLEncoder.encode(parama.q, "utf-8")).append("|");
      localStringBuffer.append("sImei=").append(URLEncoder.encode(parama.t, "utf-8")).append("|");
      localStringBuffer.append("sImsi=").append(URLEncoder.encode(parama.u, "utf-8")).append("|");
      localStringBuffer.append("sMac=").append(URLEncoder.encode(parama.v, "utf-8")).append("|");
      localStringBuffer.append("iPv=").append(URLEncoder.encode(String.valueOf(parama.A), "utf-8")).append("|");
      localStringBuffer.append("iCoreType=").append(URLEncoder.encode(String.valueOf(parama.B), "utf-8"));
      return localStringBuffer;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  // ERROR //
  public static void a(android.content.Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 39	a/a
    //   3: dup
    //   4: invokespecial 109	a/a:<init>	()V
    //   7: astore 6
    //   9: aload 6
    //   11: aload_0
    //   12: invokevirtual 115	android/content/Context:getPackageName	()Ljava/lang/String;
    //   15: putfield 43	a/a:m	Ljava/lang/String;
    //   18: new 117	java/text/SimpleDateFormat
    //   21: dup
    //   22: ldc 119
    //   24: invokespecial 122	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   27: astore 8
    //   29: aload 8
    //   31: ldc 124
    //   33: invokestatic 130	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   36: invokevirtual 134	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   39: aload 6
    //   41: aload 8
    //   43: invokestatic 140	java/util/Calendar:getInstance	()Ljava/util/Calendar;
    //   46: invokevirtual 144	java/util/Calendar:getTime	()Ljava/util/Date;
    //   49: invokevirtual 148	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   52: putfield 56	a/a:n	Ljava/lang/String;
    //   55: aload 6
    //   57: aload_1
    //   58: putfield 71	a/a:q	Ljava/lang/String;
    //   61: aload 6
    //   63: aload_2
    //   64: putfield 61	a/a:o	Ljava/lang/String;
    //   67: aload 6
    //   69: aload_3
    //   70: putfield 66	a/a:p	Ljava/lang/String;
    //   73: aload_0
    //   74: ldc 150
    //   76: invokevirtual 154	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   79: checkcast 156	android/telephony/TelephonyManager
    //   82: astore 9
    //   84: aload 9
    //   86: ifnull +61 -> 147
    //   89: aload 9
    //   91: invokevirtual 159	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   94: astore 12
    //   96: aload 12
    //   98: ifnull +20 -> 118
    //   101: ldc 161
    //   103: aload 12
    //   105: invokevirtual 165	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   108: ifne +10 -> 118
    //   111: aload 6
    //   113: aload 12
    //   115: putfield 76	a/a:t	Ljava/lang/String;
    //   118: aload 9
    //   120: invokevirtual 168	android/telephony/TelephonyManager:getSubscriberId	()Ljava/lang/String;
    //   123: astore 13
    //   125: aload 13
    //   127: ifnull +20 -> 147
    //   130: ldc 161
    //   132: aload 13
    //   134: invokevirtual 165	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   137: ifne +10 -> 147
    //   140: aload 6
    //   142: aload 13
    //   144: putfield 81	a/a:u	Ljava/lang/String;
    //   147: aload 6
    //   149: ldc 161
    //   151: putfield 86	a/a:v	Ljava/lang/String;
    //   154: aload 6
    //   156: iload 4
    //   158: i2l
    //   159: putfield 92	a/a:A	J
    //   162: iload 5
    //   164: ifeq +28 -> 192
    //   167: iconst_1
    //   168: istore 10
    //   170: aload 6
    //   172: iload 10
    //   174: putfield 102	a/a:B	I
    //   177: new 170	com/tencent/smtt/sdk/a/c
    //   180: dup
    //   181: ldc 172
    //   183: aload 6
    //   185: invokespecial 175	com/tencent/smtt/sdk/a/c:<init>	(Ljava/lang/String;La/a;)V
    //   188: invokevirtual 178	com/tencent/smtt/sdk/a/c:start	()V
    //   191: return
    //   192: iconst_0
    //   193: istore 10
    //   195: goto -25 -> 170
    //   198: astore 7
    //   200: return
    //   201: astore 11
    //   203: goto -56 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   0	84	198	java/lang/Throwable
    //   89	96	198	java/lang/Throwable
    //   101	118	198	java/lang/Throwable
    //   118	125	198	java/lang/Throwable
    //   130	147	198	java/lang/Throwable
    //   147	162	198	java/lang/Throwable
    //   170	191	198	java/lang/Throwable
    //   89	96	201	java/lang/Exception
    //   101	118	201	java/lang/Exception
    //   118	125	201	java/lang/Exception
    //   130	147	201	java/lang/Exception
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.b
 * JD-Core Version:    0.6.2
 */