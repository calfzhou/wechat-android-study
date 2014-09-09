package com.tencent.mm.app;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.kingkong.support.Log;
import com.tencent.mm.ad.s;
import com.tencent.mm.booter.u;
import com.tencent.mm.c.a.fj;
import com.tencent.mm.c.a.t;
import com.tencent.mm.console.Shell;
import com.tencent.mm.kvcomm.IKVReportNotify;
import com.tencent.mm.model.am;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.be;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.n.af;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.c.q;
import com.tencent.mm.q.aa;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cq;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI;
import com.tencent.mm.ui.tools.NewTaskUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class WorkerProfile extends com.tencent.mm.compatible.loader.l
  implements IKVReportNotify, am, com.tencent.mm.model.ap, be, com.tencent.mm.o.m
{
  public static final String cFO = ak.getPackageName();
  private static WorkerProfile cGB;
  private static ai cGU;
  private static com.tencent.mm.booter.g cGz;
  private final com.tencent.mm.console.a cGA = new com.tencent.mm.console.a();
  private boolean cGC;
  private ar cGD;
  private w cGE;
  private an cGF;
  private com.tencent.mm.model.aj cGG;
  private boolean cGH;
  private boolean cGI;
  private boolean cGJ;
  private final MMAppMgr cGK = new MMAppMgr();
  private final HashSet cGL = new HashSet();
  private com.tencent.mm.d.b cGM;
  private final c cGR = new c();
  private final aj cGS = new aj();
  private final n cGT = new n();
  private final Shell cGx = new Shell();
  protected Locale locale;

  public static WorkerProfile jdMethod_if()
  {
    return cGB;
  }

  private void iq()
  {
    String str = cq.getProperty("system_property_key_locale");
    if ((str != null) && (str.length() > 0))
    {
      if (!"language_default".equalsIgnoreCase(str))
        break label106;
      this.locale = Locale.getDefault();
    }
    while (true)
    {
      Locale localLocale = MMActivity.cg(this.dOv.getBaseContext());
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = this.locale;
      arrayOfObject1[1] = localLocale;
      arrayOfObject1[2] = str;
      z.d("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "onConfigurationChanged, locale = %s, n = %s, lang = %s", arrayOfObject1);
      if ((localLocale != null) && (this.locale != null) && (!localLocale.equals(this.locale)))
      {
        z.w("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "language changed, restart process");
        System.exit(-1);
      }
      return;
      label106: String[] arrayOfString = str.split("_");
      if ((arrayOfString != null) && (arrayOfString.length >= 2))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(arrayOfString.length);
        z.d("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "initLanguage arr.length = %s", arrayOfObject2);
        this.locale = new Locale(arrayOfString[0], arrayOfString[1]);
      }
      else
      {
        this.locale = new Locale(str);
      }
    }
  }

  // ERROR //
  public final boolean H(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray 166	java/lang/Object
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: aload_0
    //   8: getfield 270	com/tencent/mm/app/WorkerProfile:cGC	Z
    //   11: invokestatic 275	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   14: aastore
    //   15: aload_2
    //   16: iconst_1
    //   17: iload_1
    //   18: invokestatic 275	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   21: aastore
    //   22: aload_2
    //   23: iconst_2
    //   24: invokestatic 281	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   27: invokevirtual 284	java/lang/Thread:getName	()Ljava/lang/String;
    //   30: aastore
    //   31: ldc 168
    //   33: ldc_w 286
    //   36: aload_2
    //   37: invokestatic 289	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   43: lstore_3
    //   44: aload_0
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 270	com/tencent/mm/app/WorkerProfile:cGC	Z
    //   50: ifne +1857 -> 1907
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield 270	com/tencent/mm/app/WorkerProfile:cGC	Z
    //   58: aload_0
    //   59: monitorexit
    //   60: ldc 2
    //   62: invokevirtual 299	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   65: astore 6
    //   67: ldc_w 301
    //   70: aload 6
    //   72: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   75: getstatic 75	com/tencent/mm/app/WorkerProfile:cFO	Ljava/lang/String;
    //   78: invokestatic 311	com/tencent/mm/app/h:aq	(Ljava/lang/String;)Z
    //   81: pop
    //   82: invokestatic 314	com/tencent/mm/compatible/g/o:nQ	()V
    //   85: new 316	com/tencent/mm/sdk/c/b
    //   88: dup
    //   89: invokespecial 317	com/tencent/mm/sdk/c/b:<init>	()V
    //   92: invokestatic 320	com/tencent/mm/sdk/c/a:a	(Lcom/tencent/mm/sdk/c/f;)V
    //   95: ldc_w 322
    //   98: aload 6
    //   100: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   103: ldc_w 324
    //   106: aload 6
    //   108: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   111: ldc_w 326
    //   114: aload 6
    //   116: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   119: ldc_w 328
    //   122: aload 6
    //   124: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   127: ldc_w 330
    //   130: aload 6
    //   132: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   135: invokestatic 335	com/tencent/mm/sdk/platformtools/MMNativeJpeg:Create	()V
    //   138: getstatic 340	com/tencent/mm/sdk/a:iCV	Ljava/lang/String;
    //   141: aload 6
    //   143: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   146: ldc_w 342
    //   149: invokestatic 345	com/tencent/mm/compatible/g/o:cI	(Ljava/lang/String;)Ljava/lang/String;
    //   152: invokestatic 262	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   155: ifne +11 -> 166
    //   158: ldc_w 342
    //   161: aload 6
    //   163: invokestatic 306	com/tencent/mm/compatible/g/o:a	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   166: invokestatic 350	com/tencent/mm/kvcomm/KVReportJni$KVReportJava2C:onCreate	()V
    //   169: aload_0
    //   170: putstatic 356	com/tencent/mm/kvcomm/KVReportJni:kvReportNotify	Lcom/tencent/mm/kvcomm/IKVReportNotify;
    //   173: getstatic 362	com/tencent/mm/protocal/a:hrn	I
    //   176: invokestatic 368	com/tencent/mm/protocal/MMProtocalJni:setClientPackVersion	(I)Z
    //   179: pop
    //   180: new 370	com/tencent/mm/xlog/Xlog
    //   183: dup
    //   184: invokespecial 371	com/tencent/mm/xlog/Xlog:<init>	()V
    //   187: invokevirtual 374	com/tencent/mm/xlog/Xlog:getLogLevel	()I
    //   190: invokestatic 377	com/tencent/mm/protocal/MMProtocalJni:setProtocalJniLogLevel	(I)Z
    //   193: pop
    //   194: invokestatic 382	com/tencent/mm/am/a:aCl	()Z
    //   197: invokestatic 386	com/tencent/mm/protocal/MMProtocalJni:setIsLite	(Z)V
    //   200: aload_0
    //   201: new 388	com/tencent/mm/app/z
    //   204: dup
    //   205: aload_0
    //   206: invokespecial 391	com/tencent/mm/app/z:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   209: invokestatic 394	com/tencent/mm/model/bg:a	(Lcom/tencent/mm/model/ap;Lcom/tencent/mm/o/ak;)V
    //   212: invokestatic 400	com/tencent/mm/ui/e/a:bbH	()Lcom/tencent/mm/ui/e/a;
    //   215: invokevirtual 403	com/tencent/mm/ui/e/a:setup	()V
    //   218: invokestatic 407	com/tencent/mm/model/bg:qX	()Lcom/tencent/mm/o/ac;
    //   221: iconst_m1
    //   222: aload_0
    //   223: invokevirtual 412	com/tencent/mm/o/ac:a	(ILcom/tencent/mm/o/m;)V
    //   226: invokestatic 417	com/tencent/mm/booter/NotifyReceiver:lw	()V
    //   229: invokestatic 421	com/tencent/mm/model/bg:qF	()Lcom/tencent/mm/model/dv;
    //   232: pop
    //   233: aload_0
    //   234: invokestatic 426	com/tencent/mm/model/dv:a	(Lcom/tencent/mm/model/be;)V
    //   237: aload_0
    //   238: invokestatic 429	com/tencent/mm/model/bg:a	(Lcom/tencent/mm/model/am;)V
    //   241: new 431	com/tencent/mm/app/ab
    //   244: dup
    //   245: aload_0
    //   246: invokespecial 432	com/tencent/mm/app/ab:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   249: invokestatic 435	com/tencent/mm/model/bg:a	(Lcom/tencent/mm/network/ag;)V
    //   252: aload_0
    //   253: getfield 117	com/tencent/mm/app/WorkerProfile:dOv	Landroid/app/Application;
    //   256: astore 11
    //   258: aload 11
    //   260: invokestatic 441	com/tencent/mm/sdk/platformtools/l:bv	(Landroid/content/Context;)V
    //   263: aload 11
    //   265: invokestatic 444	com/tencent/mm/sdk/platformtools/l:bw	(Landroid/content/Context;)V
    //   268: aload 11
    //   270: invokevirtual 450	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   273: astore 12
    //   275: aload 12
    //   277: aload 11
    //   279: invokevirtual 451	android/content/Context:getPackageName	()Ljava/lang/String;
    //   282: iconst_0
    //   283: invokevirtual 457	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   286: getfield 463	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   289: getfield 468	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   292: invokestatic 474	com/tencent/mm/b/a:aj	(Ljava/lang/String;)Lcom/tencent/mm/b/a;
    //   295: astore 35
    //   297: aload 35
    //   299: ifnull +310 -> 609
    //   302: aload 35
    //   304: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   307: ifnull +302 -> 609
    //   310: ldc 168
    //   312: ldc_w 480
    //   315: invokestatic 482	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   318: aload 35
    //   320: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   323: invokevirtual 487	com/tencent/mm/b/c:hp	()Z
    //   326: ifeq +22 -> 348
    //   329: aload 35
    //   331: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   334: invokevirtual 490	com/tencent/mm/b/c:ho	()I
    //   337: putstatic 493	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   340: ldc 168
    //   342: ldc_w 495
    //   345: invokestatic 482	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   348: aload 35
    //   350: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   353: invokevirtual 498	com/tencent/mm/b/c:ht	()Z
    //   356: ifeq +40 -> 396
    //   359: aload 35
    //   361: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   364: invokevirtual 501	com/tencent/mm/b/c:hs	()I
    //   367: putstatic 504	com/tencent/mm/sdk/platformtools/l:cFr	I
    //   370: iconst_1
    //   371: anewarray 166	java/lang/Object
    //   374: astore 39
    //   376: aload 39
    //   378: iconst_0
    //   379: getstatic 504	com/tencent/mm/sdk/platformtools/l:cFr	I
    //   382: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   385: aastore
    //   386: ldc 168
    //   388: ldc_w 506
    //   391: aload 39
    //   393: invokestatic 176	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   396: aload 35
    //   398: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   401: invokevirtual 509	com/tencent/mm/b/c:hv	()Z
    //   404: ifeq +17 -> 421
    //   407: aload 35
    //   409: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   412: invokevirtual 512	com/tencent/mm/b/c:hu	()Ljava/lang/String;
    //   415: invokestatic 516	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   418: putstatic 519	com/tencent/mm/sdk/platformtools/l:iDq	I
    //   421: aload 35
    //   423: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   426: invokevirtual 522	com/tencent/mm/b/c:hx	()Z
    //   429: ifeq +14 -> 443
    //   432: aload 35
    //   434: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   437: invokevirtual 525	com/tencent/mm/b/c:hw	()Ljava/lang/String;
    //   440: putstatic 528	com/tencent/mm/sdk/platformtools/l:iDr	Ljava/lang/String;
    //   443: aload 35
    //   445: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   448: invokevirtual 531	com/tencent/mm/b/c:hr	()Z
    //   451: ifeq +14 -> 465
    //   454: aload 35
    //   456: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   459: invokevirtual 534	com/tencent/mm/b/c:hq	()Ljava/lang/String;
    //   462: putstatic 537	com/tencent/mm/sdk/platformtools/l:cFp	Ljava/lang/String;
    //   465: aload 35
    //   467: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   470: invokevirtual 540	com/tencent/mm/b/c:hF	()Z
    //   473: ifeq +40 -> 513
    //   476: aload 35
    //   478: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   481: invokevirtual 543	com/tencent/mm/b/c:hC	()Z
    //   484: putstatic 546	com/tencent/mm/sdk/platformtools/l:iDv	Z
    //   487: iconst_1
    //   488: anewarray 166	java/lang/Object
    //   491: astore 38
    //   493: aload 38
    //   495: iconst_0
    //   496: getstatic 546	com/tencent/mm/sdk/platformtools/l:iDv	Z
    //   499: invokestatic 275	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   502: aastore
    //   503: ldc 168
    //   505: ldc_w 548
    //   508: aload 38
    //   510: invokestatic 176	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   513: aload 35
    //   515: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   518: invokevirtual 551	com/tencent/mm/b/c:hB	()Z
    //   521: ifeq +40 -> 561
    //   524: aload 35
    //   526: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   529: invokevirtual 554	com/tencent/mm/b/c:hA	()I
    //   532: putstatic 557	com/tencent/mm/sdk/platformtools/l:cFz	I
    //   535: iconst_1
    //   536: anewarray 166	java/lang/Object
    //   539: astore 37
    //   541: aload 37
    //   543: iconst_0
    //   544: getstatic 557	com/tencent/mm/sdk/platformtools/l:cFz	I
    //   547: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   550: aastore
    //   551: ldc 168
    //   553: ldc_w 559
    //   556: aload 37
    //   558: invokestatic 176	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   561: aload 35
    //   563: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   566: invokevirtual 562	com/tencent/mm/b/c:hz	()Z
    //   569: ifeq +40 -> 609
    //   572: aload 35
    //   574: invokevirtual 478	com/tencent/mm/b/a:hl	()Lcom/tencent/mm/b/c;
    //   577: invokevirtual 565	com/tencent/mm/b/c:hy	()Z
    //   580: putstatic 568	com/tencent/mm/sdk/platformtools/l:iDu	Z
    //   583: iconst_1
    //   584: anewarray 166	java/lang/Object
    //   587: astore 36
    //   589: aload 36
    //   591: iconst_0
    //   592: getstatic 568	com/tencent/mm/sdk/platformtools/l:iDu	Z
    //   595: invokestatic 275	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   598: aastore
    //   599: ldc 168
    //   601: ldc_w 570
    //   604: aload 36
    //   606: invokestatic 176	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   609: invokestatic 575	com/tencent/mm/app/b:hL	()V
    //   612: getstatic 577	com/tencent/mm/app/WorkerProfile:cGz	Lcom/tencent/mm/booter/g;
    //   615: ifnull +22 -> 637
    //   618: getstatic 577	com/tencent/mm/app/WorkerProfile:cGz	Lcom/tencent/mm/booter/g;
    //   621: getfield 582	com/tencent/mm/booter/g:dhH	I
    //   624: iconst_m1
    //   625: if_icmpeq +12 -> 637
    //   628: getstatic 577	com/tencent/mm/app/WorkerProfile:cGz	Lcom/tencent/mm/booter/g;
    //   631: getfield 582	com/tencent/mm/booter/g:dhH	I
    //   634: putstatic 493	com/tencent/mm/sdk/platformtools/l:cFn	I
    //   637: getstatic 519	com/tencent/mm/sdk/platformtools/l:iDq	I
    //   640: ifle +7 -> 647
    //   643: iconst_1
    //   644: putstatic 585	com/tencent/mm/sdk/platformtools/l:iDs	Z
    //   647: invokestatic 382	com/tencent/mm/am/a:aCl	()Z
    //   650: pop
    //   651: new 57	java/lang/StringBuilder
    //   654: dup
    //   655: ldc_w 587
    //   658: invokespecial 588	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   661: astore 16
    //   663: getstatic 537	com/tencent/mm/sdk/platformtools/l:cFp	Ljava/lang/String;
    //   666: invokestatic 262	com/tencent/mm/sdk/platformtools/ch:jb	(Ljava/lang/String;)Z
    //   669: ifeq +1292 -> 1961
    //   672: getstatic 593	android/os/Build$VERSION:SDK_INT	I
    //   675: invokestatic 204	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   678: astore 17
    //   680: aload 16
    //   682: aload 17
    //   684: invokevirtual 596	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   687: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   690: putstatic 599	com/tencent/mm/protocal/a:hrg	Ljava/lang/String;
    //   693: aload_0
    //   694: aload_0
    //   695: getfield 117	com/tencent/mm/app/WorkerProfile:dOv	Landroid/app/Application;
    //   698: invokevirtual 158	android/app/Application:getBaseContext	()Landroid/content/Context;
    //   701: invokestatic 164	com/tencent/mm/ui/MMActivity:cg	(Landroid/content/Context;)Ljava/util/Locale;
    //   704: putfield 152	com/tencent/mm/app/WorkerProfile:locale	Ljava/util/Locale;
    //   707: aload_0
    //   708: getfield 86	com/tencent/mm/app/WorkerProfile:cGA	Lcom/tencent/mm/console/a;
    //   711: astore 18
    //   713: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   716: ldc_w 601
    //   719: aload 18
    //   721: invokeinterface 604 3 0
    //   726: pop
    //   727: new 606	com/tencent/mm/app/a
    //   730: dup
    //   731: invokespecial 607	com/tencent/mm/app/a:<init>	()V
    //   734: invokestatic 612	com/tencent/mm/pluginsdk/ui/c:a	(Lcom/tencent/mm/pluginsdk/ui/ad;)V
    //   737: new 614	com/tencent/mm/app/u
    //   740: dup
    //   741: aload_0
    //   742: invokespecial 615	com/tencent/mm/app/u:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   745: invokestatic 620	com/tencent/mm/pluginsdk/g:a	(Lcom/tencent/mm/pluginsdk/l;)V
    //   748: ldc_w 622
    //   751: invokestatic 625	com/tencent/mm/sdk/platformtools/ak:getContext	()Landroid/content/Context;
    //   754: ldc_w 622
    //   757: invokestatic 631	com/tencent/mm/compatible/loader/g:j	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   760: invokestatic 635	com/tencent/mm/compatible/loader/g:q	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;
    //   763: pop
    //   764: ldc_w 637
    //   767: aload_0
    //   768: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   771: aload_0
    //   772: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   775: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   778: ldc_w 642
    //   781: aload_0
    //   782: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   785: aload_0
    //   786: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   789: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   792: ldc_w 644
    //   795: aload_0
    //   796: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   799: aload_0
    //   800: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   803: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   806: ldc_w 646
    //   809: aload_0
    //   810: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   813: aload_0
    //   814: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   817: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   820: ldc_w 648
    //   823: aload_0
    //   824: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   827: aload_0
    //   828: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   831: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   834: ldc_w 650
    //   837: aload_0
    //   838: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   841: aload_0
    //   842: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   845: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   848: ldc_w 652
    //   851: aload_0
    //   852: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   855: aload_0
    //   856: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   859: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   862: ldc_w 654
    //   865: aload_0
    //   866: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   869: aload_0
    //   870: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   873: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   876: ldc_w 656
    //   879: aload_0
    //   880: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   883: aload_0
    //   884: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   887: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   890: ldc_w 658
    //   893: aload_0
    //   894: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   897: aload_0
    //   898: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   901: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   904: ldc_w 660
    //   907: aload_0
    //   908: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   911: aload_0
    //   912: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   915: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   918: ldc_w 662
    //   921: aload_0
    //   922: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   925: aload_0
    //   926: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   929: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   932: ldc_w 664
    //   935: aload_0
    //   936: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   939: aload_0
    //   940: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   943: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   946: ldc_w 666
    //   949: aload_0
    //   950: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   953: aload_0
    //   954: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   957: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   960: ldc_w 668
    //   963: aload_0
    //   964: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   967: aload_0
    //   968: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   971: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   974: ldc_w 670
    //   977: aload_0
    //   978: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   981: aload_0
    //   982: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   985: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   988: ldc_w 672
    //   991: aload_0
    //   992: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   995: aload_0
    //   996: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   999: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1002: ldc_w 674
    //   1005: aload_0
    //   1006: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1009: aload_0
    //   1010: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1013: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1016: ldc_w 676
    //   1019: aload_0
    //   1020: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1023: aload_0
    //   1024: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1027: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1030: ldc_w 678
    //   1033: aload_0
    //   1034: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1037: aload_0
    //   1038: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1041: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1044: ldc_w 680
    //   1047: aload_0
    //   1048: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1051: aload_0
    //   1052: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1055: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1058: ldc_w 682
    //   1061: aload_0
    //   1062: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1065: aload_0
    //   1066: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1069: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1072: ldc_w 684
    //   1075: aload_0
    //   1076: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1079: aload_0
    //   1080: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1083: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1086: ldc_w 686
    //   1089: aload_0
    //   1090: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1093: aload_0
    //   1094: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1097: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1100: ldc_w 688
    //   1103: aload_0
    //   1104: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1107: aload_0
    //   1108: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1111: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1114: ldc_w 690
    //   1117: aload_0
    //   1118: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1121: aload_0
    //   1122: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1125: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1128: ldc_w 692
    //   1131: aload_0
    //   1132: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1135: aload_0
    //   1136: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1139: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1142: ldc_w 694
    //   1145: aload_0
    //   1146: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1149: aload_0
    //   1150: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1153: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1156: ldc_w 696
    //   1159: aload_0
    //   1160: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1163: aload_0
    //   1164: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1167: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1170: ldc_w 698
    //   1173: aload_0
    //   1174: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1177: aload_0
    //   1178: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1181: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1184: ldc_w 700
    //   1187: aload_0
    //   1188: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1191: aload_0
    //   1192: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1195: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1198: ldc_w 702
    //   1201: aload_0
    //   1202: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1205: aload_0
    //   1206: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1209: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1212: ldc_w 704
    //   1215: aload_0
    //   1216: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1219: aload_0
    //   1220: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1223: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1226: ldc_w 706
    //   1229: aload_0
    //   1230: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1233: aload_0
    //   1234: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1237: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1240: ldc_w 708
    //   1243: aload_0
    //   1244: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1247: aload_0
    //   1248: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1251: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1254: ldc_w 710
    //   1257: aload_0
    //   1258: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1261: aload_0
    //   1262: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1265: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1268: ldc_w 712
    //   1271: aload_0
    //   1272: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1275: aload_0
    //   1276: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1279: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1282: ldc_w 714
    //   1285: aload_0
    //   1286: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1289: aload_0
    //   1290: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1293: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1296: ldc_w 716
    //   1299: aload_0
    //   1300: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1303: aload_0
    //   1304: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1307: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1310: ldc_w 718
    //   1313: aload_0
    //   1314: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1317: aload_0
    //   1318: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1321: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1324: ldc_w 720
    //   1327: aload_0
    //   1328: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1331: aload_0
    //   1332: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1335: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1338: ldc_w 722
    //   1341: aload_0
    //   1342: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1345: aload_0
    //   1346: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1349: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1352: ldc_w 724
    //   1355: aload_0
    //   1356: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1359: aload_0
    //   1360: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1363: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1366: ldc_w 726
    //   1369: aload_0
    //   1370: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1373: aload_0
    //   1374: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1377: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1380: ldc_w 728
    //   1383: aload_0
    //   1384: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1387: aload_0
    //   1388: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1391: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1394: ldc_w 730
    //   1397: aload_0
    //   1398: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1401: aload_0
    //   1402: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1405: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1408: ldc_w 732
    //   1411: aload_0
    //   1412: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1415: aload_0
    //   1416: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1419: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1422: ldc_w 734
    //   1425: aload_0
    //   1426: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1429: aload_0
    //   1430: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1433: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1436: ldc_w 736
    //   1439: aload_0
    //   1440: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1443: aload_0
    //   1444: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1447: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1450: ldc_w 738
    //   1453: aload_0
    //   1454: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1457: aload_0
    //   1458: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1461: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1464: ldc_w 740
    //   1467: aload_0
    //   1468: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1471: aload_0
    //   1472: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1475: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1478: ldc_w 742
    //   1481: aload_0
    //   1482: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1485: aload_0
    //   1486: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1489: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1492: ldc_w 744
    //   1495: aload_0
    //   1496: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1499: aload_0
    //   1500: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1503: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1506: ldc_w 746
    //   1509: aload_0
    //   1510: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1513: aload_0
    //   1514: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1517: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1520: ldc_w 748
    //   1523: aload_0
    //   1524: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1527: aload_0
    //   1528: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1531: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1534: ldc_w 750
    //   1537: aload_0
    //   1538: getfield 106	com/tencent/mm/app/WorkerProfile:cGS	Lcom/tencent/mm/app/aj;
    //   1541: aload_0
    //   1542: getfield 111	com/tencent/mm/app/WorkerProfile:cGT	Lcom/tencent/mm/app/n;
    //   1545: invokestatic 640	com/tencent/mm/am/a:a	(Ljava/lang/String;Lcom/tencent/mm/pluginsdk/d;Lcom/tencent/mm/pluginsdk/c;)V
    //   1548: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1551: ldc_w 752
    //   1554: new 754	com/tencent/mm/plugin/ext/m
    //   1557: dup
    //   1558: invokespecial 755	com/tencent/mm/plugin/ext/m:<init>	()V
    //   1561: invokeinterface 604 3 0
    //   1566: pop
    //   1567: aload_0
    //   1568: new 757	com/tencent/mm/booter/u
    //   1571: dup
    //   1572: aload_0
    //   1573: getfield 117	com/tencent/mm/app/WorkerProfile:dOv	Landroid/app/Application;
    //   1576: invokespecial 759	com/tencent/mm/booter/u:<init>	(Landroid/content/Context;)V
    //   1579: putfield 761	com/tencent/mm/app/WorkerProfile:cGD	Lcom/tencent/mm/model/ar;
    //   1582: aload_0
    //   1583: new 763	com/tencent/mm/d/b
    //   1586: dup
    //   1587: invokespecial 764	com/tencent/mm/d/b:<init>	()V
    //   1590: putfield 766	com/tencent/mm/app/WorkerProfile:cGM	Lcom/tencent/mm/d/b;
    //   1593: aload_0
    //   1594: getfield 766	com/tencent/mm/app/WorkerProfile:cGM	Lcom/tencent/mm/d/b;
    //   1597: invokevirtual 769	com/tencent/mm/d/b:init	()V
    //   1600: aload_0
    //   1601: getfield 771	com/tencent/mm/app/WorkerProfile:cGH	Z
    //   1604: ifeq +12 -> 1616
    //   1607: aload_0
    //   1608: invokespecial 773	com/tencent/mm/app/WorkerProfile:iq	()V
    //   1611: aload_0
    //   1612: iconst_0
    //   1613: putfield 771	com/tencent/mm/app/WorkerProfile:cGH	Z
    //   1616: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1619: ldc_w 775
    //   1622: new 777	com/tencent/mm/ui/bindqq/f
    //   1625: dup
    //   1626: invokespecial 778	com/tencent/mm/ui/bindqq/f:<init>	()V
    //   1629: invokeinterface 604 3 0
    //   1634: pop
    //   1635: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1638: ldc_w 780
    //   1641: new 782	com/tencent/mm/app/ac
    //   1644: dup
    //   1645: aload_0
    //   1646: invokespecial 783	com/tencent/mm/app/ac:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1649: invokeinterface 604 3 0
    //   1654: pop
    //   1655: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1658: ldc_w 785
    //   1661: new 787	com/tencent/mm/app/ad
    //   1664: dup
    //   1665: aload_0
    //   1666: invokespecial 788	com/tencent/mm/app/ad:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1669: invokeinterface 604 3 0
    //   1674: pop
    //   1675: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1678: ldc_w 790
    //   1681: new 792	com/tencent/mm/app/ae
    //   1684: dup
    //   1685: aload_0
    //   1686: invokespecial 793	com/tencent/mm/app/ae:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1689: invokeinterface 604 3 0
    //   1694: pop
    //   1695: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1698: ldc_w 795
    //   1701: new 797	com/tencent/mm/app/af
    //   1704: dup
    //   1705: aload_0
    //   1706: invokespecial 798	com/tencent/mm/app/af:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1709: invokeinterface 604 3 0
    //   1714: pop
    //   1715: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1718: ldc_w 800
    //   1721: new 802	com/tencent/mm/app/ag
    //   1724: dup
    //   1725: aload_0
    //   1726: invokespecial 803	com/tencent/mm/app/ag:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1729: invokeinterface 604 3 0
    //   1734: pop
    //   1735: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1738: ldc_w 805
    //   1741: new 807	com/tencent/mm/app/p
    //   1744: dup
    //   1745: aload_0
    //   1746: invokespecial 808	com/tencent/mm/app/p:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1749: invokeinterface 604 3 0
    //   1754: pop
    //   1755: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1758: ldc_w 810
    //   1761: new 812	com/tencent/mm/app/q
    //   1764: dup
    //   1765: aload_0
    //   1766: invokespecial 813	com/tencent/mm/app/q:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1769: invokeinterface 604 3 0
    //   1774: pop
    //   1775: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1778: ldc_w 815
    //   1781: new 817	com/tencent/mm/app/r
    //   1784: dup
    //   1785: aload_0
    //   1786: invokespecial 818	com/tencent/mm/app/r:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1789: invokeinterface 604 3 0
    //   1794: pop
    //   1795: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1798: ldc_w 820
    //   1801: new 822	com/tencent/mm/app/s
    //   1804: dup
    //   1805: aload_0
    //   1806: invokespecial 823	com/tencent/mm/app/s:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1809: invokeinterface 604 3 0
    //   1814: pop
    //   1815: invokestatic 242	com/tencent/mm/sdk/c/a:aGB	()Lcom/tencent/mm/sdk/c/f;
    //   1818: ldc_w 825
    //   1821: new 827	com/tencent/mm/app/t
    //   1824: dup
    //   1825: aload_0
    //   1826: invokespecial 828	com/tencent/mm/app/t:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1829: invokeinterface 604 3 0
    //   1834: pop
    //   1835: new 830	com/tencent/mm/app/v
    //   1838: dup
    //   1839: aload_0
    //   1840: invokespecial 831	com/tencent/mm/app/v:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1843: invokestatic 834	com/tencent/mm/pluginsdk/g:a	(Lcom/tencent/mm/pluginsdk/k;)V
    //   1846: new 836	com/tencent/mm/app/w
    //   1849: dup
    //   1850: aload_0
    //   1851: invokespecial 837	com/tencent/mm/app/w:<init>	(Lcom/tencent/mm/app/WorkerProfile;)V
    //   1854: invokestatic 840	com/tencent/mm/pluginsdk/g:a	(Lcom/tencent/mm/pluginsdk/m;)V
    //   1857: new 842	com/tencent/mm/ui/transmit/ae
    //   1860: dup
    //   1861: invokespecial 843	com/tencent/mm/ui/transmit/ae:<init>	()V
    //   1864: invokestatic 846	com/tencent/mm/pluginsdk/g:a	(Lcom/tencent/mm/pluginsdk/n;)V
    //   1867: iload_1
    //   1868: ifeq +7 -> 1875
    //   1871: invokestatic 850	com/tencent/mm/model/bg:qW	()Lcom/tencent/mm/model/b;
    //   1874: pop
    //   1875: aload_0
    //   1876: invokevirtual 853	com/tencent/mm/app/WorkerProfile:ie	()V
    //   1879: ldc 168
    //   1881: new 57	java/lang/StringBuilder
    //   1884: dup
    //   1885: ldc_w 855
    //   1888: invokespecial 588	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1891: invokestatic 293	java/lang/System:currentTimeMillis	()J
    //   1894: lload_3
    //   1895: lsub
    //   1896: invokevirtual 858	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1899: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1902: invokestatic 860	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   1905: iconst_1
    //   1906: ireturn
    //   1907: aload_0
    //   1908: monitorexit
    //   1909: iconst_0
    //   1910: ireturn
    //   1911: astore 5
    //   1913: aload_0
    //   1914: monitorexit
    //   1915: aload 5
    //   1917: athrow
    //   1918: astore 34
    //   1920: ldc 168
    //   1922: ldc_w 862
    //   1925: invokestatic 865	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1928: goto -1319 -> 609
    //   1931: astore 13
    //   1933: iconst_1
    //   1934: anewarray 166	java/lang/Object
    //   1937: astore 14
    //   1939: aload 14
    //   1941: iconst_0
    //   1942: aload 13
    //   1944: invokevirtual 868	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1947: aastore
    //   1948: ldc 168
    //   1950: ldc_w 870
    //   1953: aload 14
    //   1955: invokestatic 872	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1958: goto -1349 -> 609
    //   1961: getstatic 537	com/tencent/mm/sdk/platformtools/l:cFp	Ljava/lang/String;
    //   1964: astore 17
    //   1966: goto -1286 -> 680
    //
    // Exception table:
    //   from	to	target	type
    //   46	58	1911	finally
    //   1907	1909	1911	finally
    //   275	297	1918	android/content/pm/PackageManager$NameNotFoundException
    //   302	348	1918	android/content/pm/PackageManager$NameNotFoundException
    //   348	396	1918	android/content/pm/PackageManager$NameNotFoundException
    //   396	421	1918	android/content/pm/PackageManager$NameNotFoundException
    //   421	443	1918	android/content/pm/PackageManager$NameNotFoundException
    //   443	465	1918	android/content/pm/PackageManager$NameNotFoundException
    //   465	513	1918	android/content/pm/PackageManager$NameNotFoundException
    //   513	561	1918	android/content/pm/PackageManager$NameNotFoundException
    //   561	609	1918	android/content/pm/PackageManager$NameNotFoundException
    //   275	297	1931	java/lang/Exception
    //   302	348	1931	java/lang/Exception
    //   348	396	1931	java/lang/Exception
    //   396	421	1931	java/lang/Exception
    //   421	443	1931	java/lang/Exception
    //   443	465	1931	java/lang/Exception
    //   465	513	1931	java/lang/Exception
    //   513	561	1931	java/lang/Exception
    //   561	609	1931	java/lang/Exception
  }

  public final aq a(String paramString, Context paramContext)
  {
    if ((paramString == null) || (paramString.equals("")))
      return null;
    aq localaq = new aq();
    if (paramString.equals("qqsync"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOp);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOq);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOr);
      return localaq;
    }
    if (paramString.equals("floatbottle"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNs);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNt);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNu);
      return localaq;
    }
    if (paramString.equals("shakeapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOy);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOz);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOA);
      return localaq;
    }
    if (paramString.equals("lbsapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNN);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNO);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNP);
      return localaq;
    }
    if (paramString.equals("medianote"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNW);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNX);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNY);
      return localaq;
    }
    if (paramString.equals("newsapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOs);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOt);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOu);
      return localaq;
    }
    if (paramString.equals("facebookapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNy);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNz);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNA);
      return localaq;
    }
    if (paramString.equals("qqfriend"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOh);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOi);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOj);
      return localaq;
    }
    if (paramString.equals("googlecontact"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNH);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNI);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNJ);
      return localaq;
    }
    if (paramString.equals("masssendapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNT);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNU);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNV);
      return localaq;
    }
    if (paramString.equals("feedsapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNB);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNC);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bND);
      return localaq;
    }
    if (paramString.equals("qmessage"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOg);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOn);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOo);
      return localaq;
    }
    if (paramString.equals("fmessage"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNE);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNF);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNG);
      return localaq;
    }
    if (paramString.equals("voipapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOH);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOI);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOJ);
      return localaq;
    }
    if (paramString.equals("officialaccounts"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOd);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOe);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOf);
      return localaq;
    }
    if (paramString.equals("helper_entry"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNK);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNL);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNM);
      return localaq;
    }
    if (paramString.equals("cardpackage"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNv);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNw);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNx);
      return localaq;
    }
    if (paramString.equals("voicevoipapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOK);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOL);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOM);
      return localaq;
    }
    if (paramString.equals("voiceinputapp"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOE);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOF);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOG);
      return localaq;
    }
    if (paramString.equals("qqmail"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bOk);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bOl);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bOm);
      return localaq;
    }
    if (paramString.equals("linkedinplugin"))
    {
      localaq.dkB = paramContext.getString(com.tencent.mm.n.bNQ);
      localaq.dkA = paramContext.getString(com.tencent.mm.n.bNR);
      localaq.dkC = paramContext.getString(com.tencent.mm.n.bNS);
      return localaq;
    }
    return null;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.d("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "broadcast " + paramString);
    if (!ch.jb(paramString))
    {
      t localt = new t();
      localt.cHt.type = 3;
      localt.cHt.cHv = paramString;
      com.tencent.mm.sdk.c.a.aGB().g(localt);
    }
    if ((bg.oE()) && (paramInt1 == 4) && (paramInt2 == -6) && (paramString != null) && (paramString.startsWith("autoauth_errmsg_")))
      if (NewTaskUI.baL() == null);
    do
    {
      do
      {
        return;
        Intent localIntent2 = new Intent();
        localIntent2.setClass(ak.getContext(), NewTaskUI.class).addFlags(268435456);
        ak.getContext().startActivity(localIntent2);
        return;
      }
      while ((paramInt1 != 4) || (paramInt2 != -213));
      fj localfj = new fj();
      localfj.cKH.status = 0;
      localfj.cKH.cKI = 3;
      com.tencent.mm.sdk.c.a.aGB().g(localfj);
    }
    while (AccountDeletedAlphaAlertUI.aZy() != null);
    Intent localIntent1 = new Intent();
    localIntent1.setClass(ak.getContext(), AccountDeletedAlphaAlertUI.class).addFlags(268435456);
    localIntent1.putExtra("errmsg", paramString);
    ak.getContext().startActivity(localIntent1);
  }

  public final void a(ah paramah)
  {
    this.cGL.add(paramah);
  }

  public final void aQ()
  {
    String str = cq.getProperty("system_property_key_locale");
    if ((str != null) && (str.length() > 0))
      this.locale = new Locale(str);
    try
    {
      if (!this.cGC)
      {
        this.cGH = true;
        return;
      }
      iq();
      return;
    }
    finally
    {
    }
  }

  public final void b(ah paramah)
  {
    this.cGL.remove(paramah);
  }

  public final void ie()
  {
    Iterator localIterator = this.cGL.iterator();
    while (localIterator.hasNext())
      ((ah)localIterator.next()).iv();
  }

  public final ar ig()
  {
    if (this.cGD == null)
      this.cGD = new u(this.dOv);
    return this.cGD;
  }

  public final w ih()
  {
    if (this.cGE == null)
      this.cGE = new x(this);
    return this.cGE;
  }

  public final an ii()
  {
    if (this.cGF == null)
      this.cGF = new com.tencent.mm.booter.i();
    return this.cGF;
  }

  public final com.tencent.mm.model.aj ij()
  {
    if (this.cGG == null)
      this.cGG = new com.tencent.mm.booter.a();
    return this.cGG;
  }

  public final Map ik()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(af.class.getName(), new af());
    localHashMap.put(com.tencent.mm.y.ap.class.getName(), new com.tencent.mm.y.ap());
    localHashMap.put(s.class.getName(), new s());
    localHashMap.put(r.class.getName(), new r());
    localHashMap.put(com.tencent.mm.v.m.class.getName(), new com.tencent.mm.v.m());
    localHashMap.put(com.tencent.mm.aj.l.class.getName(), new com.tencent.mm.aj.l());
    localHashMap.put(com.tencent.mm.ak.m.class.getName(), new com.tencent.mm.ak.m());
    localHashMap.put(bm.class.getName(), new bm());
    localHashMap.put(com.tencent.mm.k.i.class.getName(), new com.tencent.mm.k.i());
    localHashMap.put(com.tencent.mm.f.e.class.getName(), new com.tencent.mm.f.e());
    localHashMap.put(com.tencent.mm.pluginsdk.model.app.bf.class.getName(), new com.tencent.mm.pluginsdk.model.app.bf());
    localHashMap.put(q.class.getName(), new q());
    localHashMap.put(com.tencent.mm.ae.f.class.getName(), new com.tencent.mm.ae.f());
    localHashMap.put(aa.class.getName(), new aa());
    localHashMap.put(com.tencent.mm.plugin.voicereminder.a.f.class.getName(), new com.tencent.mm.plugin.voicereminder.a.f());
    localHashMap.put(com.tencent.mm.w.e.class.getName(), new com.tencent.mm.w.e());
    localHashMap.put(k.class.getName(), new k());
    localHashMap.put(az.class.getName(), new az());
    localHashMap.put(com.tencent.mm.jdbiz.g.class.getName(), new com.tencent.mm.jdbiz.g());
    com.tencent.mm.am.a.i("nearby", localHashMap);
    com.tencent.mm.am.a.i("brandservice", localHashMap);
    com.tencent.mm.am.a.i("wallet", localHashMap);
    com.tencent.mm.am.a.i("mall", localHashMap);
    com.tencent.mm.am.a.i("qqsync", localHashMap);
    com.tencent.mm.am.a.i("favorite", localHashMap);
    com.tencent.mm.am.a.i("scanner", localHashMap);
    com.tencent.mm.am.a.i("shake", localHashMap);
    com.tencent.mm.am.a.i("voip", localHashMap);
    com.tencent.mm.am.a.i("radar", localHashMap);
    com.tencent.mm.am.a.i("sns", localHashMap);
    com.tencent.mm.am.a.i("ext", localHashMap);
    com.tencent.mm.am.a.i("emoji", localHashMap);
    com.tencent.mm.am.a.i("emoticon", localHashMap);
    com.tencent.mm.am.a.i("accountsync", localHashMap);
    com.tencent.mm.am.a.i("qqmail", localHashMap);
    com.tencent.mm.am.a.i("readerapp", localHashMap);
    com.tencent.mm.am.a.i("talkroom", localHashMap);
    com.tencent.mm.am.a.i("game", localHashMap);
    com.tencent.mm.am.a.i("bottle", localHashMap);
    com.tencent.mm.am.a.i("masssend", localHashMap);
    com.tencent.mm.am.a.i("qmessage", localHashMap);
    com.tencent.mm.am.a.i("tmessage", localHashMap);
    com.tencent.mm.am.a.i("chatroom", localHashMap);
    com.tencent.mm.am.a.i("location", localHashMap);
    com.tencent.mm.am.a.i("clean", localHashMap);
    com.tencent.mm.am.a.i("watch", localHashMap);
    com.tencent.mm.am.a.i("safedevice", localHashMap);
    com.tencent.mm.am.a.i("card", localHashMap);
    com.tencent.mm.am.a.i("search", localHashMap);
    com.tencent.mm.am.a.i("translate", localHashMap);
    com.tencent.mm.am.a.i("extqlauncher", localHashMap);
    com.tencent.mm.am.a.i("nearlife", localHashMap);
    com.tencent.mm.am.a.i("webview", localHashMap);
    com.tencent.mm.am.a.i("exdevice", localHashMap);
    com.tencent.mm.am.a.i("freewifi", localHashMap);
    com.tencent.mm.am.a.i("freewifi", localHashMap);
    com.tencent.mm.am.a.i("pwdgroup", localHashMap);
    com.tencent.mm.am.a.i("gallery", localHashMap);
    com.tencent.mm.am.a.i("label", localHashMap);
    com.tencent.mm.am.a.i("address", localHashMap);
    com.tencent.mm.am.a.i("wxcredit", localHashMap);
    com.tencent.mm.am.a.i("offline", localHashMap);
    com.tencent.mm.am.a.i("recharge", localHashMap);
    com.tencent.mm.am.a.i("order", localHashMap);
    com.tencent.mm.am.a.i("product", localHashMap);
    com.tencent.mm.am.a.i("wallet_index", localHashMap);
    com.tencent.mm.am.a.i("remittance", localHashMap);
    com.tencent.mm.am.a.i("collect", localHashMap);
    com.tencent.mm.am.a.i("backup", localHashMap);
    com.tencent.mm.am.a.i("record", localHashMap);
    com.tencent.mm.am.a.i("webwx", localHashMap);
    return localHashMap;
  }

  public final List il()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new com.tencent.mm.s.c());
    localArrayList.add(new com.tencent.mm.s.f());
    localArrayList.add(new com.tencent.mm.s.d());
    localArrayList.add(new com.tencent.mm.s.e());
    localArrayList.add(new com.tencent.mm.s.a());
    localArrayList.add(new com.tencent.mm.s.b());
    localArrayList.add(new com.tencent.mm.s.g());
    return localArrayList;
  }

  public final com.tencent.mm.pluginsdk.d im()
  {
    return this.cGS;
  }

  public final boolean in()
  {
    try
    {
      boolean bool = this.cGC;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final ai io()
  {
    if (cGU == null)
      cGU = new ai(this, "initThread");
    return cGU;
  }

  public final boolean is()
  {
    return this.cGJ;
  }

  public final boolean it()
  {
    return this.cGI;
  }

  public final void onCreate()
  {
    long l = System.currentTimeMillis();
    this.cGK.ch(this.dOv);
    com.tencent.mm.compatible.g.o.a("stlport_shared", WorkerProfile.class.getClassLoader());
    if (cGz == null)
    {
      com.tencent.mm.model.bf.dkH.z("login_user_name", "");
      com.tencent.mm.booter.g localg = new com.tencent.mm.booter.g(this.dOv);
      cGz = localg;
      localg.kN();
    }
    Log.setLogImp(new o(this));
    com.tencent.mm.ui.e.f.bbM().setup();
    z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check onCreate proc:%s pid:%d" + cFO + Process.myPid());
    cGB = this;
    ComponentName localComponentName = ch.bM(ak.getContext());
    if ((localComponentName != null) && (localComponentName.getPackageName().equals(ak.getPackageName())) && (localComponentName.getClassName().equals(ak.aHf())))
    {
      this.cGI = true;
      this.cGJ = true;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = localComponentName.getPackageName();
      arrayOfObject3[1] = localComponentName.getClassName();
      z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", arrayOfObject3);
    }
    while (true)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(System.currentTimeMillis() - l);
      arrayOfObject1[1] = Boolean.valueOf(this.cGI);
      z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b", arrayOfObject1);
      return;
      z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check onCreate appOnCreate!");
      if ((localComponentName != null) && (!localComponentName.getPackageName().equals(ak.getPackageName())))
      {
        this.cGI = true;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localComponentName.getPackageName();
        arrayOfObject2[1] = localComponentName.getClassName();
        z.i("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "start time check currentActivity.getPackageName() :%s, currentActivity.getClassName(): %s", arrayOfObject2);
      }
      H(false);
    }
  }

  public final void onReportKVDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    com.tencent.mm.plugin.f.b.n localn = new com.tencent.mm.plugin.f.b.n(paramArrayOfByte1, paramArrayOfByte2);
    bg.qX().d(localn);
  }

  public final void onTerminate()
  {
    super.onTerminate();
    this.cGM.mf();
    this.cGM = null;
    this.cGK.ci(this.dOv);
  }

  public final String toString()
  {
    return cFO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile
 * JD-Core Version:    0.6.2
 */