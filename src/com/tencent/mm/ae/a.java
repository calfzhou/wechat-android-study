package com.tencent.mm.ae;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.mo;
import com.tencent.mm.protocal.a.mp;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.z;
import java.io.RandomAccessFile;

public final class a extends x
  implements ab
{
  private RandomAccessFile dAK;
  private int dAL;
  private m dlH;
  private int dny;
  private String filePath;
  private String url;

  public a(String paramString)
  {
    this.url = paramString;
    this.dAL = 0;
    this.dny = 0;
    this.filePath = null;
    this.dAK = null;
  }

  // ERROR //
  private boolean b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iload_3
    //   1: ifne +86 -> 87
    //   4: aload_0
    //   5: getfield 31	com/tencent/mm/ae/a:dAK	Ljava/io/RandomAccessFile;
    //   8: ifnonnull +10 -> 18
    //   11: aload_0
    //   12: getfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   15: ifnull +12 -> 27
    //   18: ldc 39
    //   20: ldc 41
    //   22: invokestatic 47	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: iconst_0
    //   26: ireturn
    //   27: aload_0
    //   28: aload_1
    //   29: invokestatic 53	com/tencent/mm/ae/b:hg	(Ljava/lang/String;)Ljava/lang/String;
    //   32: putfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   35: aload_0
    //   36: getfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   39: ifnonnull +31 -> 70
    //   42: ldc 39
    //   44: new 55	java/lang/StringBuilder
    //   47: dup
    //   48: ldc 57
    //   50: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   53: aload_1
    //   54: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc 65
    //   59: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokestatic 47	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: iconst_0
    //   69: ireturn
    //   70: aload_0
    //   71: new 71	java/io/RandomAccessFile
    //   74: dup
    //   75: aload_0
    //   76: getfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   79: ldc 73
    //   81: invokespecial 75	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   84: putfield 31	com/tencent/mm/ae/a:dAK	Ljava/io/RandomAccessFile;
    //   87: aload_0
    //   88: getfield 31	com/tencent/mm/ae/a:dAK	Ljava/io/RandomAccessFile;
    //   91: iload_3
    //   92: i2l
    //   93: invokevirtual 79	java/io/RandomAccessFile:seek	(J)V
    //   96: aload_0
    //   97: getfield 31	com/tencent/mm/ae/a:dAK	Ljava/io/RandomAccessFile;
    //   100: aload_2
    //   101: iconst_0
    //   102: aload_2
    //   103: arraylength
    //   104: invokevirtual 83	java/io/RandomAccessFile:write	([BII)V
    //   107: iconst_1
    //   108: ireturn
    //   109: astore 5
    //   111: ldc 39
    //   113: new 55	java/lang/StringBuilder
    //   116: dup
    //   117: ldc 85
    //   119: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_0
    //   123: getfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   126: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: ldc 87
    //   131: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 5
    //   136: invokevirtual 90	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 47	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: iconst_0
    //   149: ireturn
    //   150: astore 4
    //   152: ldc 39
    //   154: new 55	java/lang/StringBuilder
    //   157: dup
    //   158: ldc 92
    //   160: invokespecial 59	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: aload_0
    //   164: getfield 29	com/tencent/mm/ae/a:filePath	Ljava/lang/String;
    //   167: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: ldc 94
    //   172: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: aload 4
    //   177: invokevirtual 95	java/io/IOException:getMessage	()Ljava/lang/String;
    //   180: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: invokevirtual 69	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   186: invokestatic 47	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   189: iconst_0
    //   190: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   70	87	109	java/lang/Exception
    //   87	107	150	java/io/IOException
  }

  protected final int a(aj paramaj)
  {
    String str = ((mo)((com.tencent.mm.o.a)paramaj).sO()).URL;
    int i;
    if (str == null)
      i = 0;
    while (i == 0)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "security checked failed : url invalid:" + this.url);
      return aa.doN;
      if (str.indexOf("weixin://") != 0)
        i = 0;
      else
        i = 1;
    }
    if ((this.dAL < 0) || (this.dny < 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "security checked failed : offset:" + this.dAL + " total:" + this.dny);
      return aa.doN;
    }
    if (this.dAL == 0)
    {
      if (this.dny != 0)
      {
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "security checked failed : offset:" + this.dAL + " total:" + this.dny);
        return aa.doN;
      }
    }
    else if (this.dAL >= this.dny)
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "security checked failed : offset:" + this.dAL + " total:" + this.dny);
      return aa.doN;
    }
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new mo());
    localb.b(new mp());
    localb.fi("/cgi-bin/micromsg-bin/getpsmimg");
    localb.de(141);
    localb.df(29);
    localb.dg(1000000029);
    com.tencent.mm.o.a locala = localb.sU();
    mo localmo = (mo)locala.sO();
    localmo.URL = this.url;
    localmo.hQd = this.dAL;
    z.v("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "doscene url:[" + this.url + "] + offset:" + this.dAL + " totallen:" + this.dny);
    return a(paramr, locala, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      mp localmp = (mp)((com.tencent.mm.o.a)paramaj).sP();
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "onGYNetEnd url:[" + this.url + "] + offset:" + this.dAL + " Resp[ totallen:" + localmp.hSi + " bufSize:" + localmp.hQi.aLK() + " ]");
      if (localmp.hSi > 0)
        this.dny = localmp.hSi;
      if (!b(this.url, localmp.hQi.aLL().getBytes(), this.dAL))
      {
        this.dlH.a(3, -1, paramString, this);
        return;
      }
      this.dAL += localmp.hQi.aLK();
      if (this.dny <= this.dAL)
      {
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvtFpk2ZkkVShKVsTCvnvNdE=", "down url:[" + this.url + "] final size: " + this.dny);
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    while (a(tp(), this.dlH) >= 0);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 141;
  }

  public final String getUrl()
  {
    return this.url;
  }

  protected final int sB()
  {
    return 10;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ae.a
 * JD-Core Version:    0.6.2
 */