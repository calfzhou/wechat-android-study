package oicq.wlogin_sdk.c;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

final class a
{
  private int contextStart;
  private int crypt;
  private boolean header = true;
  private byte[] key;
  private byte[] out;
  private int padding;
  private byte[] plain;
  private int pos;
  private int preCrypt;
  private byte[] prePlain;
  private Random random = new Random();

  private byte[] decipher(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 16;
    try
    {
      long l1 = x(paramArrayOfByte, 0);
      long l2 = x(paramArrayOfByte, 4);
      long l3 = x(this.key, 0);
      long l4 = x(this.key, 4);
      long l5 = x(this.key, 8);
      long l6 = x(this.key, 12);
      long l7 = 3816266640L;
      while (true)
      {
        int j = i - 1;
        if (i <= 0)
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(8);
          DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
          localDataOutputStream.writeInt((int)l1);
          localDataOutputStream.writeInt((int)l2);
          localDataOutputStream.close();
          byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
          return arrayOfByte;
        }
        l2 = 0xFFFFFFFF & l2 - (l5 + (l1 << 4) ^ l1 + l7 ^ l6 + (l1 >>> 5));
        l1 = 0xFFFFFFFF & l1 - (l3 + (l2 << 4) ^ l2 + l7 ^ l4 + (l2 >>> 5));
        l7 = 0xFFFFFFFF & l7 - 2654435769L;
        i = j;
      }
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  private boolean decrypt8Bytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    for (this.pos = 0; ; this.pos = (1 + this.pos))
    {
      if (this.pos >= 8)
      {
        this.prePlain = decipher(this.prePlain, 0);
        if (this.prePlain != null)
          break;
        bool = false;
      }
      while (this.contextStart + this.pos >= paramInt2)
        return bool;
      byte[] arrayOfByte = this.prePlain;
      int i = this.pos;
      arrayOfByte[i] = ((byte)(arrayOfByte[i] ^ paramArrayOfByte[(0 + this.crypt + this.pos)]));
    }
    this.contextStart = (8 + this.contextStart);
    this.crypt = (8 + this.crypt);
    this.pos = 0;
    return bool;
  }

