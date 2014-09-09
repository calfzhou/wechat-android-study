package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.b.ab;
import oicq.wlogin_sdk.b.ah;
import oicq.wlogin_sdk.b.aj;
import oicq.wlogin_sdk.b.ak;
import oicq.wlogin_sdk.b.am;
import oicq.wlogin_sdk.b.ao;
import oicq.wlogin_sdk.b.b;
import oicq.wlogin_sdk.b.c;
import oicq.wlogin_sdk.b.h;
import oicq.wlogin_sdk.b.i;
import oicq.wlogin_sdk.b.j;
import oicq.wlogin_sdk.b.r;
import oicq.wlogin_sdk.b.z;

public final class l extends g
{
  public l(k paramk)
  {
    this.kjD = 2064;
    this.kjE = 9;
    this.kjG = paramk;
  }

  public final byte[] a(long paramLong1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte3)
  {
    int i = this.kjG.kjQ;
    this.kjG.kja = paramLong2;
    byte[] arrayOfByte1 = df(paramArrayOfByte2);
    if (arrayOfByte1 == null)
      return null;
    byte[] arrayOfByte2 = this.kjG.kjR;
    byte[] arrayOfByte3 = this.kjG.kjL.beQ();
    byte[] arrayOfByte4 = this.kjG.kjV;
    ao localao = new ao();
    b localb = new b();
    h localh = new h();
    r localr = new r();
    c localc = new c();
    i locali = new i();
    j localj = new j();
    oicq.wlogin_sdk.b.k localk = new oicq.wlogin_sdk.b.k();
    oicq.wlogin_sdk.b.f localf = new oicq.wlogin_sdk.b.f();
    z localz = new z();
    ab localab = new ab();
    ah localah = new ah();
    aj localaj = new aj();
    ak localak = new ak();
    am localam = new am();
    byte[] arrayOfByte5 = localao.a(522017402L, i, paramLong2, 0);
    byte[] arrayOfByte6 = localb.i(paramLong2, paramArrayOfByte1);
    this.kjG.kkg = de(arrayOfByte1);
    localh.u(arrayOfByte1, arrayOfByte1.length);
    byte[] arrayOfByte7 = localh.beN();
    oicq.wlogin_sdk.c.f.bS("req2 a1:", oicq.wlogin_sdk.c.f.dp(arrayOfByte7));
    byte[] arrayOfByte8 = localc.a(522017402L, 1L, i, 8256);
    byte[] arrayOfByte9 = locali.l(0, 1, 102400, 1);
    byte[] arrayOfByte10 = localr.a(paramInt1, paramInt2, null);
    byte[] arrayOfByte11 = localak.dl(this.kjG.kjR);
    int j = 7;
    byte[] arrayOfByte12 = new byte[0];
    byte[] arrayOfByte13 = new byte[0];
    byte[] arrayOfByte14 = new byte[0];
    byte[] arrayOfByte15 = new byte[0];
    if (paramArrayOfByte3.length > 0)
    {
      arrayOfByte12 = localj.di(paramArrayOfByte3);
      j = 8;
    }
    if (arrayOfByte2.length > 0)
      arrayOfByte13 = localk.dj(arrayOfByte2);
    byte[] arrayOfByte16 = localz.a(oicq.wlogin_sdk.c.f.bfm(), oicq.wlogin_sdk.c.f.bfn(), this.kjG.kjU, this.kjG.kjT, new byte[0], this.kjG.kjW);
    byte[] arrayOfByte17 = localab.a(this.kjG.kkb, this.kjG.kkc, this.kjG.kkd, this.kjG.kka, this.kjG.kjR);
    byte[] arrayOfByte18 = localam.a(522017402L, this.kjG.kjY, this.kjG.kjZ);
    byte[] arrayOfByte19 = this.kjG.kjI;
    byte[] arrayOfByte20 = localaj.a(arrayOfByte13, arrayOfByte16, arrayOfByte17, arrayOfByte18, arrayOfByte19);
    int k = j + 1;
    byte[] arrayOfByte21 = localah.dk(arrayOfByte4);
    int m = k + 1;
    byte[] arrayOfByte22;
    if (arrayOfByte3.length > 0)
    {
      arrayOfByte22 = localf.dh(arrayOfByte3);
      m++;
    }
    while (true)
    {
      byte[] arrayOfByte23 = new byte[0 + (arrayOfByte5.length + arrayOfByte6.length + arrayOfByte7.length + arrayOfByte10.length + arrayOfByte8.length + arrayOfByte9.length + arrayOfByte12.length + arrayOfByte20.length + arrayOfByte22.length + arrayOfByte21.length) + arrayOfByte11.length];
      System.arraycopy(arrayOfByte5, 0, arrayOfByte23, 0, arrayOfByte5.length);
      int n = 0 + arrayOfByte5.length;
      System.arraycopy(arrayOfByte6, 0, arrayOfByte23, n, arrayOfByte6.length);
      int i1 = n + arrayOfByte6.length;
      System.arraycopy(arrayOfByte7, 0, arrayOfByte23, i1, arrayOfByte7.length);
      int i2 = i1 + arrayOfByte7.length;
      System.arraycopy(arrayOfByte10, 0, arrayOfByte23, i2, arrayOfByte10.length);
      int i3 = i2 + arrayOfByte10.length;
      System.arraycopy(arrayOfByte8, 0, arrayOfByte23, i3, arrayOfByte8.length);
      int i4 = i3 + arrayOfByte8.length;
      System.arraycopy(arrayOfByte9, 0, arrayOfByte23, i4, arrayOfByte9.length);
      int i5 = i4 + arrayOfByte9.length;
      System.arraycopy(arrayOfByte12, 0, arrayOfByte23, i5, arrayOfByte12.length);
      int i6 = i5 + arrayOfByte12.length;
      System.arraycopy(arrayOfByte20, 0, arrayOfByte23, i6, arrayOfByte20.length);
      int i7 = i6 + arrayOfByte20.length;
      System.arraycopy(arrayOfByte21, 0, arrayOfByte23, i7, arrayOfByte21.length);
      int i8 = i7 + arrayOfByte21.length;
      System.arraycopy(arrayOfByte15, 0, arrayOfByte23, i8, 0);
      int i9 = i8 + 0;
      System.arraycopy(arrayOfByte22, 0, arrayOfByte23, i9, arrayOfByte22.length);
      System.arraycopy(arrayOfByte11, 0, arrayOfByte23, i9 + arrayOfByte22.length, arrayOfByte11.length);
      byte[] arrayOfByte24 = d(arrayOfByte23, this.kjE, m);
      a(this.kjy, this.kjD, kjz, paramLong2, this.kjA, this.kjB, i, this.kjC, arrayOfByte24);
      return beN();
      arrayOfByte22 = arrayOfByte14;
    }
  }

