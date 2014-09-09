package oicq.wlogin_sdk.a;

import java.lang.reflect.Array;
import oicq.wlogin_sdk.b.aa;
import oicq.wlogin_sdk.b.ac;
import oicq.wlogin_sdk.b.ad;
import oicq.wlogin_sdk.b.ae;
import oicq.wlogin_sdk.b.af;
import oicq.wlogin_sdk.b.ag;
import oicq.wlogin_sdk.b.ai;
import oicq.wlogin_sdk.b.al;
import oicq.wlogin_sdk.b.an;
import oicq.wlogin_sdk.b.aq;
import oicq.wlogin_sdk.b.d;
import oicq.wlogin_sdk.b.h;
import oicq.wlogin_sdk.b.j;
import oicq.wlogin_sdk.b.l;
import oicq.wlogin_sdk.b.m;
import oicq.wlogin_sdk.b.n;
import oicq.wlogin_sdk.b.o;
import oicq.wlogin_sdk.b.p;
import oicq.wlogin_sdk.b.q;
import oicq.wlogin_sdk.b.s;
import oicq.wlogin_sdk.b.t;
import oicq.wlogin_sdk.b.u;
import oicq.wlogin_sdk.b.v;
import oicq.wlogin_sdk.b.w;
import oicq.wlogin_sdk.b.x;
import oicq.wlogin_sdk.b.y;
import oicq.wlogin_sdk.c.b;

public class g
{
  protected static int kjz = 0;
  protected int kjA = 0;
  protected int kjB = 0;
  protected int kjC = 0;
  protected int kjD = 0;
  protected int kjE = 0;
  byte kjF;
  protected k kjG;
  int kjr = 4096;
  int kjs = 0;
  int kjt = 27;
  int kju = 0;
  public int kjv = 15;
  protected int kjw = 0;
  protected byte[] kjx = new byte[this.kjr];
  protected int kjy = 8001;

