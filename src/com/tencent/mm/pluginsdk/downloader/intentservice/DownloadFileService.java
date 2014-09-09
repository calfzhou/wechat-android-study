package com.tencent.mm.pluginsdk.downloader.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.ResultReceiver;
import android.support.v4.app.aj;
import com.tencent.mm.h;
import java.io.File;

public class DownloadFileService extends IntentService
{
  private static final String TAG = DownloadFileService.class.getSimpleName();
  private int ehe;
  private ResultReceiver htM;
  private int htN;

  public DownloadFileService()
  {
    super("com.tencent.mm.pluginsdk.downloader.intentservice.DownloadFileService");
  }

  // ERROR //
  private void c(String paramString, File paramFile)
  {
    // Byte code:
    //   0: new 39	java/io/FileOutputStream
    //   3: dup
    //   4: aload_2
    //   5: invokespecial 42	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 4
    //   12: new 44	java/net/URL
    //   15: dup
    //   16: aload_1
    //   17: invokespecial 45	java/net/URL:<init>	(Ljava/lang/String;)V
    //   20: invokevirtual 49	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   23: checkcast 51	java/net/HttpURLConnection
    //   26: astore 14
    //   28: aload 14
    //   30: ldc 53
    //   32: invokevirtual 56	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   35: aload 14
    //   37: sipush 10000
    //   40: invokevirtual 60	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   43: aload 14
    //   45: sipush 3000
    //   48: invokevirtual 63	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   51: aload 14
    //   53: ldc 65
    //   55: invokevirtual 69	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   58: invokestatic 75	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   61: invokevirtual 79	java/lang/Integer:intValue	()I
    //   64: istore 15
    //   66: aload 14
    //   68: invokevirtual 83	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   71: astore 16
    //   73: aload 16
    //   75: astore 4
    //   77: aload 14
    //   79: invokevirtual 86	java/net/HttpURLConnection:getResponseCode	()I
    //   82: sipush 200
    //   85: if_icmpne +140 -> 225
    //   88: sipush 8192
    //   91: newarray byte
    //   93: astore 20
    //   95: aload 4
    //   97: aload 20
    //   99: invokevirtual 92	java/io/InputStream:read	([B)I
    //   102: istore 21
    //   104: iload 21
    //   106: iconst_m1
    //   107: if_icmpeq +122 -> 229
    //   110: aload_3
    //   111: aload 20
    //   113: iconst_0
    //   114: iload 21
    //   116: invokevirtual 96	java/io/FileOutputStream:write	([BII)V
    //   119: aload_0
    //   120: iload 21
    //   122: aload_0
    //   123: getfield 98	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:htN	I
    //   126: iadd
    //   127: putfield 98	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:htN	I
    //   130: new 100	android/os/Bundle
    //   133: dup
    //   134: invokespecial 102	android/os/Bundle:<init>	()V
    //   137: astore 22
    //   139: bipush 100
    //   141: aload_0
    //   142: getfield 98	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:htN	I
    //   145: imul
    //   146: iload 15
    //   148: idiv
    //   149: istore 23
    //   151: iload 23
    //   153: aload_0
    //   154: getfield 104	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:ehe	I
    //   157: if_icmple -62 -> 95
    //   160: aload 22
    //   162: ldc 106
    //   164: iload 23
    //   166: invokevirtual 110	android/os/Bundle:putInt	(Ljava/lang/String;I)V
    //   169: aload_0
    //   170: getfield 112	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:htM	Landroid/os/ResultReceiver;
    //   173: sipush 4657
    //   176: aload 22
    //   178: invokevirtual 118	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   181: aload_0
    //   182: iload 23
    //   184: putfield 104	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:ehe	I
    //   187: goto -92 -> 95
    //   190: astore 17
    //   192: aload 4
    //   194: astore 6
    //   196: aload_3
    //   197: invokevirtual 122	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   200: invokevirtual 127	java/io/FileDescriptor:sync	()V
    //   203: aload_3
    //   204: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   207: aload 6
    //   209: ifnull +8 -> 217
    //   212: aload 6
    //   214: invokevirtual 131	java/io/InputStream:close	()V
    //   217: return
    //   218: astore 24
    //   220: getstatic 21	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   223: pop
    //   224: return
    //   225: getstatic 21	com/tencent/mm/pluginsdk/downloader/intentservice/DownloadFileService:TAG	Ljava/lang/String;
    //   228: pop
    //   229: aload_3
    //   230: invokevirtual 122	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   233: invokevirtual 127	java/io/FileDescriptor:sync	()V
    //   236: aload_3
    //   237: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   240: aload 4
    //   242: ifnull -25 -> 217
    //   245: aload 4
    //   247: invokevirtual 131	java/io/InputStream:close	()V
    //   250: return
    //   251: astore 19
    //   253: return
    //   254: astore 12
    //   256: aload_3
    //   257: invokevirtual 122	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   260: invokevirtual 127	java/io/FileDescriptor:sync	()V
    //   263: aload_3
    //   264: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   267: aload 4
    //   269: ifnull -52 -> 217
    //   272: aload 4
    //   274: invokevirtual 131	java/io/InputStream:close	()V
    //   277: return
    //   278: astore 13
    //   280: return
    //   281: astore 10
    //   283: aload_3
    //   284: invokevirtual 122	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   287: invokevirtual 127	java/io/FileDescriptor:sync	()V
    //   290: aload_3
    //   291: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   294: aload 4
    //   296: ifnull -79 -> 217
    //   299: aload 4
    //   301: invokevirtual 131	java/io/InputStream:close	()V
    //   304: return
    //   305: astore 11
    //   307: return
    //   308: astore 8
    //   310: aload_3
    //   311: invokevirtual 122	java/io/FileOutputStream:getFD	()Ljava/io/FileDescriptor;
    //   314: invokevirtual 127	java/io/FileDescriptor:sync	()V
    //   317: aload_3
    //   318: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   321: aload 4
    //   323: ifnull +8 -> 331
    //   326: aload 4
    //   328: invokevirtual 131	java/io/InputStream:close	()V
    //   331: aload 8
    //   333: athrow
    //   334: astore 9
    //   336: goto -5 -> 331
    //   339: astore 7
    //   341: return
    //   342: astore 5
    //   344: aconst_null
    //   345: astore 6
    //   347: goto -151 -> 196
    //
    // Exception table:
    //   from	to	target	type
    //   77	95	190	java/net/ProtocolException
    //   95	104	190	java/net/ProtocolException
    //   110	187	190	java/net/ProtocolException
    //   225	229	190	java/net/ProtocolException
    //   0	9	218	java/io/FileNotFoundException
    //   229	240	251	java/io/IOException
    //   245	250	251	java/io/IOException
    //   12	73	254	java/net/MalformedURLException
    //   77	95	254	java/net/MalformedURLException
    //   95	104	254	java/net/MalformedURLException
    //   110	187	254	java/net/MalformedURLException
    //   225	229	254	java/net/MalformedURLException
    //   256	267	278	java/io/IOException
    //   272	277	278	java/io/IOException
    //   12	73	281	java/io/IOException
    //   77	95	281	java/io/IOException
    //   95	104	281	java/io/IOException
    //   110	187	281	java/io/IOException
    //   225	229	281	java/io/IOException
    //   283	294	305	java/io/IOException
    //   299	304	305	java/io/IOException
    //   12	73	308	finally
    //   77	95	308	finally
    //   95	104	308	finally
    //   110	187	308	finally
    //   225	229	308	finally
    //   310	321	334	java/io/IOException
    //   326	331	334	java/io/IOException
    //   196	207	339	java/io/IOException
    //   212	217	339	java/io/IOException
    //   12	73	342	java/net/ProtocolException
  }

  public void onCreate()
  {
    super.onCreate();
    aj localaj = new aj(this);
    localaj.a("Something Download").b("Download in progress").f(h.icon);
    startForeground(4657, localaj.build());
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    String str = paramIntent.getExtras().getString("url");
    this.htM = ((ResultReceiver)paramIntent.getParcelableExtra("receiver"));
    File localFile = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download");
    if (!localFile.exists())
      localFile.mkdirs();
    c(str, new File(localFile, "file11.apk"));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.intentservice.DownloadFileService
 * JD-Core Version:    0.6.2
 */