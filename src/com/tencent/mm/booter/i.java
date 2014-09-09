package com.tencent.mm.booter;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.MediaPlayer;
import android.os.Looper;
import android.util.SparseArray;
import com.tencent.mm.a.f;
import com.tencent.mm.ai.b;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao;
import com.tencent.mm.network.be;
import com.tencent.mm.network.bm;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.a.acb;
import com.tencent.mm.protocal.a.eo;
import com.tencent.mm.protocal.a.rt;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.protocal.a.y;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class i
  implements an
{
  private static final String[] dii = { "#", "?", "#" };
  private Context context;
  private volatile int currentIndex = -1;
  private MediaPlayer daf;
  private String dhL;
  private String dhM = "";
  private String dhN = "";
  private String dhO = "";
  private volatile int dhP = 0;
  private RandomAccessFile dhQ;
  private long dhR = 0L;
  private be dhS;
  private InputStream dhT;
  private FileInputStream dhU;
  private volatile boolean dhV;
  private volatile boolean dhW = false;
  private com.tencent.mm.model.r dhX;
  private ay dhY = new ay(Looper.getMainLooper(), new j(this), true);
  private List dhZ = new ArrayList();
  private long dia = 0L;
  private boolean dib = false;
  private bi dic = new bi();
  private boolean did = false;
  private boolean die = false;
  private SparseArray dif = new SparseArray();
  private t dig;
  private ay dij;
  private int dik = -1;
  private final Object lock = new Object();

  public i()
  {
    this.dic.ca(ak.getContext());
    this.dic.a(new n(this));
    this.dhX = com.tencent.mm.model.r.pD();
    this.dig = new t(this, (byte)0);
  }

  private static tb a(tb paramtb, String paramString1, String paramString2)
  {
    tb localtb = new tb();
    try
    {
      localtb.cd(paramtb.toByteArray());
      localtb.inl = paramString1;
      localtb.hOd = paramString2;
      return localtb;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private static String a(String paramString1, String paramString2, boolean paramBoolean, PBool paramPBool)
  {
    if ((paramBoolean) || (ap.jb(paramString2)));
    for (String str = paramString1; ap.jb(str); str = paramString2)
      return str;
    PString localPString = new PString();
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Boolean.valueOf(paramBoolean);
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "url[%s], lowBandUrl[%s], isWifi[%B]", arrayOfObject);
    if (str.startsWith("http://y.qq.com/i/song.html#p="))
      if (a(str.substring(30), paramBoolean, localPString))
        paramPBool.value = paramBoolean;
    while (true)
    {
      return localPString.value;
      if (str.contains("wechat_music_url="))
        a(str.substring(17 + str.indexOf("wechat_music_url=")), paramBoolean, localPString);
      else
        localPString.value = str;
    }
  }

  private void a(tb paramtb)
  {
    Object[] arrayOfObject = new Object[1];
    if (paramtb == null);
    for (String str = "null"; ; str = paramtb.toString())
    {
      arrayOfObject[0] = str;
      z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "init current music data: musicwrapper %s", arrayOfObject);
      this.dif.put(0, paramtb);
      this.currentIndex = 0;
      return;
    }
  }

  private void a(FileDescriptor paramFileDescriptor)
  {
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "start play");
    am.h(new r(this, paramFileDescriptor));
  }

  private static boolean a(String paramString, boolean paramBoolean, PString paramPString)
  {
    String str1 = new String(bZ(paramString));
    int i = str1.indexOf("{");
    if (i != -1)
      str1 = str1.substring(i);
    try
    {
      JSONObject localJSONObject = new JSONObject(str1);
      String str2 = localJSONObject.getString("song_WapLiveURL");
      String str3 = localJSONObject.getString("song_WifiURL");
      z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "waplive: " + str2 + "  wifi:" + str3);
      if (paramBoolean);
      while (true)
      {
        paramPString.value = str3;
        return true;
        str3 = str2;
      }
    }
    catch (Exception localException)
    {
      paramPString.value = paramString;
    }
    return false;
  }

  // ERROR //
  private void b(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 201
    //   4: ldc_w 318
    //   7: invokestatic 262	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   10: aload_0
    //   11: lconst_0
    //   12: putfield 78	com/tencent/mm/booter/i:dhR	J
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 320	com/tencent/mm/booter/i:dhV	Z
    //   20: new 322	java/io/File
    //   23: dup
    //   24: aload_2
    //   25: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: astore 12
    //   30: new 322	java/io/File
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: astore 13
    //   40: aload 12
    //   42: invokevirtual 327	java/io/File:exists	()Z
    //   45: ifne +23 -> 68
    //   48: aload 12
    //   50: invokevirtual 330	java/io/File:createNewFile	()Z
    //   53: pop
    //   54: aload 13
    //   56: invokevirtual 327	java/io/File:exists	()Z
    //   59: ifeq +9 -> 68
    //   62: aload 13
    //   64: invokevirtual 333	java/io/File:delete	()Z
    //   67: pop
    //   68: iconst_4
    //   69: anewarray 4	java/lang/Object
    //   72: astore 14
    //   74: aload 14
    //   76: iconst_0
    //   77: aload 12
    //   79: invokevirtual 336	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   82: aastore
    //   83: aload 14
    //   85: iconst_1
    //   86: aload 12
    //   88: invokevirtual 340	java/io/File:length	()J
    //   91: invokestatic 345	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   94: aastore
    //   95: aload 14
    //   97: iconst_2
    //   98: aload 13
    //   100: invokevirtual 327	java/io/File:exists	()Z
    //   103: invokestatic 199	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   106: aastore
    //   107: aload 14
    //   109: iconst_3
    //   110: aload 13
    //   112: invokevirtual 340	java/io/File:length	()J
    //   115: invokestatic 345	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   118: aastore
    //   119: ldc 201
    //   121: ldc_w 347
    //   124: aload 14
    //   126: invokestatic 209	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload 12
    //   131: invokevirtual 340	java/io/File:length	()J
    //   134: lconst_0
    //   135: lcmp
    //   136: ifle +102 -> 238
    //   139: aload 13
    //   141: invokevirtual 327	java/io/File:exists	()Z
    //   144: ifeq +94 -> 238
    //   147: aload 13
    //   149: invokevirtual 340	java/io/File:length	()J
    //   152: lstore 43
    //   154: lload 43
    //   156: lconst_0
    //   157: lcmp
    //   158: ifle +80 -> 238
    //   161: aload 13
    //   163: invokevirtual 340	java/io/File:length	()J
    //   166: l2i
    //   167: newarray byte
    //   169: astore 46
    //   171: new 349	java/io/FileInputStream
    //   174: dup
    //   175: aload 13
    //   177: invokespecial 352	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   180: astore 47
    //   182: aload 47
    //   184: aload 46
    //   186: invokevirtual 356	java/io/FileInputStream:read	([B)I
    //   189: pop
    //   190: aload 47
    //   192: invokevirtual 359	java/io/FileInputStream:close	()V
    //   195: aload_0
    //   196: new 57	java/lang/String
    //   199: dup
    //   200: aload 46
    //   202: invokespecial 285	java/lang/String:<init>	([B)V
    //   205: invokestatic 363	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   208: putfield 78	com/tencent/mm/booter/i:dhR	J
    //   211: iconst_1
    //   212: anewarray 4	java/lang/Object
    //   215: astore 49
    //   217: aload 49
    //   219: iconst_0
    //   220: aload_0
    //   221: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   224: invokestatic 345	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   227: aastore
    //   228: ldc 201
    //   230: ldc_w 365
    //   233: aload 49
    //   235: invokestatic 209	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_0
    //   239: aload 4
    //   241: invokestatic 371	com/tencent/mm/network/k:jr	(Ljava/lang/String;)Lcom/tencent/mm/network/be;
    //   244: putfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   247: aload_0
    //   248: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   251: ldc_w 375
    //   254: invokevirtual 380	com/tencent/mm/network/be:setRequestMethod	(Ljava/lang/String;)V
    //   257: aload_0
    //   258: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   261: sipush 25000
    //   264: invokevirtual 384	com/tencent/mm/network/be:setConnectTimeout	(I)V
    //   267: aload_0
    //   268: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   271: ldc_w 386
    //   274: ldc_w 388
    //   277: invokevirtual 391	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   280: aload_0
    //   281: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   284: lconst_0
    //   285: lcmp
    //   286: ifle +64 -> 350
    //   289: aload_0
    //   290: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   293: ldc_w 393
    //   296: new 302	java/lang/StringBuilder
    //   299: dup
    //   300: ldc_w 395
    //   303: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: aload_0
    //   307: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   310: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   313: ldc_w 400
    //   316: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   322: invokevirtual 391	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: ldc 201
    //   327: new 302	java/lang/StringBuilder
    //   330: dup
    //   331: ldc_w 402
    //   334: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   337: aload_0
    //   338: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   341: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   344: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: invokestatic 315	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   350: iload 5
    //   352: ifne +17 -> 369
    //   355: aload 4
    //   357: invokestatic 190	com/tencent/mm/platformtools/ap:jb	(Ljava/lang/String;)Z
    //   360: ifeq +301 -> 661
    //   363: iconst_0
    //   364: istore 18
    //   366: goto +1014 -> 1380
    //   369: aload_0
    //   370: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   373: ldc_w 404
    //   376: ldc_w 406
    //   379: invokevirtual 391	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   382: aload_0
    //   383: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   386: ldc_w 408
    //   389: ldc_w 410
    //   392: invokevirtual 391	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   395: aload_0
    //   396: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   399: ldc_w 412
    //   402: new 302	java/lang/StringBuilder
    //   405: dup
    //   406: invokespecial 413	java/lang/StringBuilder:<init>	()V
    //   409: ldc_w 415
    //   412: invokestatic 420	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   415: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: ldc_w 422
    //   421: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: aload_0
    //   425: getfield 424	com/tencent/mm/booter/i:context	Landroid/content/Context;
    //   428: invokestatic 428	com/tencent/mm/booter/i:p	(Landroid/content/Context;)Ljava/lang/String;
    //   431: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   437: invokevirtual 391	com/tencent/mm/network/be:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   440: aload_0
    //   441: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   444: invokevirtual 432	com/tencent/mm/network/be:getResponseCode	()I
    //   447: sipush 200
    //   450: if_icmpeq +261 -> 711
    //   453: aload_0
    //   454: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   457: invokevirtual 432	com/tencent/mm/network/be:getResponseCode	()I
    //   460: sipush 206
    //   463: if_icmpeq +248 -> 711
    //   466: ldc 201
    //   468: new 302	java/lang/StringBuilder
    //   471: dup
    //   472: ldc_w 434
    //   475: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   478: aload_0
    //   479: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   482: invokevirtual 432	com/tencent/mm/network/be:getResponseCode	()I
    //   485: invokevirtual 437	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   488: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   491: invokestatic 440	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   494: new 442	com/tencent/mm/booter/q
    //   497: dup
    //   498: aload_0
    //   499: invokespecial 443	com/tencent/mm/booter/q:<init>	(Lcom/tencent/mm/booter/i;)V
    //   502: invokestatic 273	com/tencent/mm/sdk/platformtools/am:h	(Ljava/lang/Runnable;)V
    //   505: aload_0
    //   506: monitorexit
    //   507: return
    //   508: astore 45
    //   510: ldc 201
    //   512: new 302	java/lang/StringBuilder
    //   515: dup
    //   516: ldc_w 445
    //   519: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   522: aload 45
    //   524: invokevirtual 446	java/lang/Exception:toString	()Ljava/lang/String;
    //   527: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   533: invokestatic 440	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   536: goto -298 -> 238
    //   539: astore 7
    //   541: aload_0
    //   542: getfield 107	com/tencent/mm/booter/i:dia	J
    //   545: invokestatic 450	com/tencent/mm/platformtools/ap:ad	(J)J
    //   548: lstore 8
    //   550: ldc 201
    //   552: new 302	java/lang/StringBuilder
    //   555: dup
    //   556: ldc_w 452
    //   559: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   562: lload 8
    //   564: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   567: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   570: invokestatic 440	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   573: lload 8
    //   575: ldc2_w 453
    //   578: lcmp
    //   579: ifle +793 -> 1372
    //   582: aload_0
    //   583: getfield 105	com/tencent/mm/booter/i:dhZ	Ljava/util/List;
    //   586: invokeinterface 460 1 0
    //   591: astore 10
    //   593: aload 10
    //   595: invokeinterface 465 1 0
    //   600: ifeq -95 -> 505
    //   603: aload 10
    //   605: invokeinterface 469 1 0
    //   610: pop
    //   611: goto -18 -> 593
    //   614: astore 6
    //   616: aload_0
    //   617: monitorexit
    //   618: aload 6
    //   620: athrow
    //   621: astore 15
    //   623: aload_0
    //   624: invokevirtual 472	com/tencent/mm/booter/i:release	()V
    //   627: aload_0
    //   628: getfield 82	com/tencent/mm/booter/i:lock	Ljava/lang/Object;
    //   631: astore 16
    //   633: aload 16
    //   635: monitorenter
    //   636: new 474	com/tencent/mm/booter/p
    //   639: dup
    //   640: aload_0
    //   641: invokespecial 475	com/tencent/mm/booter/p:<init>	(Lcom/tencent/mm/booter/i;)V
    //   644: invokestatic 273	com/tencent/mm/sdk/platformtools/am:h	(Ljava/lang/Runnable;)V
    //   647: aload 16
    //   649: monitorexit
    //   650: goto -145 -> 505
    //   653: astore 17
    //   655: aload 16
    //   657: monitorexit
    //   658: aload 17
    //   660: athrow
    //   661: aload 4
    //   663: invokestatic 481	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   666: invokevirtual 484	android/net/Uri:getHost	()Ljava/lang/String;
    //   669: ldc_w 486
    //   672: invokevirtual 234	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   675: istore 18
    //   677: iconst_2
    //   678: anewarray 4	java/lang/Object
    //   681: astore 42
    //   683: aload 42
    //   685: iconst_0
    //   686: aload 4
    //   688: aastore
    //   689: aload 42
    //   691: iconst_1
    //   692: iload 18
    //   694: invokestatic 199	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   697: aastore
    //   698: ldc 201
    //   700: ldc_w 488
    //   703: aload 42
    //   705: invokestatic 491	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   708: goto +672 -> 1380
    //   711: ldc 201
    //   713: new 302	java/lang/StringBuilder
    //   716: dup
    //   717: ldc_w 493
    //   720: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   723: aload_0
    //   724: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   727: ldc_w 412
    //   730: invokevirtual 496	com/tencent/mm/network/be:getRequestProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   733: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   736: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   739: invokestatic 315	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   742: ldc 201
    //   744: new 302	java/lang/StringBuilder
    //   747: dup
    //   748: ldc_w 498
    //   751: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   754: aload_0
    //   755: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   758: ldc_w 500
    //   761: invokevirtual 503	com/tencent/mm/network/be:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   764: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   770: invokestatic 315	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   773: aload_0
    //   774: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   777: lconst_0
    //   778: lcmp
    //   779: ifle +59 -> 838
    //   782: aload_0
    //   783: invokespecial 506	com/tencent/mm/booter/i:lh	()Z
    //   786: ifne +52 -> 838
    //   789: ldc 201
    //   791: ldc_w 508
    //   794: invokestatic 510	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   797: aload 12
    //   799: invokevirtual 333	java/io/File:delete	()Z
    //   802: pop
    //   803: aload 12
    //   805: invokevirtual 330	java/io/File:createNewFile	()Z
    //   808: pop
    //   809: aload_0
    //   810: lconst_0
    //   811: putfield 78	com/tencent/mm/booter/i:dhR	J
    //   814: new 322	java/io/File
    //   817: dup
    //   818: aload_3
    //   819: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   822: astore 40
    //   824: aload 40
    //   826: invokevirtual 327	java/io/File:exists	()Z
    //   829: ifeq +9 -> 838
    //   832: aload 40
    //   834: invokevirtual 333	java/io/File:delete	()Z
    //   837: pop
    //   838: aload_0
    //   839: new 512	java/io/RandomAccessFile
    //   842: dup
    //   843: aload_2
    //   844: ldc_w 514
    //   847: invokespecial 516	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   850: putfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   853: aload_0
    //   854: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   857: lstore 19
    //   859: lload 19
    //   861: ldc2_w 519
    //   864: ladd
    //   865: lstore 21
    //   867: aload_0
    //   868: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   871: ldc_w 522
    //   874: invokevirtual 503	com/tencent/mm/network/be:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   877: invokestatic 363	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   880: lstore 34
    //   882: lload 34
    //   884: lconst_0
    //   885: lcmp
    //   886: ifeq +16 -> 902
    //   889: aload_0
    //   890: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   893: lstore 36
    //   895: lload 36
    //   897: lload 34
    //   899: ladd
    //   900: lstore 21
    //   902: lload 21
    //   904: lstore 24
    //   906: aload_0
    //   907: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   910: lload 24
    //   912: invokevirtual 526	java/io/RandomAccessFile:setLength	(J)V
    //   915: aload_0
    //   916: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   919: aload_0
    //   920: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   923: invokevirtual 529	java/io/RandomAccessFile:seek	(J)V
    //   926: aload_0
    //   927: aload_0
    //   928: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   931: invokevirtual 533	com/tencent/mm/network/be:getInputStream	()Ljava/io/InputStream;
    //   934: putfield 535	com/tencent/mm/booter/i:dhT	Ljava/io/InputStream;
    //   937: sipush 4096
    //   940: newarray byte
    //   942: astore 26
    //   944: iconst_0
    //   945: istore 27
    //   947: lconst_0
    //   948: lstore 28
    //   950: aload_0
    //   951: iconst_1
    //   952: putfield 118	com/tencent/mm/booter/i:die	Z
    //   955: aload_0
    //   956: getfield 535	com/tencent/mm/booter/i:dhT	Ljava/io/InputStream;
    //   959: aload 26
    //   961: iload 27
    //   963: sipush 4096
    //   966: iload 27
    //   968: isub
    //   969: invokevirtual 540	java/io/InputStream:read	([BII)I
    //   972: istore 30
    //   974: iload 30
    //   976: iconst_m1
    //   977: if_icmpeq +224 -> 1201
    //   980: iload 27
    //   982: iload 30
    //   984: iadd
    //   985: sipush 4096
    //   988: if_icmpge +48 -> 1036
    //   991: iload 27
    //   993: iload 30
    //   995: iadd
    //   996: istore 27
    //   998: goto -43 -> 955
    //   1001: astore 23
    //   1003: ldc 201
    //   1005: new 302	java/lang/StringBuilder
    //   1008: dup
    //   1009: ldc_w 542
    //   1012: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1015: aload 23
    //   1017: invokevirtual 446	java/lang/Exception:toString	()Ljava/lang/String;
    //   1020: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1023: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1026: invokestatic 440	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1029: lload 21
    //   1031: lstore 24
    //   1033: goto -127 -> 906
    //   1036: aload_0
    //   1037: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1040: aload 26
    //   1042: iconst_0
    //   1043: sipush 4096
    //   1046: invokevirtual 546	java/io/RandomAccessFile:write	([BII)V
    //   1049: aload_0
    //   1050: ldc2_w 547
    //   1053: aload_0
    //   1054: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1057: ladd
    //   1058: putfield 78	com/tencent/mm/booter/i:dhR	J
    //   1061: new 322	java/io/File
    //   1064: dup
    //   1065: aload_2
    //   1066: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   1069: pop
    //   1070: aload_0
    //   1071: aload_3
    //   1072: invokespecial 551	com/tencent/mm/booter/i:bV	(Ljava/lang/String;)V
    //   1075: aload_0
    //   1076: getfield 118	com/tencent/mm/booter/i:die	Z
    //   1079: ifeq +66 -> 1145
    //   1082: aload_0
    //   1083: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1086: ldc2_w 552
    //   1089: lload 28
    //   1091: ladd
    //   1092: lcmp
    //   1093: ifle +52 -> 1145
    //   1096: ldc 201
    //   1098: ldc_w 555
    //   1101: invokestatic 262	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1104: aload_0
    //   1105: iconst_0
    //   1106: putfield 118	com/tencent/mm/booter/i:die	Z
    //   1109: aload_0
    //   1110: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1113: lstore 28
    //   1115: aload_0
    //   1116: new 349	java/io/FileInputStream
    //   1119: dup
    //   1120: new 322	java/io/File
    //   1123: dup
    //   1124: aload_2
    //   1125: invokespecial 323	java/io/File:<init>	(Ljava/lang/String;)V
    //   1128: invokespecial 352	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   1131: putfield 557	com/tencent/mm/booter/i:dhU	Ljava/io/FileInputStream;
    //   1134: aload_0
    //   1135: aload_0
    //   1136: getfield 557	com/tencent/mm/booter/i:dhU	Ljava/io/FileInputStream;
    //   1139: invokevirtual 561	java/io/FileInputStream:getFD	()Ljava/io/FileDescriptor;
    //   1142: invokespecial 563	com/tencent/mm/booter/i:a	(Ljava/io/FileDescriptor;)V
    //   1145: aload_0
    //   1146: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1149: lload 24
    //   1151: lcmp
    //   1152: ifle +14 -> 1166
    //   1155: aload_0
    //   1156: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1159: aload_0
    //   1160: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1163: invokevirtual 526	java/io/RandomAccessFile:setLength	(J)V
    //   1166: aload_0
    //   1167: getfield 320	com/tencent/mm/booter/i:dhV	Z
    //   1170: istore 33
    //   1172: iconst_0
    //   1173: istore 27
    //   1175: iload 33
    //   1177: ifeq -222 -> 955
    //   1180: aload_0
    //   1181: getfield 535	com/tencent/mm/booter/i:dhT	Ljava/io/InputStream;
    //   1184: aload 26
    //   1186: invokevirtual 564	java/io/InputStream:read	([B)I
    //   1189: iconst_m1
    //   1190: if_icmpne +174 -> 1364
    //   1193: ldc 201
    //   1195: ldc_w 566
    //   1198: invokestatic 510	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1201: aload_0
    //   1202: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1205: aload 26
    //   1207: iconst_0
    //   1208: iload 27
    //   1210: invokevirtual 546	java/io/RandomAccessFile:write	([BII)V
    //   1213: aload_0
    //   1214: aload_0
    //   1215: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1218: iload 27
    //   1220: i2l
    //   1221: ladd
    //   1222: putfield 78	com/tencent/mm/booter/i:dhR	J
    //   1225: ldc 201
    //   1227: new 302	java/lang/StringBuilder
    //   1230: dup
    //   1231: ldc_w 568
    //   1234: invokespecial 305	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1237: aload_1
    //   1238: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1241: ldc_w 570
    //   1244: invokevirtual 309	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1247: aload_0
    //   1248: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1251: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1254: invokevirtual 312	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1257: invokestatic 315	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1260: aload_0
    //   1261: getfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   1264: invokevirtual 573	com/tencent/mm/network/be:disconnect	()V
    //   1267: aload_0
    //   1268: getfield 535	com/tencent/mm/booter/i:dhT	Ljava/io/InputStream;
    //   1271: invokevirtual 574	java/io/InputStream:close	()V
    //   1274: aload_0
    //   1275: aconst_null
    //   1276: putfield 373	com/tencent/mm/booter/i:dhS	Lcom/tencent/mm/network/be;
    //   1279: aload_0
    //   1280: aconst_null
    //   1281: putfield 535	com/tencent/mm/booter/i:dhT	Ljava/io/InputStream;
    //   1284: aload_0
    //   1285: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1288: lconst_0
    //   1289: lcmp
    //   1290: ifle +24 -> 1314
    //   1293: aload_0
    //   1294: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1297: lload 24
    //   1299: lcmp
    //   1300: ifeq +14 -> 1314
    //   1303: aload_0
    //   1304: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1307: aload_0
    //   1308: getfield 78	com/tencent/mm/booter/i:dhR	J
    //   1311: invokevirtual 526	java/io/RandomAccessFile:setLength	(J)V
    //   1314: aload_0
    //   1315: getfield 118	com/tencent/mm/booter/i:die	Z
    //   1318: ifeq +19 -> 1337
    //   1321: aload_0
    //   1322: iconst_0
    //   1323: putfield 118	com/tencent/mm/booter/i:die	Z
    //   1326: aload_0
    //   1327: aload_0
    //   1328: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1331: invokevirtual 575	java/io/RandomAccessFile:getFD	()Ljava/io/FileDescriptor;
    //   1334: invokespecial 563	com/tencent/mm/booter/i:a	(Ljava/io/FileDescriptor;)V
    //   1337: aload_0
    //   1338: getfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1341: invokevirtual 576	java/io/RandomAccessFile:close	()V
    //   1344: aload_0
    //   1345: aconst_null
    //   1346: putfield 518	com/tencent/mm/booter/i:dhQ	Ljava/io/RandomAccessFile;
    //   1349: ldc 68
    //   1351: aload_2
    //   1352: aload_1
    //   1353: invokestatic 581	com/tencent/mm/a/c:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1356: aload_3
    //   1357: invokestatic 584	com/tencent/mm/a/c:deleteFile	(Ljava/lang/String;)Z
    //   1360: pop
    //   1361: goto -856 -> 505
    //   1364: aload_0
    //   1365: aload_2
    //   1366: invokespecial 587	com/tencent/mm/booter/i:bW	(Ljava/lang/String;)V
    //   1369: goto -864 -> 505
    //   1372: aload_0
    //   1373: lconst_0
    //   1374: putfield 107	com/tencent/mm/booter/i:dia	J
    //   1377: goto -872 -> 505
    //   1380: iload 18
    //   1382: ifeq -987 -> 395
    //   1385: goto -1016 -> 369
    //
    // Exception table:
    //   from	to	target	type
    //   161	238	508	java/lang/Exception
    //   2	68	539	java/lang/Exception
    //   68	154	539	java/lang/Exception
    //   247	350	539	java/lang/Exception
    //   355	363	539	java/lang/Exception
    //   369	395	539	java/lang/Exception
    //   395	505	539	java/lang/Exception
    //   510	536	539	java/lang/Exception
    //   623	636	539	java/lang/Exception
    //   655	661	539	java/lang/Exception
    //   661	708	539	java/lang/Exception
    //   711	838	539	java/lang/Exception
    //   838	859	539	java/lang/Exception
    //   906	944	539	java/lang/Exception
    //   950	955	539	java/lang/Exception
    //   955	974	539	java/lang/Exception
    //   1003	1029	539	java/lang/Exception
    //   1036	1145	539	java/lang/Exception
    //   1145	1166	539	java/lang/Exception
    //   1166	1172	539	java/lang/Exception
    //   1180	1201	539	java/lang/Exception
    //   1201	1314	539	java/lang/Exception
    //   1314	1337	539	java/lang/Exception
    //   1337	1361	539	java/lang/Exception
    //   1364	1369	539	java/lang/Exception
    //   2	68	614	finally
    //   68	154	614	finally
    //   161	238	614	finally
    //   238	247	614	finally
    //   247	350	614	finally
    //   355	363	614	finally
    //   369	395	614	finally
    //   395	505	614	finally
    //   510	536	614	finally
    //   541	573	614	finally
    //   582	593	614	finally
    //   593	611	614	finally
    //   623	636	614	finally
    //   655	661	614	finally
    //   661	708	614	finally
    //   711	838	614	finally
    //   838	859	614	finally
    //   867	882	614	finally
    //   889	895	614	finally
    //   906	944	614	finally
    //   950	955	614	finally
    //   955	974	614	finally
    //   1003	1029	614	finally
    //   1036	1145	614	finally
    //   1145	1166	614	finally
    //   1166	1172	614	finally
    //   1180	1201	614	finally
    //   1201	1314	614	finally
    //   1314	1337	614	finally
    //   1337	1361	614	finally
    //   1364	1369	614	finally
    //   1372	1377	614	finally
    //   238	247	621	java/lang/Exception
    //   636	650	653	finally
    //   867	882	1001	java/lang/Exception
    //   889	895	1001	java/lang/Exception
  }

  private boolean b(FileDescriptor paramFileDescriptor)
  {
    z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "start play img");
    try
    {
      this.daf = new MediaPlayer();
      this.daf.setAudioStreamType(3);
      this.daf.setOnCompletionListener(new s(this));
      if (this.daf != null)
      {
        this.daf.setDataSource(paramFileDescriptor);
        this.daf.prepare();
        this.daf.seekTo(this.dhP);
      }
      if (this.daf != null)
        kZ();
      this.dib = true;
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  private boolean bU(String paramString)
  {
    if (ap.jb(paramString))
      z.e("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "try to play url, but url is null");
    while (true)
    {
      return false;
      File localFile = new File(this.dhL + f.d(paramString.getBytes()));
      if (localFile.exists())
      {
        z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "try play url exist! %s", new Object[] { paramString });
        try
        {
          this.dhU = new FileInputStream(localFile);
          boolean bool = b(this.dhU.getFD());
          if (bool)
            return true;
        }
        catch (Exception localException)
        {
        }
      }
    }
    return false;
  }

  private void bV(String paramString)
  {
    try
    {
      long l = this.dhR;
      if (l == 0L);
      while (true)
      {
        return;
        FileOutputStream localFileOutputStream = new FileOutputStream(paramString);
        localFileOutputStream.write(this.dhR.getBytes());
        localFileOutputStream.flush();
        localFileOutputStream.close();
      }
    }
    finally
    {
    }
  }

  private void bW(String paramString)
  {
    try
    {
      z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "stopDownLoad");
      try
      {
        if (this.dhS != null)
        {
          this.dhS.disconnect();
          this.dhT.close();
        }
        if (this.dhQ != null)
        {
          this.dhQ.setLength(this.dhR);
          this.dhQ.close();
          File localFile = new File(paramString);
          z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "stopDownLoad temFileLen:" + localFile.length() + " downloadFileLen:" + this.dhR);
          this.dhQ = null;
        }
        this.dhR = 0L;
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localException.getLocalizedMessage();
          z.w("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "stop download error[%s]", arrayOfObject);
        }
      }
    }
    finally
    {
    }
  }

  private static byte[] bZ(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length() / 2 + paramString.length() % 2];
    int i = 0;
    int j = 0;
    while (true)
    {
      int k;
      try
      {
        if (i < paramString.length())
        {
          k = i + 1;
          int m = h(paramString.charAt(i));
          if (k >= paramString.length())
            break label96;
          i = k + 1;
          n = h(paramString.charAt(k));
          int i1 = j + 1;
          arrayOfByte[j] = ((byte)(n | m << 4));
          j = i1;
          continue;
        }
      }
      catch (Exception localException)
      {
        arrayOfByte = null;
      }
      return arrayOfByte;
      label96: i = k;
      int n = 0;
    }
  }

  private void d(String paramString1, String paramString2, String paramString3)
  {
    this.dhL = (paramString1 + "music/");
    lt();
    release();
    if (this.context == null)
      this.context = ak.getContext();
    n(paramString2, paramString3);
  }

  private String getUrl()
  {
    if (la() == null);
    do
    {
      return null;
      if (!ap.jb(la().ing))
        return la().ing;
      if (!ap.jb(la().ini))
        return la().ini;
    }
    while (ap.jb(la().inh));
    return la().inh;
  }

  private static int h(char paramChar)
  {
    int i;
    if ((paramChar >= '1') && (paramChar <= '9'))
      i = paramChar - '0';
    do
    {
      do
      {
        return i;
        i = 0;
      }
      while (paramChar < 'A');
      i = 0;
    }
    while (paramChar > 'F');
    return 10 + (paramChar - 'A');
  }

  private void kZ()
  {
    if (this.daf != null)
      this.daf.start();
    synchronized (this.lock)
    {
      am.h(new m(this));
      this.dhX.a(this.dig);
      return;
    }
  }

  private void lc()
  {
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "clearCurrentMusicData");
    if (this.currentIndex >= 0)
    {
      this.dif.remove(this.currentIndex);
      this.dif.clear();
      this.currentIndex = (-1 + this.dif.size());
    }
  }

  private boolean lh()
  {
    String str = this.dhS.getHeaderField("Content-Range");
    if (ap.jb(str))
      z.w("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "dealWithContinueDownload, rangeInfo is null");
    while (true)
    {
      return false;
      String[] arrayOfString = str.split("-");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
      {
        z.w("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "dealWithContinueDownload, rangeArray empty");
        return false;
      }
      try
      {
        int i = arrayOfString[0].indexOf("bytes");
        int j = Integer.parseInt(arrayOfString[0].substring(1 + (i + 5)));
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(j);
        arrayOfObject2[1] = Long.valueOf(this.dhR);
        z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "try continueDownLoad from %d, downloadFileLen %d", arrayOfObject2);
        long l1 = j;
        long l2 = this.dhR;
        if (l1 == l2)
          return true;
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = localException.getLocalizedMessage();
        z.w("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "dealWithContinueDownload, error[%s]", arrayOfObject1);
      }
    }
    return false;
  }

  private void li()
  {
    try
    {
      z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "stopPlay");
      this.dhP = 0;
      while (true)
      {
        try
        {
          if (this.daf == null)
            break label134;
          this.daf.stop();
          this.daf.release();
          this.daf = null;
          synchronized (this.lock)
          {
            Iterator localIterator = this.dhZ.iterator();
            if (localIterator.hasNext())
            {
              ao localao = (ao)localIterator.next();
              if (localao == null)
                continue;
              Object[] arrayOfObject = new Object[1];
              arrayOfObject[0] = localao.toString();
              z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "on stop call back: %s", arrayOfObject);
              localao.onStop();
            }
          }
        }
        catch (Exception localException)
        {
          return;
        }
        label134: if (this.dhU != null)
          this.dhU.close();
      }
    }
    finally
    {
    }
  }

  private String ls()
  {
    String str5;
    if (getUrl() == null)
    {
      tb localtb = la();
      str5 = null;
      if (localtb != null);
    }
    while (true)
    {
      return str5;
      String str1 = "";
      String[] arrayOfString1 = dii;
      int i = arrayOfString1.length;
      int j = 0;
      String str2 = null;
      if (j < i)
      {
        String str6 = arrayOfString1[j];
        str1 = str6 + "p=";
        if ((la().ing != null) && (la().ing.contains(str1)))
          str2 = la().ing;
        while (true)
        {
          if (str2 != null)
            break label190;
          j++;
          break;
          if ((la().ini != null) && (la().ini.contains(str1)))
            str2 = la().ini;
          else if ((la().inh != null) && (la().inh.contains(str1)))
            str2 = la().inh;
        }
      }
      label190: String str3 = str2;
      String str4 = str1;
      str5 = null;
      if (str3 != null)
      {
        if (str3 == null);
        for (int k = -1; k < 0; k = str3.indexOf(str4))
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(k);
          z.w("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "pIndex is %d, return", arrayOfObject);
          return null;
        }
        str5 = str3.substring(k + str4.length());
        String[] arrayOfString2 = dii;
        int m = arrayOfString2.length;
        for (int n = 0; n < m; n++)
        {
          int i1 = str5.indexOf(arrayOfString2[n]);
          if (i1 > 0)
            str5 = str5.substring(0, i1);
        }
      }
    }
  }

  private void lt()
  {
    File localFile1 = new File(this.dhL);
    if (!localFile1.exists())
      localFile1.mkdirs();
    File localFile2 = new File(localFile1, ".nomedia");
    if (!localFile2.exists());
    try
    {
      localFile2.createNewFile();
      label48: this.dhP = 0;
      return;
    }
    catch (Exception localException)
    {
      break label48;
    }
  }

  private void n(String paramString1, String paramString2)
  {
    synchronized (this.lock)
    {
      Iterator localIterator = this.dhZ.iterator();
      while (localIterator.hasNext())
      {
        ao localao = (ao)localIterator.next();
        if (localao != null)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = localao.toString();
          z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "on start call back: %s", arrayOfObject2);
          localao.onStart();
        }
      }
    }
    this.dhY.cP(50L);
    Context localContext = this.context;
    this.context = localContext;
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "play : " + paramString1);
    boolean bool1 = bm.ab(localContext);
    PBool localPBool = new PBool();
    String str1 = a(paramString1, paramString2, bool1, localPBool);
    if (!ap.jb(str1))
      if (!bool1)
        break label350;
    label350: for (String str2 = str1; ; str2 = a(paramString1, paramString2, true, new PBool()))
    {
      if ((!bU(str2)) && ((bool1) || (!bU(str1))))
      {
        boolean bool2 = localPBool.value;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = str1;
        arrayOfObject1[1] = Boolean.valueOf(bool2);
        z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "mediaUrl[%s], isQQmusicInWifi[%B]", arrayOfObject1);
        this.dhM = (this.dhL + f.d(str1.getBytes()));
        this.dhN = (this.dhM + ".tem");
        this.dhO = (this.dhM + ".config");
        o localo = new o(this, str1, bool2);
        localo.setPriority(1);
        localo.start();
      }
      return;
    }
  }

  private static String p(Context paramContext)
  {
    String str1 = "";
    String str2 = ak.getPackageName();
    if (str2 == null);
    while (true)
    {
      return str1;
      try
      {
        PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(str2, 0);
        if (localPackageInfo != null)
        {
          str1 = str1 + localPackageInfo.versionName;
          String str3 = str1 + "." + localPackageInfo.versionCode;
          return str3;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
      }
    }
    return str1;
  }

  public final an a(String paramString, acb paramacb)
  {
    if ((paramacb == null) || (paramacb.ivA == null) || (paramacb.ivA.hUT == null) || (paramacb.ivA.hUT.size() <= 0))
      this = null;
    rt localrt1;
    do
    {
      return this;
      localrt1 = (rt)paramacb.ivA.hUT.get(0);
      d(paramString, localrt1.hOh, localrt1.ihN);
    }
    while (localrt1 == null);
    this.dif.clear();
    Object localObject = null;
    if (paramacb != null)
    {
      eo localeo1 = paramacb.ivA;
      localObject = null;
      if (localeo1 != null)
      {
        LinkedList localLinkedList = paramacb.ivA.hUT;
        localObject = null;
        if (localLinkedList != null)
        {
          int i = paramacb.ivA.hUT.size();
          localObject = null;
          if (i > 0)
            break label143;
        }
      }
    }
    while (true)
    {
      a((tb)localObject);
      return this;
      label143: rt localrt2 = (rt)paramacb.ivA.hUT.get(0);
      localObject = null;
      if (localrt2 != null)
      {
        tb localtb = new tb();
        localtb.imY = 1;
        localtb.imZ = paramacb.hPl;
        localtb.ina = 0.0F;
        localtb.ind = "";
        localtb.ine = localrt2.ihJ;
        localtb.ink = null;
        localtb.hQj = 1;
        localtb.inj = null;
        localtb.inb = localrt2.cCD;
        localtb.inc = localrt2.hwQ;
        localtb.ini = localrt2.hOh;
        localtb.inh = localrt2.ihN;
        eo localeo2 = paramacb.ivA;
        String str = null;
        if (localeo2 != null)
          str = paramacb.ivA.hOh;
        localtb.ing = str;
        localtb.inm = localrt2.ihK;
        localtb.hQq = localrt2.hPl;
        localtb.inl = paramString;
        localtb.hOd = paramacb.ivz.hPl;
        localObject = localtb;
      }
    }
  }

  public final an a(String paramString1, String paramString2, b paramb, String paramString3)
  {
    Object localObject1;
    Object localObject2;
    tb localtb;
    if ((ap.jb(paramb.dRl)) && (ap.jb(paramb.dRm)))
    {
      localObject1 = paramb.url;
      localObject2 = paramb.dQV;
      d(paramString1, (String)localObject1, (String)localObject2);
      if (paramb != null)
      {
        this.dif.clear();
        if (paramb != null)
          break label130;
        localtb = null;
      }
    }
    while (true)
    {
      a(localtb);
      return this;
      if (paramb.dRl == null);
      for (String str1 = paramb.url; ; str1 = paramb.dRl)
      {
        if (paramb.dRm != null)
          break label113;
        String str3 = paramb.dQV;
        localObject1 = str1;
        localObject2 = str3;
        break;
      }
      label113: String str2 = paramb.dRm;
      localObject1 = str1;
      localObject2 = str2;
      break;
      label130: localtb = new tb();
      localtb.imY = 0;
      localtb.imZ = paramString2;
      localtb.ina = 0.0F;
      localtb.ind = "";
      localtb.ine = paramString3;
      localtb.ink = paramString3;
      localtb.hQj = 1;
      localtb.inj = null;
      localtb.inb = paramb.title;
      localtb.inc = paramb.description;
      localtb.ini = paramb.url;
      localtb.inh = paramb.dQV;
      localtb.ing = paramb.dRl;
      localtb.hOd = paramb.appId;
      localtb.inl = paramString1;
    }
  }

  public final an a(String paramString1, String paramString2, tb paramtb)
  {
    if ((paramtb != null) && (ap.jb(paramtb.ing)))
    {
      if (paramtb != null)
      {
        this.dif.clear();
        a(a(paramtb, paramString1, paramString2));
      }
      lb();
      tb localtb = la();
      if ((localtb != null) && (localtb.ini.equals(paramtb.ini)))
      {
        d(paramString1, ap.Y(localtb.ing, localtb.ini), localtb.inh);
        this.dif.clear();
        a(a(localtb, paramString1, paramString2));
      }
    }
    while (paramtb == null)
      return this;
    d(paramString1, ap.Y(paramtb.ing, paramtb.ini), paramtb.inh);
    this.dif.clear();
    a(a(paramtb, paramString1, paramString2));
    return this;
  }

  public final an a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    if (ap.jb(paramString4));
    for (String str = paramString2; ; str = paramString4)
    {
      d(paramString1, str, paramString3);
      this.dif.clear();
      a(a(6, null, paramString8, paramString9, paramString2, paramString3, paramString4, String.valueOf(paramString5), paramString1, paramString7, paramString6));
      return this;
    }
  }

  public final tb a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    tb localtb = new tb();
    localtb.imY = paramInt;
    localtb.ine = paramString1;
    localtb.inb = paramString2;
    localtb.inc = paramString3;
    localtb.ini = paramString4;
    localtb.inh = paramString5;
    localtb.ing = paramString6;
    localtb.inl = paramString8;
    localtb.hOd = paramString10;
    localtb.ink = paramString9;
    localtb.imZ = paramString7;
    localtb.ina = 0.0F;
    localtb.ind = "";
    localtb.hQj = 1;
    localtb.inj = null;
    localtb.hQq = paramString7;
    return localtb;
  }

  public final void a(ao paramao)
  {
    if ((paramao == null) || (this.dhZ.contains(paramao)))
      return;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramao.toString();
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "add callback: %s", arrayOfObject);
    synchronized (this.lock)
    {
      this.dhZ.add(paramao);
      return;
    }
  }

  public final an b(tb paramtb)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.dif.size());
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "put musicwrapper: %d ", arrayOfObject);
    this.dif.put(this.dif.size(), paramtb);
    return this;
  }

  public final void b(ao paramao)
  {
    if (paramao == null)
      return;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramao.toString();
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "unRegistDownloadCallBack: %s", arrayOfObject);
    synchronized (this.lock)
    {
      this.dhZ.remove(paramao);
      return;
    }
  }

  public final an bP(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.dif.size()));
    do
    {
      return this;
      this.dik = paramInt;
      this.currentIndex = this.dik;
    }
    while (la() == null);
    this.dhW = true;
    lf();
    return this;
  }

  public final an bX(String paramString)
  {
    if (la() == null)
      return this;
    la().inj = paramString;
    return this;
  }

  public final void c(ao paramao)
  {
    z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "releasePlayer");
    if (!kT())
    {
      release();
      lc();
      z.d("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "releasePlayer == release playing");
      this.did = false;
      this.die = false;
      this.dib = false;
      this.dhX.pE();
    }
    b(paramao);
  }

  public final boolean c(String paramString1, String paramString2, String paramString3)
  {
    return ((getUrl() != null) && (getUrl().equals(paramString1))) || ((getUrl() != null) && (getUrl().equals(paramString3))) || ((la() != null) && (la().inh != null) && (la().inh.equals(paramString2)));
  }

  public final String getTitle()
  {
    if (la() == null)
      return "";
    if (la().inb == null)
      return "";
    return la().inb;
  }

  public final int kP()
  {
    if (la() == null)
      return -1;
    return la().imY;
  }

  public final String kQ()
  {
    if (la() == null)
      return null;
    return la().imZ;
  }

  public final int kR()
  {
    if (la() == null)
      return 0;
    return la().inm;
  }

  public final String kS()
  {
    if (la() == null)
      return null;
    return la().ind;
  }

  public final boolean kT()
  {
    return (this.daf != null) && (this.daf.isPlaying());
  }

  public final void kU()
  {
    c(null);
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "clear call back");
    synchronized (this.lock)
    {
      this.dhZ.clear();
      return;
    }
  }

  public final boolean kV()
  {
    return !kT();
  }

  public final String kp()
  {
    if (la() == null)
      return null;
    return la().ink;
  }

  public final tb la()
  {
    if ((this.currentIndex < 0) || (this.currentIndex >= this.dif.size()));
    for (tb localtb = null; ; localtb = (tb)this.dif.get(this.currentIndex))
    {
      if (localtb == null)
      {
        this.dhW = false;
        this.dik = -1;
      }
      return localtb;
    }
  }

  public final an lb()
  {
    if ((la() == null) || (ls() == null));
    while (true)
    {
      return this;
      String str = new String(bZ(ls()));
      int i = str.indexOf("{");
      if (i != -1)
        str = str.substring(i);
      try
      {
        JSONObject localJSONObject = new JSONObject(str);
        tb localtb = la();
        if (localtb != null)
        {
          localtb.idq = localJSONObject.getInt("song_ID");
          if (ap.jb(localtb.inb))
            localtb.inb = localJSONObject.getString("song_Name");
          if (ap.jb(localtb.inh))
            localtb.inh = localJSONObject.getString("song_WapLiveURL");
          if (ap.jb(localtb.ing))
            localtb.ing = localJSONObject.getString("song_WifiURL");
          if (ap.jb(localtb.ind))
            localtb.ind = localJSONObject.getString("song_Album");
          if (ap.jb(localtb.inc))
          {
            localtb.inc = localJSONObject.getString("song_Singer");
            return this;
          }
        }
      }
      catch (Exception localException)
      {
      }
    }
    return this;
  }

  public final int ld()
  {
    if (la() == null)
      return -1;
    return la().idq;
  }

  public final String le()
  {
    if (la() == null)
      return null;
    return la().hOd;
  }

  public final an lf()
  {
    if (this.dij == null)
      this.dij = new ay(new k(this), false);
    this.dij.aNu();
    this.dij.cP(500L);
    return this;
  }

  public final an lg()
  {
    if (this.dij != null)
      this.dij.aNu();
    z.i("!32@/B4Tb64lLpJY5frTR9Nb+0/K71RXh0Ei", "stop UI Music");
    this.dhX.pE();
    this.dib = false;
    this.dhV = true;
    li();
    return this;
  }

  public final String lj()
  {
    if (la() == null)
      return null;
    return la().hQq;
  }

  public final an lk()
  {
    this.dif.clear();
    this.currentIndex = -1;
    this.dik = -1;
    this.dhW = false;
    release();
    return this;
  }

  public final an lu()
  {
    this.currentIndex = (1 + this.currentIndex);
    if (this.dik > 0)
    {
      if (this.currentIndex >= this.dif.size())
        this.currentIndex = 0;
      if (this.currentIndex == this.dik)
      {
        this.dik = -1;
        return this;
      }
    }
    if (la() == null)
    {
      this.currentIndex = (-1 + this.currentIndex);
      return this;
    }
    lf();
    return this;
  }

  public final an oC()
  {
    bP(0);
    return this;
  }

  public final void pause()
  {
    if (this.dij != null)
      this.dij.aNu();
    if (!kT())
      return;
    this.daf.pause();
    this.die = false;
    synchronized (this.lock)
    {
      am.h(new l(this));
      return;
    }
  }

  public final void release()
  {
    lg();
    lc();
  }

  public final void resume()
  {
    kZ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.i
 * JD-Core Version:    0.6.2
 */