package com.tencent.mm.modelvoice;

import com.tencent.mm.ah.k;
import com.tencent.mm.compatible.audio.c;
import com.tencent.mm.compatible.audio.q;
import com.tencent.mm.compatible.g.l;
import com.tencent.mm.model.bg;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public class MediaRecorder
{
  public static final int[] dcX = { 13, 14, 16, 18, 20, 21, 27, 32 };
  private static long dde = 0L;
  private static Object ddf = new Object();
  private k dGA;
  private o dGB;
  private com.tencent.mm.ah.d dGC;
  private s dGD;
  private int dGE;
  private boolean dGF;
  private n dGy;
  private j dGz;
  private int dcZ;
  private String dda;
  private long ddc;
  private long ddd;
  private android.media.MediaRecorder ddg;
  private int ddh;
  private com.tencent.mm.compatible.audio.o ddi;
  private c ddj;
  private int ddl;
  private int ddm;
  private l ddn;
  private q ddo;

  // ERROR //
  public MediaRecorder(c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 53	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 60	com/tencent/mm/modelvoice/MediaRecorder:dcZ	I
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 62	com/tencent/mm/modelvoice/MediaRecorder:dda	Ljava/lang/String;
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield 64	com/tencent/mm/modelvoice/MediaRecorder:dGz	Lcom/tencent/mm/modelvoice/j;
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield 66	com/tencent/mm/modelvoice/MediaRecorder:dGA	Lcom/tencent/mm/ah/k;
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield 68	com/tencent/mm/modelvoice/MediaRecorder:dGB	Lcom/tencent/mm/modelvoice/o;
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 70	com/tencent/mm/modelvoice/MediaRecorder:dGC	Lcom/tencent/mm/ah/d;
    //   34: aload_0
    //   35: lconst_0
    //   36: putfield 72	com/tencent/mm/modelvoice/MediaRecorder:ddc	J
    //   39: aload_0
    //   40: lconst_0
    //   41: putfield 74	com/tencent/mm/modelvoice/MediaRecorder:ddd	J
    //   44: aload_0
    //   45: aconst_null
    //   46: putfield 76	com/tencent/mm/modelvoice/MediaRecorder:ddi	Lcom/tencent/mm/compatible/audio/o;
    //   49: aload_0
    //   50: sipush 8000
    //   53: putfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   56: aload_0
    //   57: sipush 16000
    //   60: putfield 80	com/tencent/mm/modelvoice/MediaRecorder:dGE	I
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 82	com/tencent/mm/modelvoice/MediaRecorder:dGF	Z
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 84	com/tencent/mm/modelvoice/MediaRecorder:ddm	I
    //   73: aload_0
    //   74: new 86	com/tencent/mm/compatible/g/l
    //   77: dup
    //   78: invokespecial 87	com/tencent/mm/compatible/g/l:<init>	()V
    //   81: putfield 89	com/tencent/mm/modelvoice/MediaRecorder:ddn	Lcom/tencent/mm/compatible/g/l;
    //   84: aload_0
    //   85: new 91	com/tencent/mm/modelvoice/h
    //   88: dup
    //   89: aload_0
    //   90: invokespecial 94	com/tencent/mm/modelvoice/h:<init>	(Lcom/tencent/mm/modelvoice/MediaRecorder;)V
    //   93: putfield 96	com/tencent/mm/modelvoice/MediaRecorder:ddo	Lcom/tencent/mm/compatible/audio/q;
    //   96: aload_0
    //   97: aload_1
    //   98: putfield 98	com/tencent/mm/modelvoice/MediaRecorder:ddj	Lcom/tencent/mm/compatible/audio/c;
    //   101: aload_1
    //   102: getstatic 103	com/tencent/mm/compatible/audio/c:dJI	Lcom/tencent/mm/compatible/audio/c;
    //   105: if_acmpne +21 -> 126
    //   108: aload_0
    //   109: bipush 7
    //   111: putfield 105	com/tencent/mm/modelvoice/MediaRecorder:ddh	I
    //   114: aload_0
    //   115: new 107	android/media/MediaRecorder
    //   118: dup
    //   119: invokespecial 108	android/media/MediaRecorder:<init>	()V
    //   122: putfield 110	com/tencent/mm/modelvoice/MediaRecorder:ddg	Landroid/media/MediaRecorder;
    //   125: return
    //   126: aload_0
    //   127: invokestatic 116	com/tencent/mm/ah/d:zP	()Lcom/tencent/mm/ah/d;
    //   130: putfield 70	com/tencent/mm/modelvoice/MediaRecorder:dGC	Lcom/tencent/mm/ah/d;
    //   133: aload_0
    //   134: getfield 70	com/tencent/mm/modelvoice/MediaRecorder:dGC	Lcom/tencent/mm/ah/d;
    //   137: ifnull +14 -> 151
    //   140: aload_0
    //   141: aload_0
    //   142: getfield 70	com/tencent/mm/modelvoice/MediaRecorder:dGC	Lcom/tencent/mm/ah/d;
    //   145: invokevirtual 120	com/tencent/mm/ah/d:zO	()Z
    //   148: putfield 82	com/tencent/mm/modelvoice/MediaRecorder:dGF	Z
    //   151: aload_0
    //   152: getfield 98	com/tencent/mm/modelvoice/MediaRecorder:ddj	Lcom/tencent/mm/compatible/audio/c;
    //   155: getstatic 123	com/tencent/mm/compatible/audio/c:dJJ	Lcom/tencent/mm/compatible/audio/c;
    //   158: if_acmpne +201 -> 359
    //   161: invokestatic 129	com/tencent/mm/f/e:or	()Lcom/tencent/mm/f/c;
    //   164: ldc 131
    //   166: invokevirtual 137	com/tencent/mm/f/c:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   169: astore 6
    //   171: aload_0
    //   172: aload 6
    //   174: sipush 16000
    //   177: invokestatic 143	com/tencent/mm/sdk/platformtools/ch:getInt	(Ljava/lang/String;I)I
    //   180: putfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   183: invokestatic 129	com/tencent/mm/f/e:or	()Lcom/tencent/mm/f/c;
    //   186: ldc 145
    //   188: invokevirtual 137	com/tencent/mm/f/c:getValue	(Ljava/lang/String;)Ljava/lang/String;
    //   191: astore 7
    //   193: aload_0
    //   194: aload 7
    //   196: sipush 16000
    //   199: invokestatic 143	com/tencent/mm/sdk/platformtools/ch:getInt	(Ljava/lang/String;I)I
    //   202: putfield 80	com/tencent/mm/modelvoice/MediaRecorder:dGE	I
    //   205: iconst_4
    //   206: anewarray 4	java/lang/Object
    //   209: astore 8
    //   211: aload 8
    //   213: iconst_0
    //   214: aload 6
    //   216: aastore
    //   217: aload 8
    //   219: iconst_1
    //   220: aload_0
    //   221: getfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   224: invokestatic 151	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   227: aastore
    //   228: aload 8
    //   230: iconst_2
    //   231: aload 7
    //   233: aastore
    //   234: aload 8
    //   236: iconst_3
    //   237: aload_0
    //   238: getfield 80	com/tencent/mm/modelvoice/MediaRecorder:dGE	I
    //   241: invokestatic 151	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: aastore
    //   245: ldc 153
    //   247: ldc 155
    //   249: aload 8
    //   251: invokestatic 161	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: aload_0
    //   255: iconst_0
    //   256: putfield 60	com/tencent/mm/modelvoice/MediaRecorder:dcZ	I
    //   259: aload_0
    //   260: aconst_null
    //   261: putfield 62	com/tencent/mm/modelvoice/MediaRecorder:dda	Ljava/lang/String;
    //   264: aload_0
    //   265: aconst_null
    //   266: putfield 64	com/tencent/mm/modelvoice/MediaRecorder:dGz	Lcom/tencent/mm/modelvoice/j;
    //   269: aload_0
    //   270: aconst_null
    //   271: putfield 66	com/tencent/mm/modelvoice/MediaRecorder:dGA	Lcom/tencent/mm/ah/k;
    //   274: aload_0
    //   275: aconst_null
    //   276: putfield 68	com/tencent/mm/modelvoice/MediaRecorder:dGB	Lcom/tencent/mm/modelvoice/o;
    //   279: ldc 153
    //   281: new 163	java/lang/StringBuilder
    //   284: dup
    //   285: ldc 165
    //   287: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   290: getstatic 55	com/tencent/mm/modelvoice/MediaRecorder:ddf	Ljava/lang/Object;
    //   293: invokevirtual 172	java/lang/Object:hashCode	()I
    //   296: invokevirtual 176	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   299: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   302: invokestatic 184	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   305: getstatic 55	com/tencent/mm/modelvoice/MediaRecorder:ddf	Ljava/lang/Object;
    //   308: astore 4
    //   310: aload 4
    //   312: monitorenter
    //   313: aload_0
    //   314: new 186	com/tencent/mm/compatible/audio/o
    //   317: dup
    //   318: aload_0
    //   319: getfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   322: bipush 120
    //   324: iconst_1
    //   325: iconst_0
    //   326: invokespecial 189	com/tencent/mm/compatible/audio/o:<init>	(IIZI)V
    //   329: putfield 76	com/tencent/mm/modelvoice/MediaRecorder:ddi	Lcom/tencent/mm/compatible/audio/o;
    //   332: aload_0
    //   333: getfield 76	com/tencent/mm/modelvoice/MediaRecorder:ddi	Lcom/tencent/mm/compatible/audio/o;
    //   336: aload_0
    //   337: getfield 96	com/tencent/mm/modelvoice/MediaRecorder:ddo	Lcom/tencent/mm/compatible/audio/q;
    //   340: invokevirtual 193	com/tencent/mm/compatible/audio/o:a	(Lcom/tencent/mm/compatible/audio/q;)V
    //   343: aload 4
    //   345: monitorexit
    //   346: aload_0
    //   347: getstatic 198	com/tencent/mm/modelvoice/s:dGS	Lcom/tencent/mm/modelvoice/s;
    //   350: putfield 200	com/tencent/mm/modelvoice/MediaRecorder:dGD	Lcom/tencent/mm/modelvoice/s;
    //   353: aload_0
    //   354: iconst_1
    //   355: putfield 105	com/tencent/mm/modelvoice/MediaRecorder:ddh	I
    //   358: return
    //   359: aload_0
    //   360: getfield 82	com/tencent/mm/modelvoice/MediaRecorder:dGF	Z
    //   363: ifeq +74 -> 437
    //   366: aload_0
    //   367: sipush 16000
    //   370: putfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   373: invokestatic 206	com/tencent/mm/model/bg:qP	()Lcom/tencent/mm/storage/d;
    //   376: bipush 27
    //   378: invokevirtual 212	com/tencent/mm/storage/d:get	(I)Ljava/lang/Object;
    //   381: checkcast 147	java/lang/Integer
    //   384: iconst_0
    //   385: invokestatic 215	com/tencent/mm/sdk/platformtools/ch:a	(Ljava/lang/Integer;I)I
    //   388: istore_2
    //   389: ldc 153
    //   391: new 163	java/lang/StringBuilder
    //   394: dup
    //   395: ldc 217
    //   397: invokespecial 168	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   400: aload_0
    //   401: getfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   404: invokevirtual 176	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   407: ldc 219
    //   409: invokevirtual 222	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: iload_2
    //   413: invokevirtual 176	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   416: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   419: invokestatic 224	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   422: iload_2
    //   423: iconst_1
    //   424: if_icmpne -170 -> 254
    //   427: aload_0
    //   428: sipush 8000
    //   431: putfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   434: goto -180 -> 254
    //   437: aload_0
    //   438: sipush 8000
    //   441: putfield 78	com/tencent/mm/modelvoice/MediaRecorder:ddl	I
    //   444: goto -71 -> 373
    //   447: astore 5
    //   449: aload 4
    //   451: monitorexit
    //   452: aload 5
    //   454: athrow
    //   455: astore_3
    //   456: aload_3
    //   457: invokevirtual 227	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   460: ifnull +22 -> 482
    //   463: ldc 153
    //   465: aload_3
    //   466: invokevirtual 227	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   469: invokestatic 230	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   472: aload_0
    //   473: getstatic 233	com/tencent/mm/modelvoice/s:dGV	Lcom/tencent/mm/modelvoice/s;
    //   476: putfield 200	com/tencent/mm/modelvoice/MediaRecorder:dGD	Lcom/tencent/mm/modelvoice/s;
    //   479: goto -126 -> 353
    //   482: ldc 153
    //   484: ldc 235
    //   486: invokestatic 230	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   489: goto -17 -> 472
    //
    // Exception table:
    //   from	to	target	type
    //   313	346	447	finally
    //   279	313	455	java/lang/Exception
    //   346	353	455	java/lang/Exception
    //   449	455	455	java/lang/Exception
  }

  public static native int SilkDecInit(int paramInt1, byte[] paramArrayOfByte, int paramInt2);

  public static native int SilkDecUnInit();

  public static native int SilkDoDec(byte[] paramArrayOfByte, short paramShort);

  public static native int SilkDoEnc(byte[] paramArrayOfByte1, short paramShort, byte[] paramArrayOfByte2, short[] paramArrayOfShort, boolean paramBoolean);

  public static native int SilkEncInit(int paramInt1, int paramInt2, int paramInt3);

  public static native int SilkEncUnInit();

  public static native int SilkGetEncSampleRate(byte[] paramArrayOfByte);

  private static native boolean native_init();

  private static native boolean native_pcm2amr(int paramInt1, byte[] paramArrayOfByte, int paramInt2, PByteArray paramPByteArray, int paramInt3);

  private static native boolean native_pcmresamp(byte[] paramArrayOfByte, int paramInt, PByteArray paramPByteArray);

  private static native boolean native_release();

  public final int Bg()
  {
    if (((this.ddj == c.dJH) || (this.ddj == c.dJJ)) && (this.ddi != null))
      return this.ddi.getState();
    return 1;
  }

  public final boolean Bh()
  {
    return this.ddj == c.dJH;
  }

  public final void Bi()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.setMaxDuration(70000);
      return;
    }
    this.ddc = 70000L;
  }

  public final void a(n paramn)
  {
    if (this.ddj == c.dJI)
      if (this.ddg != null);
    while (true)
    {
      return;
      this.dGy = paramn;
      this.ddg.setOnErrorListener(new g(this));
      this.dGD = s.dGV;
      return;
      try
      {
        if (this.dGD == s.dGS)
        {
          this.dGy = paramn;
          return;
        }
      }
      catch (Exception localException)
      {
        if (localException.getMessage() == null)
          break label87;
      }
    }
    z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", localException.getMessage());
    while (true)
    {
      this.dGD = s.dGV;
      return;
      label87: z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Unknown error occured while setting output path");
    }
  }

  public final int getMaxAmplitude()
  {
    if (this.ddj == c.dJI)
      if (this.ddg != null);
    while (this.dGD != s.dGU)
    {
      return 0;
      return this.ddg.getMaxAmplitude();
    }
    int i = this.dcZ;
    this.dcZ = 0;
    return i;
  }

  public final void ma()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setAudioEncoder(1);
  }

  public final void mb()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setAudioSource(1);
  }

  public final void mc()
  {
    if ((this.ddj != c.dJI) || (this.ddg == null))
      return;
    this.ddg.setOutputFormat(3);
  }

  public final boolean md()
  {
    if (this.ddj == c.dJI)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.ddg;
      z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "MediaRecorder stop RECMODE.AMR sysMediaRecorder:%s", arrayOfObject);
      if (this.ddg != null)
      {
        this.ddg.stop();
        this.ddg.release();
        this.ddg = null;
      }
      return true;
    }
    l locall = new l();
    z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Stop now  state:" + this.dGD);
    if (this.dGD != s.dGU)
    {
      z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "stop() called on illegal state");
      this.dGD = s.dGV;
      return true;
    }
    synchronized (ddf)
    {
      if (this.ddi != null)
      {
        this.ddi.lZ();
        this.ddi.a(null);
        long l1 = locall.nM();
        this.dGD = s.dGW;
        long l2 = locall.nM();
        if (this.dGz != null)
          this.dGz.mh();
        if (this.dGB != null)
          this.dGB.mh();
        if (this.dGA != null)
          this.dGA.stop();
        long l3 = ch.ac(this.ddd);
        z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "toNow " + l3 + " sStartTS " + this.ddd + " bufferLen " + dde);
        if ((l3 > 2000L) && (dde == 0L))
        {
          bg.qP().set(27, Integer.valueOf(1));
          z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "16k not suppourt");
        }
        z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Wait Stop Time Media:" + l1 + " Read:" + l2 + " Thr:" + locall.nM());
        return false;
      }
      z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Stop now  recorder:null");
    }
  }

  public final void prepare()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.prepare();
      return;
    }
    if ((this.dGD != s.dGS) || (this.dda == null))
    {
      this.dGD = s.dGV;
      release();
      return;
    }
    this.dGD = s.dGT;
  }

  public final void release()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.release();
      return;
    }
    if (this.dGD == s.dGU)
      md();
    while (true)
      synchronized (ddf)
      {
        if (this.ddi != null)
        {
          this.ddi.lZ();
          this.ddi = null;
        }
        return;
      }
  }

  public final void setOutputFile(String paramString)
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.setOutputFile(paramString);
      this.dda = paramString;
      return;
    }
    if (this.dGD == s.dGS)
    {
      this.dda = paramString;
      return;
    }
    this.dGD = s.dGV;
  }

  public final void start()
  {
    if (this.ddj == c.dJI)
    {
      if (this.ddg == null)
        return;
      this.ddg.start();
      return;
    }
    z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Start record now  state:" + this.dGD + " recMode:" + this.ddj);
    if (this.dGD == s.dGT)
    {
      this.ddd = System.currentTimeMillis();
      dde = 0L;
      this.dGD = s.dGU;
      while (true)
      {
        synchronized (ddf)
        {
          if (this.ddj == c.dJJ)
          {
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = this.dGD;
            arrayOfObject[1] = this.dGB;
            z.i("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "Start now  state:%s recMode:RECMODE.SILK silkWriter:%s", arrayOfObject);
            if (this.dGB == null)
            {
              int i = this.ddl;
              this.dGB = new o(i);
              this.dGB.im(this.dda);
            }
            this.ddi.mB();
            return;
          }
        }
        if (this.dGz == null)
        {
          this.dGz = new j();
          this.dGz.d(this.ddh, this.dda);
        }
      }
    }
    bg.qP().set(27, Integer.valueOf(1));
    z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", "start() called on illegal state");
    this.dGD = s.dGV;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.MediaRecorder
 * JD-Core Version:    0.6.2
 */