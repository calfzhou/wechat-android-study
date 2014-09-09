package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.d;
import oicq.wlogin_sdk.c.e;
import oicq.wlogin_sdk.c.f;

public final class h extends a
{
  int kkQ = 1;
  int kkR = 1;
  int kkS = 69;

  public h()
  {
    this.kjD = 262;
    if (f.klO <= 2)
    {
      this.kkQ = 1;
      this.kkS = 69;
      return;
    }
    this.kkQ = 2;
    this.kkS = 90;
  }

  public final byte[] a(long paramLong1, int paramInt1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt2, byte[] paramArrayOfByte5)
  {
    if (f.klO <= 2)
    {
      byte[] arrayOfByte6 = new byte[this.kkS];
      f.j(arrayOfByte6, 0, this.kkQ);
      f.k(arrayOfByte6, 2, f.bfo());
      f.k(arrayOfByte6, 6, this.kkR);
      f.k(arrayOfByte6, 10, (int)paramLong1);
      f.k(arrayOfByte6, 14, paramInt1);
      f.b(arrayOfByte6, 18, paramLong2);
      System.arraycopy(paramArrayOfByte1, 0, arrayOfByte6, 26, paramArrayOfByte1.length);
      int i3 = 26 + paramArrayOfByte1.length;
      System.arraycopy(paramArrayOfByte2, 0, arrayOfByte6, i3, paramArrayOfByte2.length);
      int i4 = i3 + paramArrayOfByte2.length;
      f.i(arrayOfByte6, i4, 1);
      int i5 = i4 + 1;
      System.arraycopy(paramArrayOfByte3, 0, arrayOfByte6, i5, paramArrayOfByte3.length);
      System.arraycopy(paramArrayOfByte4, 0, arrayOfByte6, i5 + paramArrayOfByte3.length, paramArrayOfByte4.length);
      byte[] arrayOfByte7 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, arrayOfByte7, 0, paramArrayOfByte3.length);
      f.b(arrayOfByte7, 16, paramLong2);
      byte[] arrayOfByte8 = d.dn(arrayOfByte7);
      byte[] arrayOfByte9 = e.a(arrayOfByte6, arrayOfByte6.length, arrayOfByte8);
      this.kkS = arrayOfByte9.length;
      rY(this.kjD);
      v(arrayOfByte9, this.kkS);
      beR();
      return beN();
    }
    byte[] arrayOfByte1 = new byte[this.kkS];
    f.j(arrayOfByte1, 0, this.kkQ);
    f.k(arrayOfByte1, 2, f.bfo());
    f.k(arrayOfByte1, 6, this.kkR);
    f.k(arrayOfByte1, 10, (int)paramLong1);
    f.k(arrayOfByte1, 14, paramInt1);
    f.b(arrayOfByte1, 18, paramLong2);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 26, paramArrayOfByte1.length);
    int i = 26 + paramArrayOfByte1.length;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, i, paramArrayOfByte2.length);
    int j = i + paramArrayOfByte2.length;
    f.i(arrayOfByte1, j, 1);
    int k = j + 1;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte1, k, paramArrayOfByte3.length);
    int m = k + paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte1, m, paramArrayOfByte4.length);
    int n = m + paramArrayOfByte4.length;
    f.k(arrayOfByte1, n, 0);
    int i1 = n + 4;
    f.i(arrayOfByte1, i1, paramInt2);
    int i2 = i1 + 1;
    if ((paramArrayOfByte5 == null) || (paramArrayOfByte5.length <= 0))
    {
      byte[] arrayOfByte2 = new byte[16];
      f.k(arrayOfByte2, 0, f.bfo());
      f.k(arrayOfByte2, 4, f.bfo());
      f.k(arrayOfByte2, 8, f.bfo());
      f.k(arrayOfByte2, 12, f.bfo());
    }
    while (true)
    {
      byte[] arrayOfByte3 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, arrayOfByte3, 0, paramArrayOfByte3.length);
      f.b(arrayOfByte3, 16, paramLong2);
      byte[] arrayOfByte4 = d.dn(arrayOfByte3);
      byte[] arrayOfByte5 = e.a(arrayOfByte1, arrayOfByte1.length, arrayOfByte4);
      this.kkS = arrayOfByte5.length;
      rY(this.kjD);
      v(arrayOfByte5, this.kkS);
      beR();
      return beN();
      System.arraycopy(paramArrayOfByte5, 0, arrayOfByte1, i2, paramArrayOfByte5.length);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.h
 * JD-Core Version:    0.6.2
 */