  private byte[] encipher(byte[] paramArrayOfByte)
  {
    int i = 16;
    try
    {
      long l1 = x(paramArrayOfByte, 0);
      long l2 = x(paramArrayOfByte, 4);
      long l3 = x(this.key, 0);
      long l4 = x(this.key, 4);
      long l5 = x(this.key, 8);
      long l6 = x(this.key, 12);
      long l7 = 0L;
      while (true)
      {
        int j = i - 1;
        if (i <= 0)
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(8);
          DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
          localDataOutputStream.writeInt((int)l1);
          localDataOutputStream.writeInt((int)l2);
          localDataOutputStream.close();
          byte[] arrayOfByte = localByteArrayOutputStream.toByteArray();
          return arrayOfByte;
        }
        l7 = 0xFFFFFFFF & l7 + 2654435769L;
        l1 = 0xFFFFFFFF & l1 + (l3 + (l2 << 4) ^ l2 + l7 ^ l4 + (l2 >>> 5));
        l2 = 0xFFFFFFFF & l2 + (l5 + (l1 << 4) ^ l1 + l7 ^ l6 + (l1 >>> 5));
        i = j;
      }
    }
    catch (IOException localIOException)
    {
    }
    return null;
  }

  private void encrypt8Bytes()
  {
    this.pos = 0;
    if (this.pos >= 8)
      System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
    for (this.pos = 0; ; this.pos = (1 + this.pos))
    {
      if (this.pos >= 8)
      {
        System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
        this.preCrypt = this.crypt;
        this.crypt = (8 + this.crypt);
        this.pos = 0;
        this.header = false;
        return;
        if (this.header)
        {
          byte[] arrayOfByte2 = this.plain;
          int j = this.pos;
          arrayOfByte2[j] = ((byte)(arrayOfByte2[j] ^ this.prePlain[this.pos]));
        }
        while (true)
        {
          this.pos = (1 + this.pos);
          break;
          byte[] arrayOfByte1 = this.plain;
          int i = this.pos;
          arrayOfByte1[i] = ((byte)(arrayOfByte1[i] ^ this.out[(this.preCrypt + this.pos)]));
        }
      }
      byte[] arrayOfByte3 = this.out;
      int k = this.crypt + this.pos;
      arrayOfByte3[k] = ((byte)(arrayOfByte3[k] ^ this.prePlain[this.pos]));
    }
  }

  private static long x(byte[] paramArrayOfByte, int paramInt)
  {
    long l = 0L;
    int i = paramInt + 4;
    while (true)
    {
      if (paramInt >= i)
        return 0xFFFFFFFF & l | l >>> 32;
      l = l << 8 | 0xFF & paramArrayOfByte[paramInt];
      paramInt++;
    }
  }

  protected final byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    byte[] arrayOfByte1 = new byte[8];
    if ((i % 8 != 0) || (i < 16))
      return null;
    this.prePlain = decipher(paramArrayOfByte1, 0);
    this.pos = (0x7 & this.prePlain[0]);
    int j = -10 + (i - this.pos);
    if (j < 0)
      return null;
    int k = 0;
    if (k >= 8)
    {
      this.out = new byte[j];
      this.preCrypt = 0;
      this.crypt = 8;
      this.contextStart = 8;
      this.pos = (1 + this.pos);
      this.padding = 1;
    }
    while (true)
    {
      label130: byte[] arrayOfByte2;
      int m;
      if (this.padding > 2)
      {
        arrayOfByte2 = arrayOfByte1;
        m = 0;
      }
      while (true)
      {
        label145: byte[] arrayOfByte3;
        if (j == 0)
        {
          this.padding = 1;
          arrayOfByte3 = arrayOfByte2;
        }
        while (true)
        {
          if (this.padding >= 8)
          {
            return this.out;
            arrayOfByte1[k] = 0;
            k++;
            break;
            if (this.pos < 8)
            {
              this.pos = (1 + this.pos);
              this.padding = (1 + this.padding);
            }
            if (this.pos != 8)
              break label130;
            if (decrypt8Bytes(paramArrayOfByte1, 0, i))
              break label423;
            return null;
            if (this.pos < 8)
            {
              this.out[m] = ((byte)(arrayOfByte2[(0 + this.preCrypt + this.pos)] ^ this.prePlain[this.pos]));
              m++;
              j--;
              this.pos = (1 + this.pos);
            }
            if (this.pos != 8)
              break label145;
            this.preCrypt = (-8 + this.crypt);
            if (decrypt8Bytes(paramArrayOfByte1, 0, i))
              break label417;
            return null;
          }
          if (this.pos < 8)
          {
            if ((arrayOfByte3[(0 + this.preCrypt + this.pos)] ^ this.prePlain[this.pos]) != 0)
              return null;
            this.pos = (1 + this.pos);
          }
          if (this.pos == 8)
          {
            this.preCrypt = this.crypt;
            if (!decrypt8Bytes(paramArrayOfByte1, 0, i))
              return null;
            arrayOfByte3 = paramArrayOfByte1;
          }
          this.padding = (1 + this.padding);
        }
        label417: arrayOfByte2 = paramArrayOfByte1;
      }
      label423: arrayOfByte1 = paramArrayOfByte1;
    }
  }

  protected final byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    this.plain = new byte[8];
    this.prePlain = new byte[8];
    this.pos = 1;
    this.padding = 0;
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    this.header = true;
    this.pos = ((i + 10) % 8);
    if (this.pos != 0)
      this.pos = (8 - this.pos);
    this.out = new byte[10 + (i + this.pos)];
    this.plain[0] = ((byte)(0xF8 & this.random.nextInt() | this.pos));
    int j = 1;
    int k;
    if (j > this.pos)
    {
      this.pos = (1 + this.pos);
      k = 0;
      label141: if (k < 8)
        break label216;
      this.padding = 1;
    }
    int n;
    int i1;
    while (true)
    {
      if (this.padding > 2)
      {
        n = i;
        i1 = 0;
        if (n > 0)
          break label302;
        this.padding = 1;
        label177: if (this.padding <= 7)
          break label376;
        return this.out;
        this.plain[j] = ((byte)(0xFF & this.random.nextInt()));
        j++;
        break;
        label216: this.prePlain[k] = 0;
        k++;
        break label141;
      }
      if (this.pos < 8)
      {
        byte[] arrayOfByte1 = this.plain;
        int m = this.pos;
        this.pos = (m + 1);
        arrayOfByte1[m] = ((byte)(0xFF & this.random.nextInt()));
        this.padding = (1 + this.padding);
      }
      if (this.pos == 8)
        encrypt8Bytes();
    }
    label302: int i2;
    if (this.pos < 8)
    {
      byte[] arrayOfByte2 = this.plain;
      int i4 = this.pos;
      this.pos = (i4 + 1);
      i2 = i1 + 1;
      arrayOfByte2[i4] = paramArrayOfByte1[i1];
    }
    for (int i3 = n - 1; ; i3 = n)
    {
      if (this.pos == 8)
        encrypt8Bytes();
      n = i3;
      i1 = i2;
      break;
      label376: if (this.pos < 8)
      {
        byte[] arrayOfByte3 = this.plain;
        int i5 = this.pos;
        this.pos = (i5 + 1);
        arrayOfByte3[i5] = 0;
        this.padding = (1 + this.padding);
      }
      if (this.pos != 8)
        break label177;
      encrypt8Bytes();
      break label177;
      i2 = i1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.c.a
 * JD-Core Version:    0.6.2
 */