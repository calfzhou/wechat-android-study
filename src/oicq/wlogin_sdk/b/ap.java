package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.f;

public final class ap extends a
{
  int klr = 0;
  int kls = 0;

  public ap()
  {
    this.kjD = 2;
  }

  public final byte[] i(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.klr = (6 + paramArrayOfByte1.length + paramArrayOfByte2.length);
    byte[] arrayOfByte = new byte[this.klr];
    f.j(arrayOfByte, 0, this.kls);
    f.j(arrayOfByte, 2, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 4, paramArrayOfByte1.length);
    int i = 4 + paramArrayOfByte1.length;
    f.j(arrayOfByte, i, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i + 2, paramArrayOfByte2.length);
    rY(this.kjD);
    v(arrayOfByte, this.klr);
    beR();
    return beN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.ap
 * JD-Core Version:    0.6.2
 */