  public final byte[] a(long paramLong1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte4)
  {
    int i = this.kjG.kjQ;
    this.kjG.kja = paramLong2;
    oicq.wlogin_sdk.c.f.bS("IMEI", oicq.wlogin_sdk.c.f.dp(this.kjG.kjR));
    byte[] arrayOfByte1 = this.kjG.kjI;
    byte[] arrayOfByte2 = this.kjG.kjR;
    byte[] arrayOfByte3 = this.kjG.kjL.beQ();
    byte[] arrayOfByte4 = this.kjG.kjV;
    ao localao = new ao();
    b localb = new b();
    h localh = new h();
    r localr = new r();
    c localc = new c();
    i locali = new i();
    j localj = new j();
    oicq.wlogin_sdk.b.k localk = new oicq.wlogin_sdk.b.k();
    oicq.wlogin_sdk.b.f localf = new oicq.wlogin_sdk.b.f();
    z localz = new z();
    ab localab = new ab();
    ah localah = new ah();
    aj localaj = new aj();
    ak localak = new ak();
    am localam = new am();
    byte[] arrayOfByte5 = localao.a(522017402L, i, paramLong2, 0);
    byte[] arrayOfByte6 = localb.i(paramLong2, paramArrayOfByte1);
    byte[] arrayOfByte7 = localh.a(522017402L, i, paramLong2, paramArrayOfByte2, paramArrayOfByte1, paramArrayOfByte3, arrayOfByte1, this.kjG.kkc, this.kjG.kjR);
    this.kjG.kkg = de(localh.beQ());
    byte[] arrayOfByte8 = localc.a(522017402L, 1L, i, 8256);
    byte[] arrayOfByte9 = locali.l(0, 1, 102400, 1);
    byte[] arrayOfByte10 = localr.a(paramInt1, paramInt2, null);
    byte[] arrayOfByte11 = localak.dl(this.kjG.kjR);
    int j = 7;
    byte[] arrayOfByte12 = new byte[0];
    byte[] arrayOfByte13 = new byte[0];
    byte[] arrayOfByte14 = new byte[0];
    byte[] arrayOfByte15 = new byte[0];
    if (paramArrayOfByte4.length > 0)
    {
      arrayOfByte12 = localj.di(paramArrayOfByte4);
      j = 8;
    }
    if (arrayOfByte2.length > 0)
      arrayOfByte13 = localk.dj(arrayOfByte2);
    byte[] arrayOfByte16 = localz.a(oicq.wlogin_sdk.c.f.bfm(), oicq.wlogin_sdk.c.f.bfn(), this.kjG.kjU, this.kjG.kjT, new byte[0], this.kjG.kjW);
    byte[] arrayOfByte17 = localab.a(this.kjG.kkb, this.kjG.kkc, this.kjG.kkd, this.kjG.kka, this.kjG.kjR);
    byte[] arrayOfByte18 = localam.a(522017402L, this.kjG.kjY, this.kjG.kjZ);
    byte[] arrayOfByte19 = this.kjG.kjI;
    byte[] arrayOfByte20 = localaj.a(arrayOfByte13, arrayOfByte16, arrayOfByte17, arrayOfByte18, arrayOfByte19);
    int k = j + 1;
    byte[] arrayOfByte21 = localah.dk(arrayOfByte4);
    int m = k + 1;
    byte[] arrayOfByte22;
    if (arrayOfByte3.length > 0)
    {
      arrayOfByte22 = localf.dh(arrayOfByte3);
      m++;
    }
    while (true)
    {
      byte[] arrayOfByte23 = new byte[0 + (arrayOfByte5.length + arrayOfByte6.length + arrayOfByte7.length + arrayOfByte10.length + arrayOfByte8.length + arrayOfByte9.length + arrayOfByte12.length + arrayOfByte20.length + arrayOfByte22.length + arrayOfByte21.length) + arrayOfByte11.length];
      System.arraycopy(arrayOfByte5, 0, arrayOfByte23, 0, arrayOfByte5.length);
      int n = 0 + arrayOfByte5.length;
      System.arraycopy(arrayOfByte6, 0, arrayOfByte23, n, arrayOfByte6.length);
      int i1 = n + arrayOfByte6.length;
      System.arraycopy(arrayOfByte7, 0, arrayOfByte23, i1, arrayOfByte7.length);
      int i2 = i1 + arrayOfByte7.length;
      System.arraycopy(arrayOfByte10, 0, arrayOfByte23, i2, arrayOfByte10.length);
      int i3 = i2 + arrayOfByte10.length;
      System.arraycopy(arrayOfByte8, 0, arrayOfByte23, i3, arrayOfByte8.length);
      int i4 = i3 + arrayOfByte8.length;
      System.arraycopy(arrayOfByte9, 0, arrayOfByte23, i4, arrayOfByte9.length);
      int i5 = i4 + arrayOfByte9.length;
      System.arraycopy(arrayOfByte12, 0, arrayOfByte23, i5, arrayOfByte12.length);
      int i6 = i5 + arrayOfByte12.length;
      System.arraycopy(arrayOfByte20, 0, arrayOfByte23, i6, arrayOfByte20.length);
      int i7 = i6 + arrayOfByte20.length;
      System.arraycopy(arrayOfByte21, 0, arrayOfByte23, i7, arrayOfByte21.length);
      int i8 = i7 + arrayOfByte21.length;
      System.arraycopy(arrayOfByte15, 0, arrayOfByte23, i8, 0);
      int i9 = i8 + 0;
      System.arraycopy(arrayOfByte22, 0, arrayOfByte23, i9, arrayOfByte22.length);
      System.arraycopy(arrayOfByte11, 0, arrayOfByte23, i9 + arrayOfByte22.length, arrayOfByte11.length);
      byte[] arrayOfByte24 = d(arrayOfByte23, this.kjE, m);
      a(this.kjy, this.kjD, kjz, paramLong2, this.kjA, this.kjB, i, this.kjC, arrayOfByte24);
      return beN();
      arrayOfByte22 = arrayOfByte14;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.l
 * JD-Core Version:    0.6.2
 */