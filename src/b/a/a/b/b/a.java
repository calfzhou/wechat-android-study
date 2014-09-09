package b.a.a.b.b;

import com.tencent.mm.ao.b;
import java.io.UnsupportedEncodingException;

public final class a
{
  private final byte[] buffer;
  private final int doC;
  private int position;

  private a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.doC = (paramInt2 + 0);
  }

  public static int J(int paramInt, String paramString)
  {
    if (paramString == null)
      return 0;
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      int i = rV(paramInt) + rX(arrayOfByte.length);
      int j = arrayOfByte.length;
      return j + i;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new IllegalStateException("UTF-8 not supported.");
  }

  public static a db(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private void dc(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null);
    int k;
    int m;
    do
    {
      int i;
      do
      {
        return;
        i = paramArrayOfByte.length;
      }
      while (paramArrayOfByte == null);
      if (this.doC - this.position >= i)
      {
        System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
        this.position = (i + this.position);
        return;
      }
      int j = this.doC - this.position;
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, j);
      k = j + 0;
      m = i - j;
      this.position = this.doC;
    }
    while (m > this.doC);
    System.arraycopy(paramArrayOfByte, k, this.buffer, 0, m);
    this.position = m;
  }

  private void dp(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        rU((int)paramLong);
        return;
      }
      rU(0x80 | 0x7F & (int)paramLong);
      paramLong >>>= 7;
    }
  }

  private void rU(int paramInt)
  {
    int i = (byte)paramInt;
    byte[] arrayOfByte = this.buffer;
    int j = this.position;
    this.position = (j + 1);
    arrayOfByte[j] = i;
  }

  public static int rV(int paramInt)
  {
    return rX(b.a.a.b.a.bt(paramInt, 0));
  }

  public static int rX(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      return 1;
    if ((paramInt & 0xFFFFC000) == 0)
      return 2;
    if ((0xFFE00000 & paramInt) == 0)
      return 3;
    if ((0xF0000000 & paramInt) == 0)
      return 4;
    return 5;
  }

  public final void C(int paramInt, boolean paramBoolean)
  {
    bw(paramInt, 0);
    int i = 0;
    if (paramBoolean)
      i = 1;
    rU(i);
  }

  public final void I(int paramInt, String paramString)
  {
    if (paramString == null)
      return;
    bw(paramInt, 2);
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    rW(arrayOfByte.length);
    dc(arrayOfByte);
  }

  public final void a(int paramInt, double paramDouble)
  {
    bw(paramInt, 1);
    long l = Double.doubleToLongBits(paramDouble);
    rU(0xFF & (int)l);
    rU(0xFF & (int)(l >> 8));
    rU(0xFF & (int)(l >> 16));
    rU(0xFF & (int)(l >> 24));
    rU(0xFF & (int)(l >> 32));
    rU(0xFF & (int)(l >> 40));
    rU(0xFF & (int)(l >> 48));
    rU(0xFF & (int)(l >> 56));
  }

  public final void b(int paramInt, b paramb)
  {
    if (paramb == null)
      return;
    bw(paramInt, 2);
    byte[] arrayOfByte = paramb.toByteArray();
    rW(arrayOfByte.length);
    dc(arrayOfByte);
  }

  public final void bu(int paramInt1, int paramInt2)
  {
    bw(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      rW(paramInt2);
      return;
    }
    dp(paramInt2);
  }

  public final void bv(int paramInt1, int paramInt2)
  {
    bw(paramInt1, 2);
    rW(paramInt2);
  }

  public final void bw(int paramInt1, int paramInt2)
  {
    rW(b.a.a.b.a.bt(paramInt1, paramInt2));
  }

  public final void c(int paramInt, float paramFloat)
  {
    bw(paramInt, 5);
    int i = Float.floatToIntBits(paramFloat);
    rU(i & 0xFF);
    rU(0xFF & i >> 8);
    rU(0xFF & i >> 16);
    rU(0xFF & i >> 24);
  }

  public final void j(int paramInt, long paramLong)
  {
    bw(paramInt, 0);
    dp(paramLong);
  }

  public final void rT(int paramInt)
  {
    rW(paramInt);
  }

  public final void rW(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        rU(paramInt);
        return;
      }
      rU(0x80 | paramInt & 0x7F);
      paramInt >>>= 7;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.b.b.a
 * JD-Core Version:    0.6.2
 */