  private int a(s params)
  {
    long l1 = 4294967295L;
    o localo = new o();
    p localp = new p();
    l locall = new l();
    q localq = new q();
    oicq.wlogin_sdk.b.e locale = new oicq.wlogin_sdk.b.e();
    t localt = new t();
    d locald = new d();
    m localm = new m();
    u localu = new u();
    v localv = new v();
    x localx = new x();
    y localy = new y();
    j localj = new j();
    h localh = new h();
    n localn = new n();
    aa localaa = new aa();
    w localw = new w();
    ag localag = new ag();
    ac localac = new ac();
    ai localai = new ai();
    aq localaq = new aq();
    an localan = new an();
    ad localad = new ad();
    ae localae = new ae();
    af localaf = new af();
    byte[] arrayOfByte1 = params.beQ();
    int i = arrayOfByte1.length;
    localo.h(arrayOfByte1, 2, i);
    localp.h(arrayOfByte1, 2, i);
    locall.h(arrayOfByte1, 2, i);
    localq.h(arrayOfByte1, 2, i);
    int j = localt.h(arrayOfByte1, 2, i);
    if (j < 0)
      return j;
    int k = locale.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte2 = null;
    if (k >= 0)
      arrayOfByte2 = locale.beQ();
    if (localj.h(arrayOfByte1, 2, i) >= 0)
      oicq.wlogin_sdk.c.f.a(this.kjG.kjp, localj.beQ());
    int m = locald.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte3 = null;
    if (m >= 0)
      arrayOfByte3 = locald.beQ();
    int n = localm.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte4 = null;
    if (n >= 0)
      arrayOfByte4 = localm.beQ();
    int i1 = localu.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte5 = null;
    if (i1 >= 0)
      arrayOfByte5 = localu.beQ();
    int i2 = localx.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte6 = null;
    if (i2 >= 0)
      arrayOfByte6 = localx.beQ();
    int i3 = localy.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte7 = null;
    if (i3 >= 0)
      arrayOfByte7 = localy.beQ();
    int i4 = localaa.h(arrayOfByte1, 2, i);
    byte[] arrayOfByte8 = null;
    byte[] arrayOfByte9 = null;
    if (i4 >= 0)
    {
      arrayOfByte8 = localaa.bfe();
      arrayOfByte9 = localaa.bff();
    }
    int[] arrayOfInt = { 8, 0 };
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, arrayOfInt);
    if (localad.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[0] = localad.beQ();
    if (localae.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[1] = localae.beQ();
    if (localaf.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[2] = localaf.beQ();
    int i5 = localn.h(arrayOfByte1, 2, i);
    if ((localh.h(arrayOfByte1, 2, i) >= 0) && (i5 >= 0))
    {
      this.kjG.kjI = localn.beQ();
      this.kjG.kkg = de(localh.beQ());
      arrayOfByte[3] = ((byte[])this.kjG.kkg.clone());
    }
    if (localac.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[4] = localac.bfg();
    if (localai.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[5] = localai.beQ();
    if (localaq.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[6] = localaq.beQ();
    if (localan.h(arrayOfByte1, 2, i) >= 0)
      arrayOfByte[7] = localan.beQ();
    long l5;
    if (localw.h(arrayOfByte1, 2, i) >= 0)
      if (this.kjG.kjP == -1L)
      {
        l5 = localw.bfc();
        l1 = 0xFFFFFFFF & localw.bfd();
      }
    for (long l2 = l5; ; l2 = 3600L)
    {
      if ((localag.h(arrayOfByte1, 2, i) >= 0) && (localag.bfh() != 0));
      for (long l3 = localag.bfh(); ; l3 = 2160000L)
      {
        if (l3 < l2);
        for (long l4 = l2; ; l4 = l3)
        {
          this.kjG.a(this.kjG.kja, this.kjG.kjN, l1, k.beP(), l2 + k.beP(), l4 + k.beP(), localt.beV(), localt.beW(), localt.beX(), localt.beY(), locall.beQ(), localo.beQ(), localq.beQ(), localp.beQ(), arrayOfByte2, arrayOfByte4, arrayOfByte3, arrayOfByte5, arrayOfByte6, arrayOfByte7, arrayOfByte8, arrayOfByte9, arrayOfByte);
          int i7;
          for (int i6 = 2; ; i6 = i7)
          {
            i7 = localv.h(arrayOfByte1, i6, i);
            if (i7 < 0)
            {
              return 0;
              l5 = this.kjG.kjP;
              break;
            }
            this.kjG.a(this.kjG.kja, localv.beZ(), k.beP(), l2 + k.beP(), localv.bfb(), localv.bfa());
          }
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, long paramLong, int paramInt4, int paramInt5, int paramInt6, int paramInt7, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = 1 + kjz;
    kjz = j;
    this.kjs = 0;
    oicq.wlogin_sdk.c.f.i(this.kjx, this.kjs, 2);
    this.kjs = (1 + this.kjs);
    oicq.wlogin_sdk.c.f.j(this.kjx, this.kjs, i + (2 + this.kjt));
    this.kjs = (2 + this.kjs);
    oicq.wlogin_sdk.c.f.j(this.kjx, this.kjs, paramInt1);
    this.kjs = (2 + this.kjs);
    oicq.wlogin_sdk.c.f.j(this.kjx, this.kjs, paramInt2);
    this.kjs = (2 + this.kjs);
    oicq.wlogin_sdk.c.f.j(this.kjx, this.kjs, j);
    this.kjs = (2 + this.kjs);
    oicq.wlogin_sdk.c.f.k(this.kjx, this.kjs, (int)paramLong);
    this.kjs = (4 + this.kjs);
    oicq.wlogin_sdk.c.f.i(this.kjx, this.kjs, 3);
    this.kjs = (1 + this.kjs);
    oicq.wlogin_sdk.c.f.i(this.kjx, this.kjs, 0);
    this.kjs = (1 + this.kjs);
    oicq.wlogin_sdk.c.f.i(this.kjx, this.kjs, paramInt4);
    this.kjs = (1 + this.kjs);
    oicq.wlogin_sdk.c.f.k(this.kjx, this.kjs, paramInt5);
    this.kjs = (4 + this.kjs);
    oicq.wlogin_sdk.c.f.k(this.kjx, this.kjs, paramInt6);
    this.kjs = (4 + this.kjs);
    oicq.wlogin_sdk.c.f.k(this.kjx, this.kjs, paramInt7);
    this.kjs = (4 + this.kjs);
    if (1 + (i + this.kjs) > this.kjr)
    {
      this.kjr = (128 + (1 + (i + this.kjs)));
      byte[] arrayOfByte = new byte[this.kjr];
      System.arraycopy(this.kjx, 0, arrayOfByte, 0, this.kjs);
      this.kjx = arrayOfByte;
    }
    System.arraycopy(paramArrayOfByte, 0, this.kjx, this.kjs, i);
    this.kjs = (i + this.kjs);
    oicq.wlogin_sdk.c.f.i(this.kjx, this.kjs, 3);
    this.kjs = (1 + this.kjs);
  }

  public final byte[] beN()
  {
    byte[] arrayOfByte = new byte[this.kjs];
    System.arraycopy(this.kjx, 0, arrayOfByte, 0, this.kjs);
    return arrayOfByte;
  }

  public final void beO()
  {
    this.kjG.kkf.bfl();
  }

  final byte[] d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte1 = new byte[4 + paramArrayOfByte.length];
    oicq.wlogin_sdk.c.f.j(arrayOfByte1, 0, paramInt1);
    oicq.wlogin_sdk.c.f.j(arrayOfByte1, 2, paramInt2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 4, paramArrayOfByte.length);
    byte[] arrayOfByte2 = oicq.wlogin_sdk.c.e.a(arrayOfByte1, arrayOfByte1.length, this.kjG.kjK);
    byte[] arrayOfByte3 = new byte[arrayOfByte2.length + this.kjG.kjK.length];
    System.arraycopy(this.kjG.kjK, 0, arrayOfByte3, 0, this.kjG.kjK.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, this.kjG.kjK.length, arrayOfByte2.length);
    return arrayOfByte3;
  }

  public final byte[] de(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + this.kjG.kjI.length];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    System.arraycopy(this.kjG.kjI, 0, arrayOfByte, paramArrayOfByte.length, this.kjG.kjI.length);
    return arrayOfByte;
  }

  public final byte[] df(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 16))
      return null;
    byte[] arrayOfByte1 = (byte[])paramArrayOfByte.clone();
    int i = -16 + arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
    this.kjG.kjI = new byte[16];
    System.arraycopy(arrayOfByte1, i, this.kjG.kjI, 0, 16);
    return arrayOfByte2;
  }

  public final void e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    al localal = new al();
    if (localal.h(paramArrayOfByte, paramInt1, paramInt2) >= 0)
    {
      this.kjG.kkf.setTitle(new String(localal.bfi()));
      this.kjG.kkf.setMessage(new String(localal.bfj()));
      this.kjG.kkf.DP(new String(localal.bfk()));
      return;
    }
    this.kjG.kkf.bfl();
  }

  public int f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    oicq.wlogin_sdk.b.f localf = new oicq.wlogin_sdk.b.f();
    oicq.wlogin_sdk.b.g localg = new oicq.wlogin_sdk.b.g();
    s locals = new s();
    int i;
    if ((this.kjD == 2064) && (this.kjE == 9))
      i = 0;
    while (paramInt2 < 5)
    {
      return -1009;
      if ((this.kjD == 2064) && (this.kjE == 10))
        i = 1;
      else if ((this.kjD == 2064) && (this.kjE == 2))
        i = 2;
      else
        return -1012;
    }
    int j = t(paramArrayOfByte, paramInt1 + 2);
    beO();
    int k = paramInt1 + 5;
    switch (j)
    {
    default:
      e(paramArrayOfByte, k, -1 + (this.kjs - k));
      return j;
    case 0:
      if (i == 1)
        if (this.kjG.kjJ == null)
          return -1006;
      for (int n = locals.a(paramArrayOfByte, k, -1 + (this.kjs - k), this.kjG.kjJ); n < 0; n = locals.a(paramArrayOfByte, k, -1 + (this.kjs - k), this.kjG.kjI))
      {
        oicq.wlogin_sdk.c.f.DS("119 can not decrypt, ret=" + n);
        return n;
      }
      int i1 = a(locals);
      if (i1 < 0)
      {
        oicq.wlogin_sdk.c.f.DS("parse 119 failed, ret=" + i1);
        return i1;
      }
      return 0;
    case 1:
      e(paramArrayOfByte, k, -1 + (this.kjs - k));
      return j;
    case 2:
    }
    int m = localf.h(paramArrayOfByte, k, -1 + (this.kjs - k));
    if (m >= 0)
    {
      this.kjG.kjL = localf;
      m = localg.h(paramArrayOfByte, k, -1 + (this.kjs - k));
      if (m >= 0)
      {
        this.kjG.kjM = localg;
        return j;
      }
    }
    return m;
  }

  public final int s(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1002;
    if (paramInt <= 2 + this.kjv)
      i = -1009;
    while (true)
    {
      return i;
      this.kjw = (-2 + (paramInt - this.kjv));
      if (paramInt > this.kjr)
      {
        this.kjr = (paramInt + 128);
        this.kjx = new byte[this.kjr];
      }
      this.kjs = paramInt;
      System.arraycopy(paramArrayOfByte, 0, this.kjx, 0, paramInt);
      byte[] arrayOfByte1 = this.kjx;
      int j = 1 + this.kjv;
      byte[] arrayOfByte2 = oicq.wlogin_sdk.c.e.decrypt(arrayOfByte1, j, this.kjw, this.kjG.kjK);
      if (arrayOfByte2 == null);
      for (int k = i; k >= 0; k = 0)
      {
        return f(this.kjx, 1 + this.kjv, this.kjw);
        this.kjw = arrayOfByte2.length;
        if (2 + (arrayOfByte2.length + this.kjv) > this.kjr)
        {
          this.kjr = (2 + (arrayOfByte2.length + this.kjv));
          byte[] arrayOfByte3 = new byte[this.kjr];
          System.arraycopy(this.kjx, 0, arrayOfByte3, 0, this.kjs);
          this.kjx = arrayOfByte3;
        }
        this.kjs = 0;
        System.arraycopy(arrayOfByte2, 0, this.kjx, j, arrayOfByte2.length);
        this.kjs += 2 + this.kjv + arrayOfByte2.length;
      }
    }
  }

  public final int t(byte[] paramArrayOfByte, int paramInt)
  {
    this.kjF = paramArrayOfByte[paramInt];
    return 0xFF & paramArrayOfByte[paramInt];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.g
 * JD-Core Version:    0.6.2
 */