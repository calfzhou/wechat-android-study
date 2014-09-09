package oicq.wlogin_sdk.sharemem;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class WloginSigInfo
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator CREATOR = new b();
  public byte[] kiE;
  public byte[] kiF;
  public byte[] kiG;
  public byte[] kiH;
  public byte[] kiI;
  public byte[] kiJ;
  public byte[] kiK;
  public byte[] kiL;
  public byte[] kiM;
  public byte[] kiN;
  public byte[] kiO;
  public byte[] kiP;
  public byte[] kiQ;
  public byte[] kiR;
  public byte[] kiU;
  public byte[] kiV;
  public byte[] kiX;
  public byte[] kkn;
  public byte[] kko;
  public byte[] kkp;
  public byte[] kkq;
  public long kkr = 0L;
  public long kks = 0L;
  public long kkt = 0L;
  public long kku = 0L;
  public long kkv = 0L;

  public WloginSigInfo(long paramLong1, long paramLong2, long paramLong3, long paramLong4, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[][] paramArrayOfByte)
  {
    this.kku = paramLong1;
    this.kkt = paramLong2;
    this.kkr = paramLong3;
    this.kks = paramLong4;
    this.kkn = ((byte[])paramArrayOfByte1.clone());
    this.kko = ((byte[])paramArrayOfByte2.clone());
    this.kiE = ((byte[])paramArrayOfByte3.clone());
    this.kiF = ((byte[])paramArrayOfByte4.clone());
    if (paramArrayOfByte5 != null)
    {
      this.kiG = ((byte[])paramArrayOfByte5.clone());
      this.kiH = new byte[0];
      if (paramArrayOfByte6 == null)
        break label380;
      this.kiI = ((byte[])paramArrayOfByte6.clone());
      label140: if (paramArrayOfByte7 == null)
        break label390;
      this.kiJ = ((byte[])paramArrayOfByte7.clone());
      label157: if (paramArrayOfByte8 == null)
        break label400;
      this.kiK = ((byte[])paramArrayOfByte8.clone());
      label174: if (paramArrayOfByte9 == null)
        break label410;
      this.kiL = ((byte[])paramArrayOfByte9.clone());
      label191: if (paramArrayOfByte10 == null)
        break label420;
      this.kiM = ((byte[])paramArrayOfByte10.clone());
      label208: if (paramArrayOfByte11 == null)
        break label430;
      this.kiN = ((byte[])paramArrayOfByte11.clone());
      label225: if (paramArrayOfByte12 == null)
        break label440;
    }
    label390: label400: label410: label420: label430: label440: for (this.kiO = ((byte[])paramArrayOfByte12.clone()); ; this.kiO = new byte[0])
    {
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length != 8))
        break label450;
      this.kiQ = ((byte[])paramArrayOfByte[0].clone());
      this.kiP = ((byte[])paramArrayOfByte[1].clone());
      this.kiR = ((byte[])paramArrayOfByte[2].clone());
      this.kkp = ((byte[])paramArrayOfByte[3].clone());
      this.kiU = ((byte[])paramArrayOfByte[4].clone());
      this.kiV = ((byte[])paramArrayOfByte[5].clone());
      this.kkq = ((byte[])paramArrayOfByte[6].clone());
      this.kiX = ((byte[])paramArrayOfByte[7].clone());
      return;
      this.kiG = new byte[0];
      break;
      label380: this.kiI = new byte[0];
      break label140;
      this.kiJ = new byte[0];
      break label157;
      this.kiK = new byte[0];
      break label174;
      this.kiL = new byte[0];
      break label191;
      this.kiM = new byte[0];
      break label208;
      this.kiN = new byte[0];
      break label225;
    }
    label450: this.kiQ = new byte[0];
    this.kiP = new byte[0];
    this.kiR = new byte[0];
    this.kkp = new byte[0];
    this.kiU = new byte[0];
    this.kiV = new byte[0];
    this.kkq = new byte[0];
    this.kiX = new byte[0];
  }

  public WloginSigInfo(long paramLong1, long paramLong2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.kku = 4294967295L;
    this.kkt = paramLong1;
    this.kkr = paramLong2;
    this.kks = 0L;
    this.kkn = new byte[0];
    this.kko = new byte[0];
    this.kiE = ((byte[])paramArrayOfByte1.clone());
    this.kiF = ((byte[])paramArrayOfByte2.clone());
    this.kiG = new byte[0];
    this.kiH = new byte[0];
    this.kiI = new byte[0];
    this.kiJ = new byte[0];
    this.kiK = new byte[0];
    this.kiL = new byte[0];
    this.kiM = new byte[0];
    this.kiN = new byte[0];
    this.kiO = new byte[0];
    this.kiP = new byte[0];
    this.kiQ = new byte[0];
    this.kiR = new byte[0];
    this.kkp = new byte[0];
    this.kiU = new byte[0];
    this.kiV = new byte[0];
    this.kkq = new byte[0];
    this.kiX = new byte[0];
  }

  private WloginSigInfo(Parcel paramParcel)
  {
    this.kkn = paramParcel.createByteArray();
    this.kko = paramParcel.createByteArray();
    this.kiE = paramParcel.createByteArray();
    this.kiF = paramParcel.createByteArray();
    this.kiG = paramParcel.createByteArray();
    this.kiH = paramParcel.createByteArray();
    this.kiI = paramParcel.createByteArray();
    this.kiJ = paramParcel.createByteArray();
    this.kiK = paramParcel.createByteArray();
    this.kiL = paramParcel.createByteArray();
    this.kiM = paramParcel.createByteArray();
    this.kiN = paramParcel.createByteArray();
    this.kiO = paramParcel.createByteArray();
    this.kiP = paramParcel.createByteArray();
    this.kiQ = paramParcel.createByteArray();
    this.kiR = paramParcel.createByteArray();
    this.kkp = paramParcel.createByteArray();
    this.kiU = paramParcel.createByteArray();
    this.kiV = paramParcel.createByteArray();
    this.kkq = paramParcel.createByteArray();
    this.kiX = paramParcel.createByteArray();
    this.kkr = paramParcel.readLong();
    this.kks = paramParcel.readLong();
    this.kkt = paramParcel.readLong();
    this.kku = paramParcel.readLong();
    this.kkv = paramParcel.readLong();
  }

  public final WloginSigInfo a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5, byte[] paramArrayOfByte6, byte[] paramArrayOfByte7, byte[] paramArrayOfByte8, byte[] paramArrayOfByte9, byte[] paramArrayOfByte10, byte[] paramArrayOfByte11, byte[] paramArrayOfByte12, byte[][] paramArrayOfByte)
  {
    this.kku = paramLong1;
    this.kkt = paramLong2;
    this.kkr = paramLong3;
    this.kks = paramLong4;
    this.kkn = ((byte[])paramArrayOfByte1.clone());
    this.kko = ((byte[])paramArrayOfByte2.clone());
    this.kiE = ((byte[])paramArrayOfByte3.clone());
    this.kiF = ((byte[])paramArrayOfByte4.clone());
    if (paramArrayOfByte5 != null)
    {
      this.kiG = ((byte[])paramArrayOfByte5.clone());
      this.kiH = new byte[0];
      if (paramArrayOfByte6 == null)
        break label376;
      this.kiI = ((byte[])paramArrayOfByte6.clone());
      label111: if (paramArrayOfByte7 == null)
        break label386;
      this.kiJ = ((byte[])paramArrayOfByte7.clone());
      label128: if (paramArrayOfByte8 == null)
        break label396;
      this.kiK = ((byte[])paramArrayOfByte8.clone());
      label145: if (paramArrayOfByte9 == null)
        break label406;
      this.kiL = ((byte[])paramArrayOfByte9.clone());
      label162: if (paramArrayOfByte10 == null)
        break label416;
      this.kiM = ((byte[])paramArrayOfByte10.clone());
      label179: if (paramArrayOfByte11 == null)
        break label426;
      this.kiN = ((byte[])paramArrayOfByte11.clone());
      label196: if (paramArrayOfByte12 == null)
        break label436;
    }
    label386: label396: label406: label416: label426: label436: for (this.kiO = ((byte[])paramArrayOfByte12.clone()); ; this.kiO = new byte[0])
    {
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length != 8))
        break label446;
      this.kiQ = ((byte[])paramArrayOfByte[0].clone());
      this.kiP = ((byte[])paramArrayOfByte[1].clone());
      this.kiR = ((byte[])paramArrayOfByte[2].clone());
      if ((paramArrayOfByte[3].clone() != null) && (((byte[])paramArrayOfByte[3].clone()).length > 0))
        this.kkp = ((byte[])paramArrayOfByte[3].clone());
      this.kiU = ((byte[])paramArrayOfByte[4].clone());
      this.kiV = ((byte[])paramArrayOfByte[5].clone());
      this.kkq = ((byte[])paramArrayOfByte[6].clone());
      this.kiX = ((byte[])paramArrayOfByte[7].clone());
      return this;
      this.kiG = new byte[0];
      break;
      label376: this.kiI = new byte[0];
      break label111;
      this.kiJ = new byte[0];
      break label128;
      this.kiK = new byte[0];
      break label145;
      this.kiL = new byte[0];
      break label162;
      this.kiM = new byte[0];
      break label179;
      this.kiN = new byte[0];
      break label196;
    }
    label446: this.kiQ = new byte[0];
    this.kiP = new byte[0];
    this.kiR = new byte[0];
    this.kiU = new byte[0];
    this.kiV = new byte[0];
    this.kkq = new byte[0];
    this.kiX = new byte[0];
    return this;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByteArray(this.kkn);
    paramParcel.writeByteArray(this.kko);
    paramParcel.writeByteArray(this.kiE);
    paramParcel.writeByteArray(this.kiF);
    paramParcel.writeByteArray(this.kiG);
    paramParcel.writeByteArray(this.kiH);
    paramParcel.writeByteArray(this.kiI);
    paramParcel.writeByteArray(this.kiJ);
    paramParcel.writeByteArray(this.kiK);
    paramParcel.writeByteArray(this.kiL);
    paramParcel.writeByteArray(this.kiM);
    paramParcel.writeByteArray(this.kiN);
    paramParcel.writeByteArray(this.kiO);
    paramParcel.writeByteArray(this.kiP);
    paramParcel.writeByteArray(this.kiQ);
    paramParcel.writeByteArray(this.kiR);
    paramParcel.writeByteArray(this.kkp);
    paramParcel.writeByteArray(this.kiU);
    paramParcel.writeByteArray(this.kiV);
    paramParcel.writeByteArray(this.kkq);
    paramParcel.writeByteArray(this.kiX);
    paramParcel.writeLong(this.kkr);
    paramParcel.writeLong(this.kks);
    paramParcel.writeLong(this.kkt);
    paramParcel.writeLong(this.kku);
    paramParcel.writeLong(this.kkv);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.sharemem.WloginSigInfo
 * JD-Core Version:    0.6.2
 */