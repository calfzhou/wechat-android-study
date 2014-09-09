package com.tencent.mm.sdk.platformtools;

import java.nio.ByteBuffer;

public final class w
{
  private ai iEg = null;
  private int iEh = -1;
  private boolean iEi = true;

  public w(byte[] paramArrayOfByte)
  {
    this.iEg.cR(paramArrayOfByte);
  }

  private static String a(byte paramByte)
  {
    String str = Integer.toHexString(paramByte & 0xFF);
    if (str.length() == 1)
      str = "0" + str;
    return "" + str.toUpperCase();
  }

  private void oq(int paramInt)
  {
    int i = this.iEg.getBuffer().position();
    this.iEg.getBuffer().position(i + paramInt);
  }

  public final int aNn()
  {
    label1031: label1040: 
    while (true)
    {
      int i5;
      int i6;
      String str;
      int i12;
      int i11;
      int i13;
      int i15;
      try
      {
        byte b1 = this.iEg.getBuffer().get();
        byte b2 = this.iEg.getBuffer().get();
        if ((!a(b1).equals("FF")) || (!a(b2).equals("D8")))
          break label983;
        i = 1;
        if (i != 0)
          break label989;
        z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "this is not jpeg or no exif data!!!");
        return -1;
        byte b3 = this.iEg.getBuffer().get();
        byte b4 = this.iEg.getBuffer().get();
        this.iEg.getBuffer().get();
        int k = this.iEg.getBuffer().get();
        int m;
        if (!a(b3).equals("FF"))
        {
          m = -1;
          if (m < 0)
          {
            z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "datalen is error ");
            return -1;
          }
        }
        else
        {
          if ((a(b3).equals("FF")) && (a(b4).equals("E1")))
          {
            m = -2 + (k & 0xFF);
            continue;
          }
          if ((a(b3).equals("FF")) && (a(b4).equals("D9")))
          {
            m = -1;
            continue;
          }
          int i16 = -2 + (k + this.iEg.getOffset());
          this.iEg.getBuffer().position(i16);
          j++;
          if (j <= 100)
            continue;
          z.e("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "error while!");
          m = -1;
          continue;
        }
        int n = this.iEg.getBuffer().get();
        int i1 = this.iEg.getBuffer().get();
        int i2 = this.iEg.getBuffer().get();
        int i3 = this.iEg.getBuffer().get();
        if (!((char)n + (char)i1 + (char)i2 + (char)i3).equals("Exif"))
          break label995;
        i4 = 1;
        if (i4 == 0)
        {
          z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "checkExifTag is error");
          return -1;
        }
        oq(2);
        i5 = this.iEg.getBuffer().get();
        i6 = this.iEg.getBuffer().get();
        if (((char)i5 != 'M') || ((char)i6 != 'M'))
          break label1001;
        str = "MM";
        if ((!str.equals("MM")) && (!str.equals("II")))
        {
          z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "byteOrder  is error " + str);
          return -1;
        }
        this.iEi = str.equals("MM");
        boolean bool1 = this.iEi;
        byte b5 = this.iEg.getBuffer().get();
        byte b6 = this.iEg.getBuffer().get();
        int i7;
        if ((bool1) && (a(b5).equals("00")) && (a(b6).equals("2A")))
        {
          i7 = 1;
          if (i7 == 0)
          {
            z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "checkTiffTag  is error ");
            return -1;
          }
        }
        else
        {
          if ((a(b5).equals("2A")) && (a(b6).equals("00")))
          {
            i7 = 1;
            continue;
          }
          z.w("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "checkTiffTag: " + a(b5) + " " + a(b6));
          i7 = 0;
          continue;
        }
        oq(4);
        int i8 = this.iEg.getBuffer().get();
        int i9 = this.iEg.getBuffer().get();
        int i10 = i8 & 0xFF;
        if (!this.iEi)
          break label1031;
        i10 = i9 & 0xFF;
        break label1031;
        byte b7;
        byte b8;
        if ((i12 < i10) && (i12 < 255))
        {
          b7 = this.iEg.getBuffer().get();
          b8 = this.iEg.getBuffer().get();
          if ((this.iEi) && (a(b7).equals("01")) && (a(b8).equals("12")))
          {
            i11 = 1;
            oq(2);
            oq(4);
            if (i11 == 0)
              continue;
            boolean bool2 = this.iEi;
            i13 = this.iEg.getBuffer().get();
            int i14 = this.iEg.getBuffer().get();
            oq(2);
            if (!bool2)
              break label1040;
            i15 = i14 & 0xFF;
            this.iEh = i15;
          }
        }
        else
        {
          z.d("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "orei " + this.iEh);
          if (this.iEh == -1);
        }
        switch (this.iEh)
        {
        case 2:
        case 4:
        case 5:
        case 7:
        default:
          return -1;
          if ((this.iEi) || (!a(b7).equals("12")) || (!a(b8).equals("01")))
            continue;
          i11 = 1;
          continue;
          oq(4);
          i12++;
          continue;
        case 6:
        case 3:
        case 8:
        case 1:
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpJaJa7oj22gIipxLgiUrYmZ", "parser jpeg error");
        return -1;
      }
      return 90;
      return 180;
      return 270;
      return 0;
      label983: int i = 0;
      continue;
      label989: int j = 0;
      continue;
      label995: int i4 = 0;
      continue;
      label1001: if (((char)i5 == 'I') && ((char)i6 == 'I'))
      {
        str = "II";
      }
      else
      {
        str = "";
        continue;
        i11 = 0;
        i12 = 0;
        continue;
        i15 = i13 & 0xFF;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.w
 * JD-Core Version:    0.6.2
 */