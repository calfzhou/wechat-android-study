package com.tencent.mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;

public final class f
{
  private static final String dEv = localStringBuilder.toString();
  private int cGN = -2;
  public int dDW = 0;
  public int dDX = 0;
  public int dDY = 0;
  public int dDZ = 0;
  public int dEa = 0;
  public int dEb = 0;
  public int dEc = 0;
  public int dEd = 0;
  public int dEe = 0;
  public int dEf = 0;
  public int dEg = 0;
  public int dEh = 0;
  public int dEi = 0;
  public int dEj = 0;
  public int dEk = 0;
  public int dEl = 0;
  public int dEm = 0;
  public int dEn = 0;
  public int dEo = 0;
  public int dEp = 0;
  public int dEq = 0;
  public int dEr = 0;
  public int dEs = 0;
  public int dEt = 0;
  public int dEu = 0;
  public int dSD = 0;
  public int dSE = 0;
  public int dSF = 0;
  public int dSG = 0;
  public int id = 0;

  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NetStatInfo: \n");
    localStringBuilder.append("|- text in=%d/%dB, out=%d/%dB\n");
    localStringBuilder.append("|- image in=%d/%dB, out=%d/%dB\n");
    localStringBuilder.append("|- voice in=%d/%dB, out=%d/%dB\n");
    localStringBuilder.append("|- video in=%d/%dB, out=%d/%dB\n");
    localStringBuilder.append("|- mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB\n");
    localStringBuilder.append("`- wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB\n");
  }

  public final boolean a(f paramf)
  {
    this.cGN = (0x1 | paramf.cGN);
    this.dDX += paramf.dDY;
    this.dDY += paramf.dDY;
    this.dDZ += paramf.dEa;
    this.dEa += paramf.dEa;
    this.dEb += paramf.dEb;
    this.dEc += paramf.dEc;
    this.dEd += paramf.dEd;
    this.dEe += paramf.dEe;
    this.dEf += paramf.dEf;
    this.dEg += paramf.dEg;
    this.dEh += paramf.dEh;
    this.dEi += paramf.dEi;
    this.dEj += paramf.dEk;
    this.dEk += paramf.dEk;
    this.dEl += paramf.dEm;
    this.dEm += paramf.dEm;
    this.dEn += paramf.dEn;
    this.dEo += paramf.dEo;
    this.dEp += paramf.dEp;
    this.dEq += paramf.dEq;
    this.dEr += paramf.dEr;
    this.dEs += paramf.dEs;
    this.dEt += paramf.dEt;
    this.dEu += paramf.dEu;
    this.dSD += paramf.dSD;
    this.dSE += paramf.dSE;
    this.dSF += paramf.dSF;
    this.dSG += paramf.dSG;
    return (this.dEf > 4096) || (this.dEg > 4096) || (this.dEr > 4096) || (this.dEs > 4096);
  }

  public final void b(Cursor paramCursor)
  {
    this.id = paramCursor.getInt(0);
    this.dDW = paramCursor.getInt(1);
    this.dDX = paramCursor.getInt(2);
    this.dDY = paramCursor.getInt(3);
    this.dDZ = paramCursor.getInt(4);
    this.dEa = paramCursor.getInt(5);
    this.dEb = paramCursor.getInt(6);
    this.dEc = paramCursor.getInt(7);
    this.dEd = paramCursor.getInt(8);
    this.dEe = paramCursor.getInt(9);
    this.dEf = paramCursor.getInt(10);
    this.dEg = paramCursor.getInt(11);
    this.dEh = paramCursor.getInt(12);
    this.dEi = paramCursor.getInt(13);
    this.dEj = paramCursor.getInt(14);
    this.dEk = paramCursor.getInt(15);
    this.dEl = paramCursor.getInt(16);
    this.dEm = paramCursor.getInt(17);
    this.dEn = paramCursor.getInt(18);
    this.dEo = paramCursor.getInt(19);
    this.dEp = paramCursor.getInt(20);
    this.dEq = paramCursor.getInt(21);
    this.dEr = paramCursor.getInt(22);
    this.dEs = paramCursor.getInt(23);
    this.dEt = paramCursor.getInt(24);
    this.dEu = paramCursor.getInt(25);
    this.dSD = paramCursor.getInt(26);
    this.dSE = paramCursor.getInt(27);
    this.dSF = paramCursor.getInt(28);
    this.dSG = paramCursor.getInt(29);
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("peroid", Integer.valueOf(this.dDW));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("textCountIn", Integer.valueOf(this.dDX));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("textBytesIn", Integer.valueOf(this.dDY));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("imageCountIn", Integer.valueOf(this.dDZ));
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("imageBytesIn", Integer.valueOf(this.dEa));
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("voiceCountIn", Integer.valueOf(this.dEb));
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("voiceBytesIn", Integer.valueOf(this.dEc));
    if ((0x100 & this.cGN) != 0)
      localContentValues.put("videoCountIn", Integer.valueOf(this.dEd));
    if ((0x200 & this.cGN) != 0)
      localContentValues.put("videoBytesIn", Integer.valueOf(this.dEe));
    if ((0x400 & this.cGN) != 0)
      localContentValues.put("mobileBytesIn", Integer.valueOf(this.dEf));
    if ((0x800 & this.cGN) != 0)
      localContentValues.put("wifiBytesIn", Integer.valueOf(this.dEg));
    if ((0x1000 & this.cGN) != 0)
      localContentValues.put("sysMobileBytesIn", Integer.valueOf(this.dEh));
    if ((0x2000 & this.cGN) != 0)
      localContentValues.put("sysWifiBytesIn", Integer.valueOf(this.dEi));
    if ((0x4000 & this.cGN) != 0)
      localContentValues.put("textCountOut", Integer.valueOf(this.dEj));
    if ((0x8000 & this.cGN) != 0)
      localContentValues.put("textBytesOut", Integer.valueOf(this.dEk));
    if ((0x10000 & this.cGN) != 0)
      localContentValues.put("imageCountOut", Integer.valueOf(this.dEl));
    if ((0x20000 & this.cGN) != 0)
      localContentValues.put("imageBytesOut", Integer.valueOf(this.dEm));
    if ((0x40000 & this.cGN) != 0)
      localContentValues.put("voiceCountOut", Integer.valueOf(this.dEn));
    if ((0x80000 & this.cGN) != 0)
      localContentValues.put("voiceBytesOut", Integer.valueOf(this.dEo));
    if ((0x100000 & this.cGN) != 0)
      localContentValues.put("videoCountOut", Integer.valueOf(this.dEp));
    if ((0x200000 & this.cGN) != 0)
      localContentValues.put("videoBytesOut", Integer.valueOf(this.dEq));
    if ((0x400000 & this.cGN) != 0)
      localContentValues.put("mobileBytesOut", Integer.valueOf(this.dEr));
    if ((0x800000 & this.cGN) != 0)
      localContentValues.put("wifiBytesOut", Integer.valueOf(this.dEs));
    if ((0x1000000 & this.cGN) != 0)
      localContentValues.put("sysMobileBytesOut", Integer.valueOf(this.dEt));
    if ((0x2000000 & this.cGN) != 0)
      localContentValues.put("sysWifiBytesOut", Integer.valueOf(this.dEu));
    if ((0x4000000 & this.cGN) != 0)
      localContentValues.put("realMobileBytesIn", Integer.valueOf(this.dSD));
    if ((0x8000000 & this.cGN) != 0)
      localContentValues.put("realWifiBytesIn", Integer.valueOf(this.dSE));
    if ((0x10000000 & this.cGN) != 0)
      localContentValues.put("realMobileBytesOut", Integer.valueOf(this.dSF));
    if ((0x20000000 & this.cGN) != 0)
      localContentValues.put("realWifiBytesOut", Integer.valueOf(this.dSG));
    return localContentValues;
  }

  public final int ss()
  {
    return this.cGN;
  }

  public final String toString()
  {
    String str = dEv;
    Object[] arrayOfObject = new Object[28];
    arrayOfObject[0] = Integer.valueOf(this.dDX);
    arrayOfObject[1] = Integer.valueOf(this.dDY);
    arrayOfObject[2] = Integer.valueOf(this.dEj);
    arrayOfObject[3] = Integer.valueOf(this.dEk);
    arrayOfObject[4] = Integer.valueOf(this.dDZ);
    arrayOfObject[5] = Integer.valueOf(this.dEa);
    arrayOfObject[6] = Integer.valueOf(this.dEl);
    arrayOfObject[7] = Integer.valueOf(this.dEm);
    arrayOfObject[8] = Integer.valueOf(this.dEb);
    arrayOfObject[9] = Integer.valueOf(this.dEc);
    arrayOfObject[10] = Integer.valueOf(this.dEn);
    arrayOfObject[11] = Integer.valueOf(this.dEo);
    arrayOfObject[12] = Integer.valueOf(this.dEd);
    arrayOfObject[13] = Integer.valueOf(this.dEe);
    arrayOfObject[14] = Integer.valueOf(this.dEp);
    arrayOfObject[15] = Integer.valueOf(this.dEq);
    arrayOfObject[16] = Integer.valueOf(this.dEf);
    arrayOfObject[17] = Integer.valueOf(this.dSD);
    arrayOfObject[18] = Integer.valueOf(this.dEh);
    arrayOfObject[19] = Integer.valueOf(this.dEr);
    arrayOfObject[20] = Integer.valueOf(this.dSF);
    arrayOfObject[21] = Integer.valueOf(this.dEt);
    arrayOfObject[22] = Integer.valueOf(this.dEg);
    arrayOfObject[23] = Integer.valueOf(this.dSE);
    arrayOfObject[24] = Integer.valueOf(this.dEi);
    arrayOfObject[25] = Integer.valueOf(this.dEs);
    arrayOfObject[26] = Integer.valueOf(this.dSG);
    arrayOfObject[27] = Integer.valueOf(this.dEu);
    return String.format(str, arrayOfObject);
  }

  public final f zU()
  {
    this.cGN = 0;
    this.id = 0;
    this.dDW = 0;
    this.dDX = 0;
    this.dDY = 0;
    this.dDZ = 0;
    this.dEa = 0;
    this.dEb = 0;
    this.dEc = 0;
    this.dEd = 0;
    this.dEe = 0;
    this.dEf = 0;
    this.dEg = 0;
    this.dEh = 0;
    this.dEi = 0;
    this.dEj = 0;
    this.dEk = 0;
    this.dEl = 0;
    this.dEm = 0;
    this.dEn = 0;
    this.dEo = 0;
    this.dEp = 0;
    this.dEq = 0;
    this.dEr = 0;
    this.dEs = 0;
    this.dEt = 0;
    this.dEu = 0;
    this.dSD = 0;
    this.dSE = 0;
    this.dSF = 0;
    this.dSG = 0;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.f
 * JD-Core Version:    0.6.2
 */