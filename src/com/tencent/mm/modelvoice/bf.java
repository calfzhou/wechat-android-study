package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;
import java.io.FileInputStream;

public final class bf
  implements d
{
  private com.tencent.qqpinyin.voicerecoapi.a dDF = null;
  private byte[] dIA = new byte[com.tencent.qqpinyin.voicerecoapi.a.kdr];
  private int dIB = 0;
  private FileInputStream dIC = null;
  private int dID = 314;
  private String dIg = "";
  private String dIh = "";
  private MediaPlayer.OnCompletionListener dIn = new bg(this);
  private MediaPlayer.OnErrorListener dIo = new bh(this);
  private AudioTrack dIq;
  private e dIr = null;
  private f dIs = null;
  private int dIt = 2;
  private int dIu = 1;
  private int dIv = 20;
  private Thread dIw;
  private int dIx;
  int dIy = 0;
  private boolean dIz = false;
  private int dcl = 16000;
  private com.tencent.mm.compatible.g.a ddJ;
  private String rI = "";
  private int status = 0;

  public bf()
  {
    int i = this.dDF.bdn();
    if (i != 0)
      z.e("speex", "res: " + i);
  }

  public bf(Context paramContext)
  {
    this();
    this.ddJ = new com.tencent.mm.compatible.g.a(paramContext);
  }

  // ERROR //
  private void ae(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 50	com/tencent/mm/modelvoice/bf:rI	Ljava/lang/String;
    //   6: invokestatic 149	com/tencent/mm/a/c:ac	(Ljava/lang/String;)Z
    //   9: ifne +4 -> 13
    //   12: return
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_1
    //   16: ifeq +5 -> 21
    //   19: iload_2
    //   20: istore_3
    //   21: getstatic 155	com/tencent/mm/compatible/c/v:dNC	Lcom/tencent/mm/compatible/c/a;
    //   24: getfield 160	com/tencent/mm/compatible/c/a:dLc	Z
    //   27: ifeq +241 -> 268
    //   30: getstatic 155	com/tencent/mm/compatible/c/v:dNC	Lcom/tencent/mm/compatible/c/a;
    //   33: invokevirtual 163	com/tencent/mm/compatible/c/a:dump	()V
    //   36: getstatic 155	com/tencent/mm/compatible/c/v:dNC	Lcom/tencent/mm/compatible/c/a;
    //   39: getfield 166	com/tencent/mm/compatible/c/a:dLj	I
    //   42: iconst_1
    //   43: if_icmpne +225 -> 268
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 60	com/tencent/mm/modelvoice/bf:dcl	I
    //   51: aload_0
    //   52: getfield 58	com/tencent/mm/modelvoice/bf:dIt	I
    //   55: iconst_2
    //   56: invokestatic 172	android/media/AudioTrack:getMinBufferSize	(III)I
    //   59: putfield 174	com/tencent/mm/modelvoice/bf:dIx	I
    //   62: aload_0
    //   63: getfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   66: ifnull +22 -> 88
    //   69: aload_0
    //   70: getfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   73: invokevirtual 179	android/media/AudioTrack:stop	()V
    //   76: aload_0
    //   77: getfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   80: invokevirtual 182	android/media/AudioTrack:release	()V
    //   83: aload_0
    //   84: aconst_null
    //   85: putfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   88: aload_0
    //   89: new 168	android/media/AudioTrack
    //   92: dup
    //   93: iload_2
    //   94: aload_0
    //   95: getfield 60	com/tencent/mm/modelvoice/bf:dcl	I
    //   98: aload_0
    //   99: getfield 58	com/tencent/mm/modelvoice/bf:dIt	I
    //   102: iconst_2
    //   103: bipush 8
    //   105: aload_0
    //   106: getfield 174	com/tencent/mm/modelvoice/bf:dIx	I
    //   109: imul
    //   110: iconst_1
    //   111: invokespecial 185	android/media/AudioTrack:<init>	(IIIIII)V
    //   114: putfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   117: aload_0
    //   118: iconst_2
    //   119: aload_0
    //   120: getfield 60	com/tencent/mm/modelvoice/bf:dcl	I
    //   123: sipush 1000
    //   126: idiv
    //   127: aload_0
    //   128: getfield 62	com/tencent/mm/modelvoice/bf:dIu	I
    //   131: imul
    //   132: aload_0
    //   133: getfield 64	com/tencent/mm/modelvoice/bf:dIv	I
    //   136: imul
    //   137: imul
    //   138: putfield 87	com/tencent/mm/modelvoice/bf:dID	I
    //   141: iload_1
    //   142: ifeq +18 -> 160
    //   145: aload_0
    //   146: getfield 135	com/tencent/mm/modelvoice/bf:ddJ	Lcom/tencent/mm/compatible/g/a;
    //   149: ifnull +11 -> 160
    //   152: aload_0
    //   153: getfield 135	com/tencent/mm/modelvoice/bf:ddJ	Lcom/tencent/mm/compatible/g/a;
    //   156: invokevirtual 189	com/tencent/mm/compatible/g/a:requestFocus	()Z
    //   159: pop
    //   160: aload_0
    //   161: getfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   164: astore 6
    //   166: aload 6
    //   168: ifnull -156 -> 12
    //   171: aload_0
    //   172: getfield 176	com/tencent/mm/modelvoice/bf:dIq	Landroid/media/AudioTrack;
    //   175: invokevirtual 192	android/media/AudioTrack:play	()V
    //   178: aload_0
    //   179: new 194	com/tencent/mm/modelvoice/bi
    //   182: dup
    //   183: aload_0
    //   184: invokespecial 195	com/tencent/mm/modelvoice/bi:<init>	(Lcom/tencent/mm/modelvoice/bf;)V
    //   187: putfield 197	com/tencent/mm/modelvoice/bf:dIw	Ljava/lang/Thread;
    //   190: aload_0
    //   191: getfield 197	com/tencent/mm/modelvoice/bf:dIw	Ljava/lang/Thread;
    //   194: invokevirtual 202	java/lang/Thread:start	()V
    //   197: return
    //   198: astore 4
    //   200: aload_0
    //   201: getfield 135	com/tencent/mm/modelvoice/bf:ddJ	Lcom/tencent/mm/compatible/g/a;
    //   204: ifnull +11 -> 215
    //   207: aload_0
    //   208: getfield 135	com/tencent/mm/modelvoice/bf:ddJ	Lcom/tencent/mm/compatible/g/a;
    //   211: invokevirtual 205	com/tencent/mm/compatible/g/a:nH	()Z
    //   214: pop
    //   215: ldc 207
    //   217: new 108	java/lang/StringBuilder
    //   220: dup
    //   221: ldc 209
    //   223: invokespecial 113	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload 4
    //   228: invokevirtual 212	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   231: invokevirtual 215	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   237: invokestatic 127	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: return
    //   241: astore 7
    //   243: iconst_1
    //   244: anewarray 4	java/lang/Object
    //   247: astore 8
    //   249: aload 8
    //   251: iconst_0
    //   252: aload 7
    //   254: invokevirtual 212	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   257: aastore
    //   258: ldc 207
    //   260: ldc 217
    //   262: aload 8
    //   264: invokestatic 220	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   267: return
    //   268: iload_3
    //   269: istore_2
    //   270: goto -224 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   21	46	198	java/lang/Exception
    //   46	88	198	java/lang/Exception
    //   88	141	198	java/lang/Exception
    //   145	160	198	java/lang/Exception
    //   160	166	198	java/lang/Exception
    //   178	197	198	java/lang/Exception
    //   243	267	198	java/lang/Exception
    //   171	178	241	java/lang/Exception
  }

  private boolean l(String paramString, boolean paramBoolean)
  {
    if (this.status != 0)
    {
      z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "startPlay error status:" + this.status);
      return false;
    }
    this.status = 1;
    this.rI = paramString;
    try
    {
      ae(paramBoolean);
      return true;
    }
    catch (Exception localException1)
    {
      try
      {
        ae(true);
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "startPlay File[" + this.rI + "] failed");
        this.status = -1;
      }
    }
    return false;
  }

  public final void U(boolean paramBoolean)
  {
    int i = 3;
    this.dIz = true;
    int j;
    if (this.dIu == 2)
    {
      this.dIt = i;
      this.dIx = AudioTrack.getMinBufferSize(this.dcl, this.dIt, 2);
      if (this.dIq != null)
      {
        this.dIq.stop();
        this.dIq.release();
        this.dIq = null;
      }
      if (!paramBoolean)
        break label143;
      j = i;
      if (!v.dNC.dLc)
        break label177;
      v.dNC.dump();
      if (v.dNC.dLj != 1)
        break label177;
    }
    while (true)
    {
      while (true)
      {
        this.dIq = new AudioTrack(i, this.dcl, this.dIt, 2, 8 * this.dIx, 1);
        try
        {
          this.dIq.play();
          this.dIz = false;
          return;
          this.dIt = 2;
          break;
          label143: j = 0;
        }
        catch (Exception localException)
        {
          while (true)
          {
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = localException.getMessage();
            z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "audioTrack error:%s", arrayOfObject);
          }
        }
      }
      label177: i = j;
    }
  }

  public final void a(e parame)
  {
    this.dIr = parame;
  }

  public final void a(f paramf)
  {
    this.dIs = paramf;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final boolean isPlaying()
  {
    return this.status == 1;
  }

  public final boolean j(String paramString, boolean paramBoolean)
  {
    return l(paramString, paramBoolean);
  }

  public final boolean md()
  {
    z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "stop  status:" + this.status);
    if (this.status != 1)
    {
      z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "stop  error status:" + this.status);
      return false;
    }
    this.status = 3;
    synchronized (this.dIg)
    {
      try
      {
        this.dIg.notify();
        return true;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }

  public final boolean pause()
  {
    if (this.status != 1)
      return false;
    this.status = 2;
    synchronized (this.dIh)
    {
      try
      {
        z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mOk.wait");
        long l = System.currentTimeMillis();
        this.dIh.wait();
        z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mOk.wait time:" + (System.currentTimeMillis() - l));
        return true;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }

  public final boolean tc()
  {
    if (this.status != 2)
      return false;
    this.status = 1;
    synchronized (this.dIg)
    {
      try
      {
        z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "before mpause.notify");
        this.dIg.notify();
        z.v("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "after mpause.notify");
        return true;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }

  public final double td()
  {
    return 0.0D;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bf
 * JD-Core Version:    0.6.2
 */