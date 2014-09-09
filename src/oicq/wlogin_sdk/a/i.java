package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.b.ap;
import oicq.wlogin_sdk.b.f;

public final class i extends g
{
  public i(k paramk)
  {
    this.kjD = 2064;
    this.kjE = 2;
    this.kjG = paramk;
  }

  public final byte[] dg(byte[] paramArrayOfByte)
  {
    int i = this.kjG.kjQ;
    byte[] arrayOfByte1 = this.kjG.kjL.beQ();
    byte[] arrayOfByte2 = this.kjG.kjM.beU();
    f localf = new f();
    ap localap = new ap();
    byte[] arrayOfByte3 = localf.dh(arrayOfByte1);
    byte[] arrayOfByte4 = localap.i(paramArrayOfByte, arrayOfByte2);
    byte[] arrayOfByte5 = new byte[arrayOfByte3.length + arrayOfByte4.length];
    int j;
    if (arrayOfByte1.length > 0)
    {
      System.arraycopy(arrayOfByte3, 0, arrayOfByte5, 0, arrayOfByte3.length);
      j = 0 + arrayOfByte3.length;
    }
    for (int k = 1; ; k = 0)
    {
      System.arraycopy(arrayOfByte4, 0, arrayOfByte5, j, arrayOfByte4.length);
      int m = k + 1;
      byte[] arrayOfByte6 = d(arrayOfByte5, this.kjE, m);
      a(this.kjy, this.kjD, kjz, this.kjG.kja, this.kjA, this.kjB, i, this.kjC, arrayOfByte6);
      return beN();
      j = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.a.i
 * JD-Core Version:    0.6.2
 */