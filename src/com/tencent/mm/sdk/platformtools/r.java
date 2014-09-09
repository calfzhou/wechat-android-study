package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class r extends Thread
{
  private int bgColor;
  private int delay = 0;
  private byte[] gfW = null;
  public int height;
  private int[] iDA;
  private int[] iDB;
  private int iDC;
  private int iDD;
  private boolean iDE;
  private boolean iDF;
  private int iDG;
  private int iDH;
  private int iDI;
  private int iDJ;
  private int iDK;
  private int iDL;
  private int iDM;
  private int iDN;
  private int iDO;
  private byte[] iDP = new byte[256];
  private int iDQ = 0;
  private int iDR = 0;
  private int iDS = 0;
  private boolean iDT = false;
  private int iDU;
  private short[] iDV;
  private byte[] iDW;
  private byte[] iDX;
  private byte[] iDY;
  private Vector iDZ;
  private boolean iDx;
  private int iDy;
  private int[] iDz;
  private Vector iEa;
  private InputStream in;
  private int status;
  public int width;

  public r(byte[] paramArrayOfByte)
  {
    this.gfW = paramArrayOfByte;
  }

  private boolean aNd()
  {
    return this.status != 0;
  }

  private void aNe()
  {
    boolean bool = true;
    String str = "";
    for (int i = 0; i < 6; i++)
      str = str + (char)aNk();
    if (!str.startsWith("GIF"))
    {
      this.status = -1;
      return;
    }
    this.width = aNl();
    this.height = aNl();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.width);
    arrayOfObject[bool] = Integer.valueOf(this.height);
    z.i("!32@/B4Tb64lLpJsAvj5rPUAxSct5458VDnm", "[GifDecoder]readLSD width: %d,height: %d", arrayOfObject);
    int j = aNk();
    if ((j & 0x80) != 0);
    while (true)
    {
      this.iDx = bool;
      this.iDy = (2 << (j & 0x7));
      this.iDC = aNk();
      aNk();
      if ((!this.iDx) || (aNd()))
        break;
      this.iDz = op(this.iDy);
      this.bgColor = this.iDz[this.iDC];
      return;
      bool = false;
    }
  }

  private void aNf()
  {
    boolean bool;
    do
    {
      s locals = new s();
      bool = b(locals);
      if (locals.dnb != null)
        this.iDZ.add(locals);
    }
    while (!bool);
  }

  private void aNg()
  {
    int i = this.iDJ * this.iDK;
    if ((this.iDY == null) || (this.iDY.length < i))
      this.iDY = new byte[i];
    if (this.iDV == null)
      this.iDV = new short[4096];
    if (this.iDW == null)
      this.iDW = new byte[4096];
    if (this.iDX == null)
      this.iDX = new byte[4097];
    int j = aNk();
    int k = 1 << j;
    int m = k + 1;
    int n = k + 2;
    int i1 = -1;
    int i2 = j + 1;
    int i3 = -1 + (1 << i2);
    for (int i4 = 0; i4 < k; i4++)
    {
      this.iDV[i4] = 0;
      this.iDW[i4] = ((byte)i4);
    }
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i25;
    int i26;
    int i27;
    label382: int i21;
    int i19;
    int i20;
    int i14;
    int i15;
    int i16;
    int i17;
    int i18;
    while (i9 < i)
    {
      if (i6 != 0)
        break label661;
      if (i11 < i2)
      {
        if (i10 == 0)
        {
          i10 = aNm();
          if (i10 > 0)
            i12 = 0;
        }
        else
        {
          i8 += ((0xFF & this.iDP[i12]) << i11);
          i11 += 8;
          i12++;
          i10--;
        }
      }
      else
      {
        i25 = i8 & i3;
        i8 >>= i2;
        i11 -= i2;
        if ((i25 <= n) && (i25 != m))
          if (i25 == k)
          {
            i2 = j + 1;
            i3 = -1 + (1 << i2);
            n = k + 2;
            i1 = -1;
          }
          else if (i1 == -1)
          {
            byte[] arrayOfByte5 = this.iDX;
            int i31 = i6 + 1;
            arrayOfByte5[i6] = this.iDW[i25];
            i6 = i31;
            i1 = i25;
            i7 = i25;
          }
          else
          {
            if (i25 != n)
              break label650;
            byte[] arrayOfByte4 = this.iDX;
            i26 = i6 + 1;
            arrayOfByte4[i6] = ((byte)i7);
            i27 = i1;
            while (i27 > k)
            {
              byte[] arrayOfByte3 = this.iDX;
              int i30 = i26 + 1;
              arrayOfByte3[i26] = this.iDW[i27];
              i27 = this.iDV[i27];
              i26 = i30;
            }
            int i28 = 0xFF & this.iDW[i27];
            if (n < 4096)
            {
              byte[] arrayOfByte2 = this.iDX;
              int i29 = i26 + 1;
              arrayOfByte2[i26] = ((byte)i28);
              this.iDV[n] = ((short)i1);
              this.iDW[n] = ((byte)i28);
              i21 = n + 1;
              if (((i21 & i3) == 0) && (i21 < 4096))
              {
                i2++;
                i3 += i21;
              }
              i19 = i8;
              i20 = i25;
              i14 = i3;
              i15 = i28;
              i16 = i11;
              i17 = i2;
              i18 = i29;
            }
          }
      }
    }
    while (true)
    {
      int i22 = i18 - 1;
      byte[] arrayOfByte1 = this.iDY;
      int i23 = i5 + 1;
      arrayOfByte1[i5] = this.iDX[i22];
      i9++;
      i5 = i23;
      i2 = i17;
      i11 = i16;
      i7 = i15;
      i3 = i14;
      int i24 = i20;
      i8 = i19;
      i6 = i22;
      n = i21;
      i1 = i24;
      break;
      for (int i13 = i5; i13 < i; i13++)
        this.iDY[i13] = 0;
      return;
      label650: i26 = i6;
      i27 = i25;
      break label382;
      label661: i14 = i3;
      i15 = i7;
      i16 = i11;
      i17 = i2;
      i18 = i6;
      i19 = i8;
      i20 = i1;
      i21 = n;
    }
  }

  private Bitmap aNh()
  {
    int i = 0;
    int[] arrayOfInt = new int[this.width * this.height];
    if (this.iDZ == null)
      if (this.iEa.size() <= 0)
        break label539;
    label143: label528: label539: for (t localt = (t)this.iEa.lastElement(); ; localt = null)
    {
      if (this.iDS > 0)
        if (this.iDS == 3)
          if (this.iEa.size() <= 1)
            break label357;
      int j;
      int m;
      label200: int n;
      label219: label357: for (localt = (t)this.iEa.elementAt(-2 + this.iEa.size()); ; localt = null)
      {
        if (localt != null)
        {
          arrayOfInt = localt.iEb;
          this.width = localt.width;
          this.height = localt.height;
          if (this.iDS == 2)
            e(arrayOfInt);
        }
        j = 8;
        int k = 1;
        m = 0;
        if (i >= this.iDK)
          break label512;
        if (!this.iDF)
          break label528;
        if (m >= this.iDK)
          k++;
        switch (k)
        {
        default:
          int i10 = m + j;
          int i11 = m;
          m = i10;
          n = i11;
          int i1 = n + this.iDI;
          if (i1 >= this.height)
            break label506;
          int i2 = i1 * this.width;
          int i3 = i2 + this.iDH;
          int i4 = i3 + this.iDJ;
          if (i2 + this.width < i4)
            i4 = i2 + this.width;
          int i5 = i * this.iDJ;
          int i6 = i3;
          while (i6 < i4)
          {
            byte[] arrayOfByte = this.iDY;
            int i7 = i5 + 1;
            int i8 = 0xFF & arrayOfByte[i5];
            int i9 = this.iDB[i8];
            if (i9 != 0)
              arrayOfInt[i6] = i9;
            i6++;
            i5 = i7;
          }
        case 2:
        case 3:
        case 4:
        }
      }
      if (this.iDZ.size() > 0);
      for (Bitmap localBitmap = ((s)this.iDZ.lastElement()).dnb; this.iDS > 0; localBitmap = null)
      {
        if (this.iDS == 3)
          if (this.iDZ.size() <= 1)
            break label477;
        label477: for (localBitmap = ((s)this.iDZ.elementAt(-2 + this.iDZ.size())).dnb; localBitmap != null; localBitmap = null)
        {
          localBitmap.getPixels(arrayOfInt, 0, this.width, 0, 0, this.width, this.height);
          if (this.iDS != 2)
            break;
          e(arrayOfInt);
          break;
        }
        m = 4;
        break label200;
        j = 4;
        m = 2;
        break label200;
        m = 1;
        j = 2;
        break label200;
        label506: i++;
        break label143;
        return i.a(arrayOfInt, this.width, this.height, Bitmap.Config.ARGB_4444);
        n = i;
        break label219;
      }
    }
  }

  private void aNi()
  {
    do
      aNm();
    while ((this.iDQ > 0) && (!aNd()));
  }

  private void aNj()
  {
    do
      aNm();
    while ((this.iDQ > 0) && (!aNd()));
  }

  private int aNk()
  {
    try
    {
      int i = this.in.read();
      return i;
    }
    catch (Exception localException)
    {
      this.status = -1;
    }
    return 0;
  }

  private int aNl()
  {
    return aNk() | aNk() << 8;
  }

  private int aNm()
  {
    this.iDQ = aNk();
    int i = this.iDQ;
    int j = 0;
    if (i > 0)
      try
      {
        while (j < this.iDQ)
        {
          int k = this.in.read(this.iDP, j, this.iDQ - j);
          if (k == -1)
            break;
          j += k;
        }
      }
      catch (Exception localException)
      {
        if (j < this.iDQ)
          this.status = -1;
      }
    return j;
  }

  private boolean b(s params)
  {
    int i;
    boolean bool3;
    label333: boolean bool4;
    label350: int k;
    switch (aNk())
    {
    default:
      this.status = -1;
      i = 0;
    case 33:
      while (true)
      {
        boolean bool1;
        if (i == 0)
        {
          boolean bool2 = aNd();
          bool1 = false;
          if (!bool2);
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        switch (aNk())
        {
        default:
          aNj();
          i = 0;
          break;
        case 249:
          aNk();
          int i1 = aNk();
          this.iDR = ((i1 & 0x1C) >> 2);
          if (this.iDR == 0)
            this.iDR = 1;
          if ((i1 & 0x1) != 0);
          for (boolean bool5 = true; ; bool5 = false)
          {
            this.iDT = bool5;
            this.delay = (10 * aNl());
            this.iDU = aNk();
            aNk();
            i = 0;
            break;
          }
        case 255:
          aNm();
          String str = "";
          for (int n = 0; n < 11; n++)
            str = str + (char)this.iDP[n];
          if (str.equals("NETSCAPE2.0"))
          {
            aNi();
            i = 0;
          }
          else
          {
            aNj();
            i = 0;
          }
          break;
        }
      }
    case 44:
      this.iDH = aNl();
      this.iDI = aNl();
      this.iDJ = aNl();
      this.iDK = aNl();
      int j = aNk();
      if ((j & 0x80) != 0)
      {
        bool3 = true;
        this.iDE = bool3;
        if ((j & 0x40) == 0)
          break label589;
        bool4 = true;
        this.iDF = bool4;
        this.iDG = (2 << (j & 0x7));
        if (!this.iDE)
          break label595;
        this.iDA = op(this.iDG);
        this.iDB = this.iDA;
        label394: if (!this.iDT)
          break label640;
        k = this.iDB[this.iDU];
        this.iDB[this.iDU] = 0;
      }
      break;
    case 59:
    case 0:
    }
    while (true)
    {
      if (this.iDB == null)
        this.status = -1;
      if (!aNd())
      {
        aNg();
        aNj();
        if (!aNd())
        {
          if (params == null)
            params = new s();
          Bitmap localBitmap = aNh();
          int m = this.delay;
          params.dnb = localBitmap;
          params.duration = m;
          if (this.iDT)
            this.iDB[this.iDU] = k;
          this.iDS = this.iDR;
          this.iDL = this.iDH;
          this.iDM = this.iDI;
          this.iDN = this.iDJ;
          this.iDO = this.iDK;
          this.iDD = this.bgColor;
          this.iDR = 0;
          this.iDT = false;
          this.delay = 0;
          this.iDA = null;
        }
      }
      i = 0;
      break;
      bool3 = false;
      break label333;
      label589: bool4 = false;
      break label350;
      label595: this.iDB = this.iDz;
      if (this.iDC != this.iDU)
        break label394;
      this.bgColor = 0;
      break label394;
      i = 1;
      break;
      z.d("!32@/B4Tb64lLpJsAvj5rPUAxSct5458VDnm", "notice, bad byte!");
      i = 0;
      break;
      label640: k = 0;
    }
  }

  public static boolean cP(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    Object localObject = "";
    int i = 0;
    while (true)
    {
      if (i < 6);
      try
      {
        String str = (String)localObject + (char)localByteArrayInputStream.read();
        localObject = str;
        i++;
        continue;
        try
        {
          localByteArrayInputStream.close();
          label57: return ((String)localObject).startsWith("GIF");
        }
        catch (IOException localIOException1)
        {
          break label57;
        }
      }
      catch (IOException localIOException2)
      {
      }
    }
    return false;
  }

  private void e(int[] paramArrayOfInt)
  {
    int i = 0;
    int j;
    if (!this.iDT)
      j = this.iDD;
    while (true)
      if (i < this.iDO)
      {
        int k = (i + this.iDM) * this.width + this.iDL;
        int m = k + this.iDN;
        while (k < m)
        {
          paramArrayOfInt[k] = j;
          k++;
        }
        i++;
      }
      else
      {
        return;
        j = 0;
        i = 0;
      }
  }

  private void init()
  {
    this.status = 0;
    this.iDz = null;
    this.iDA = null;
  }

  private int[] op(int paramInt)
  {
    int i = 0;
    int j = paramInt * 3;
    int[] arrayOfInt = null;
    byte[] arrayOfByte = new byte[j];
    while (true)
    {
      int m;
      try
      {
        int i6 = this.in.read(arrayOfByte);
        k = i6;
        if (k < j)
        {
          this.status = -1;
          return arrayOfInt;
        }
      }
      catch (Exception localException)
      {
        int k = 0;
        continue;
        arrayOfInt = new int[256];
        m = 0;
      }
      while (m < paramInt)
      {
        int n = i + 1;
        int i1 = 0xFF & arrayOfByte[i];
        int i2 = n + 1;
        int i3 = 0xFF & arrayOfByte[n];
        i = i2 + 1;
        int i4 = 0xFF & arrayOfByte[i2];
        int i5 = m + 1;
        arrayOfInt[m] = (i4 | (0xFF000000 | i1 << 16 | i3 << 8));
        m = i5;
      }
    }
  }

  public final int a(Vector paramVector)
  {
    this.iDZ = paramVector;
    this.in = new ByteArrayInputStream(this.gfW);
    this.gfW = null;
    this.iEa = null;
    init();
    aNe();
    if (aNd());
    while (true)
    {
      return -1;
      aNf();
      try
      {
        this.in.close();
        label58: if (aNd())
          continue;
        return 0;
      }
      catch (Exception localException)
      {
        break label58;
      }
    }
  }

  public final boolean a(s params)
  {
    boolean bool = b(params);
    if (params.dnb != null)
      this.iEa.add(new t(this, params.dnb, this.width, this.height));
    return bool;
  }

  public final void finish()
  {
    try
    {
      this.in.close();
      this.iEa.clear();
      this.iEa = null;
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public final boolean ready()
  {
    this.in = new ByteArrayInputStream(this.gfW);
    this.gfW = null;
    this.iDZ = null;
    this.iEa = new Vector();
    init();
    aNe();
    return !aNd();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.r
 * JD-Core Version:    0.6.2
 */