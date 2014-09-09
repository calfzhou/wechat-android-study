package b.a.a.b.a;

import java.io.InputStream;
import java.util.LinkedList;

public final class a
{
  private byte[] buffer;
  private int gNV;
  private int kiA = 67108864;
  private int kiu = 0;
  private int kiv;
  private InputStream kiw;
  private int kix = 0;
  private int kiy = 0;
  private int kiz = 2147483647;

  private a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.gNV = (paramInt + 0);
    this.kiv = 0;
    this.kiw = null;
  }

  private int beB()
  {
    int i = beD();
    if (i >= 0);
    int i4;
    do
    {
      return i;
      int j = i & 0x7F;
      int k = beD();
      if (k >= 0)
        return j | k << 7;
      int m = j | (k & 0x7F) << 7;
      int n = beD();
      if (n >= 0)
        return m | n << 14;
      int i1 = m | (n & 0x7F) << 14;
      int i2 = beD();
      if (i2 >= 0)
        return i1 | i2 << 21;
      int i3 = i1 | (i2 & 0x7F) << 21;
      i4 = beD();
      i = i3 | i4 << 28;
    }
    while (i4 >= 0);
    for (int i5 = 0; ; i5++)
    {
      if (i5 >= 5)
        throw b.beG();
      if (beD() >= 0)
        break;
    }
  }

  private byte beD()
  {
    if (this.kiv == this.gNV)
      gw(true);
    byte[] arrayOfByte = this.buffer;
    int i = this.kiv;
    this.kiv = (i + 1);
    return arrayOfByte[i];
  }

  public static a da(byte[] paramArrayOfByte)
  {
    return new a(paramArrayOfByte, paramArrayOfByte.length);
  }

  private boolean gw(boolean paramBoolean)
  {
    if (this.kiv < this.gNV)
      throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    if (this.kiy + this.gNV == this.kiz)
    {
      if (paramBoolean)
        throw b.beE();
      return false;
    }
    this.kiy += this.gNV;
    this.kiv = 0;
    if (this.kiw == null);
    for (int i = -1; ; i = this.kiw.read(this.buffer))
    {
      this.gNV = i;
      if (this.gNV != -1)
        break label117;
      this.gNV = 0;
      if (!paramBoolean)
        break;
      throw b.beE();
    }
    return false;
    label117: this.gNV += this.kiu;
    int j = this.kiy + this.gNV;
    if (j > this.kiz)
    {
      this.kiu = (j - this.kiz);
      this.gNV -= this.kiu;
    }
    while (true)
    {
      int k = this.kiy + this.gNV + this.kiu;
      if ((k <= this.kiA) && (k >= 0))
        break;
      throw b.beI();
      this.kiu = 0;
    }
    return true;
  }

  private int[] rQ(int paramInt)
  {
    int i = this.buffer[paramInt];
    int j = paramInt + 1;
    if (i >= 0)
      return new int[] { i, j };
    int k = i & 0x7F;
    int m = this.buffer[j];
    int i7;
    int i6;
    if (m >= 0)
    {
      i7 = j + 1;
      i6 = k | m << 7;
    }
    int i5;
    do
    {
      int i2;
      int i3;
      while (true)
      {
        return new int[] { i6, i7 };
        int n = k | (m & 0x7F) << 7;
        int i1 = this.buffer[j];
        if (i1 >= 0)
        {
          i7 = j + 1;
          i6 = n | i1 << 14;
        }
        else
        {
          i2 = n | (i1 & 0x7F) << 14;
          i3 = this.buffer[j];
          if (i3 < 0)
            break;
          i7 = j + 1;
          i6 = i2 | i3 << 21;
        }
      }
      int i4 = i2 | (i3 & 0x7F) << 21;
      i5 = this.buffer[j];
      i6 = i4 | i5 << 28;
      i7 = j + 1;
    }
    while (i5 >= 0);
    for (int i8 = 0; ; i8++)
    {
      if (i8 >= 5)
        throw b.beG();
      if (this.buffer[i7] >= 0)
        return new int[] { i5, i7 + 1 };
    }
  }

  private byte[] rR(int paramInt)
  {
    if (paramInt < 0)
      throw b.beF();
    if (paramInt + (this.kiy + this.kiv) > this.kiz)
    {
      rS(this.kiz - this.kiy - this.kiv);
      throw b.beE();
    }
    if (paramInt <= this.gNV - this.kiv)
    {
      byte[] arrayOfByte5 = new byte[paramInt];
      System.arraycopy(this.buffer, this.kiv, arrayOfByte5, 0, paramInt);
      this.kiv = (paramInt + this.kiv);
      return arrayOfByte5;
    }
    if (paramInt < 2048)
    {
      byte[] arrayOfByte4 = new byte[paramInt];
      int i6 = this.gNV - this.kiv;
      System.arraycopy(this.buffer, this.kiv, arrayOfByte4, 0, i6);
      this.kiv = this.gNV;
      gw(true);
      while (true)
      {
        if (paramInt - i6 <= this.gNV)
        {
          System.arraycopy(this.buffer, 0, arrayOfByte4, i6, paramInt - i6);
          this.kiv = (paramInt - i6);
          return arrayOfByte4;
        }
        System.arraycopy(this.buffer, 0, arrayOfByte4, i6, this.gNV);
        i6 += this.gNV;
        this.kiv = this.gNV;
        gw(true);
      }
    }
    int i = this.kiv;
    int j = this.gNV;
    this.kiy += this.gNV;
    this.kiv = 0;
    this.gNV = 0;
    int k = paramInt - (j - i);
    LinkedList localLinkedList = new LinkedList();
    int m = k;
    byte[] arrayOfByte2;
    int i4;
    int i5;
    if (m <= 0)
    {
      arrayOfByte2 = new byte[paramInt];
      int i3 = j - i;
      System.arraycopy(this.buffer, i, arrayOfByte2, 0, i3);
      i4 = 0;
      i5 = i3;
    }
    while (true)
    {
      if (i4 >= localLinkedList.size())
      {
        return arrayOfByte2;
        byte[] arrayOfByte1 = new byte[Math.min(m, 2048)];
        int n = 0;
        while (true)
        {
          if (n >= arrayOfByte1.length)
          {
            int i2 = m - arrayOfByte1.length;
            localLinkedList.add(arrayOfByte1);
            m = i2;
            break;
          }
          if (this.kiw == null);
          for (int i1 = -1; i1 == -1; i1 = this.kiw.read(arrayOfByte1, n, arrayOfByte1.length - n))
            throw b.beE();
          this.kiy = (i1 + this.kiy);
          n += i1;
        }
      }
      byte[] arrayOfByte3 = (byte[])localLinkedList.get(i4);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte2, i5, arrayOfByte3.length);
      i5 += arrayOfByte3.length;
      i4++;
    }
  }

  private void rS(int paramInt)
  {
    if (paramInt < 0)
      throw b.beF();
    if (paramInt + (this.kiy + this.kiv) > this.kiz)
    {
      rS(this.kiz - this.kiy - this.kiv);
      throw b.beE();
    }
    if (paramInt < this.gNV - this.kiv)
      this.kiv = (paramInt + this.kiv);
    while (true)
    {
      return;
      int i = this.gNV - this.kiv;
      this.kiy = (i + this.kiy);
      this.kiv = 0;
      this.gNV = 0;
      int j = i;
      while (j < paramInt)
      {
        if (this.kiw == null);
        for (int k = -1; k <= 0; k = (int)this.kiw.skip(paramInt - j))
          throw b.beE();
        j += k;
        this.kiy = (k + this.kiy);
      }
    }
  }

  public final com.tencent.mm.ao.b beA()
  {
    int i = beB();
    if ((i < this.gNV - this.kiv) && (i > 0))
    {
      com.tencent.mm.ao.b localb = com.tencent.mm.ao.b.c(this.buffer, this.kiv, i);
      this.kiv = (i + this.kiv);
      return localb;
    }
    return com.tencent.mm.ao.b.aO(rR(i));
  }

  public final long beC()
  {
    int i = 0;
    long l = 0L;
    while (true)
    {
      if (i >= 64)
        throw b.beG();
      int j = beD();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
        return l;
      i += 7;
    }
  }

  public final int bew()
  {
    if ((this.kiv == this.gNV) && (!gw(false)))
    {
      this.kix = 0;
      return 0;
    }
    this.kix = beB();
    if (this.kix == 0)
      throw b.beH();
    return this.kix;
  }

  public final int bex()
  {
    return beB();
  }

  public final LinkedList bey()
  {
    LinkedList localLinkedList = new LinkedList();
    while (true)
    {
      if (this.kiv >= this.gNV)
        return localLinkedList;
      localLinkedList.add(Integer.valueOf(beB()));
    }
  }

  public final boolean bez()
  {
    return beB() != 0;
  }

  public final LinkedList rN(int paramInt)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = beB();
    byte[] arrayOfByte1 = new byte[i];
    System.arraycopy(this.buffer, this.kiv, arrayOfByte1, 0, i);
    localLinkedList.add(arrayOfByte1);
    this.kiv = (i + this.kiv);
    int j = this.kiv;
    if (this.kiv == this.gNV)
      return localLinkedList;
    int[] arrayOfInt = rQ(j);
    for (int k = arrayOfInt[0]; ; k = arrayOfInt[0])
    {
      if (b.a.a.b.a.rP(k) != paramInt);
      do
      {
        return localLinkedList;
        this.kiv = arrayOfInt[1];
        int m = beB();
        byte[] arrayOfByte2 = new byte[m];
        System.arraycopy(this.buffer, this.kiv, arrayOfByte2, 0, m);
        localLinkedList.add(arrayOfByte2);
        this.kiv = (m + this.kiv);
      }
      while (this.kiv == this.gNV);
      arrayOfInt = rQ(this.kiv);
    }
  }

  public final double readDouble()
  {
    int i = beD();
    int j = beD();
    int k = beD();
    int m = beD();
    int n = beD();
    int i1 = beD();
    int i2 = beD();
    int i3 = beD();
    return Double.longBitsToDouble(0xFF & i | (0xFF & j) << 8 | (0xFF & k) << 16 | (0xFF & m) << 24 | (0xFF & n) << 32 | (0xFF & i1) << 40 | (0xFF & i2) << 48 | (0xFF & i3) << 56);
  }

  public final float readFloat()
  {
    int i = beD();
    int j = beD();
    int k = beD();
    int m = beD();
    return Float.intBitsToFloat(i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (m & 0xFF) << 24);
  }

  public final String readString()
  {
    int i = beB();
    if ((i < this.gNV - this.kiv) && (i > 0))
    {
      String str = new String(this.buffer, this.kiv, i, "UTF-8");
      this.kiv = (i + this.kiv);
      return str;
    }
    return new String(rR(i), "UTF-8");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     b.a.a.b.a.a
 * JD-Core Version:    0.6.2
 */