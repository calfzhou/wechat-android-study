package com.tencent.mm.network;

import com.tencent.mm.a.j;
import com.tencent.mm.network.a.a;
import com.tencent.mm.sdk.platformtools.z;

public final class bh
{
  private static final byte[] dTV = j.aX(7);
  public af dTW;

  public static void onOOBNotify(long paramLong1, long paramLong2)
  {
    bk.Dl().jt(paramLong1 + "," + paramLong2);
  }

  public final void onNotify(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("onNotify, seq(threadId)=").append(paramInt1).append(", datalen=");
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", i + " cmd= " + paramInt2);
    }
    switch (paramInt2)
    {
    case 11:
    case 12:
    default:
    case 5:
    case 24:
    case 39:
    case 61:
    case 8:
    case 120:
    case 122:
      do
      {
        do
        {
          do
          {
            return;
            i = paramArrayOfByte.length;
            break;
            z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "old notify");
            bk.Dj().a(1103, null, null);
            this.dTW.a(38, dTV);
            return;
            z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "dkpush new notify");
            bk.Dj().a(1103, null, null);
            this.dTW.a(38, paramArrayOfByte);
            return;
            z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "dkpush do synccheck");
            this.dTW.a(39, null);
            return;
            this.dTW.a(174, paramArrayOfByte);
            return;
          }
          while (paramArrayOfByte.length <= 0);
          this.dTW.a(10, paramArrayOfByte);
          return;
          z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "MM_PKT_VOIP_REQ");
        }
        while (paramArrayOfByte.length <= 0);
        this.dTW.a(170, paramArrayOfByte);
        return;
        z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "dkpush MM_PKT_PUSH_DATA_REQ");
      }
      while (paramArrayOfByte.length <= 0);
      bk.Dj().a(1104, null, null);
      this.dTW.a(268369921, paramArrayOfByte);
      return;
    case 1000000205:
      this.dTW.a(1000000205, paramArrayOfByte);
      return;
    case 192:
      this.dTW.a(192, paramArrayOfByte);
      return;
    case 268369923:
      z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "dkpush do oob do notify");
      this.dTW.a(268369923, paramArrayOfByte);
      return;
    case 241:
      z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "jacks do voice notify PUSH");
      this.dTW.a(241, paramArrayOfByte);
      return;
    case 244:
    }
    z.i("!56@/B4Tb64lLpJ+CRpvz/hRUHpUjpkPFyYq4R4eGf6rI1YM+ebOLIMWgw==", "pandy do gamesync notify");
    this.dTW.a(244, paramArrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.bh
 * JD-Core Version:    0.6.2
 */