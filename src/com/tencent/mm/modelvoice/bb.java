package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;
import java.io.FileInputStream;

public final class bb
  implements d
{
  private static Object dIi = new Object();
  private static int dIj = -1;
  private static int dIk;
  private AudioTrack dHW;
  private Thread dHX;
  private com.tencent.mm.compatible.g.a dHY;
  private e dHZ = null;
  private f dIa = null;
  private int dIb = 2;
  private int dIc = 16000;
  private int dId = 0;
  private int dIe;
  private boolean dIf = false;
  private String dIg = "";
  private String dIh = "";
  private int dIl;
  private int dIm = 0;
  private MediaPlayer.OnCompletionListener dIn = new bc(this);
  private MediaPlayer.OnErrorListener dIo = new bd(this);
  private String mFileName = "";

  public bb()
  {
    dIj = 1 + dIj;
    this.dIl = dIj;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.dIl);
    z.d("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] new Instance", arrayOfObject);
  }

  public bb(Context paramContext)
  {
    this();
    this.dHY = new com.tencent.mm.compatible.g.a(paramContext);
  }

  private void ad(boolean paramBoolean)
  {
    int i = 3;
    this.dIe = AudioTrack.getMinBufferSize(this.dIc, this.dIb, 2);
    if (this.dHW != null)
    {
      this.dHW.stop();
      this.dHW.release();
      this.dHW = null;
    }
    int j;
    if (paramBoolean)
    {
      j = i;
      if (!v.dNC.dLc)
        break label110;
      v.dNC.dump();
      if (v.dNC.dLj != 1)
        break label110;
    }
    while (true)
    {
      this.dHW = new AudioTrack(i, this.dIc, this.dIb, 2, 8 * this.dIe, 1);
      return;
      j = 0;
      break;
      label110: i = j;
    }
  }

  // ERROR //
  private void ae(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	com/tencent/mm/modelvoice/bb:mFileName	Ljava/lang/String;
    //   4: invokestatic 168	com/tencent/mm/a/c:ac	(Ljava/lang/String;)Z
    //   7: ifne +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: iload_1
    //   13: invokespecial 170	com/tencent/mm/modelvoice/bb:ad	(Z)V
    //   16: iload_1
    //   17: ifeq +18 -> 35
    //   20: aload_0
    //   21: getfield 106	com/tencent/mm/modelvoice/bb:dHY	Lcom/tencent/mm/compatible/g/a;
    //   24: ifnull +11 -> 35
    //   27: aload_0
    //   28: getfield 106	com/tencent/mm/modelvoice/bb:dHY	Lcom/tencent/mm/compatible/g/a;
    //   31: invokevirtual 174	com/tencent/mm/compatible/g/a:requestFocus	()Z
    //   34: pop
    //   35: aload_0
    //   36: getfield 133	com/tencent/mm/modelvoice/bb:dHW	Landroid/media/AudioTrack;
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull -33 -> 10
    //   46: aload_0
    //   47: getfield 133	com/tencent/mm/modelvoice/bb:dHW	Landroid/media/AudioTrack;
    //   50: invokevirtual 177	android/media/AudioTrack:play	()V
    //   53: aload_0
    //   54: new 179	com/tencent/mm/modelvoice/be
    //   57: dup
    //   58: aload_0
    //   59: iconst_0
    //   60: invokespecial 182	com/tencent/mm/modelvoice/be:<init>	(Lcom/tencent/mm/modelvoice/bb;B)V
    //   63: putfield 184	com/tencent/mm/modelvoice/bb:dHX	Ljava/lang/Thread;
    //   66: aload_0
    //   67: getfield 184	com/tencent/mm/modelvoice/bb:dHX	Ljava/lang/Thread;
    //   70: invokevirtual 189	java/lang/Thread:start	()V
    //   73: return
    //   74: astore_2
    //   75: aload_0
    //   76: getfield 106	com/tencent/mm/modelvoice/bb:dHY	Lcom/tencent/mm/compatible/g/a;
    //   79: ifnull +11 -> 90
    //   82: aload_0
    //   83: getfield 106	com/tencent/mm/modelvoice/bb:dHY	Lcom/tencent/mm/compatible/g/a;
    //   86: invokevirtual 192	com/tencent/mm/compatible/g/a:nH	()Z
    //   89: pop
    //   90: ldc 90
    //   92: new 194	java/lang/StringBuilder
    //   95: dup
    //   96: ldc 196
    //   98: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload_2
    //   102: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   105: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokestatic 213	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   114: return
    //   115: astore 5
    //   117: iconst_1
    //   118: anewarray 4	java/lang/Object
    //   121: astore 6
    //   123: aload 6
    //   125: iconst_0
    //   126: aload 5
    //   128: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   131: aastore
    //   132: ldc 90
    //   134: ldc 215
    //   136: aload 6
    //   138: invokestatic 217	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: return
    //
    // Exception table:
    //   from	to	target	type
    //   11	16	74	java/lang/Exception
    //   20	35	74	java/lang/Exception
    //   35	41	74	java/lang/Exception
    //   53	73	74	java/lang/Exception
    //   117	141	74	java/lang/Exception
    //   46	53	115	java/lang/Exception
  }

  private void io(String paramString)
  {
    dIk = this.dIl;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.dIl);
    z.i("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] SilkDecInit", arrayOfObject1);
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString);
      int k = localFileInputStream.available();
      byte[] arrayOfByte2 = new byte[k];
      localFileInputStream.read(arrayOfByte2, 0, k);
      byte[] arrayOfByte3 = new byte[1];
      arrayOfByte3[0] = arrayOfByte2[0];
      this.dIc = MediaRecorder.SilkGetEncSampleRate(arrayOfByte3);
      MediaRecorder.SilkDecUnInit();
      MediaRecorder.SilkDecInit(this.dIc, arrayOfByte2, k);
      localFileInputStream.close();
      label103: Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(this.dIl);
      arrayOfObject2[1] = Integer.valueOf(this.dIm);
      z.d("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d] skip %d frames", arrayOfObject2);
      byte[] arrayOfByte1 = new byte[2 * AudioTrack.getMinBufferSize(this.dIc, 2, 2)];
      short s = (short)(20 * this.dIc / 1000);
      for (int i = 0; ; i++)
        if (i < this.dIm)
        {
          int j = MediaRecorder.SilkDoDec(arrayOfByte1, s);
          if (j <= 0)
          {
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Integer.valueOf(this.dIl);
            arrayOfObject3[1] = Integer.valueOf(j);
            z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "[%d], skip frame failed: %d", arrayOfObject3);
          }
        }
        else
        {
          return;
        }
    }
    catch (Exception localException)
    {
      break label103;
    }
  }

  // ERROR //
  private String ip(String paramString)
  {
    // Byte code:
    //   0: ldc 90
    //   2: ldc_w 274
    //   5: invokestatic 276	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   8: aload_0
    //   9: getfield 58	com/tencent/mm/modelvoice/bb:mFileName	Ljava/lang/String;
    //   12: invokestatic 168	com/tencent/mm/a/c:ac	(Ljava/lang/String;)Z
    //   15: ifne +31 -> 46
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: astore 12
    //   24: aload 12
    //   26: iconst_0
    //   27: aload_0
    //   28: getfield 58	com/tencent/mm/modelvoice/bb:mFileName	Ljava/lang/String;
    //   31: aastore
    //   32: ldc 90
    //   34: ldc_w 278
    //   37: aload 12
    //   39: invokestatic 217	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_1
    //   45: areturn
    //   46: aload_0
    //   47: aload_0
    //   48: getfield 54	com/tencent/mm/modelvoice/bb:dIc	I
    //   51: aload_0
    //   52: getfield 52	com/tencent/mm/modelvoice/bb:dIb	I
    //   55: iconst_2
    //   56: invokestatic 129	android/media/AudioTrack:getMinBufferSize	(III)I
    //   59: putfield 131	com/tencent/mm/modelvoice/bb:dIe	I
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: astore_3
    //   67: aload_3
    //   68: iconst_0
    //   69: aload_0
    //   70: getfield 131	com/tencent/mm/modelvoice/bb:dIe	I
    //   73: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   76: aastore
    //   77: ldc 90
    //   79: ldc_w 280
    //   82: aload_3
    //   83: invokestatic 98	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: ldc 90
    //   88: ldc_w 282
    //   91: invokestatic 276	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: bipush 240
    //   96: invokestatic 288	android/os/Process:setThreadPriority	(I)V
    //   99: aload_0
    //   100: getfield 54	com/tencent/mm/modelvoice/bb:dIc	I
    //   103: iconst_2
    //   104: iconst_2
    //   105: invokestatic 129	android/media/AudioTrack:getMinBufferSize	(III)I
    //   108: iconst_1
    //   109: ishl
    //   110: newarray byte
    //   112: astore 7
    //   114: bipush 20
    //   116: aload_0
    //   117: getfield 54	com/tencent/mm/modelvoice/bb:dIc	I
    //   120: imul
    //   121: sipush 1000
    //   124: idiv
    //   125: i2s
    //   126: istore 8
    //   128: new 290	java/io/FileOutputStream
    //   131: dup
    //   132: aload_1
    //   133: invokespecial 291	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   136: astore 5
    //   138: aload_0
    //   139: getfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   142: iconst_1
    //   143: if_icmpeq +11 -> 154
    //   146: aload_0
    //   147: getfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   150: iconst_2
    //   151: if_icmpne +116 -> 267
    //   154: aload 7
    //   156: iload 8
    //   158: invokestatic 266	com/tencent/mm/modelvoice/MediaRecorder:SilkDoDec	([BS)I
    //   161: istore 9
    //   163: iload 9
    //   165: ifge +56 -> 221
    //   168: aload_0
    //   169: iconst_0
    //   170: putfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   173: goto -35 -> 138
    //   176: astore 4
    //   178: ldc 90
    //   180: new 194	java/lang/StringBuilder
    //   183: dup
    //   184: ldc_w 293
    //   187: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload 4
    //   192: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   195: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokestatic 213	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   204: aload_0
    //   205: iconst_0
    //   206: putfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   209: aload 5
    //   211: ifnull +8 -> 219
    //   214: aload 5
    //   216: invokevirtual 294	java/io/FileOutputStream:close	()V
    //   219: aconst_null
    //   220: areturn
    //   221: aload_0
    //   222: getfield 62	com/tencent/mm/modelvoice/bb:dIf	Z
    //   225: ifeq +12 -> 237
    //   228: ldc2_w 295
    //   231: invokestatic 300	java/lang/Thread:sleep	(J)V
    //   234: goto -13 -> 221
    //   237: aload 5
    //   239: aload 7
    //   241: iconst_0
    //   242: iload 8
    //   244: iconst_2
    //   245: imul
    //   246: invokevirtual 304	java/io/FileOutputStream:write	([BII)V
    //   249: aload 5
    //   251: invokevirtual 307	java/io/FileOutputStream:flush	()V
    //   254: iload 9
    //   256: ifne -118 -> 138
    //   259: aload_0
    //   260: iconst_0
    //   261: putfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   264: goto -126 -> 138
    //   267: ldc 90
    //   269: ldc_w 309
    //   272: invokestatic 276	com/tencent/mm/sdk/platformtools/z:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   275: aload 5
    //   277: invokevirtual 294	java/io/FileOutputStream:close	()V
    //   280: invokestatic 253	com/tencent/mm/modelvoice/MediaRecorder:SilkDecUnInit	()I
    //   283: istore 10
    //   285: iconst_1
    //   286: anewarray 4	java/lang/Object
    //   289: astore 11
    //   291: aload 11
    //   293: iconst_0
    //   294: aload_0
    //   295: getfield 82	com/tencent/mm/modelvoice/bb:dIl	I
    //   298: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   301: aastore
    //   302: ldc 90
    //   304: ldc_w 311
    //   307: aload 11
    //   309: invokestatic 234	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: iload 10
    //   314: ifeq -270 -> 44
    //   317: ldc 90
    //   319: new 194	java/lang/StringBuilder
    //   322: dup
    //   323: ldc_w 313
    //   326: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   329: iload 10
    //   331: invokevirtual 316	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   334: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   337: invokestatic 213	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: aload_1
    //   341: areturn
    //   342: astore_2
    //   343: ldc 90
    //   345: new 194	java/lang/StringBuilder
    //   348: dup
    //   349: ldc_w 318
    //   352: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   355: aload_2
    //   356: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   359: invokevirtual 206	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: invokestatic 213	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   368: aconst_null
    //   369: areturn
    //   370: astore 6
    //   372: goto -153 -> 219
    //   375: astore 4
    //   377: aconst_null
    //   378: astore 5
    //   380: goto -202 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   138	154	176	java/lang/Exception
    //   154	163	176	java/lang/Exception
    //   168	173	176	java/lang/Exception
    //   221	234	176	java/lang/Exception
    //   237	254	176	java/lang/Exception
    //   259	264	176	java/lang/Exception
    //   267	280	176	java/lang/Exception
    //   46	86	342	java/lang/Exception
    //   178	209	342	java/lang/Exception
    //   214	219	342	java/lang/Exception
    //   280	312	342	java/lang/Exception
    //   317	340	342	java/lang/Exception
    //   214	219	370	java/io/IOException
    //   86	138	375	java/lang/Exception
  }

  private boolean l(String paramString, boolean paramBoolean)
  {
    if (this.dId != 0)
    {
      z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "startPlay error status:" + this.dId);
      return false;
    }
    this.dId = 1;
    this.mFileName = paramString;
    synchronized (dIi)
    {
      io(paramString);
    }
    try
    {
      ae(paramBoolean);
      return true;
      localObject2 = finally;
      throw localObject2;
    }
    catch (Exception localException1)
    {
      try
      {
        ae(true);
      }
      catch (Exception localException2)
      {
        z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "startPlay File[" + this.mFileName + "] failed");
        this.dId = -1;
      }
    }
    return false;
  }

  public final int Bx()
  {
    return this.dIc;
  }

  public final int By()
  {
    return this.dIb;
  }

  // ERROR //
  public final String S(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   4: ifeq +30 -> 34
    //   7: ldc 90
    //   9: new 194	java/lang/StringBuilder
    //   12: dup
    //   13: ldc_w 325
    //   16: invokespecial 198	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   23: invokevirtual 316	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   26: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   29: invokestatic 213	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aconst_null
    //   33: areturn
    //   34: aload_0
    //   35: iconst_1
    //   36: putfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   39: aload_0
    //   40: aload_1
    //   41: putfield 58	com/tencent/mm/modelvoice/bb:mFileName	Ljava/lang/String;
    //   44: new 236	java/io/FileInputStream
    //   47: dup
    //   48: aload_1
    //   49: invokespecial 237	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   52: astore_3
    //   53: aload_3
    //   54: invokevirtual 240	java/io/FileInputStream:available	()I
    //   57: istore 7
    //   59: iload 7
    //   61: newarray byte
    //   63: astore 8
    //   65: aload_3
    //   66: aload 8
    //   68: iconst_0
    //   69: iload 7
    //   71: invokevirtual 244	java/io/FileInputStream:read	([BII)I
    //   74: pop
    //   75: iconst_1
    //   76: newarray byte
    //   78: astore 10
    //   80: aload 10
    //   82: iconst_0
    //   83: aload 8
    //   85: iconst_0
    //   86: baload
    //   87: bastore
    //   88: aload_0
    //   89: aload 10
    //   91: invokestatic 250	com/tencent/mm/modelvoice/MediaRecorder:SilkGetEncSampleRate	([B)I
    //   94: putfield 54	com/tencent/mm/modelvoice/bb:dIc	I
    //   97: aload_0
    //   98: getfield 54	com/tencent/mm/modelvoice/bb:dIc	I
    //   101: aload 8
    //   103: iload 7
    //   105: invokestatic 257	com/tencent/mm/modelvoice/MediaRecorder:SilkDecInit	(I[BI)I
    //   108: pop
    //   109: iconst_1
    //   110: anewarray 4	java/lang/Object
    //   113: astore 12
    //   115: aload 12
    //   117: iconst_0
    //   118: aload_0
    //   119: getfield 82	com/tencent/mm/modelvoice/bb:dIl	I
    //   122: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: aastore
    //   126: ldc 90
    //   128: ldc_w 344
    //   131: aload 12
    //   133: invokestatic 234	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: aload_3
    //   137: invokevirtual 260	java/io/FileInputStream:close	()V
    //   140: aload_0
    //   141: aload_2
    //   142: invokespecial 346	com/tencent/mm/modelvoice/bb:ip	(Ljava/lang/String;)Ljava/lang/String;
    //   145: astore 13
    //   147: aload 13
    //   149: areturn
    //   150: astore 4
    //   152: aconst_null
    //   153: astore_3
    //   154: iconst_2
    //   155: anewarray 4	java/lang/Object
    //   158: astore 5
    //   160: aload 5
    //   162: iconst_0
    //   163: aload_0
    //   164: getfield 58	com/tencent/mm/modelvoice/bb:mFileName	Ljava/lang/String;
    //   167: aastore
    //   168: aload 5
    //   170: iconst_1
    //   171: aload 4
    //   173: invokevirtual 202	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   176: aastore
    //   177: ldc 90
    //   179: ldc_w 348
    //   182: aload 5
    //   184: invokestatic 217	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_0
    //   188: iconst_m1
    //   189: putfield 60	com/tencent/mm/modelvoice/bb:dId	I
    //   192: aload_3
    //   193: ifnull -161 -> 32
    //   196: aload_3
    //   197: invokevirtual 260	java/io/FileInputStream:close	()V
    //   200: aconst_null
    //   201: areturn
    //   202: astore 6
    //   204: aconst_null
    //   205: areturn
    //   206: astore 4
    //   208: goto -54 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   44	53	150	java/lang/Exception
    //   196	200	202	java/io/IOException
    //   53	147	206	java/lang/Exception
  }

  public final void U(boolean paramBoolean)
  {
    this.dIf = true;
    this.dIb = 2;
    ad(paramBoolean);
    try
    {
      this.dHW.play();
      this.dIf = false;
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getMessage();
        z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "audioTrack error:%s", arrayOfObject);
      }
    }
  }

  public final void a(e parame)
  {
    this.dHZ = parame;
  }

  public final void a(f paramf)
  {
    this.dIa = paramf;
  }

  public final int getStatus()
  {
    return this.dId;
  }

  public final boolean isPlaying()
  {
    return this.dId == 1;
  }

  public final boolean j(String paramString, boolean paramBoolean)
  {
    return l(paramString, paramBoolean);
  }

  public final boolean md()
  {
    z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "stop  status:" + this.dId);
    if (this.dId != 1)
    {
      z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "stop  error status:" + this.dId);
      return false;
    }
    this.dId = 3;
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
    if (this.dId != 1)
      return false;
    this.dId = 2;
    synchronized (this.dIh)
    {
      try
      {
        z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "before mOk.wait");
        long l = System.currentTimeMillis();
        this.dIh.wait();
        z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "after mOk.wait time:" + (System.currentTimeMillis() - l));
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
    if (this.dId != 2)
      return false;
    this.dId = 1;
    synchronized (this.dIg)
    {
      try
      {
        z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "before mpause.notify");
        this.dIg.notify();
        z.v("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "after mpause.notify");
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
 * Qualified Name:     com.tencent.mm.modelvoice.bb
 * JD-Core Version:    0.6.2
 */