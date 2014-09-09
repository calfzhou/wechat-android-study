package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ad;
import java.util.ArrayList;
import java.util.List;

public class EmojiView extends ImageView
  implements az
{
  private static boolean hxR = true;
  private static long hxS = 0L;
  private static int hxT;
  private static cm hxX = new cm(new m());
  private final String dip = "lock_";
  private boolean dsv = true;
  private ad eAp;
  private volatile int emO = 0;
  private cm gQj = new n(this);
  private boolean hxU = true;
  private p hxV;
  private boolean hxW = false;
  private long hxY = 0L;
  private volatile int hxZ = 0;
  private int hya = 0;
  private volatile long hyb = 0L;
  private volatile long hyc = 0L;
  private ArrayList hyd = null;
  private String[] hye = null;
  private List hyf = null;
  private Bitmap hyg = null;
  private volatile boolean hyh = false;
  private long hyi;
  private boolean hyj;
  private boolean hyk = true;
  private Runnable hyl = new o(this);

  public EmojiView(Context paramContext)
  {
    this(paramContext, null);
  }

  public EmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    hxT = paramContext.getResources().getDimensionPixelSize(com.tencent.mm.g.Qr);
  }

  // ERROR //
  private void aAa()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 111
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   9: astore 4
    //   11: aload 4
    //   13: ifnonnull +7 -> 20
    //   16: ldc 111
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: getfield 144	com/tencent/mm/pluginsdk/ui/EmojiView:hyj	Z
    //   24: ifne +36 -> 60
    //   27: aload_0
    //   28: aload_0
    //   29: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   32: invokevirtual 119	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   35: getstatic 153	com/tencent/mm/h:Xv	I
    //   38: invokevirtual 157	android/content/res/Resources:getDrawable	(I)Landroid/graphics/drawable/Drawable;
    //   41: checkcast 159	android/graphics/drawable/BitmapDrawable
    //   44: invokevirtual 163	android/graphics/drawable/BitmapDrawable:getBitmap	()Landroid/graphics/Bitmap;
    //   47: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   50: ldc 111
    //   52: monitorexit
    //   53: return
    //   54: astore_3
    //   55: ldc 111
    //   57: monitorexit
    //   58: aload_3
    //   59: athrow
    //   60: aload_0
    //   61: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   64: getfield 172	com/tencent/mm/storage/ad:field_catalog	I
    //   67: getstatic 175	com/tencent/mm/storage/ad:iiU	I
    //   70: if_icmpne +269 -> 339
    //   73: aload_0
    //   74: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   77: ifnonnull +137 -> 214
    //   80: new 177	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 178	java/util/ArrayList:<init>	()V
    //   87: astore 15
    //   89: iload_1
    //   90: iconst_4
    //   91: if_icmpge +64 -> 155
    //   94: new 169	com/tencent/mm/storage/ad
    //   97: dup
    //   98: invokespecial 179	com/tencent/mm/storage/ad:<init>	()V
    //   101: astore 16
    //   103: aload 16
    //   105: new 181	java/lang/StringBuilder
    //   108: dup
    //   109: ldc 183
    //   111: invokespecial 186	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   114: iload_1
    //   115: invokevirtual 190	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   118: ldc 192
    //   120: invokevirtual 195	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: invokevirtual 199	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   126: putfield 202	com/tencent/mm/storage/ad:field_name	Ljava/lang/String;
    //   129: aload 16
    //   131: aload 16
    //   133: invokevirtual 205	com/tencent/mm/storage/ad:getName	()Ljava/lang/String;
    //   136: putfield 208	com/tencent/mm/storage/ad:field_md5	Ljava/lang/String;
    //   139: aload 15
    //   141: aload 16
    //   143: invokeinterface 214 2 0
    //   148: pop
    //   149: iinc 1 1
    //   152: goto -63 -> 89
    //   155: aload_0
    //   156: aload 15
    //   158: putfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   161: aload_0
    //   162: aload_0
    //   163: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   166: invokeinterface 218 1 0
    //   171: putfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   174: iconst_1
    //   175: anewarray 220	java/lang/Object
    //   178: astore 18
    //   180: aload 18
    //   182: iconst_0
    //   183: aload_0
    //   184: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   187: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   190: aastore
    //   191: ldc 228
    //   193: ldc 230
    //   195: aload 18
    //   197: invokestatic 236	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aload_0
    //   201: ldc2_w 237
    //   204: putfield 83	com/tencent/mm/pluginsdk/ui/EmojiView:hyc	J
    //   207: aload_0
    //   208: ldc2_w 237
    //   211: putfield 81	com/tencent/mm/pluginsdk/ui/EmojiView:hyb	J
    //   214: iconst_3
    //   215: aload_0
    //   216: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   219: imul
    //   220: istore 19
    //   222: aload_0
    //   223: getfield 93	com/tencent/mm/pluginsdk/ui/EmojiView:hyh	Z
    //   226: ifeq +75 -> 301
    //   229: aload_0
    //   230: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   233: iload 19
    //   235: if_icmpgt +66 -> 301
    //   238: aload_0
    //   239: aload_0
    //   240: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   243: aload_0
    //   244: invokespecial 241	com/tencent/mm/pluginsdk/ui/EmojiView:azZ	()I
    //   247: invokeinterface 245 2 0
    //   252: checkcast 169	com/tencent/mm/storage/ad
    //   255: aload_0
    //   256: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   259: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   262: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   265: aload_0
    //   266: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   269: iconst_1
    //   270: if_icmpne +8 -> 278
    //   273: aload_0
    //   274: iconst_1
    //   275: putfield 71	com/tencent/mm/pluginsdk/ui/EmojiView:hxW	Z
    //   278: aload_0
    //   279: getfield 95	com/tencent/mm/pluginsdk/ui/EmojiView:dsv	Z
    //   282: ifne +15 -> 297
    //   285: aload_0
    //   286: aload_0
    //   287: aload_0
    //   288: getfield 91	com/tencent/mm/pluginsdk/ui/EmojiView:hyg	Landroid/graphics/Bitmap;
    //   291: invokespecial 253	com/tencent/mm/pluginsdk/ui/EmojiView:j	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   294: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   297: ldc 111
    //   299: monitorexit
    //   300: return
    //   301: aload_0
    //   302: iconst_0
    //   303: putfield 93	com/tencent/mm/pluginsdk/ui/EmojiView:hyh	Z
    //   306: aload_0
    //   307: aload_0
    //   308: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   311: aload_0
    //   312: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   315: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   318: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   321: aload_0
    //   322: iconst_0
    //   323: putfield 71	com/tencent/mm/pluginsdk/ui/EmojiView:hxW	Z
    //   326: aload_0
    //   327: iconst_0
    //   328: putfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   331: goto -53 -> 278
    //   334: astore_2
    //   335: ldc 111
    //   337: monitorexit
    //   338: return
    //   339: aload_0
    //   340: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   343: getfield 172	com/tencent/mm/storage/ad:field_catalog	I
    //   346: getstatic 256	com/tencent/mm/storage/ad:iiT	I
    //   349: if_icmpne +221 -> 570
    //   352: aload_0
    //   353: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   356: ifnonnull +94 -> 450
    //   359: aload_0
    //   360: invokestatic 262	com/tencent/mm/pluginsdk/g:axR	()Lcom/tencent/mm/pluginsdk/i;
    //   363: aload_0
    //   364: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   367: getfield 172	com/tencent/mm/storage/ad:field_catalog	I
    //   370: invokeinterface 268 2 0
    //   375: putfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   378: aload_0
    //   379: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   382: ifnonnull +14 -> 396
    //   385: aload_0
    //   386: new 177	java/util/ArrayList
    //   389: dup
    //   390: invokespecial 178	java/util/ArrayList:<init>	()V
    //   393: putfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   396: aload_0
    //   397: aload_0
    //   398: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   401: invokeinterface 218 1 0
    //   406: putfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   409: iconst_1
    //   410: anewarray 220	java/lang/Object
    //   413: astore 14
    //   415: aload 14
    //   417: iconst_0
    //   418: aload_0
    //   419: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   422: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   425: aastore
    //   426: ldc 228
    //   428: ldc_w 270
    //   431: aload 14
    //   433: invokestatic 236	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   436: aload_0
    //   437: ldc2_w 271
    //   440: putfield 83	com/tencent/mm/pluginsdk/ui/EmojiView:hyc	J
    //   443: aload_0
    //   444: ldc2_w 271
    //   447: putfield 81	com/tencent/mm/pluginsdk/ui/EmojiView:hyb	J
    //   450: iconst_3
    //   451: aload_0
    //   452: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   455: imul
    //   456: istore 13
    //   458: aload_0
    //   459: getfield 93	com/tencent/mm/pluginsdk/ui/EmojiView:hyh	Z
    //   462: ifeq +75 -> 537
    //   465: aload_0
    //   466: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   469: iload 13
    //   471: if_icmpgt +66 -> 537
    //   474: aload_0
    //   475: aload_0
    //   476: getfield 89	com/tencent/mm/pluginsdk/ui/EmojiView:hyf	Ljava/util/List;
    //   479: aload_0
    //   480: invokespecial 241	com/tencent/mm/pluginsdk/ui/EmojiView:azZ	()I
    //   483: invokeinterface 245 2 0
    //   488: checkcast 169	com/tencent/mm/storage/ad
    //   491: aload_0
    //   492: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   495: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   498: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   501: aload_0
    //   502: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   505: iconst_1
    //   506: if_icmpne +8 -> 514
    //   509: aload_0
    //   510: iconst_1
    //   511: putfield 71	com/tencent/mm/pluginsdk/ui/EmojiView:hxW	Z
    //   514: aload_0
    //   515: getfield 95	com/tencent/mm/pluginsdk/ui/EmojiView:dsv	Z
    //   518: ifne +15 -> 533
    //   521: aload_0
    //   522: aload_0
    //   523: aload_0
    //   524: getfield 91	com/tencent/mm/pluginsdk/ui/EmojiView:hyg	Landroid/graphics/Bitmap;
    //   527: invokespecial 253	com/tencent/mm/pluginsdk/ui/EmojiView:j	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   530: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   533: ldc 111
    //   535: monitorexit
    //   536: return
    //   537: aload_0
    //   538: iconst_0
    //   539: putfield 93	com/tencent/mm/pluginsdk/ui/EmojiView:hyh	Z
    //   542: aload_0
    //   543: aload_0
    //   544: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   547: aload_0
    //   548: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   551: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   554: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   557: aload_0
    //   558: iconst_0
    //   559: putfield 71	com/tencent/mm/pluginsdk/ui/EmojiView:hxW	Z
    //   562: aload_0
    //   563: iconst_0
    //   564: putfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   567: goto -53 -> 514
    //   570: aload_0
    //   571: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   574: getfield 275	com/tencent/mm/storage/ad:field_type	I
    //   577: getstatic 278	com/tencent/mm/storage/ad:iiX	I
    //   580: if_icmpeq +16 -> 596
    //   583: aload_0
    //   584: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   587: getfield 275	com/tencent/mm/storage/ad:field_type	I
    //   590: getstatic 281	com/tencent/mm/storage/ad:ija	I
    //   593: if_icmpne -258 -> 335
    //   596: aload_0
    //   597: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   600: invokevirtual 284	com/tencent/mm/storage/ad:aJi	()Z
    //   603: ifne +61 -> 664
    //   606: invokestatic 262	com/tencent/mm/pluginsdk/g:axR	()Lcom/tencent/mm/pluginsdk/i;
    //   609: aload_0
    //   610: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   613: aload_0
    //   614: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   617: invokeinterface 287 3 0
    //   622: aload_0
    //   623: getfield 289	com/tencent/mm/pluginsdk/ui/EmojiView:hxV	Lcom/tencent/mm/pluginsdk/ui/p;
    //   626: ifnull +19 -> 645
    //   629: aload_0
    //   630: getfield 289	com/tencent/mm/pluginsdk/ui/EmojiView:hxV	Lcom/tencent/mm/pluginsdk/ui/p;
    //   633: aload_0
    //   634: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   637: invokeinterface 295 2 0
    //   642: ifeq +18 -> 660
    //   645: aload_0
    //   646: aload_0
    //   647: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   650: aload_0
    //   651: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   654: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   657: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   660: ldc 111
    //   662: monitorexit
    //   663: return
    //   664: aload_0
    //   665: getfield 289	com/tencent/mm/pluginsdk/ui/EmojiView:hxV	Lcom/tencent/mm/pluginsdk/ui/p;
    //   668: ifnull +16 -> 684
    //   671: aload_0
    //   672: getfield 289	com/tencent/mm/pluginsdk/ui/EmojiView:hxV	Lcom/tencent/mm/pluginsdk/ui/p;
    //   675: aload_0
    //   676: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   679: invokeinterface 299 2 0
    //   684: aload_0
    //   685: getfield 85	com/tencent/mm/pluginsdk/ui/EmojiView:hyd	Ljava/util/ArrayList;
    //   688: ifnull +10 -> 698
    //   691: aload_0
    //   692: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   695: ifne +182 -> 877
    //   698: aload_0
    //   699: new 177	java/util/ArrayList
    //   702: dup
    //   703: invokespecial 178	java/util/ArrayList:<init>	()V
    //   706: putfield 85	com/tencent/mm/pluginsdk/ui/EmojiView:hyd	Ljava/util/ArrayList;
    //   709: aload_0
    //   710: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   713: invokevirtual 302	com/tencent/mm/storage/ad:aJn	()Ljava/lang/String;
    //   716: astore 5
    //   718: ldc 228
    //   720: ldc_w 304
    //   723: iconst_1
    //   724: anewarray 220	java/lang/Object
    //   727: dup
    //   728: iconst_0
    //   729: aload 5
    //   731: aastore
    //   732: invokestatic 236	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   735: aload_0
    //   736: aload 5
    //   738: ldc_w 306
    //   741: invokevirtual 312	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   744: putfield 87	com/tencent/mm/pluginsdk/ui/EmojiView:hye	[Ljava/lang/String;
    //   747: aload_0
    //   748: getfield 87	com/tencent/mm/pluginsdk/ui/EmojiView:hye	[Ljava/lang/String;
    //   751: arraylength
    //   752: istore 6
    //   754: iload 6
    //   756: iconst_2
    //   757: if_icmpeq +7 -> 764
    //   760: ldc 111
    //   762: monitorexit
    //   763: return
    //   764: aload_0
    //   765: aload_0
    //   766: getfield 87	com/tencent/mm/pluginsdk/ui/EmojiView:hye	[Ljava/lang/String;
    //   769: iconst_0
    //   770: aaload
    //   771: invokestatic 316	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   774: putfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   777: aload_0
    //   778: getfield 87	com/tencent/mm/pluginsdk/ui/EmojiView:hye	[Ljava/lang/String;
    //   781: iconst_1
    //   782: aaload
    //   783: ldc_w 318
    //   786: invokevirtual 312	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   789: astore 7
    //   791: aload 7
    //   793: ifnull +13 -> 806
    //   796: aload 7
    //   798: arraylength
    //   799: aload_0
    //   800: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   803: if_icmpeq +15 -> 818
    //   806: ldc 228
    //   808: ldc_w 320
    //   811: invokestatic 324	com/tencent/mm/sdk/platformtools/z:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   814: ldc 111
    //   816: monitorexit
    //   817: return
    //   818: aload 7
    //   820: arraylength
    //   821: istore 8
    //   823: iconst_0
    //   824: istore 9
    //   826: iload 9
    //   828: iload 8
    //   830: if_icmpge +47 -> 877
    //   833: aload 7
    //   835: iload 9
    //   837: aaload
    //   838: invokestatic 329	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   841: invokevirtual 333	java/lang/Long:longValue	()J
    //   844: lstore 10
    //   846: lload 10
    //   848: lconst_0
    //   849: lcmp
    //   850: ifgt +8 -> 858
    //   853: ldc2_w 237
    //   856: lstore 10
    //   858: aload_0
    //   859: getfield 85	com/tencent/mm/pluginsdk/ui/EmojiView:hyd	Ljava/util/ArrayList;
    //   862: lload 10
    //   864: invokestatic 336	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   867: invokevirtual 337	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   870: pop
    //   871: iinc 9 1
    //   874: goto -48 -> 826
    //   877: aload_0
    //   878: aload_0
    //   879: getfield 85	com/tencent/mm/pluginsdk/ui/EmojiView:hyd	Ljava/util/ArrayList;
    //   882: aload_0
    //   883: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   886: aload_0
    //   887: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   890: irem
    //   891: invokevirtual 338	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   894: checkcast 326	java/lang/Long
    //   897: invokevirtual 333	java/lang/Long:longValue	()J
    //   900: putfield 81	com/tencent/mm/pluginsdk/ui/EmojiView:hyb	J
    //   903: aload_0
    //   904: aload_0
    //   905: getfield 85	com/tencent/mm/pluginsdk/ui/EmojiView:hyd	Ljava/util/ArrayList;
    //   908: iconst_1
    //   909: aload_0
    //   910: getfield 75	com/tencent/mm/pluginsdk/ui/EmojiView:emO	I
    //   913: iadd
    //   914: aload_0
    //   915: getfield 79	com/tencent/mm/pluginsdk/ui/EmojiView:hya	I
    //   918: irem
    //   919: invokevirtual 338	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   922: checkcast 326	java/lang/Long
    //   925: invokevirtual 333	java/lang/Long:longValue	()J
    //   928: putfield 83	com/tencent/mm/pluginsdk/ui/EmojiView:hyc	J
    //   931: aload_0
    //   932: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   935: getfield 172	com/tencent/mm/storage/ad:field_catalog	I
    //   938: getstatic 175	com/tencent/mm/storage/ad:iiU	I
    //   941: if_icmpne +66 -> 1007
    //   944: aload_0
    //   945: ldc2_w 237
    //   948: putfield 81	com/tencent/mm/pluginsdk/ui/EmojiView:hyb	J
    //   951: aload_0
    //   952: ldc2_w 237
    //   955: putfield 83	com/tencent/mm/pluginsdk/ui/EmojiView:hyc	J
    //   958: aload_0
    //   959: invokestatic 262	com/tencent/mm/pluginsdk/g:axR	()Lcom/tencent/mm/pluginsdk/i;
    //   962: aload_0
    //   963: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   966: aload_0
    //   967: invokespecial 241	com/tencent/mm/pluginsdk/ui/EmojiView:azZ	()I
    //   970: aload_0
    //   971: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   974: invokeinterface 341 4 0
    //   979: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   982: aload_0
    //   983: getfield 91	com/tencent/mm/pluginsdk/ui/EmojiView:hyg	Landroid/graphics/Bitmap;
    //   986: ifnonnull -651 -> 335
    //   989: aload_0
    //   990: aload_0
    //   991: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   994: aload_0
    //   995: invokevirtual 148	com/tencent/mm/pluginsdk/ui/EmojiView:getContext	()Landroid/content/Context;
    //   998: invokevirtual 249	com/tencent/mm/storage/ad:bS	(Landroid/content/Context;)Landroid/graphics/Bitmap;
    //   1001: invokevirtual 167	com/tencent/mm/pluginsdk/ui/EmojiView:k	(Landroid/graphics/Bitmap;)V
    //   1004: goto -669 -> 335
    //   1007: aload_0
    //   1008: getfield 142	com/tencent/mm/pluginsdk/ui/EmojiView:eAp	Lcom/tencent/mm/storage/ad;
    //   1011: getfield 172	com/tencent/mm/storage/ad:field_catalog	I
    //   1014: getstatic 256	com/tencent/mm/storage/ad:iiT	I
    //   1017: if_icmpne -59 -> 958
    //   1020: aload_0
    //   1021: ldc2_w 271
    //   1024: putfield 81	com/tencent/mm/pluginsdk/ui/EmojiView:hyb	J
    //   1027: aload_0
    //   1028: ldc2_w 271
    //   1031: putfield 83	com/tencent/mm/pluginsdk/ui/EmojiView:hyc	J
    //   1034: goto -76 -> 958
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	54	finally
    //   16	19	54	finally
    //   20	50	54	finally
    //   50	53	54	finally
    //   60	89	54	finally
    //   94	149	54	finally
    //   155	214	54	finally
    //   214	278	54	finally
    //   278	297	54	finally
    //   297	300	54	finally
    //   301	331	54	finally
    //   335	338	54	finally
    //   339	396	54	finally
    //   396	450	54	finally
    //   450	514	54	finally
    //   514	533	54	finally
    //   533	536	54	finally
    //   537	567	54	finally
    //   570	596	54	finally
    //   596	645	54	finally
    //   645	660	54	finally
    //   660	663	54	finally
    //   664	684	54	finally
    //   684	698	54	finally
    //   698	754	54	finally
    //   760	763	54	finally
    //   764	791	54	finally
    //   796	806	54	finally
    //   806	814	54	finally
    //   814	817	54	finally
    //   818	823	54	finally
    //   833	846	54	finally
    //   858	871	54	finally
    //   877	958	54	finally
    //   958	1004	54	finally
    //   1007	1034	54	finally
    //   5	11	334	java/lang/Exception
    //   20	50	334	java/lang/Exception
    //   60	89	334	java/lang/Exception
    //   94	149	334	java/lang/Exception
    //   155	214	334	java/lang/Exception
    //   214	278	334	java/lang/Exception
    //   278	297	334	java/lang/Exception
    //   301	331	334	java/lang/Exception
    //   339	396	334	java/lang/Exception
    //   396	450	334	java/lang/Exception
    //   450	514	334	java/lang/Exception
    //   514	533	334	java/lang/Exception
    //   537	567	334	java/lang/Exception
    //   570	596	334	java/lang/Exception
    //   596	645	334	java/lang/Exception
    //   645	660	334	java/lang/Exception
    //   664	684	334	java/lang/Exception
    //   684	698	334	java/lang/Exception
    //   698	754	334	java/lang/Exception
    //   764	791	334	java/lang/Exception
    //   796	806	334	java/lang/Exception
    //   806	814	334	java/lang/Exception
    //   818	823	334	java/lang/Exception
    //   833	846	334	java/lang/Exception
    //   858	871	334	java/lang/Exception
    //   877	958	334	java/lang/Exception
    //   958	1004	334	java/lang/Exception
    //   1007	1034	334	java/lang/Exception
  }

  public static void azW()
  {
    if (!hxR)
      return;
    hxR = false;
    hxX.removeMessages(2);
    hxX.sendEmptyMessageDelayed(2, 800L);
  }

  public static void azX()
  {
    hxS = 9223372036854775807L;
  }

  private int azZ()
  {
    if (this.hya <= 0)
    {
      Object[] arrayOfObject = new Object[3];
      int j;
      if (this.hyf == null)
      {
        j = -1;
        arrayOfObject[0] = Integer.valueOf(j);
        arrayOfObject[1] = Integer.valueOf(this.emO);
        if (this.eAp != null)
          break label88;
      }
      label88: for (String str = "null emoji"; ; str = this.eAp.aJn())
      {
        arrayOfObject[2] = str;
        z.e("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "frameIdex < 0, emojiLis.size(): %d, frameIdx: %d, emojiFramesInfo: %s", arrayOfObject);
        throw new IllegalAccessError("getFrameIdex must >= 0");
        j = this.hyf.size();
        break;
      }
    }
    int i = this.emO;
    this.emO = (i + 1);
    return i % this.hya;
  }

  public static void cA(long paramLong)
  {
    if (paramLong < hxS)
      hxS = paramLong;
  }

  private Bitmap j(Bitmap paramBitmap)
  {
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
      return paramBitmap;
    Matrix localMatrix = new Matrix();
    localMatrix.preScale(-1.0F, 1.0F);
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, false);
    localBitmap.setDensity(a.fromDPToPix(getContext(), 160));
    if (paramBitmap != localBitmap)
      paramBitmap.recycle();
    return localBitmap;
  }

  public static int vm(String paramString)
  {
    return Math.abs(("emojiview_" + paramString).hashCode() / 2);
  }

  protected final void a(p paramp)
  {
    this.hxV = paramp;
  }

  public final void a(ad paramad, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramad == null);
    while (true)
    {
      try
      {
        z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "setEmojiInfo but emoji null!");
        this.eAp = paramad;
        return;
        z.d("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "setEmojiInfo");
        setId(vm(paramad.vu()));
        this.hyj = bg.qW().isSDCardAvailable();
        if (this.hyj)
          break;
        if ((paramad.field_catalog == ad.iiL) || (paramad.field_catalog == ad.iiU) || (paramad.field_catalog == ad.iiT))
        {
          k(paramad.bS(getContext()));
          this.hyh = false;
          requestLayout();
          invalidate();
          return;
        }
      }
      finally
      {
      }
      if ((!ch.jb(paramad.field_groupId)) && (!paramad.field_groupId.equals(String.valueOf(ab.iiI))) && (!paramad.field_groupId.equals(String.valueOf(ab.iiH))) && (!paramad.field_groupId.equals(String.valueOf(ab.iiJ))))
        k(paramad.bS(getContext()));
      else
        k(((BitmapDrawable)getContext().getResources().getDrawable(h.Xv)).getBitmap());
    }
    Bitmap localBitmap2;
    Object localObject3;
    label383: Bitmap localBitmap1;
    Object[] arrayOfObject1;
    if ((paramad == null) || ((this.eAp != null) && (this.eAp.vu() != null) && (this.eAp.vu().equals(paramad.vu())) && (this.hxY == paramLong)))
    {
      if ((paramad != null) && (paramad.avN()) && (!paramBoolean1))
      {
        localBitmap2 = paramad.bS(getContext());
        Object[] arrayOfObject2 = new Object[1];
        if (localBitmap2 != null)
          break label649;
        localObject3 = "null!";
        arrayOfObject2[0] = localObject3;
        z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "emoji is %s", arrayOfObject2);
        k(localBitmap2);
      }
    }
    else
    {
      this.eAp = paramad;
      this.hxY = paramLong;
      this.dsv = paramBoolean2;
      if ((paramad.avN()) || (paramad.field_type == ad.iiX) || (paramad.field_type == ad.ija))
        break label641;
      z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "emoji is not gif");
      localBitmap1 = paramad.bS(getContext());
      arrayOfObject1 = new Object[1];
      if (localBitmap1 != null)
        break label656;
    }
    label641: label649: label656: for (Object localObject2 = "null!"; ; localObject2 = localBitmap1)
    {
      arrayOfObject1[0] = localObject2;
      z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "emoji is %s", arrayOfObject1);
      k(localBitmap1);
      if (((paramad.field_catalog == ad.iiT) || (paramad.field_catalog == ad.iiU)) && (!paramBoolean2))
        k(j(this.hyg));
      this.hyh = false;
      if (this.hxV != null)
        this.hxV.f(paramad);
      this.gQj.removeMessages(1001);
      requestLayout();
      invalidate();
      return;
      z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", " emojiView UI reset same emoji.");
      return;
      do
      {
        z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "emoji is gif");
        this.hyh = true;
        this.emO = 0;
        this.hya = 0;
        this.hyb = 0L;
        this.hyc = 0L;
        if (paramad.field_catalog == ad.iiU)
        {
          this.hyb = 100L;
          this.hyc = 100L;
        }
        while (true)
        {
          z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "set duration to 0");
          this.hyf = null;
          aAa();
          this.hyi = 0L;
          break;
          if (paramad.field_catalog == ad.iiT)
          {
            this.hyb = 300L;
            this.hyc = 300L;
          }
        }
      }
      while (paramBoolean1);
      break label383;
      localObject3 = localBitmap2;
      break;
    }
  }

  public final void a(ad paramad, boolean paramBoolean)
  {
    this.hyk = false;
    h(paramad);
  }

  public final void aAb()
  {
    try
    {
      setImageDrawable(null);
      this.hyg = null;
      this.hxY = 0L;
      this.emO = 0;
      this.hya = 0;
      this.hyb = 0L;
      this.hyc = 0L;
      this.hyd = null;
      this.hye = null;
      this.hyf = null;
      this.hyg = null;
      this.hyh = false;
      this.dsv = true;
      this.hyk = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final ad aAc()
  {
    return this.eAp;
  }

  public final String aAd()
  {
    if (this.eAp != null)
      return this.eAp.vu();
    return null;
  }

  protected boolean azS()
  {
    return com.tencent.mm.pluginsdk.g.axR().MG();
  }

  protected void azT()
  {
  }

  protected boolean azU()
  {
    return true;
  }

  protected boolean azV()
  {
    return this.hxU;
  }

  public final void azY()
  {
    this.hxU = false;
  }

  public void draw(Canvas paramCanvas)
  {
    boolean bool = azS();
    int i;
    cm localcm;
    if ((this.hyh) && (bool))
    {
      if (System.currentTimeMillis() - this.hyi < this.hyb)
        break label82;
      i = 1;
      if (i != 0)
      {
        this.hyi = System.currentTimeMillis();
        localcm = this.gQj;
        if (this.hyc != 0L)
          break label87;
      }
    }
    label82: label87: for (long l = 100L; ; l = this.hyc)
    {
      localcm.sendEmptyMessageDelayed(1001, l);
      super.draw(paramCanvas);
      return;
      i = 0;
      break;
    }
  }

  public final void h(ad paramad)
  {
    a(paramad, 0L, true, true);
  }

  public final boolean isPlaying()
  {
    return this.hxW;
  }

  public final void k(Bitmap paramBitmap)
  {
    if (paramBitmap != null);
    while (true)
    {
      try
      {
        this.hyg = paramBitmap;
        return;
        if ((this.eAp == null) || (!this.eAp.aJg()))
          break label103;
        if ((this.hyk) && (Build.VERSION.SDK_INT >= 19))
        {
          z.d("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "user emo_loading_bg");
          this.hyg = ((BitmapDrawable)getContext().getResources().getDrawable(h.UF)).getBitmap();
          continue;
        }
      }
      finally
      {
      }
      this.hyg = this.eAp.bT(getContext());
      continue;
      label103: this.hyg = ((BitmapDrawable)getContext().getResources().getDrawable(h.VW)).getBitmap();
    }
  }

  public final boolean kJ()
  {
    return false;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.hyg != null) && (!this.hyg.isRecycled()))
    {
      int i = getRight() - getLeft() - getPaddingRight() - getPaddingLeft();
      int j = getBottom() - getTop() - getPaddingBottom() - getPaddingTop();
      int k = this.hyg.getWidth();
      int m = this.hyg.getHeight();
      double d1 = i / k;
      double d2 = j / m;
      Bitmap localBitmap = this.hyg;
      if ((azU()) && ((d1 < 1.0D) || (d2 < 1.0D)))
        setScaleType(ImageView.ScaleType.FIT_CENTER);
      if (!localBitmap.isRecycled())
        setImageBitmap(localBitmap);
      Drawable localDrawable = getDrawable();
      if ((localDrawable != null) && ((localDrawable instanceof BitmapDrawable)) && (((BitmapDrawable)localDrawable).getBitmap() != null) && (((BitmapDrawable)localDrawable).getBitmap().isRecycled()))
        z.e("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "Notice! EmojiView gonna draw a recycled bitmap!");
    }
    else
    {
      return;
    }
    super.onDraw(paramCanvas);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!azV())
    {
      super.onMeasure(paramInt1, paramInt2);
      azT();
      return;
    }
    int j;
    int i;
    if (this.hyg != null)
    {
      int k = getResources().getDisplayMetrics().densityDpi;
      j = resolveSize(this.hyg.getScaledWidth(k), paramInt1);
      i = resolveSize(this.hyg.getScaledHeight(k), paramInt2);
    }
    while (true)
    {
      if (j > hxT)
      {
        i = hxT;
        j = hxT;
      }
      setMeasuredDimension(j, i);
      azT();
      return;
      i = 0;
      j = 0;
    }
  }

  public final void refresh()
  {
    z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "refresh emoji view.");
    if (this.eAp == null)
    {
      z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "pre refresh emoji view failed. emoji is null. can't get md5");
      return;
    }
    this.eAp = com.tencent.mm.pluginsdk.g.axR().ly(this.eAp.vu());
    if (this.eAp == null)
    {
      z.i("!32@/B4Tb64lLpJyMm2sY0ucOYI4GPZJMWq0", "refresh emoji view failed. emoji is null.");
      return;
    }
    this.hyb = 0L;
    this.hyc = 0L;
    if (this.eAp.field_catalog == ad.iiU)
    {
      this.hyb = 100L;
      this.hyc = 100L;
    }
    while (true)
    {
      this.hyi = 0L;
      aAa();
      invalidate();
      return;
      if (this.eAp.field_catalog == ad.iiT)
      {
        this.hyb = 300L;
        this.hyc = 300L;
      }
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    this.hyg = paramBitmap;
  }

  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
  }

  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.EmojiView
 * JD-Core Version:    0.6.2
 */