package oicq.wlogin_sdk.b;

import oicq.wlogin_sdk.c.e;
import oicq.wlogin_sdk.c.f;

public final class aj extends a
{
  public int klj = 0;

  public aj()
  {
    this.kjD = 324;
  }

  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5)
  {
    int j;
    int i;
    if (paramArrayOfByte1 != null)
    {
      j = 0 + paramArrayOfByte1.length;
      i = 1;
    }
    while (true)
    {
      if (paramArrayOfByte2 != null)
      {
        j += paramArrayOfByte2.length;
        i++;
      }
      if (paramArrayOfByte3 != null)
      {
        j += paramArrayOfByte3.length;
        i++;
      }
      if (paramArrayOfByte4 != null)
      {
        j += paramArrayOfByte4.length;
        i++;
      }
      byte[] arrayOfByte1 = new byte[j + 2];
      f.j(arrayOfByte1, 0, i);
      if (paramArrayOfByte1 != null)
        System.arraycopy(paramArrayOfByte1, 0, arrayOfByte1, 2, paramArrayOfByte1.length);
      for (int k = 2 + paramArrayOfByte1.length; ; k = 2)
      {
        if (paramArrayOfByte2 != null)
        {
          System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, k, paramArrayOfByte2.length);
          k += paramArrayOfByte2.length;
        }
        if (paramArrayOfByte3 != null)
        {
          System.arraycopy(paramArrayOfByte3, 0, arrayOfByte1, k, paramArrayOfByte3.length);
          k += paramArrayOfByte3.length;
        }
        if (paramArrayOfByte4 != null)
          System.arraycopy(paramArrayOfByte4, 0, arrayOfByte1, k, paramArrayOfByte4.length);
        byte[] arrayOfByte2 = e.a(arrayOfByte1, arrayOfByte1.length, paramArrayOfByte5);
        this.klj = arrayOfByte2.length;
        rY(this.kjD);
        v(arrayOfByte2, arrayOfByte2.length);
        beR();
        return beN();
      }
      i = 0;
      j = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.b.aj
 * JD-Core Version:    0.6.2
 */